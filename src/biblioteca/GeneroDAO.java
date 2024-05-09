package biblioteca;

import java.sql.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class GeneroDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<GeneroDTO> lista = new ArrayList<>();

    public void cadastrarGenero(GeneroDTO objGeneroDTO) {
        String sql = "insert into genero (id_genero, nome) values (null,?)";

        //conn = (Connection) new Conexao(); 
        // connection = Conexao.getConexao(); 
        conn = Conexao.getConexao();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objGeneroDTO.getNome());
            pstm.execute();
            pstm.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public ArrayList<GeneroDTO> listarGeneros() {
        conn = Conexao.getConexao();

        ArrayList<GeneroDTO> listaGeneros = new ArrayList<>();

        try {
            String sql = "SELECT id_genero, nome FROM genero"; // Consulta SQL para buscar os gêneros
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                GeneroDTO genero = new GeneroDTO();
                genero.setId_genero(rs.getInt("id_genero"));
                genero.setNome(rs.getString("nome"));
                listaGeneros.add(genero);
            }

            stmt.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace(); // Tratamento de exceção
        }

        return listaGeneros;
    }

    public String obterNomeGeneroPorId(int idGenero) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String nomeGenero = null;

        try {
            conn = Conexao.getConexao();
            String sql = "SELECT nome FROM genero WHERE id_genero = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idGenero);
            rs = stmt.executeQuery();

            if (rs.next()) {
                nomeGenero = rs.getString("nome");
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        }

        return nomeGenero;
    }

    public int obterIdGeneroPorNome(String nomeGenero) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int idGenero = -1; // Valor padrão se o gênero não for encontrado

        try {
            conn = Conexao.getConexao();
            String sql = "SELECT id_genero FROM genero WHERE nome = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, nomeGenero);
            rs = stmt.executeQuery();

            if (rs.next()) {
                idGenero = rs.getInt("id_genero");
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        }

        return idGenero;
    }

    public void atualizarGenero(GeneroDTO genero) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = Conexao.getConexao();

            // SQL para atualizar o nome do gênero na tabela
            String sql = "UPDATE genero SET nome = ? WHERE id_genero = ?";

            stmt = conn.prepareStatement(sql);
            stmt.setString(1, genero.getNome());
            stmt.setInt(2, genero.getId_genero());

            // Executa a atualização
            stmt.executeUpdate();
        } finally {
            // Fecha os recursos
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }

    public void excluirGenero(int id_genero) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = Conexao.getConexao();

            // Verifica se o gênero está sendo utilizado por algum livro
            String sqlVerificarUso = "SELECT COUNT(*) FROM livro1 WHERE id_genero = ?";
            stmt = conn.prepareStatement(sqlVerificarUso);
            stmt.setInt(1, id_genero);
            rs = stmt.executeQuery();

            if (rs.next()) {
                int totalLivros = rs.getInt(1);
                if (totalLivros > 0) {
                    // Se o gênero estiver sendo utilizado por algum livro, mostra uma mensagem de aviso
                    JOptionPane.showMessageDialog(null, "Não é possível excluir o gênero, pois está sendo utilizado por " + totalLivros + " livro(s).", "Aviso", JOptionPane.WARNING_MESSAGE);
                    return; // Sai do método sem excluir o gênero
                }
            }

            // Se o gênero não estiver sendo utilizado por nenhum livro, prossegue com a exclusão
            String sqlExcluirGenero = "DELETE FROM genero WHERE id_genero = ?";
            stmt = conn.prepareStatement(sqlExcluirGenero);
            stmt.setInt(1, id_genero);
            stmt.executeUpdate();
        } finally {
            // Fecha os recursos
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }

    public boolean verificarGeneroEmUso(int id_genero) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = Conexao.getConexao();

            // SQL para verificar se o gênero está sendo utilizado por algum livro
            String sql = "SELECT COUNT(*) FROM livro1 WHERE id_genero = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id_genero);
            rs = stmt.executeQuery();

            // Verifica se há pelo menos um livro utilizando o gênero
            if (rs.next()) {
                int totalLivros = rs.getInt(1);
                return totalLivros > 0;
            }

            return false; // Se não houver resultado, retorna falso
        } finally {
            // Fecha os recursos
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }

}

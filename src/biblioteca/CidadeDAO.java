package biblioteca;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CidadeDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<CidadeDTO> lista = new ArrayList<>();

    public void cadastrarCidade(CidadeDTO objCidadeDTO) {
        String sql = "insert into cidade (id_cidade, nome) values (null,?)";

        //conn = (Connection) new Conexao(); 
        // connection = Conexao.getConexao(); 
        conn = Conexao.getConexao();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objCidadeDTO.getNome());
            pstm.execute();
            pstm.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public ArrayList<CidadeDTO> listarCidades() {
        conn = Conexao.getConexao();

        ArrayList<CidadeDTO> listaCidades = new ArrayList<>();

        try {
            String sql = "SELECT id_cidade, nome FROM cidade"; // Consulta SQL para buscar as cidades
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                CidadeDTO cidade = new CidadeDTO();
                cidade.setId_cidade(rs.getInt("id_cidade"));
                cidade.setNome(rs.getString("nome"));
                listaCidades.add(cidade);
            }

            stmt.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace(); // Tratamento de exceção
        }

        return listaCidades;
    }

    public String obterNomeCidadePorId(int idCidade) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String nomeCidade = null;

        try {
            conn = Conexao.getConexao();
            String sql = "SELECT nome FROM cidade WHERE id_cidade = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idCidade);
            rs = stmt.executeQuery();

            if (rs.next()) {
                nomeCidade = rs.getString("nome");
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

        return nomeCidade;
    }

    public int obterIdCidadePorNome(String nomeCidade) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int idCidade = -1; // Valor padrão se a cidade não for encontrada

        try {
            conn = Conexao.getConexao();
            String sql = "SELECT id_cidade FROM cidade WHERE nome = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, nomeCidade);
            rs = stmt.executeQuery();

            if (rs.next()) {
                idCidade = rs.getInt("id_cidade");
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

        return idCidade;
    }

    public void atualizarCidade(CidadeDTO cidade) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = Conexao.getConexao();

            // SQL para atualizar o nome da cidade na tabela
            String sql = "UPDATE cidade SET nome = ? WHERE id_cidade = ?";

            stmt = conn.prepareStatement(sql);
            stmt.setString(1, cidade.getNome());
            stmt.setInt(2, cidade.getId_cidade());

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

    public void excluirCidade(int id_cidade) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = Conexao.getConexao();

            // Verifica se a cidade está sendo utilizada por alguma pessoa
            String sqlVerificarUso = "SELECT COUNT(*) FROM pessoa WHERE id_cidade = ?";
            stmt = conn.prepareStatement(sqlVerificarUso);
            stmt.setInt(1, id_cidade);
            rs = stmt.executeQuery();

            if (rs.next()) {
                int totalPessoas = rs.getInt(1);
                if (totalPessoas > 0) {
                    // Se a cidade estiver sendo utilizada por alguma pessoa, mostra uma mensagem de aviso
                    JOptionPane.showMessageDialog(null, "Não é possível excluir a cidade, pois está sendo utilizada por " + totalPessoas + " pessoa(s).", "Aviso", JOptionPane.WARNING_MESSAGE);
                    return; // Sai do método sem excluir a cidade
                }
            }

            // Se a cidade não estiver sendo utilizada por nenhuma pessoa, prossegue com a exclusão
            String sqlExcluirCidade = "DELETE FROM cidade WHERE id_cidade = ?";
            stmt = conn.prepareStatement(sqlExcluirCidade);
            stmt.setInt(1, id_cidade);
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

    public boolean verificarCidadeEmUso(int id_cidade) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = Conexao.getConexao();

            // SQL para verificar se a cidade está sendo utilizada por alguma pessoa
            String sql = "SELECT COUNT(*) FROM pessoa WHERE id_cidade = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id_cidade);
            rs = stmt.executeQuery();

            // Verifica se há pelo menos uma pessoa utilizando a cidade
            if (rs.next()) {
                int totalPessoas = rs.getInt(1);
                return totalPessoas > 0;
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

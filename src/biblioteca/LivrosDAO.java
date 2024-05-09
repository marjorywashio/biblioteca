package biblioteca;

import java.sql.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class LivrosDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<LivrosDTO> lista = new ArrayList<>();

    public void cadastrarLivro(LivrosDTO objLivrosDTO) {
        String sql = "insert into livro1 (id_livro, titulo_livro, autor_livro, editora_livro, id_genero) values (null,?,?,?,?)";

        conn = Conexao.getConexao();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objLivrosDTO.getTitulo_livro());
            pstm.setString(2, objLivrosDTO.getAutor_livro());
            pstm.setString(3, objLivrosDTO.getEditora_livro());
            pstm.setInt(4, objLivrosDTO.getId_genero());
            pstm.execute();
            pstm.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public ArrayList<LivrosDTO> ListarLivros() {
        String sql = "select * from livro1";
        conn = Conexao.getConexao();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery(sql);

            while (rs.next()) {
                LivrosDTO objLivrosDTO = new LivrosDTO();
                objLivrosDTO.setTitulo_livro(rs.getString("titulo_livro"));
                objLivrosDTO.setAutor_livro(rs.getString("autor_livro"));
                objLivrosDTO.setEditora_livro(rs.getString("editora_livro"));
                objLivrosDTO.setId_genero(rs.getInt("id_genero"));

                lista.add(objLivrosDTO);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return lista;
    }

    public String obterNomeLivroPorId(int idLivro) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String nomeLivro = null;

        try {
            conn = Conexao.getConexao();
            String sql = "SELECT titulo_livro FROM livro1 WHERE id_livro = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idLivro);
            rs = stmt.executeQuery();

            if (rs.next()) {
                nomeLivro = rs.getString("titulo_livro");
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

        return nomeLivro;
    }

    public int obterIdLivroPorNome(String nomeLivro) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int idLivro = -1; // Valor padrão se o livro não for encontrado

        try {
            conn = Conexao.getConexao();
            String sql = "SELECT id_livro FROM livro1 WHERE titulo_livro = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, nomeLivro);
            rs = stmt.executeQuery();

            if (rs.next()) {
                idLivro = rs.getInt("id_livro");
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

        return idLivro;
    }

    public void atualizarLivro(LivrosDTO livro) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = Conexao.getConexao();

            // SQL para atualizar os dados do livro na tabela
            String sql = "UPDATE livro1 SET titulo_livro = ?, autor_livro = ?, editora_livro = ?, id_genero = ? WHERE id_livro = ?";

            stmt = conn.prepareStatement(sql);
            stmt.setString(1, livro.getTitulo_livro());
            stmt.setString(2, livro.getAutor_livro());
            stmt.setString(3, livro.getEditora_livro());
            stmt.setInt(4, livro.getId_genero());
            stmt.setInt(5, livro.getId_livro());

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
    
    public void ExcluirLivro(LivrosDTO livro){
        Connection conn = null;
        PreparedStatement stmt = null;
        
        try {
            conn = Conexao.getConexao();

            // SQL para excluir os dados do livro na tabela
            String sql = "DELETE FROM `livro1` WHERE id_livro = ?";
            
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, livro.getId_livro());

            
            // Executa a atualização
            stmt.executeUpdate();
           
        } catch (SQLException e) {
        }
    }

}

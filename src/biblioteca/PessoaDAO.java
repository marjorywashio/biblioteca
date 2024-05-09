package biblioteca;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PessoaDAO {
    
    Connection conn; 
    PreparedStatement pstm; 
    ResultSet rs; 
    ArrayList<PessoaDTO> lista = new ArrayList<>(); 
    
    public void cadastrarPessoa(PessoaDTO objPessoaDTO){ 
        String sql = "insert into pessoa (id_pessoa, nome, telefone, id_cidade) values (null,?,?,?)"; 
        
        //conn = (Connection) new Conexao(); 
        // connection = Conexao.getConexao(); 
        conn = Conexao.getConexao(); 
 
        try { 
            pstm = conn.prepareStatement(sql); 
            pstm.setString(1, objPessoaDTO.getNome());  
            pstm.setString(2, objPessoaDTO.getTelefone()); 
            pstm.setInt(3, objPessoaDTO.getId_cidade());
            pstm.execute(); 
            pstm.close(); 
        } catch (Exception e) { 
            JOptionPane.showMessageDialog(null, e); 
        } 
    } 

    public ArrayList<PessoaDTO> ListarPessoas() {
        String sql = "SELECT * FROM pessoa";
        conn = Conexao.getConexao();
        lista = new ArrayList<>(); 

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                PessoaDTO objPessoaDTO = new PessoaDTO();
                objPessoaDTO.setId_pessoa(rs.getInt("id_pessoa"));
                objPessoaDTO.setNome(rs.getString("nome"));
                objPessoaDTO.setTelefone(rs.getString("telefone"));
                objPessoaDTO.setId_cidade(rs.getInt("id_cidade"));

                lista.add(objPessoaDTO);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            // Feche a conexão, declaração e conjunto de resultados aqui, se necessário
        }
        return lista;
    }
    
    public String obterNomePessoaPorId(int idPessoa) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String nomePessoa = null;

        try {
            conn = Conexao.getConexao();
            String sql = "SELECT nome FROM pessoa WHERE id_pessoa = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idPessoa);
            rs = stmt.executeQuery();

            if (rs.next()) {
                nomePessoa = rs.getString("nome");
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

        return nomePessoa;
    }
    
    public int obterIdPessoaPorNome(String nomePessoa) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int idPessoa = 0;

        try {
            conn = Conexao.getConexao();
            String sql = "SELECT id_pessoa FROM pessoa WHERE nome = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, nomePessoa);
            rs = stmt.executeQuery();

            if (rs.next()) {
                idPessoa = rs.getInt("id_pessoa");
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

        return idPessoa;
    }
    
    public void atualizarPessoa(PessoaDTO pessoa) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = Conexao.getConexao();

            // SQL para atualizar os dados do livro na tabela
            String sql = "UPDATE pessoa SET nome = ?, telefone = ?, id_cidade = ? WHERE id_pessoa = ?";

            stmt = conn.prepareStatement(sql);
            stmt.setString(1, pessoa.getNome());
            stmt.setString(2, pessoa.getTelefone());
            stmt.setInt(3, pessoa.getId_cidade());
            stmt.setInt(4, pessoa.getId_pessoa());

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
    
    public void ExcluirPessoa(PessoaDTO pessoa){
        Connection conn = null;
        PreparedStatement stmt = null;
        
        try {
        conn = Conexao.getConexao();

        // SQL para excluir os dados da pessoa na tabela
        String sql = "DELETE FROM `pessoa` WHERE id_pessoa = ?";
        
        stmt = conn.prepareStatement(sql);
        stmt.setInt(1, pessoa.getId_pessoa());

        // Executa a exclusão
        stmt.executeUpdate();
       
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        // Fecha os recursos
        try {
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    }


}

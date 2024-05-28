package biblioteca;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import java.sql.SQLException;

public class EmprestimoDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<EmprestimoDTO> lista = new ArrayList<>();

    public void cadastrarEmprestimo(EmprestimoDTO objEmprestimoDTO) {
        String sql = "insert into emprestimo (id_emprestimo, id_pessoa, id_livro, data_emprestimo, devolucao) values (null,?,?,?,?)";

        conn = Conexao.getConexao();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objEmprestimoDTO.getId_pessoa());
            pstm.setInt(2, objEmprestimoDTO.getId_livro());
            pstm.setDate(3, (java.sql.Date) objEmprestimoDTO.getData_emprestimo());
            pstm.setInt(4, objEmprestimoDTO.getDevolucao());
            pstm.execute();
            pstm.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void atualizarEmprestimo(EmprestimoDTO objEmprestimoDTO) {
        String sql = "UPDATE emprestimo SET id_pessoa = ?, id_livro = ?, data_emprestimo = ?, devolucao = ? WHERE id_emprestimo = ?";

        conn = Conexao.getConexao();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objEmprestimoDTO.getId_pessoa());
            pstm.setInt(2, objEmprestimoDTO.getId_livro());
            pstm.setDate(3, (java.sql.Date) objEmprestimoDTO.getData_emprestimo());
            pstm.setInt(4, objEmprestimoDTO.getDevolucao());
            pstm.setInt(5, objEmprestimoDTO.getId_emprestimo());
            pstm.execute();
            pstm.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void ExcluirEmprestimo(int idEmprestimo){
        String sql = "DELETE FROM emprestimo WHERE id_emprestimo = ?";

        conn = Conexao.getConexao();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, idEmprestimo);
            pstm.execute();
            pstm.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public ArrayList<EmprestimoDTO> listarEmprestimos() {
        String sql = "SELECT * FROM emprestimo";
        conn = Conexao.getConexao();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                EmprestimoDTO objEmprestimoDTO = new EmprestimoDTO();
                objEmprestimoDTO.setId_pessoa(rs.getInt("id_pessoa"));
                objEmprestimoDTO.setId_livro(rs.getInt("id_livro"));
                objEmprestimoDTO.setData_emprestimo(rs.getDate("data_emprestimo"));
                objEmprestimoDTO.setDevolucao(rs.getInt("devolucao"));
                lista.add(objEmprestimoDTO);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return lista;
    }

    public boolean pessoaCadastradaEmEmprestimo(int id_pessoa) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean pessoaCadastrada = false;

        try {
            conn = Conexao.getConexao();
            String sql = "SELECT * FROM emprestimo WHERE id_pessoa = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id_pessoa);
            rs = stmt.executeQuery();

            if (rs.next()) {
                pessoaCadastrada = true; // Se houver resultados, a pessoa está cadastrada em um empréstimo
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

        return pessoaCadastrada;
    }

    public boolean livroCadastradoEmEmprestimo(int id_livro) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean livroCadastrado = false;

        try {
            conn = Conexao.getConexao();
            String sql = "SELECT * FROM emprestimo WHERE id_livro = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id_livro);
            rs = stmt.executeQuery();

            if (rs.next()) {
                livroCadastrado = true; // Se houver resultados, a pessoa está cadastrada em um empréstimo
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

        return livroCadastrado;
    }

    public int obterIdEmprestimoPorIdPessoaEIdLivro(int idPessoa, int idLivro, java.sql.Date data) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int idEmprestimo = -1; // Valor padrão se o empréstimo não for encontrado

        try {
            conn = Conexao.getConexao();
            String sql = "SELECT id_emprestimo FROM emprestimo WHERE id_pessoa = ? AND id_livro = ? AND data_emprestimo = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idPessoa);
            stmt.setInt(2, idLivro);
            stmt.setDate(3, data);
            rs = stmt.executeQuery();

            if (rs.next()) {
                idEmprestimo = rs.getInt("id_emprestimo");
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

        return idEmprestimo;
    }
    
    public ArrayList<EmprestimoDTO> filtrarEmprestimoPorPessoa(int id_pessoa) {
        String sql = "SELECT * FROM emprestimo WHERE id_pessoa=?";
        conn = Conexao.getConexao();
        
        PreparedStatement stmt = null;

        try {
            //pstm = conn.prepareStatement(sql);
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id_pessoa);
            rs = stmt.executeQuery();

            while (rs.next()) {
                EmprestimoDTO objEmprestimoDTO = new EmprestimoDTO();
                objEmprestimoDTO.setId_pessoa(rs.getInt("id_pessoa"));
                objEmprestimoDTO.setId_livro(rs.getInt("id_livro"));
                objEmprestimoDTO.setData_emprestimo(rs.getDate("data_emprestimo"));
                objEmprestimoDTO.setDevolucao(rs.getInt("devolucao"));
                lista.add(objEmprestimoDTO);
                
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return lista;
    }

    public ArrayList<EmprestimoDTO> filtrarEmprestimoPorLivro(int id_livro) {
        String sql = "SELECT * FROM emprestimo WHERE id_livro=?";
        conn = Conexao.getConexao();
        
        PreparedStatement stmt = null;

        try {
            //pstm = conn.prepareStatement(sql);
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id_livro);
            rs = stmt.executeQuery();

            while (rs.next()) {
                EmprestimoDTO objEmprestimoDTO = new EmprestimoDTO();
                objEmprestimoDTO.setId_pessoa(rs.getInt("id_pessoa"));
                objEmprestimoDTO.setId_livro(rs.getInt("id_livro"));
                objEmprestimoDTO.setData_emprestimo(rs.getDate("data_emprestimo"));
                objEmprestimoDTO.setDevolucao(rs.getInt("devolucao"));
                lista.add(objEmprestimoDTO);
                
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return lista;
    }
    
}

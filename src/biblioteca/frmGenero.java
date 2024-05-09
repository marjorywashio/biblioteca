/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package biblioteca;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Marjory
 */
public class frmGenero extends javax.swing.JFrame {

    private GeneroDAO generoDAO;

    /**
     * Creates new form frmGenero
     */
    public frmGenero() {
        initComponents();
        this.setLocationRelativeTo(null);
        generoDAO = new GeneroDAO();
        btnListarActionPerformed(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtGenero = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblGenero = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("French Script MT", 0, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 46, 29));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gênero");
        jLabel1.setAlignmentY(0.0F);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Poppins Light", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 46, 29));
        jLabel3.setText("Gênero");

        txtGenero.setFont(new java.awt.Font("Poppins Light", 0, 13)); // NOI18N
        txtGenero.setForeground(new java.awt.Color(51, 46, 29));

        btnCancelar.setBackground(new java.awt.Color(51, 51, 51));
        btnCancelar.setFont(new java.awt.Font("Poppins Light", 0, 13)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSalvar.setBackground(new java.awt.Color(0, 102, 51));
        btnSalvar.setFont(new java.awt.Font("Poppins Light", 0, 13)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        jLabel7.setFont(new java.awt.Font("French Script MT", 0, 40)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 46, 29));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Gênero");
        jLabel7.setAlignmentY(0.0F);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7))
        );

        btnExcluir.setBackground(new java.awt.Color(255, 51, 51));
        btnExcluir.setFont(new java.awt.Font("Poppins Light", 0, 13)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnListar.setBackground(new java.awt.Color(51, 51, 51));
        btnListar.setFont(new java.awt.Font("Poppins Light", 0, 13)); // NOI18N
        btnListar.setForeground(new java.awt.Color(255, 255, 255));
        btnListar.setText("Atualizar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        tblGenero.setFont(new java.awt.Font("Poppins Light", 0, 13)); // NOI18N
        tblGenero.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código", "Gênero"
            }
        ));
        tblGenero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGeneroMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblGenero);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtGenero)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnExcluir))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnListar))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try {
            // Obtém o nome do gênero do campo de texto
            String nome = txtGenero.getText();

            // Verifica se o gênero já existe na tabela
            int selectedRow = tblGenero.getSelectedRow();
            if (selectedRow != -1) {
                // Se um gênero estiver selecionado, atualiza o gênero existente

                // Obtém o ID do gênero selecionado na tabela
                DefaultTableModel model = (DefaultTableModel) tblGenero.getModel();
                int id_genero = (int) model.getValueAt(selectedRow, 0);

                // Cria um objeto GeneroDTO com o ID do gênero e o novo nome
                GeneroDTO objGeneroDTO = new GeneroDTO();
                objGeneroDTO.setId_genero(id_genero);
                objGeneroDTO.setNome(nome);

                // Instancia o objeto GeneroDAO para realizar a atualização no banco de dados
                GeneroDAO objGeneroDAO = new GeneroDAO();
                objGeneroDAO.atualizarGenero(objGeneroDTO);

                // Atualiza a tabela com os novos dados
                btnListarActionPerformed(evt);
                txtGenero.setText("");

                JOptionPane.showMessageDialog(this, "Gênero atualizado", "Informação", JOptionPane.INFORMATION_MESSAGE);
            } else {
                // Se nenhum gênero estiver selecionado, cadastra um novo gênero

                // Cria um objeto GeneroDTO com o novo nome do gênero
                GeneroDTO objGeneroDTO = new GeneroDTO();
                objGeneroDTO.setNome(nome);

                // Instancia o objeto GeneroDAO para cadastrar o novo gênero no banco de dados
                GeneroDAO objGeneroDAO = new GeneroDAO();
                objGeneroDAO.cadastrarGenero(objGeneroDTO);

                // Atualiza a tabela com os novos dados
                btnListarActionPerformed(evt);
                txtGenero.setText("");

                JOptionPane.showMessageDialog(this, "Gênero salvo", "Informação", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            // Trate quaisquer exceções aqui
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtGenero.setText(""); // Limpa o valor o JTextField 
        txtGenero.requestFocus();

        frmBiblioteca bibliotecaForm = new frmBiblioteca();
        bibliotecaForm.setVisible(true);
        this.dispose(); // Fecha o formulário atual
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void atualizarTabelaGenero() {
        DefaultTableModel model = (DefaultTableModel) tblGenero.getModel();
        model.setNumRows(0); // Limpa a tabela antes de preencher novamente

        GeneroDAO generoDAO = new GeneroDAO();
        ArrayList<GeneroDTO> listaGeneros = generoDAO.listarGeneros();

        for (GeneroDTO generoDTO : listaGeneros) {
            model.addRow(new Object[]{generoDTO.getId_genero(), generoDTO.getNome()});
        }
    }


    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try {
            // Verifica se algum gênero está selecionado na tabela
            int selectedRow = tblGenero.getSelectedRow();
            if (selectedRow != -1) {
                // Obtém o ID do gênero selecionado na tabela
                DefaultTableModel model = (DefaultTableModel) tblGenero.getModel();
                int id_genero = (int) model.getValueAt(selectedRow, 0);

                // Confirmação da exclusão
                int confirmacao = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir este gênero?", "Confirmação de Exclusão", JOptionPane.YES_NO_OPTION);
                if (confirmacao == JOptionPane.YES_OPTION) {
                    // Se o usuário confirmar a exclusão, verifica se o gênero está sendo utilizado por algum livro
                    GeneroDAO generoDAO = new GeneroDAO();
                    if (generoDAO.verificarGeneroEmUso(id_genero)) {
                        // Se o gênero estiver sendo utilizado por algum livro, mostra uma mensagem de aviso
                        JOptionPane.showMessageDialog(null, "Não é possível excluir o gênero, pois está sendo utilizado por um ou mais livros.", "Aviso", JOptionPane.WARNING_MESSAGE);
                    } else {
                        // Se o gênero não estiver sendo utilizado por nenhum livro, exclui o gênero do banco de dados
                        generoDAO.excluirGenero(id_genero);

                        // Atualiza a tabela após a exclusão
                        btnListarActionPerformed(evt);
                        txtGenero.setText("");

                        JOptionPane.showMessageDialog(this, "Gênero excluído", "Informação", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Selecione um gênero para excluir", "Aviso", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception e) {
            // Trate quaisquer exceções aqui
            e.printStackTrace();
        }

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        try {
            DefaultTableModel model = (DefaultTableModel) tblGenero.getModel();
            model.setNumRows(0); // Limpa a tabela antes de preencher

            GeneroDAO generoDAO = new GeneroDAO();
            ArrayList<GeneroDTO> listaGeneros = generoDAO.listarGeneros();

            for (int num = 0; num < listaGeneros.size(); num++) {
                GeneroDTO generoDTO = listaGeneros.get(num);

                model.addRow(new Object[]{
                    generoDTO.getId_genero(),
                    generoDTO.getNome()
                });

            }
            model.fireTableDataChanged();
        } catch (Exception e) {
            // Trate quaisquer exceções aqui
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnListarActionPerformed

    private void tblGeneroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGeneroMouseClicked
        int selectedRow = tblGenero.getSelectedRow();
        if (selectedRow != -1) {
            DefaultTableModel model = (DefaultTableModel) tblGenero.getModel();
            txtGenero.setText((String) model.getValueAt(selectedRow, 1)); // Preenche o campo txtGenero com o nome do gênero selecionado
        }
    }//GEN-LAST:event_tblGeneroMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmGenero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmGenero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmGenero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmGenero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmGenero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblGenero;
    private javax.swing.JTextField txtGenero;
    // End of variables declaration//GEN-END:variables
}
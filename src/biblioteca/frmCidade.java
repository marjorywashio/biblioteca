/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package biblioteca;

import java.awt.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Marjory
 */
public class frmCidade extends javax.swing.JFrame {

    private CidadeDAO cidadeDAO;

    /**
     * Creates new form frmCidade
     */
    public frmCidade() {
        initComponents();
        this.setLocationRelativeTo(null);
        cidadeDAO = new CidadeDAO();
        btnListarActionPerformed(null);
        ajustarLarguraColunas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCidade = new javax.swing.JTable();
        btnLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(395, 391));

        jLabel3.setFont(new java.awt.Font("Poppins Light", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 46, 29));
        jLabel3.setText("Cidade");

        txtCidade.setFont(new java.awt.Font("Poppins Light", 0, 13)); // NOI18N
        txtCidade.setForeground(new java.awt.Color(51, 46, 29));

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

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Vivaldi", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 46, 29));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cidade");
        jLabel1.setAlignmentY(0.0F);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
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
        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        tblCidade.setFont(new java.awt.Font("Poppins Light", 0, 13)); // NOI18N
        tblCidade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código", "Cidade"
            }
        ));
        tblCidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCidadeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCidade);

        btnLimpar.setBackground(new java.awt.Color(51, 51, 51));
        btnLimpar.setFont(new java.awt.Font("Poppins Light", 0, 13)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir)
                    .addComponent(btnSalvar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnListar)
                    .addComponent(btnLimpar))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        frmBiblioteca bibliotecaForm = new frmBiblioteca();
        bibliotecaForm.setVisible(true);
        this.dispose(); // Fecha o formulário atual
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void ajustarLarguraColunas() {
        tblCidade.setAutoResizeMode(tblCidade.AUTO_RESIZE_OFF); // Desativar o redimensionamento automático
        TableColumnModel columnModel = tblCidade.getColumnModel();

        columnModel.getColumn(0).setPreferredWidth(50); // Código
        columnModel.getColumn(1).setPreferredWidth(294); // Nome da cidade
    }

    
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try {
            // Obtém o nome da cidade do campo de texto
            String nome = txtCidade.getText();

            // Verifica se a cidade já existe na tabela
            int selectedRow = tblCidade.getSelectedRow();
            if (selectedRow != -1) {
                // Se uma cidade estiver selecionada, atualiza a cidade existente

                // Obtém o ID da cidade selecionada na tabela
                DefaultTableModel model = (DefaultTableModel) tblCidade.getModel();
                int id_cidade = (int) model.getValueAt(selectedRow, 0);

                // Cria um objeto CidadeDTO com o ID da cidade e o novo nome
                CidadeDTO objcidadedto = new CidadeDTO();
                objcidadedto.setId_cidade(id_cidade);
                objcidadedto.setNome(nome);

                // Instancia o objeto CidadeDAO para realizar a atualização no banco de dados
                CidadeDAO objCidadeDAO = new CidadeDAO();
                objCidadeDAO.atualizarCidade(objcidadedto);

                // Atualiza a tabela com os novos dados
                btnListarActionPerformed(evt);

                // Limpa o campo de texto
                btnLimparActionPerformed(evt);

                JOptionPane.showMessageDialog(this, "Cidade atualizada", "Informação", JOptionPane.INFORMATION_MESSAGE);
            } else {
                // Se nenhuma cidade estiver selecionada, cadastra uma nova cidade

                // Cria um objeto CidadeDTO com o novo nome da cidade
                CidadeDTO objcidadedto = new CidadeDTO();
                objcidadedto.setNome(nome);

                // Instancia o objeto CidadeDAO para cadastrar a nova cidade no banco de dados
                CidadeDAO objCidadeDAO = new CidadeDAO();
                objCidadeDAO.cadastrarCidade(objcidadedto);

                // Atualiza a tabela com os novos dados
                btnListarActionPerformed(evt);

                // Limpa o campo de texto
                btnLimparActionPerformed(evt);

                JOptionPane.showMessageDialog(this, "Cidade salva", "Informação", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            // Trate quaisquer exceções aqui
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try {
            // Verifica se alguma cidade está selecionada na tabela
            int selectedRow = tblCidade.getSelectedRow();
            if (selectedRow != -1) {
                // Obtém o ID da cidade selecionada na tabela
                DefaultTableModel model = (DefaultTableModel) tblCidade.getModel();
                int id_cidade = (int) model.getValueAt(selectedRow, 0);

                // Confirmação da exclusão
                int confirmacao = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir esta cidade?", "Confirmação de Exclusão", JOptionPane.YES_NO_OPTION);
                if (confirmacao == JOptionPane.YES_OPTION) {
                    // Se o usuário confirmar a exclusão, verifica se a cidade está sendo utilizada por alguma pessoa
                    CidadeDAO cidadeDAO = new CidadeDAO();
                    if (cidadeDAO.verificarCidadeEmUso(id_cidade)) {
                        // Se a cidade estiver sendo utilizada por alguma pessoa, mostra uma mensagem de aviso
                        JOptionPane.showMessageDialog(null, "Não é possível excluir a cidade, pois está sendo utilizada por uma ou mais pessoas.", "Aviso", JOptionPane.WARNING_MESSAGE);
                    } else {
                        // Se a cidade não estiver sendo utilizada por nenhuma pessoa, exclui a cidade do banco de dados
                        cidadeDAO.excluirCidade(id_cidade);

                        // Atualiza a tabela após a exclusão
                        btnListarActionPerformed(evt);

                        // Limpa o campo de texto
                        btnLimparActionPerformed(evt);

                        JOptionPane.showMessageDialog(this, "Cidade excluída", "Informação", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Selecione uma cidade para excluir", "Aviso", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception e) {
            // Trate quaisquer exceções aqui
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        try {
            DefaultTableModel model = (DefaultTableModel) tblCidade.getModel();
            model.setNumRows(0); // Limpa a tabela antes de preencher

            CidadeDAO cidadeDAO = new CidadeDAO();
            ArrayList<CidadeDTO> listaCidades = cidadeDAO.listarCidades();

            for (int num = 0; num < listaCidades.size(); num++) {
                CidadeDTO cidadeDTO = listaCidades.get(num);

                model.addRow(new Object[]{
                    cidadeDTO.getId_cidade(),
                    cidadeDTO.getNome()
                });
            }
            model.fireTableDataChanged();
        } catch (Exception e) {
            // Trate quaisquer exceções aqui
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnListarActionPerformed

    private void tblCidadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCidadeMouseClicked
        int selectedRow = tblCidade.getSelectedRow();
        if (selectedRow != -1) {
            DefaultTableModel model = (DefaultTableModel) tblCidade.getModel();
            txtCidade.setText((String) model.getValueAt(selectedRow, 1)); // Preenche o campo txtCidade com o nome da cidade selecionada
        }
    }//GEN-LAST:event_tblCidadeMouseClicked

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtCidade.setText("");
        txtCidade.requestFocus();
    }//GEN-LAST:event_btnLimparActionPerformed

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
            java.util.logging.Logger.getLogger(frmCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCidade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCidade;
    private javax.swing.JTextField txtCidade;
    // End of variables declaration//GEN-END:variables
}

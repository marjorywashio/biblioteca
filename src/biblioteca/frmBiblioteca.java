/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package biblioteca;

/**
 *
 * @author Marjory
 */
public class frmBiblioteca extends javax.swing.JFrame {

    /**
     * Creates new form frmBiblioteca
     */
    public frmBiblioteca() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnGenero = new javax.swing.JButton();
        btnCidade = new javax.swing.JButton();
        btnLivro = new javax.swing.JButton();
        btnPessoa = new javax.swing.JButton();
        btnEmprestimo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        btnGenero.setFont(new java.awt.Font("Poppins Light", 0, 13)); // NOI18N
        btnGenero.setText("Cadastrar gênero");
        btnGenero.setMaximumSize(new java.awt.Dimension(134, 26));
        btnGenero.setMinimumSize(new java.awt.Dimension(134, 26));
        btnGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeneroActionPerformed(evt);
            }
        });

        btnCidade.setFont(new java.awt.Font("Poppins Light", 0, 13)); // NOI18N
        btnCidade.setText("Cadastrar cidade");
        btnCidade.setMaximumSize(new java.awt.Dimension(133, 26));
        btnCidade.setMinimumSize(new java.awt.Dimension(133, 26));
        btnCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCidadeActionPerformed(evt);
            }
        });

        btnLivro.setFont(new java.awt.Font("Poppins Light", 0, 13)); // NOI18N
        btnLivro.setText("Cadastrar livro");
        btnLivro.setMaximumSize(new java.awt.Dimension(117, 26));
        btnLivro.setMinimumSize(new java.awt.Dimension(117, 26));
        btnLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLivroActionPerformed(evt);
            }
        });

        btnPessoa.setFont(new java.awt.Font("Poppins Light", 0, 13)); // NOI18N
        btnPessoa.setText("Cadastrar pessoa");
        btnPessoa.setMaximumSize(new java.awt.Dimension(135, 26));
        btnPessoa.setMinimumSize(new java.awt.Dimension(135, 26));
        btnPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPessoaActionPerformed(evt);
            }
        });

        btnEmprestimo.setFont(new java.awt.Font("Poppins Light", 0, 13)); // NOI18N
        btnEmprestimo.setText("Empréstimos");
        btnEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmprestimoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPessoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLivro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGenero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));

        jLabel1.setBackground(new java.awt.Color(153, 32, 218));
        jLabel1.setFont(new java.awt.Font("French Script MT", 0, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 46, 29));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Minha biblioteca");
        jLabel1.setAlignmentY(0.0F);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeneroActionPerformed
        // Crie uma instância do frmGenero
        frmGenero generoForm = new frmGenero();

        // Defina a visibilidade do frmGenero como verdadeira para exibi-lo
        generoForm.setVisible(true);

        // Opcional: Oculte o formulário atual
        this.setVisible(false);
    }//GEN-LAST:event_btnGeneroActionPerformed

    private void btnCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCidadeActionPerformed
        // Crie uma instância do frmGenero
        frmCidade cidadeForm = new frmCidade();

        // Defina a visibilidade do frmGenero como verdadeira para exibi-lo
        cidadeForm.setVisible(true);

        // Opcional: Oculte o formulário atual
        this.setVisible(false);
    }//GEN-LAST:event_btnCidadeActionPerformed

    private void btnLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLivroActionPerformed
        // Crie uma instância do frmGenero
        frmLivros livrosForm = new frmLivros();

        // Defina a visibilidade do frmGenero como verdadeira para exibi-lo
        livrosForm.setVisible(true);

        // Opcional: Oculte o formulário atual
        this.setVisible(false);
    }//GEN-LAST:event_btnLivroActionPerformed

    private void btnPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPessoaActionPerformed
        // Crie uma instância do frmGenero
        frmPessoa pessoaForm = new frmPessoa();

        // Defina a visibilidade do frmGenero como verdadeira para exibi-lo
        pessoaForm.setVisible(true);

        // Opcional: Oculte o formulário atual
        this.setVisible(false);
    }//GEN-LAST:event_btnPessoaActionPerformed

    private void btnEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmprestimoActionPerformed
        // Crie uma instância do frmGenero
        frmEmprestimo emprestimoForm = new frmEmprestimo();

        // Defina a visibilidade do frmGenero como verdadeira para exibi-lo
        emprestimoForm.setVisible(true);

        // Opcional: Oculte o formulário atual
        this.setVisible(false);
    }//GEN-LAST:event_btnEmprestimoActionPerformed

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
            java.util.logging.Logger.getLogger(frmBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmBiblioteca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCidade;
    private javax.swing.JButton btnEmprestimo;
    private javax.swing.JButton btnGenero;
    private javax.swing.JButton btnLivro;
    private javax.swing.JButton btnPessoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}

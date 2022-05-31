package ricardoagex3;

/**** @author ricar */
public class TelaGostoMusical extends javax.swing.JFrame {

    public TelaGostoMusical() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        cbRock = new javax.swing.JCheckBox();
        cbMPB = new javax.swing.JCheckBox();
        cbSertanejo = new javax.swing.JCheckBox();
        cbPagode = new javax.swing.JCheckBox();
        cbPop = new javax.swing.JCheckBox();
        cbOutros = new javax.swing.JCheckBox();
        btnOk = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Qual é seu gosto musical?");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nome:");

        txtNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        cbRock.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbRock.setText("Rock");

        cbMPB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbMPB.setText("MPB");

        cbSertanejo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbSertanejo.setText("Sertanejo");

        cbPagode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbPagode.setText("Pagode");

        cbPop.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbPop.setText("Pop");

        cbOutros.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbOutros.setText("Outros");

        btnOk.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnOk.setText("Ok");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        btnLimpar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        lblResultado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbRock)
                    .addComponent(cbMPB))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbSertanejo)
                    .addComponent(cbPagode))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbOutros)
                    .addComponent(cbPop))
                .addGap(53, 53, 53))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(29, 29, 29)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbRock)
                    .addComponent(cbSertanejo)
                    .addComponent(cbPop))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbMPB)
                    .addComponent(cbPagode)
                    .addComponent(cbOutros))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOk)
                    .addComponent(btnLimpar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        String nome = txtNome.getText();
        String mensagem = "Caro " + nome + ", você gosta de: ";
        mensagem = cbRock.isSelected()? mensagem + " Rock ": mensagem + "";
        mensagem = cbMPB.isSelected()? mensagem + " MPB ": mensagem +"";
        mensagem = cbSertanejo.isSelected()? mensagem + " Sertanejo ":mensagem +"";
        mensagem = cbPagode.isSelected()? mensagem + " Pagode ":mensagem +"";
        mensagem = cbPop.isSelected()? mensagem + " Pop ":mensagem +"";
        mensagem = cbOutros.isSelected()? mensagem + " Outros ":mensagem +"";
        lblResultado.setText(mensagem);
    }//GEN-LAST:event_btnOkActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtNome.setText("");
        lblResultado.setText("");
        cbRock.setSelected(false);
        cbMPB.setSelected(false);
        cbSertanejo.setSelected(false);
        cbPagode.setSelected(false);
        cbPop.setSelected(false);
        cbOutros.setSelected(false);
    }//GEN-LAST:event_btnLimparActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGostoMusical().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnOk;
    private javax.swing.JCheckBox cbMPB;
    private javax.swing.JCheckBox cbOutros;
    private javax.swing.JCheckBox cbPagode;
    private javax.swing.JCheckBox cbPop;
    private javax.swing.JCheckBox cbRock;
    private javax.swing.JCheckBox cbSertanejo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}

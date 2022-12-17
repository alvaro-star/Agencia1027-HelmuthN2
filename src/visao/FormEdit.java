/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.ContaControle;
import java.sql.SQLException;
import modelo.ContaModel;

public class FormEdit extends javax.swing.JInternalFrame {

    private final ContaModel conta = new ContaModel();
    private final ContaControle controller = new ContaControle();

    public FormEdit() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        JLNumero_Conta = new javax.swing.JLabel();
        jtfNumero_Conta = new javax.swing.JTextField();
        jlNome_Cliente = new javax.swing.JLabel();
        jtNome_Cliente = new javax.swing.JTextField();
        jlEndereco = new javax.swing.JLabel();
        jlRua = new javax.swing.JLabel();
        jtfRua = new javax.swing.JTextField();
        jlNumero_Casa = new javax.swing.JLabel();
        jtNumero_Casa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jtfBairro = new javax.swing.JTextField();
        jlCep = new javax.swing.JLabel();
        jtfCep = new javax.swing.JTextField();
        jlCidade = new javax.swing.JLabel();
        jtfCidade = new javax.swing.JTextField();
        jlEstado = new javax.swing.JLabel();
        jtfEstado = new javax.swing.JTextField();
        jSend = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jbFechar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        JLNumero_Conta.setText("Número da conta");

        jtfNumero_Conta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfNumero_ContaKeyPressed(evt);
            }
        });

        jlNome_Cliente.setText("Nome do Cliente");

        jtNome_Cliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtNome_ClienteKeyPressed(evt);
            }
        });

        jlEndereco.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jlEndereco.setText("Endereço");

        jlRua.setText("Rua");

        jtfRua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfRuaKeyPressed(evt);
            }
        });

        jlNumero_Casa.setText("Numero da Casa");

        jtNumero_Casa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtNumero_CasaKeyPressed(evt);
            }
        });

        jLabel1.setText("Bairro");

        jtfBairro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfBairroKeyPressed(evt);
            }
        });

        jlCep.setText("CEP");

        jtfCep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfCepKeyPressed(evt);
            }
        });

        jlCidade.setText("Cidade");

        jtfCidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfCidadeKeyPressed(evt);
            }
        });

        jlEstado.setText("Estado");

        jtfEstado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfEstadoKeyPressed(evt);
            }
        });

        jSend.setText("Enviar");
        jSend.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSendMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jlRua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfRua, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlNumero_Casa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtNumero_Casa))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(JLNumero_Conta)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jtfNumero_Conta))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jlCidade)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jtfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jlEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jtfEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jlEndereco)
                                .addComponent(jlNome_Cliente))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jtNome_Cliente))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(12, 12, 12)
                            .addComponent(jtfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jlCep)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                            .addComponent(jtfCep, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jSend)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLNumero_Conta)
                    .addComponent(jtfNumero_Conta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNome_Cliente)
                    .addComponent(jtNome_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jlEndereco)
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlRua)
                    .addComponent(jtfRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNumero_Casa)
                    .addComponent(jtNumero_Casa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCep)
                    .addComponent(jtfCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCidade)
                    .addComponent(jtfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlEstado)
                    .addComponent(jtfEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSend)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));

        jbFechar.setText("Fechar");
        jbFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbFechar)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jbFechar)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel2.setText("Editar Conta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(203, 203, 203))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFecharActionPerformed
        dispose();
    }//GEN-LAST:event_jbFecharActionPerformed

    private void jSendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSendMouseClicked
        try {
            conta.setCep(jtfCep.getText());
            controller.update(conta);
            dispose();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jSendMouseClicked

    private void jtfNumero_ContaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNumero_ContaKeyPressed
        conta.setNumeroConta(conta.getNumeroConta() + evt.getKeyChar());
    }//GEN-LAST:event_jtfNumero_ContaKeyPressed

    private void jtNome_ClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNome_ClienteKeyPressed
        conta.setNomeCliente(conta.getNomeCliente() + evt.getKeyChar());
    }//GEN-LAST:event_jtNome_ClienteKeyPressed

    private void jtfRuaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfRuaKeyPressed
        conta.setRua(conta.getRua() + evt.getKeyChar());
    }//GEN-LAST:event_jtfRuaKeyPressed

    private void jtNumero_CasaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNumero_CasaKeyPressed
        conta.setNumeroCasa(conta.getNumeroCasa() + evt.getKeyChar());
    }//GEN-LAST:event_jtNumero_CasaKeyPressed

    private void jtfBairroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfBairroKeyPressed
        conta.setBairro(conta.getBairro() + evt.getKeyChar());
    }//GEN-LAST:event_jtfBairroKeyPressed

    private void jtfCepKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCepKeyPressed
        conta.setCep(conta.getCep() + evt.getKeyChar());
    }//GEN-LAST:event_jtfCepKeyPressed

    private void jtfCidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCidadeKeyPressed
        conta.setCidade(conta.getCidade() + evt.getKeyChar());
    }//GEN-LAST:event_jtfCidadeKeyPressed

    private void jtfEstadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfEstadoKeyPressed
        conta.setEstado(conta.getEstado() + evt.getKeyChar());
    }//GEN-LAST:event_jtfEstadoKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLNumero_Conta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jSend;
    private javax.swing.JButton jbFechar;
    private javax.swing.JLabel jlCep;
    private javax.swing.JLabel jlCidade;
    private javax.swing.JLabel jlEndereco;
    private javax.swing.JLabel jlEstado;
    private javax.swing.JLabel jlNome_Cliente;
    private javax.swing.JLabel jlNumero_Casa;
    private javax.swing.JLabel jlRua;
    private javax.swing.JTextField jtNome_Cliente;
    private javax.swing.JTextField jtNumero_Casa;
    private javax.swing.JTextField jtfBairro;
    private javax.swing.JTextField jtfCep;
    private javax.swing.JTextField jtfCidade;
    private javax.swing.JTextField jtfEstado;
    private javax.swing.JTextField jtfNumero_Conta;
    private javax.swing.JTextField jtfRua;
    // End of variables declaration//GEN-END:variables
}

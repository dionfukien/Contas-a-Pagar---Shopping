/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Notas;

import Menu.MenuPrincipal;

/**
 *
 * @author Carina
 */
public class Tela_Nota extends javax.swing.JFrame {

    /**
     * Creates new form Nota
     */
    public Tela_Nota() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela_ContasApagar = new javax.swing.JTable();
        button_CancelaNota = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        intemMenu_ContasAPagar = new javax.swing.JMenu();
        itemMenu_Inicio = new javax.swing.JMenuItem();
        itemMenu_Sair = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        itemMenu_CadastrarNotas = new javax.swing.JMenuItem();
        itemMenu_BuscaNotas = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        itemMenu_Fornecedor = new javax.swing.JMenuItem();
        itemMenu_CadastrarFornecedor = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setTitle("Notas");
        jInternalFrame1.setVisible(true);

        Tabela_ContasApagar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nº da Nota", "Valor", "Data de Pagamento", "Fornecedor", "CPF/CNPJ", "Nota Paga em..", "Valor Pago", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Float.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tabela_ContasApagar);

        button_CancelaNota.setText("Cancelar Nota");
        button_CancelaNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_CancelaNotaActionPerformed(evt);
            }
        });

        intemMenu_ContasAPagar.setText("Contas a Pagar");

        itemMenu_Inicio.setText("Inicio");
        itemMenu_Inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenu_InicioActionPerformed(evt);
            }
        });
        intemMenu_ContasAPagar.add(itemMenu_Inicio);

        itemMenu_Sair.setText("Sair");
        itemMenu_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenu_SairActionPerformed(evt);
            }
        });
        intemMenu_ContasAPagar.add(itemMenu_Sair);

        jMenuBar1.add(intemMenu_ContasAPagar);

        jMenu2.setText("Notas");

        itemMenu_CadastrarNotas.setText("Cadastrar");
        itemMenu_CadastrarNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenu_CadastrarNotasActionPerformed(evt);
            }
        });
        jMenu2.add(itemMenu_CadastrarNotas);

        itemMenu_BuscaNotas.setText("Buscar");
        itemMenu_BuscaNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenu_BuscaNotasActionPerformed(evt);
            }
        });
        jMenu2.add(itemMenu_BuscaNotas);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Fornecedor");

        itemMenu_Fornecedor.setText("Tabela Fornecedor");
        itemMenu_Fornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenu_FornecedorActionPerformed(evt);
            }
        });
        jMenu3.add(itemMenu_Fornecedor);

        itemMenu_CadastrarFornecedor.setText("Cadastrar");
        itemMenu_CadastrarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenu_CadastrarFornecedorActionPerformed(evt);
            }
        });
        jMenu3.add(itemMenu_CadastrarFornecedor);

        jMenuBar1.add(jMenu3);

        jInternalFrame1.setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button_CancelaNota)
                .addGap(45, 45, 45))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(button_CancelaNota)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemMenu_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenu_SairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_itemMenu_SairActionPerformed

    private void itemMenu_CadastrarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenu_CadastrarFornecedorActionPerformed
        
    }//GEN-LAST:event_itemMenu_CadastrarFornecedorActionPerformed

    private void itemMenu_InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenu_InicioActionPerformed
        new MenuPrincipal().setVisible(true);
    }//GEN-LAST:event_itemMenu_InicioActionPerformed

    private void itemMenu_CadastrarNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenu_CadastrarNotasActionPerformed
        new CadastrarNotas().setVisible(true);
    }//GEN-LAST:event_itemMenu_CadastrarNotasActionPerformed

    private void itemMenu_BuscaNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenu_BuscaNotasActionPerformed
        new FiltrarNota().setVisible(true);
    }//GEN-LAST:event_itemMenu_BuscaNotasActionPerformed

    private void itemMenu_FornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenu_FornecedorActionPerformed
        
    }//GEN-LAST:event_itemMenu_FornecedorActionPerformed

    private void button_CancelaNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_CancelaNotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_CancelaNotaActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Nota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Nota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Nota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Nota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Nota().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabela_ContasApagar;
    private javax.swing.JButton button_CancelaNota;
    private javax.swing.JMenu intemMenu_ContasAPagar;
    private javax.swing.JMenuItem itemMenu_BuscaNotas;
    private javax.swing.JMenuItem itemMenu_CadastrarFornecedor;
    private javax.swing.JMenuItem itemMenu_CadastrarNotas;
    private javax.swing.JMenuItem itemMenu_Fornecedor;
    private javax.swing.JMenuItem itemMenu_Inicio;
    private javax.swing.JMenuItem itemMenu_Sair;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

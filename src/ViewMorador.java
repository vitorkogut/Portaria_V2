
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vitor
 */
public class ViewMorador extends javax.swing.JFrame {
    
    public static int numeroAp;
    public static ControladorBD controladorBD;
    
    
    /**
     * Creates new form ViewMorador
     */
    public ViewMorador() {
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

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        tNumeroAp = new javax.swing.JLabel();
        boxNome = new javax.swing.JLabel();
        boxApartamento = new javax.swing.JLabel();
        boxADM = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        viewTABELA = new javax.swing.JTable();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tNumeroAp.setFont(new java.awt.Font("Times New Roman", 1, 42)); // NOI18N
        tNumeroAp.setText("jLabel1");

        boxNome.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        boxNome.setText("jLabel1");

        boxApartamento.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        boxApartamento.setText("jLabel2");

        boxADM.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        boxADM.setText("jLabel3");

        viewTABELA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Liberado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(viewTABELA);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(564, 564, 564)
                .addComponent(tNumeroAp)
                .addContainerGap(597, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(boxADM, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
                    .addComponent(boxApartamento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boxNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tNumeroAp)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(boxNome)
                        .addGap(117, 117, 117)
                        .addComponent(boxApartamento))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(109, 109, 109)
                .addComponent(boxADM)
                .addContainerGap(282, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ViewMorador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewMorador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewMorador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewMorador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewMorador().setVisible(true);
            }
        });
    }
    
    public void callView(Morador morador){
        numeroAp = morador.apartamento;
        boolean ADMAP = morador.ADM;
        String nome = morador.nome;
        
        controladorBD = new ControladorBD();
        
        this.setVisible(true);
        
        tNumeroAp.setText("Apartamento " + numeroAp);
        boxNome.setText("Proprietario: " + morador.nome);
        boxApartamento.setText("Apartamento: " + morador.apartamento);
        if(morador.ADM){
            boxADM.setText("Administrador");
        }else{
            boxADM.setText("");
        }
        
        int historicoQuantidade = controladorBD.getQauntidadeHistorico("banco",numeroAp);
        
        System.out.println(historicoQuantidade);
        
        String[] historicoNomes = new String[historicoQuantidade];
        historicoNomes = controladorBD.getHisotricoNomes("banco", numeroAp, historicoQuantidade);
        
        String[] historicoCPFS = new String[historicoQuantidade];
        historicoCPFS = controladorBD.getHisotricoCPFS("banco", numeroAp, historicoQuantidade);
       
        boolean[] historicoAceitos = new boolean[historicoQuantidade];
        historicoAceitos = controladorBD.getHisotricoAceitos("banco", numeroAp, historicoQuantidade);
        
        
        
        for(int i=0;i<historicoQuantidade;i++){
            DefaultTableModel model = (DefaultTableModel) viewTABELA.getModel();
            model.addRow(new Object[]{historicoNomes[i], historicoCPFS[i], historicoAceitos[i]});
        }
        
        
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel boxADM;
    private javax.swing.JLabel boxApartamento;
    private javax.swing.JLabel boxNome;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JLabel tNumeroAp;
    private javax.swing.JTable viewTABELA;
    // End of variables declaration//GEN-END:variables
}

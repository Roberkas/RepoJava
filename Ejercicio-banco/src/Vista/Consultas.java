/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Cuenta;
import Modelo.Movimiento;
import Modelo.Persona;
import static ejercicio.banco.EjercicioBanco.Salir;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

/**
 *
 * @author 1gdaw06
 */
public class Consultas extends javax.swing.JFrame {

    protected Persona usuario;
    protected ArrayList<Cuenta> cuentas = new ArrayList(); 
    protected JRadioButton[] botones_cuenta;
    protected JLabel[] lineas_movimientos;
    
    
    public Consultas() {
        initComponents();
        PrepararVentana();
    }
    
    public Consultas(Persona cliente){
        initComponents();
        PrepararVentana();
        usuario = cliente;
        LeerCuentas(usuario);
        MostrarCuentas();
        MostrarMovimientos(LeerMovimientos(ObtenerCuenta(BotonSelecionado().getText())));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        rbcuenta1 = new javax.swing.JRadioButton();
        rbcuenta2 = new javax.swing.JRadioButton();
        rbcuenta3 = new javax.swing.JRadioButton();
        rbcuenta4 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        tfmov1 = new javax.swing.JLabel();
        tfmov2 = new javax.swing.JLabel();
        tfmov3 = new javax.swing.JLabel();
        tfmov4 = new javax.swing.JLabel();
        tfmov5 = new javax.swing.JLabel();
        lsaldo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cuentas"));
        jPanel1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPanel1FocusLost(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        buttonGroup1.add(rbcuenta1);
        rbcuenta1.setText("Cuenta 1");
        rbcuenta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbcuenta1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbcuenta2);
        rbcuenta2.setText("Cuenta 2");
        rbcuenta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbcuenta2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbcuenta3);
        rbcuenta3.setText("Cuenta 3");
        rbcuenta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbcuenta3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbcuenta4);
        rbcuenta4.setText("Cuenta 4");
        rbcuenta4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbcuenta4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rbcuenta2)
                    .addComponent(rbcuenta1))
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rbcuenta4)
                    .addComponent(rbcuenta3))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbcuenta3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbcuenta4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbcuenta1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbcuenta2)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Movimientos"));

        tfmov1.setText("mov 1");

        tfmov2.setText("mov 2");

        tfmov3.setText("mov 3");

        tfmov4.setText("mov 4");

        tfmov5.setText("mov 5");

        lsaldo.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lsaldo.setText("saldo");

        jLabel1.setText("Saldo:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfmov1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                    .addComponent(tfmov2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfmov3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfmov4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfmov5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lsaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(168, 168, 168))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(tfmov1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfmov2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfmov3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfmov4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfmov5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lsaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        jMenu1.setText("Resumen");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Tarjetas");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Inversiones");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Mercados");
        jMenuBar1.add(jMenu4);

        jMenu5.setText("Prestamos");
        jMenuBar1.add(jMenu5);

        jMenu6.setText("Seguros");
        jMenuBar1.add(jMenu6);

        jMenu7.setText("Servicios");
        jMenuBar1.add(jMenu7);

        jMenu8.setText("Cuentas");

        jMenuItem1.setText("Consulta");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem1);

        jMenuItem2.setText("Movimientos");
        jMenu8.add(jMenuItem2);

        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void rbcuenta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbcuenta1ActionPerformed
        BorrarLineasMovimientos();
        MostrarMovimientos(LeerMovimientos(ObtenerCuenta(BotonSelecionado().getText())));
    }//GEN-LAST:event_rbcuenta1ActionPerformed

    private void rbcuenta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbcuenta3ActionPerformed
        BorrarLineasMovimientos();
        MostrarMovimientos(LeerMovimientos(ObtenerCuenta(BotonSelecionado().getText())));
    }//GEN-LAST:event_rbcuenta3ActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jPanel1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel1FocusLost
        MostrarMovimientos(LeerMovimientos(ObtenerCuenta(BotonSelecionado().getText())));
    }//GEN-LAST:event_jPanel1FocusLost

    private void rbcuenta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbcuenta2ActionPerformed
        BorrarLineasMovimientos();
        MostrarMovimientos(LeerMovimientos(ObtenerCuenta(BotonSelecionado().getText())));
    }//GEN-LAST:event_rbcuenta2ActionPerformed

    private void rbcuenta4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbcuenta4ActionPerformed
        BorrarLineasMovimientos();
        MostrarMovimientos(LeerMovimientos(ObtenerCuenta(BotonSelecionado().getText())));
    }//GEN-LAST:event_rbcuenta4ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        Salir(this);
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consultas().setVisible(true);
            }
        });
    }
    
    
    public void LeerCuentas(Persona usuario){
        for(Cuenta cuenta : usuario.getCuentas()){
            cuentas.add(cuenta);
        } 
    }
    
    public void MostrarCuentas(){
        for(int x = 0; x < cuentas.size(); x++){
            botones_cuenta[x].setText(cuentas.get(x).getId());
            botones_cuenta[x].setVisible(true);
        }
        botones_cuenta[0].setSelected(true);
    }
    
    public Cuenta ObtenerCuenta(String c1){
        for(Cuenta cuenta :cuentas){
            if(cuenta.getId().equals(c1)){
                return cuenta;
            }
        }
        return null;
    }
    
    public ArrayList<Movimiento> LeerMovimientos(Cuenta cuenta){
        ArrayList<Movimiento> movimientos = new ArrayList();
        for(Movimiento movimiento : cuenta.getMovimientos()){
            movimientos.add(movimiento);
        }
        lsaldo.setText(String.valueOf(cuenta.getSaldo()));
        return movimientos;
    }
    
    
    public void MostrarMovimientos(ArrayList<Movimiento> movimientos){
        for(int x = 0; x < movimientos.size(); x++){
            lineas_movimientos[x].setText(movimientos.get(x).toString());
            lineas_movimientos[x].setVisible(true);
        }
    }
    
    
   public void PrepararVentana(){
        this.botones_cuenta = new JRadioButton[]{rbcuenta1, rbcuenta2, rbcuenta3, rbcuenta4};
        this.lineas_movimientos = new JLabel[]{tfmov1, tfmov2, tfmov3, tfmov4, tfmov5};
        for(JRadioButton boton : botones_cuenta){
            boton.setVisible(false);
        }
        for(JLabel etiqueta : lineas_movimientos){
            etiqueta.setVisible(false);
        }
   }
   
   public void BorrarLineasMovimientos(){
       for(JLabel etiqueta : lineas_movimientos){
            etiqueta.setVisible(false);
        }
   }
   
   
   public JRadioButton BotonSelecionado(){
       for(JRadioButton boton : botones_cuenta){
           if(boton.isSelected()){
               return boton;
           }
       }
       return null;
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lsaldo;
    private javax.swing.JRadioButton rbcuenta1;
    private javax.swing.JRadioButton rbcuenta2;
    private javax.swing.JRadioButton rbcuenta3;
    private javax.swing.JRadioButton rbcuenta4;
    private javax.swing.JLabel tfmov1;
    private javax.swing.JLabel tfmov2;
    private javax.swing.JLabel tfmov3;
    private javax.swing.JLabel tfmov4;
    private javax.swing.JLabel tfmov5;
    // End of variables declaration//GEN-END:variables
}

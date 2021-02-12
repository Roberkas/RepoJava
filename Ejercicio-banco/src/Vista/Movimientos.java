/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Cuenta;
import Modelo.Persona;
import static ejercicio.banco.EjercicioBanco.GenerarMovimiento;
import static ejercicio.banco.EjercicioBanco.Salir;
import static ejercicio.banco.EjercicioBanco.ValidarCuenta;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author 1gdaw06
 */
public class Movimientos extends javax.swing.JFrame {

    protected Persona usuario;
    protected ArrayList<Cuenta> cuentas = new ArrayList(); 
    protected JRadioButton[] botones_cuenta;
    
    
    
    public Movimientos() {
        initComponents();
        PrepararVentana();
    }
    
    public Movimientos(Persona cliente) {
        initComponents();
        PrepararVentana();
        usuario = cliente;
        LeerCuentas(usuario);
        MostrarCuentas();
        
        
        
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
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbtipo = new javax.swing.JComboBox<>();
        tfcuenta = new javax.swing.JTextField();
        tfimporte = new javax.swing.JTextField();
        baceptar = new javax.swing.JButton();
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

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cuentas"));

        buttonGroup1.add(rbcuenta1);
        rbcuenta1.setText("Cuenta 1");
        rbcuenta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbcuenta1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbcuenta2);
        rbcuenta2.setText("Cuenta 2");

        buttonGroup1.add(rbcuenta3);
        rbcuenta3.setText("Cuenta3");
        rbcuenta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbcuenta3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbcuenta4);
        rbcuenta4.setText("Cuenta4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rbcuenta2)
                    .addComponent(rbcuenta1))
                .addGap(109, 109, 109)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rbcuenta4)
                    .addComponent(rbcuenta3))
                .addContainerGap(122, Short.MAX_VALUE))
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
                        .addComponent(rbcuenta1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbcuenta2)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Movimientos"));

        jLabel2.setText("Tipo");

        jLabel3.setText("Cuenta destino");

        jLabel4.setText("Importe");

        cbtipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Trasferencia", "Pago de recibo" }));

        baceptar.setText("Aceptar");
        baceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(74, 74, 74)
                                .addComponent(cbtipo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfcuenta)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(tfimporte, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(baceptar)))
                .addContainerGap(159, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbtipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfcuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfimporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(baceptar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void rbcuenta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbcuenta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbcuenta1ActionPerformed

    private void rbcuenta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbcuenta3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbcuenta3ActionPerformed

    private void baceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baceptarActionPerformed
        
        String tipo = (String) cbtipo.getSelectedItem();
        Cuenta cuenta_origen = ObtenerCuenta(BotonSelecionado().getText());
        String cuenta_destino = tfcuenta.getText();
        Cuenta c_destino = ValidarCuenta(cuenta_destino); //devuelve null si la cuenta no existe
        double importe = Double.parseDouble(tfimporte.getText());
        //if(cuenta_destino.matches("[A-Z]{2}[0-9]{22}")){
        if(c_destino!=null){
            if(importe!=0.0){
                if(cuenta_origen.getSaldo()>=importe){
                    c_destino.setSaldo(c_destino.getSaldo()+ importe);
                    cuenta_origen.setSaldo(cuenta_origen.getSaldo() - importe);
                    GenerarMovimiento(tipo, 0-importe, cuenta_origen);
                    GenerarMovimiento(tipo, importe, c_destino);
                    JOptionPane.showMessageDialog(this, "Se ha ejecutado el movimiento");
                    Salir(this);
                }
                else{
                    JOptionPane.showMessageDialog(this, "No dispones de esa cantidad en tu cuenta");
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "El importe no puede ser 0");
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "La cuenta introducida tiene un formato no valido o no existe...");
        }
    }//GEN-LAST:event_baceptarActionPerformed

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
            java.util.logging.Logger.getLogger(Movimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Movimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Movimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Movimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Movimientos().setVisible(true);
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
    
    
    public JRadioButton BotonSelecionado(){
       for(JRadioButton boton : botones_cuenta){
           if(boton.isSelected()){
               return boton;
           }
       }
       return null;
   }
    
    public void PrepararVentana(){
        this.botones_cuenta = new JRadioButton[]{rbcuenta1, rbcuenta2, rbcuenta3, rbcuenta4};
        for(JRadioButton boton : botones_cuenta){
            boton.setVisible(false);
        }
        
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton baceptar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbtipo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton rbcuenta1;
    private javax.swing.JRadioButton rbcuenta2;
    private javax.swing.JRadioButton rbcuenta3;
    private javax.swing.JRadioButton rbcuenta4;
    private javax.swing.JTextField tfcuenta;
    private javax.swing.JTextField tfimporte;
    // End of variables declaration//GEN-END:variables
}

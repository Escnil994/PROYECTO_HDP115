/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Coordinador;
import Modelo.Vo.AdministradorVo;
import Modelo.Vo.PersonalVo;
import java.awt.Image;
import java.awt.Toolkit;
import static java.lang.Integer.parseInt;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author REYCOG
 */
public class FrmInicioSesion extends javax.swing.JFrame {

    Coordinador miCoordinador;

    /**
     * Creates new form FrmInicioSesion
     */
    public FrmInicioSesion() {
        initComponents();

    }

    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("Img/logo.png"));
        //Metodo para asignar el icono de pestaña y de la barra de tareas

        return retValue;
    }

    public void setMiCoordinador(Coordinador miCoordinador) {
        this.miCoordinador = miCoordinador;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtContraLogin = new javax.swing.JPasswordField();
        jLabel25 = new javax.swing.JLabel();
        txtIdPersonalLogin = new javax.swing.JTextField();
        btnIngresaEvaluPersonalLogin = new javax.swing.JButton();
        txtNombreLogin = new javax.swing.JTextField();
        btnCancelarPersonalLogin = new javax.swing.JButton();
        btnIngresarAdmiLogin = new javax.swing.JButton();
        btnCancelarAdmiLogin = new javax.swing.JButton();
        txtDuiPersonalLogin = new javax.swing.JPasswordField();
        labelInicipersonal = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        labelInicioAdmi = new javax.swing.JLabel();
        labelFondoPantalla = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SEPENIPSMER - INICIO SESION");
        setIconImage(getIconImage());
        setResizable(false);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setBackground(new java.awt.Color(0, 0, 0));
        jLabel33.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel33.setText("Nombre:");
        jPanel4.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));

        jLabel18.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel18.setText("Número ID de personal:");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, -1, -1));
        jPanel4.add(txtContraLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 350, 40));

        jLabel25.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel25.setText("Dui:");
        jPanel4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 490, -1, -1));

        txtIdPersonalLogin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtIdPersonalLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdPersonalLoginKeyTyped(evt);
            }
        });
        jPanel4.add(txtIdPersonalLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, 340, 40));

        btnIngresaEvaluPersonalLogin.setText("Ingresar ");
        btnIngresaEvaluPersonalLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresaEvaluPersonalLoginActionPerformed(evt);
            }
        });
        jPanel4.add(btnIngresaEvaluPersonalLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 570, 190, 40));

        txtNombreLogin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel4.add(txtNombreLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 350, 40));

        btnCancelarPersonalLogin.setText("Cancelar");
        btnCancelarPersonalLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarPersonalLoginActionPerformed(evt);
            }
        });
        jPanel4.add(btnCancelarPersonalLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 570, 160, 40));

        btnIngresarAdmiLogin.setText("Ingresar");
        btnIngresarAdmiLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarAdmiLoginActionPerformed(evt);
            }
        });
        jPanel4.add(btnIngresarAdmiLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 160, 40));

        btnCancelarAdmiLogin.setText("Cancelar");
        btnCancelarAdmiLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarAdmiLoginActionPerformed(evt);
            }
        });
        jPanel4.add(btnCancelarAdmiLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 160, 40));

        txtDuiPersonalLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDuiPersonalLoginActionPerformed(evt);
            }
        });
        jPanel4.add(txtDuiPersonalLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 490, 340, 40));

        labelInicipersonal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Iniciar sesión como personal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(51, 51, 255))); // NOI18N
        jPanel4.add(labelInicipersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 960, 340));

        jLabel41.setBackground(new java.awt.Color(0, 0, 0));
        jLabel41.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel41.setText("Contraseña:");
        jPanel4.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, -1));

        labelInicioAdmi.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Iniciar sesión como administrador", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(51, 51, 255))); // NOI18N
        jPanel4.add(labelInicioAdmi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 960, 320));

        labelFondoPantalla.setForeground(new java.awt.Color(187, 187, 190));
        labelFondoPantalla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/fondoPantalla2.png"))); // NOI18N
        labelFondoPantalla.setToolTipText("");
        labelFondoPantalla.setMaximumSize(new java.awt.Dimension(500, 500));
        labelFondoPantalla.setMinimumSize(new java.awt.Dimension(500, 500));
        labelFondoPantalla.setName(""); // NOI18N
        jPanel4.add(labelFondoPantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 710));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresaEvaluPersonalLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresaEvaluPersonalLoginActionPerformed
        if (txtIdPersonalLogin.getText().isEmpty() || txtDuiPersonalLogin.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Faltan campos de texto por llenar");
        } else {
            PersonalVo miPersonalVo = new PersonalVo();
            miPersonalVo.setIdPersonal(parseInt(txtIdPersonalLogin.getText()));
            miPersonalVo.setDui(parseInt(txtDuiPersonalLogin.getText()));
            try {
                if (miCoordinador.realizarIngresoComoPersonal(miPersonalVo)) {//Se valida que el usuario sea valido
                    miCoordinador.setMiCorPersonalVo(miPersonalVo);
                    miCoordinador.mostrarFmrMenuEvaluacion();     //se muestran y se cierran Frm
                    miCoordinador.cerrarFrmInicioSesion();

                    limpiarCamposTextLoginPersonal();
                } else {
                    limpiarCamposTextLoginPersonal(); //se limpia el texto
                }
                {
                }
            } catch (SQLException ex) {
                Logger.getLogger(FrmInicioSesion.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex);
            }
        }
        
       
    }//GEN-LAST:event_btnIngresaEvaluPersonalLoginActionPerformed

    private void btnCancelarPersonalLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarPersonalLoginActionPerformed
        limpiarCamposTextLoginPersonal();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarPersonalLoginActionPerformed

    private void btnIngresarAdmiLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarAdmiLoginActionPerformed
        AdministradorVo miAdministradorVo = new AdministradorVo();
        miAdministradorVo.setContrasena(txtContraLogin.getText());
        miAdministradorVo.setNombre(txtNombreLogin.getText());
        try {
            if (miCoordinador.realizarIngresoComoAdmi(miAdministradorVo)) {//Se valida que el usuario sea valido
                miCoordinador.setMiCorAdministradorVo(miAdministradorVo);
                miCoordinador.mostrarFrmMenuPrincipal();     //se muestran y se cierran Frm
                miCoordinador.cerrarFrmInicioSesion();

                limpiarCamposTextLoginAdmi();
            } else {
                limpiarCamposTextLoginAdmi(); //se limpia el texto
            }
            {
            }
        } catch (SQLException ex) {
            Logger.getLogger(FrmInicioSesion.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnIngresarAdmiLoginActionPerformed

    private void btnCancelarAdmiLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarAdmiLoginActionPerformed
        limpiarCamposTextLoginAdmi();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarAdmiLoginActionPerformed

    private void txtIdPersonalLoginKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdPersonalLoginKeyTyped
        validarCaracteresNumericos(evt);
    }//GEN-LAST:event_txtIdPersonalLoginKeyTyped

    private void txtDuiPersonalLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDuiPersonalLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDuiPersonalLoginActionPerformed
    public void validarCaracteresNumericos(java.awt.event.KeyEvent evt) {
        //Metodo para evitar la entrada de alfanumericos A-Z y caracteres especiales
        char caracter = evt.getKeyChar();//se toma el caracter digitado
        if (((caracter < '0')
                || //se valida que sea de entre 0 y 9
                (caracter > '9'))
                && //no se permitira que sea un "espacio",
                (caracter != evt.VK_BACK_SPACE)) {
            evt.consume();
        }
    }

    private void limpiarCamposTextLoginPersonal() {
        txtIdPersonalLogin.setText("");
        txtDuiPersonalLogin.setText("");
        //Metodo para limpiar campos de texto
    }

    private void limpiarCamposTextLoginAdmi() {
        txtContraLogin.setText("");
        txtNombreLogin.setText("");
        //Metodo para limpiar campos de texto
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarAdmiLogin;
    private javax.swing.JButton btnCancelarPersonalLogin;
    private javax.swing.JButton btnIngresaEvaluPersonalLogin;
    private javax.swing.JButton btnIngresarAdmiLogin;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel labelFondoPantalla;
    private javax.swing.JLabel labelInicioAdmi;
    private javax.swing.JLabel labelInicipersonal;
    private javax.swing.JPasswordField txtContraLogin;
    private javax.swing.JPasswordField txtDuiPersonalLogin;
    private javax.swing.JTextField txtIdPersonalLogin;
    private javax.swing.JTextField txtNombreLogin;
    // End of variables declaration//GEN-END:variables
}

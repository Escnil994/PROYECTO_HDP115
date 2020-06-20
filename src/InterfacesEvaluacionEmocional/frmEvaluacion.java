
package InterfacesEvaluacionEmocional;

import clasesEvaluacionEmocional.Preguntas;
import clasesEvaluacionEmocional.Respuestas;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class frmEvaluacion extends javax.swing.JFrame {


    
        int posicion = 0;
        int posicionaux;
        Respuestas r = new Respuestas();
        Preguntas p = new Preguntas();
        
        //Estos arreglos guardaran la puntuacion obtenida en el cuestionario.
        int[ ] atencionEmocional = {-1,-1,-1,-1,-1,-1,-1,-1};
        int[ ] claridadEmocional = {-1,-1,-1,-1,-1,-1,-1,-1};
        int[ ] reparacionEmociones = {-1,-1,-1,-1,-1,-1,-1,-1};
        
    public frmEvaluacion() {
        initComponents();
    
        lblPregunta.setText(p.getPregunta(posicion));
        buttonGroup1.clearSelection(); // sirve para borrar las selecciones de los radio button
        opc1.setText(r.getRespuesta(0));
        opc2.setText(r.getRespuesta(1));
        opc3.setText(r.getRespuesta(2));
        opc4.setText(r.getRespuesta(3));
        opc5.setText(r.getRespuesta(4));
        opc1.requestFocus();
        btnRegresar.setEnabled(false);
        btnAvanzar.setEnabled(false);
        btnTerminarExamen.setEnabled(false);
    }

    Object[] select = {"","","","",""};
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblPregunta = new javax.swing.JLabel();
        opc1 = new javax.swing.JRadioButton();
        opc2 = new javax.swing.JRadioButton();
        opc3 = new javax.swing.JRadioButton();
        opc5 = new javax.swing.JRadioButton();
        btnTerminarExamen = new javax.swing.JButton();
        btnAvanzar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        opc4 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Examen"));
        jPanel1.setName("Examen"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Pregunta");

        lblPregunta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPregunta.setText("¿Pregunta 1?");

        buttonGroup1.add(opc1);
        opc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(opc2);
        opc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(opc3);
        opc3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(opc5);
        opc5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc5ActionPerformed(evt);
            }
        });

        btnTerminarExamen.setText("Terminar Examen");
        btnTerminarExamen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerminarExamenActionPerformed(evt);
            }
        });

        btnAvanzar.setText("Avanzar >>");
        btnAvanzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvanzarActionPerformed(evt);
            }
        });

        btnRegresar.setText("<< Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        buttonGroup1.add(opc4);
        opc4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(lblPregunta))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(opc2)
                            .addComponent(opc1)
                            .addComponent(opc3)
                            .addComponent(opc5)
                            .addComponent(opc4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 437, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(btnTerminarExamen))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnRegresar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAvanzar)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAvanzar)
                            .addComponent(btnRegresar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTerminarExamen))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPregunta)
                        .addGap(28, 28, 28)
                        .addComponent(opc1)
                        .addGap(18, 18, 18)
                        .addComponent(opc2)
                        .addGap(18, 18, 18)
                        .addComponent(opc3)
                        .addGap(18, 18, 18)
                        .addComponent(opc4)
                        .addGap(18, 18, 18)
                        .addComponent(opc5)))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opc4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc4ActionPerformed
            
        if(posicion>=0 && posicion<23){
                 btnAvanzar.setEnabled(true);
                 btnTerminarExamen.setEnabled(false);
                }
            else{
                 btnAvanzar.setEnabled(false);
                 btnTerminarExamen.setEnabled(true);
                }
        
    }//GEN-LAST:event_opc4ActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed

         if(posicion==1)
        {
            btnRegresar.setEnabled(false);
            btnTerminarExamen.setEnabled(false);
            btnAvanzar.setEnabled(true);
        }
         else{
            btnRegresar.setEnabled(true);
            btnTerminarExamen.setEnabled(false);
            btnAvanzar.setEnabled(true); 
         }
         posicion--;
         lblPregunta.setText(p.getPregunta(posicion));
         
         //Para recuperar la opcion seleccionado por el usuario
         if(posicion>=0 && posicion <=7){
             if (atencionEmocional[posicion]==1){
                 opc1.setSelected(true);
             }
             else if(atencionEmocional[posicion]==2){
                 opc2.setSelected(true);
             }
             else if(atencionEmocional[posicion]==3){
                 opc3.setSelected(true);
             }
             else if(atencionEmocional[posicion]==4){
                 opc4.setSelected(true);
             }
             else if(atencionEmocional[posicion]==5){
                 opc5.setSelected(true);
             }
         }
         else if(posicion>=8 && posicion <=15){
             
             posicionaux=posicion-8;
                     
             if (claridadEmocional[posicionaux]==1){
                 opc1.setSelected(true);
             }
             else if(claridadEmocional[posicionaux]==2){
                 opc2.setSelected(true);
             }
             else if(claridadEmocional[posicionaux]==3){
                 opc3.setSelected(true);
             }
             else if(claridadEmocional[posicionaux]==4){
                 opc4.setSelected(true);
             }
             else if(claridadEmocional[posicionaux]==5){
                 opc5.setSelected(true);
             }
         }
         else if(posicion>=16 && posicion <=23){
             
             posicionaux=posicion-16;
             
              if (reparacionEmociones[posicionaux]==1){
                 opc1.setSelected(true);
             }
             else if(reparacionEmociones[posicionaux]==2){
                 opc2.setSelected(true);
             }
             else if(reparacionEmociones[posicionaux]==3){
                 opc3.setSelected(true);
             }
             else if(reparacionEmociones[posicionaux]==4){
                 opc4.setSelected(true);
             }
             else if(reparacionEmociones[posicionaux]==5){
                 opc5.setSelected(true);
             }
         }
         
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnAvanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvanzarActionPerformed
        
        if(posicion>=0 && posicion <22){
                btnRegresar.setEnabled(true);
                btnTerminarExamen.setEnabled(false);
                btnAvanzar.setEnabled(false);
            }
        else if(posicion==22){
                btnRegresar.setEnabled(true);
                btnTerminarExamen.setEnabled(false);
                btnAvanzar.setEnabled(false);
            }
        
            
            //Procedimiento para guardar los datos en arrays correspondientes
            if(opc1.isSelected()){
                if(posicion>=0 && posicion<=7){
                    atencionEmocional[posicion]=1;
                }
                else if(posicion>=8 && posicion<=15){
                    posicionaux=posicion-8;
                    claridadEmocional[posicionaux]=1;
                }
                else if(posicion>=16 && posicion<=23){
                    reparacionEmociones[posicion-16]=1;
                }
            }
            else if(opc2.isSelected()){
                if(posicion>=0 && posicion<=7){
                    atencionEmocional[posicion]=2;
                }
                else if(posicion>=8 && posicion<=15){
                    claridadEmocional[posicion-8]=2;
                }
                else if(posicion>=16 && posicion<=23){
                    reparacionEmociones[posicion-16]=2;
                }
            }
            else if(opc3.isSelected()){
                if(posicion>=0 && posicion<=7){
                    atencionEmocional[posicion]=3;
                }
                else if(posicion>=8 && posicion<=15){
                    claridadEmocional[posicion-8]=3;
                }
                else if(posicion>=16 && posicion<=23){
                    reparacionEmociones[posicion-16]=3;
                }
            }
            else if(opc4.isSelected()){
                if(posicion>=0 && posicion<=7){
                    atencionEmocional[posicion]=4;
                }
                else if(posicion>=8 && posicion<=15){
                   claridadEmocional[posicion-8]=4; 
                }
                else if(posicion>=16 && posicion<=23){
                    reparacionEmociones[posicion-16]=4;
                }
            }
            else if(opc5.isSelected()){
                if(posicion>=0 && posicion<=7){
                    atencionEmocional[posicion]=5;
                }
                else if(posicion>=8 && posicion<=15){
                   claridadEmocional[posicion-8]=5; 
                }
                else if(posicion>=16 && posicion<=23){
                   reparacionEmociones[posicion-16]=5; 
                }
            }
    
        posicion++;
        lblPregunta.setText(p.getPregunta(posicion));
        
        //Esto es para recuperar opciones seleccionados por el usuario
        if(posicion>=1 && posicion <=7){
            if(atencionEmocional[posicion]==-1){
                 buttonGroup1.clearSelection();
             }
            else if (atencionEmocional[posicion]==1){
                 opc1.setSelected(true);
             }
             else if(atencionEmocional[posicion]==2){
                 opc2.setSelected(true);
             }
             else if(atencionEmocional[posicion]==3){
                 opc3.setSelected(true);
             }
             else if(atencionEmocional[posicion]==4){
                 opc4.setSelected(true);
             }
             else if(atencionEmocional[posicion]==5){
                 opc5.setSelected(true);
             }
         }
         else if(posicion>=8 && posicion <=15){
             if(claridadEmocional[posicion-8]==-1){
                 buttonGroup1.clearSelection();
             }
             else if (claridadEmocional[posicion-8]==1){
                 opc1.setSelected(true);
             }
             else if(claridadEmocional[posicion-8]==2){
                 opc2.setSelected(true);
             }
             else if(claridadEmocional[posicion-8]==3){
                 opc3.setSelected(true);
             }
             else if(claridadEmocional[posicion-8]==4){
                 opc4.setSelected(true);
             }
             else if(claridadEmocional[posicion-8]==5){
                 opc5.setSelected(true);
             }
         }
         else if(posicion>=16 && posicion <=23){
             if(reparacionEmociones[posicion-16]==-1){
                 buttonGroup1.clearSelection();
             }
             else if (reparacionEmociones[posicion]==1){
                 opc1.setSelected(true);
             }
             else if(reparacionEmociones[posicion-16]==2){
                 opc2.setSelected(true);
             }
             else if(reparacionEmociones[posicion-16]==3){
                 opc3.setSelected(true);
             }
             else if(reparacionEmociones[posicion-16]==4){
                 opc4.setSelected(true);
             }
             else if(reparacionEmociones[posicion-16]==5){
                 opc5.setSelected(true);
             }
         }
    }//GEN-LAST:event_btnAvanzarActionPerformed

    private void btnTerminarExamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminarExamenActionPerformed
        
            try {
                //Guardar ultimo registro
                if(opc1.isSelected()){
                    reparacionEmociones[7]=1;
                }
                else if(opc2.isSelected()){
                    reparacionEmociones[7]=2;
                }
                else if(opc3.isSelected()){
                    reparacionEmociones[7]=3;
                }
                else if(opc4.isSelected()){
                    reparacionEmociones[7]=4;
                }
                else if(opc5.isSelected()){
                    reparacionEmociones[7]=5;
                }
                
                //Calculamod puntajes
                int puntaje1= atencionEmocional[0]+atencionEmocional[1]+atencionEmocional[2]+atencionEmocional[3]+atencionEmocional[4]
                        +atencionEmocional[5]+atencionEmocional[6]+atencionEmocional[7];
                int puntaje2=claridadEmocional[0]+claridadEmocional[1]+claridadEmocional[2]+claridadEmocional[3]+claridadEmocional[4]+
                        claridadEmocional[5]+claridadEmocional[6]+claridadEmocional[7];
                int puntaje3=reparacionEmociones[0]+reparacionEmociones[1]+reparacionEmociones[2]+reparacionEmociones[3]+
                        reparacionEmociones[4]+reparacionEmociones[5]+reparacionEmociones[6]+reparacionEmociones[7];
                
                frmResultados e;
                e = new frmResultados(puntaje1,puntaje2,puntaje3);
                e.setVisible(true);
                this.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(frmEvaluacion.class.getName()).log(Level.SEVERE, null, ex);
            }

    }//GEN-LAST:event_btnTerminarExamenActionPerformed

    private void opc5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc5ActionPerformed

       if(posicion>=0 && posicion<23){
           btnAvanzar.setEnabled(true);
           btnTerminarExamen.setEnabled(false);
       }
       else if(posicion==23){
           btnAvanzar.setEnabled(false);
           btnTerminarExamen.setEnabled(true);
       }
    }//GEN-LAST:event_opc5ActionPerformed

    private void opc3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc3ActionPerformed
        if(posicion>=0 && posicion<23){
           btnAvanzar.setEnabled(true);
           btnTerminarExamen.setEnabled(false);
       }
       else{
           btnAvanzar.setEnabled(true);
           btnTerminarExamen.setEnabled(true);
       }
    }//GEN-LAST:event_opc3ActionPerformed

    private void opc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc2ActionPerformed
        if(posicion>=0 && posicion<23){
           btnAvanzar.setEnabled(true);
       }
       else{
           btnAvanzar.setEnabled(false);
           btnTerminarExamen.setEnabled(true);
       }
    }//GEN-LAST:event_opc2ActionPerformed

    private void opc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc1ActionPerformed
        if(posicion>=0 && posicion<23){
           btnAvanzar.setEnabled(true);
           btnTerminarExamen.setEnabled(false);
       }
       else{
           btnAvanzar.setEnabled(false);
           btnTerminarExamen.setEnabled(true);
       }
    }//GEN-LAST:event_opc1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvanzar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnTerminarExamen;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblPregunta;
    private javax.swing.JRadioButton opc1;
    private javax.swing.JRadioButton opc2;
    private javax.swing.JRadioButton opc3;
    private javax.swing.JRadioButton opc4;
    private javax.swing.JRadioButton opc5;
    // End of variables declaration//GEN-END:variables
}

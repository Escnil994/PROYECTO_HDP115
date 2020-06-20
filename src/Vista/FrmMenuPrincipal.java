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
import java.awt.event.KeyEvent;
import static java.lang.Integer.parseInt;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author CDC2
 */
public class FrmMenuPrincipal extends javax.swing.JFrame {

    Coordinador miCoordinador;
    PersonalVo miPersonalVo;
    AdministradorVo miAdministradorVo;
    private int numFila;

    public FrmMenuPrincipal() {
        initComponents();
        String[] opcionesSexo = {"Seleccionar", "F", "M"};
        String[] opcionesEstudios = {"Seleccionar", "Basico", "Intermedio", "Superior"};
        setComboBoxItems(comboBoxSexoRegist, opcionesSexo);
        setComboBoxItems(comboBoxSexoMod, opcionesSexo);  //Cargar los Items de los comboBox
        setComboBoxItems(comboBoxEstudiosRegist, opcionesEstudios);
        setComboBoxItems(comboBoxEstudiosMod, opcionesEstudios);
        obtenerAsignarFecha();

        desblockOblockCamposMod(false);
        this.miPersonalVo = new PersonalVo();
    }
//METDOS DE ASIGNAR

    private void setComboBoxItems(JComboBox combo, String[] opciones) {
        for (String sexo : opciones) {
            combo.addItem(sexo); //añadimos las opciones al combobox
        }
    }

    public void setMiCoordinador(Coordinador miCoordinador) {
        this.miCoordinador = miCoordinador;
    }

    public void setMiAdministradorVo(AdministradorVo miAdministradorVo) {
        this.miAdministradorVo = miAdministradorVo;
    }
    //METODOS DE OBTENER    

    public void obtenerAsignarFecha() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("YYYY/MM/dd");
        LocalDate fechaactual = LocalDate.now();
        txtFechaActualConsult.setText(fechaactual.toString());
        txtFechaActualRegist.setText(fechaactual.toString());
        txtFechaActualMod.setText(fechaactual.toString());
    }

    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("Img/logo.png"));
        //Metodo para asignar el icono de pestaña y de la barra de tareas

        return retValue;
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabbedPaneMenuPrincipal = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btnRegistrarPersonal = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTNombreProveedor1 = new javax.swing.JLabel();
        txtApellidRegist = new javax.swing.JTextField();
        txtDuiRegist = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        txtNombreRegist = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        txtDireccionRegist = new javax.swing.JTextField();
        comboBoxSexoRegist = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        txtTelefonoRegist = new javax.swing.JTextField();
        txtCelularRegist = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        comboBoxEstudiosRegist = new javax.swing.JComboBox<>();
        dateNacimientoRegist = new com.toedter.calendar.JDateChooser();
        jLabel59 = new javax.swing.JLabel();
        txtFechaActualRegist = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        btnCancelRegist = new javax.swing.JButton();
        txtCorreoRegist = new javax.swing.JTextField();
        labelRegistroPersonal = new javax.swing.JLabel();
        LabelFondoPantallaRegistro = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTNombreProveedor = new javax.swing.JLabel();
        txtApellidMod = new javax.swing.JTextField();
        txtDuiMod = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        btnDesbloquearCampos = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        txtNombreMod = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtNombreBusquedad = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablePersonalBusquedad = new javax.swing.JTable();
        txtDireccionMod = new javax.swing.JTextField();
        comboBoxSexoMod = new javax.swing.JComboBox<>();
        txIdPersonalBusquedad = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        btnCancelarBusquedad = new javax.swing.JButton();
        txtTelefonoMod = new javax.swing.JTextField();
        txtCelularMod = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        comboBoxEstudiosMod = new javax.swing.JComboBox<>();
        dateNacimientoMod = new com.toedter.calendar.JDateChooser();
        jLabel30 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        txtFechaActualMod = new javax.swing.JTextField();
        txtCorreoMod = new javax.swing.JTextField();
        labelModificarDatoss = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        labelBusquedad = new javax.swing.JLabel();
        labelFondoPantalla = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tableEvaluacionesConsult = new javax.swing.JTable();
        btnBuscarConsult = new javax.swing.JButton();
        btnEliminarEvaluConult = new javax.swing.JButton();
        jLabel61 = new javax.swing.JLabel();
        txtFechaActualConsult = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        txt = new javax.swing.JLabel();
        btnImprimirEvaluacionConsulta = new javax.swing.JButton();
        txIdPersonalConsult = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        DateRealizacionConsult = new com.toedter.calendar.JDateChooser();
        labelConsultarEvaluaciones = new javax.swing.JLabel();
        labelFondoPantallaConsulta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SEPENIPSMER - MENU PRINCIPAL");
        setIconImage(getIconImage());
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegistrarPersonal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnRegistrarPersonal.setText("Registrar");
        jPanel1.add(btnRegistrarPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 730, 150, 40));

        jLabel20.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel20.setText("Dui:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        jLabel21.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel21.setText("Apellidos:");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        jTNombreProveedor1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jTNombreProveedor1.setText("Sexo:");
        jPanel1.add(jTNombreProveedor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));
        jPanel1.add(txtApellidRegist, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 260, -1));
        jPanel1.add(txtDuiRegist, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 260, -1));

        jLabel32.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel32.setText("Dirección:");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        jLabel37.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel37.setText("Nombres:");
        jPanel1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));
        jPanel1.add(txtNombreRegist, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 260, -1));

        jLabel34.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel34.setText("Estudios:");
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, -1, 20));
        jPanel1.add(txtDireccionRegist, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 260, -1));

        jPanel1.add(comboBoxSexoRegist, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 260, -1));

        jLabel35.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel35.setText("Correo:");
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, -1, -1));

        jLabel42.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel42.setText("Telefono:");
        jPanel1.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, -1, -1));
        jPanel1.add(txtTelefonoRegist, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 260, -1));
        jPanel1.add(txtCelularRegist, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 260, -1));

        jLabel43.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel43.setText("Fecha de nacimiento:");
        jPanel1.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 560, -1, -1));

        jPanel1.add(comboBoxEstudiosRegist, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 260, -1));

        dateNacimientoRegist.setDateFormatString("yyyy-MM-dd");
        dateNacimientoRegist.setFocusable(false);
        dateNacimientoRegist.setMinSelectableDate(new java.util.Date(-62135744325000L));
        jPanel1.add(dateNacimientoRegist, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 560, 260, -1));

        jLabel59.setBackground(new java.awt.Color(0, 0, 0));
        jLabel59.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel59.setText("Fecha:");
        jPanel1.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, -1, -1));

        txtFechaActualRegist.setEditable(false);
        jPanel1.add(txtFechaActualRegist, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 30, 110, -1));

        jLabel44.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel44.setText("Celular:");
        jPanel1.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, -1, -1));

        btnCancelRegist.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCancelRegist.setText("Cancelar");
        jPanel1.add(btnCancelRegist, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 730, 150, 40));
        jPanel1.add(txtCorreoRegist, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 500, 260, -1));

        labelRegistroPersonal.setBackground(new java.awt.Color(204, 204, 204));
        labelRegistroPersonal.setForeground(new java.awt.Color(51, 51, 255));
        labelRegistroPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de personal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(51, 51, 255))); // NOI18N
        jPanel1.add(labelRegistroPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1040, 820));

        LabelFondoPantallaRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/fondoPantalla.png"))); // NOI18N
        LabelFondoPantallaRegistro.setMaximumSize(new java.awt.Dimension(500, 500));
        LabelFondoPantallaRegistro.setMinimumSize(new java.awt.Dimension(500, 500));
        LabelFondoPantallaRegistro.setName(""); // NOI18N
        jPanel1.add(LabelFondoPantallaRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -80, 1090, 990));

        jTabbedPaneMenuPrincipal.addTab("Registrar ", jPanel1);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setBackground(new java.awt.Color(0, 0, 0));
        jLabel33.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel33.setText("Búsqueda por ID personal:");
        jPanel4.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, -1, -1));

        jLabel18.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel18.setText("Dui:");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 490, -1, -1));

        jLabel19.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel19.setText("Apellidos:");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 590, -1, -1));

        jTNombreProveedor.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jTNombreProveedor.setText("Sexo:");
        jPanel4.add(jTNombreProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 490, -1, -1));
        jPanel4.add(txtApellidMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 590, 230, -1));
        jPanel4.add(txtDuiMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 490, 230, -1));

        jLabel25.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel25.setText("Dirección:");
        jPanel4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 640, -1, -1));

        btnModificar.setText("Modificar");
        jPanel4.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 760, 160, 40));

        btnDesbloquearCampos.setText("Desbloquear Campos");
        jPanel4.add(btnDesbloquearCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 760, 190, 40));

        jLabel36.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel36.setText("Nombres:");
        jPanel4.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 540, -1, -1));
        jPanel4.add(txtNombreMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 540, 230, -1));

        jLabel26.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel26.setText("Estudios:");
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 700, -1, -1));
        jPanel4.add(txtNombreBusquedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 220, -1));

        tablePersonalBusquedad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablePersonalBusquedad.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablePersonalBusquedad.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tablePersonalBusquedad);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 980, 250));
        jPanel4.add(txtDireccionMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 640, 230, -1));

        comboBoxSexoMod.setEditable(true);
        comboBoxSexoMod.setEnabled(false);
        jPanel4.add(comboBoxSexoMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 490, 260, -1));
        jPanel4.add(txIdPersonalBusquedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 220, -1));

        btnCancelar.setText("Cancelar");
        jPanel4.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 760, 160, 40));

        btnEliminar.setText("Eliminar");
        jPanel4.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 760, 160, 40));

        jLabel27.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel27.setText("Correo:");
        jPanel4.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 640, -1, -1));

        jLabel28.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel28.setText("Telefono:");
        jPanel4.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 550, -1, -1));

        btnCancelarBusquedad.setText("Cancelar");
        jPanel4.add(btnCancelarBusquedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 160, 40));
        jPanel4.add(txtTelefonoMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 540, 260, -1));
        jPanel4.add(txtCelularMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 590, 260, -1));

        jLabel29.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel29.setText("Fecha de nacimiento:");
        jPanel4.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 700, -1, -1));

        comboBoxEstudiosMod.setEditable(true);
        comboBoxEstudiosMod.setEnabled(false);
        jPanel4.add(comboBoxEstudiosMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 700, 230, -1));

        dateNacimientoMod.setDateFormatString("yyyy-MM-dd");
        jPanel4.add(dateNacimientoMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 700, 260, -1));

        jLabel30.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel30.setText("Celular:");
        jPanel4.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 590, -1, -1));

        jLabel58.setBackground(new java.awt.Color(0, 0, 0));
        jLabel58.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel58.setText("Fecha:");
        jPanel4.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, -1, -1));

        txtFechaActualMod.setEditable(false);
        jPanel4.add(txtFechaActualMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, 110, -1));
        jPanel4.add(txtCorreoMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 640, 260, -1));

        labelModificarDatoss.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Modificar datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(51, 51, 255))); // NOI18N
        jPanel4.add(labelModificarDatoss, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 1030, 380));

        jLabel38.setBackground(new java.awt.Color(0, 0, 0));
        jLabel38.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel38.setText("Seleccionar un registro:");
        jPanel4.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jLabel41.setBackground(new java.awt.Color(0, 0, 0));
        jLabel41.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel41.setText("Búsqueda por Nombre:");
        jPanel4.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));

        labelBusquedad.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Búsquedad de personal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(51, 51, 255))); // NOI18N
        jPanel4.add(labelBusquedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1030, 430));

        labelFondoPantalla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/fondoPantalla.png"))); // NOI18N
        labelFondoPantalla.setMaximumSize(new java.awt.Dimension(500, 500));
        labelFondoPantalla.setMinimumSize(new java.awt.Dimension(500, 500));
        labelFondoPantalla.setName(""); // NOI18N
        jPanel4.add(labelFondoPantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -50, 1080, 940));

        jTabbedPaneMenuPrincipal.addTab("Buscar/Modificar", jPanel4);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableEvaluacionesConsult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableEvaluacionesConsult.getTableHeader().setReorderingAllowed(false);
        jScrollPane9.setViewportView(tableEvaluacionesConsult);

        jPanel6.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 990, 260));

        btnBuscarConsult.setText("Buscar");
        jPanel6.add(btnBuscarConsult, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, 150, 40));

        btnEliminarEvaluConult.setText("Eliminar evaluación");
        jPanel6.add(btnEliminarEvaluConult, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 470, 210, 40));

        jLabel61.setBackground(new java.awt.Color(0, 0, 0));
        jLabel61.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel61.setText("Fecha:");
        jPanel6.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, 50, -1));

        txtFechaActualConsult.setEditable(false);
        jPanel6.add(txtFechaActualConsult, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 30, 110, -1));

        jLabel45.setBackground(new java.awt.Color(0, 0, 0));
        jLabel45.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel45.setText("Búsqueda por ID personal:");
        jPanel6.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        jLabel46.setBackground(new java.awt.Color(0, 0, 0));
        jLabel46.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel46.setText("Búsqueda por fecha de realización:");
        jPanel6.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 240, -1));
        jPanel6.add(txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 534, 100, 30));

        btnImprimirEvaluacionConsulta.setText("Imprimir reporte de evaluación");
        jPanel6.add(btnImprimirEvaluacionConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 540, 210, 40));
        jPanel6.add(txIdPersonalConsult, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 230, -1));

        jLabel39.setBackground(new java.awt.Color(0, 0, 0));
        jLabel39.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel39.setText("Seleccionar una evaluación para imprimir su reporte:");
        jPanel6.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 550, 380, -1));

        jLabel40.setBackground(new java.awt.Color(0, 0, 0));
        jLabel40.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel40.setText("Seleccionar un registro:");
        jPanel6.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jLabel47.setBackground(new java.awt.Color(0, 0, 0));
        jLabel47.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel47.setText("Seleccionar una evaluación a eliminar:");
        jPanel6.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 380, -1));

        DateRealizacionConsult.setDateFormatString("yyyy-MM-dd");
        jPanel6.add(DateRealizacionConsult, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 230, -1));

        labelConsultarEvaluaciones.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consultar evaluaciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(51, 51, 255))); // NOI18N
        jPanel6.add(labelConsultarEvaluaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1030, 820));

        labelFondoPantallaConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/fondoPantalla.png"))); // NOI18N
        labelFondoPantallaConsulta.setMaximumSize(new java.awt.Dimension(500, 500));
        labelFondoPantallaConsulta.setMinimumSize(new java.awt.Dimension(500, 500));
        labelFondoPantallaConsulta.setName(""); // NOI18N
        jPanel6.add(labelFondoPantallaConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -30, 1080, 900));

        jTabbedPaneMenuPrincipal.addTab("Consultar", jPanel6);

        jScrollPane1.setViewportView(jTabbedPaneMenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1060, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 902, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void jCalendar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCalendar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCalendar1ActionPerformed


    private void mostrarPersonaTablaBusquedad() {
        miPersonalVo.setNombre("");//Cancela las busqueda y muestra todos los registros del peronal
        miCoordinador.cargarBusquedaNombresPersonal(miPersonalVo, tablePersonalBusquedad);    //para mostrar todos los registros 
    }    public void validarCorreoCaracteres(JTextField campo, java.awt.event.KeyEvent evt) {
        //Metdo para ecitar entra de caracteres no validos
        if (campo.getText().length() > 49) {
            evt.consume(); //hace que esa pulsación de tecla se rechace.
            Toolkit.getDefaultToolkit().beep(); //sonido de no aceptar más caracteres.
        }
    }

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

    public void limpiarCamposTextBusquedad() {
        //Metodo para limpiar los campos de texto de la parte de busqueda personal
        txIdPersonalBusquedad.setText(null);
        txtNombreBusquedad.setText(null);
    }

    public void limpiarCamposTextRegistro() {
        //Metodo para limpiar los campos de texto del registro
        txtDuiRegist.setText(null);
        txtNombreRegist.setText(null);
        txtApellidRegist.setText(null);
        txtTelefonoRegist.setText(null);
        txtCelularRegist.setText(null);
        txtCorreoRegist.setText(null);
        txtDireccionRegist.setText(null);
        dateNacimientoRegist.setCalendar(null);
        comboBoxSexoRegist.setSelectedIndex(0);
        comboBoxEstudiosRegist.setSelectedIndex(0);
    }

    public void limpiarCamposTextModificar() {
        txtDuiMod.setText(null);
        txtNombreMod.setText(null);
        txtApellidMod.setText(null);
        txtDireccionMod.setText(null);
        comboBoxEstudiosMod.setSelectedIndex(0);
        comboBoxSexoMod.setSelectedIndex(0);
        txtTelefonoMod.setText(null);
        txtCelularMod.setText(null);
        txtCorreoMod.setText(null);
        dateNacimientoMod.setCalendar(null);
    }

    public void desblockOblockCamposMod(boolean a) {
        txtDuiMod.setEnabled(a);
        txtNombreMod.setEnabled(a);
        txtApellidMod.setEnabled(a);
        txtDireccionMod.setEnabled(a);
        comboBoxEstudiosMod.setEnabled(a);
        comboBoxSexoMod.setEnabled(a);
        txtTelefonoMod.setEnabled(a);
        txtCelularMod.setEnabled(a);
        txtCorreoMod.setEnabled(a);
        dateNacimientoMod.setEnabled(a);
        if (a) {
            comboBoxEstudiosMod.setEditable(false);
            comboBoxSexoMod.setEditable(false);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateRealizacionConsult;
    private javax.swing.JLabel LabelFondoPantallaRegistro;
    private javax.swing.JButton btnBuscarConsult;
    private javax.swing.JButton btnCancelRegist;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelarBusquedad;
    private javax.swing.JButton btnDesbloquearCampos;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminarEvaluConult;
    private javax.swing.JButton btnImprimirEvaluacionConsulta;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrarPersonal;
    private javax.swing.JComboBox<String> comboBoxEstudiosMod;
    private javax.swing.JComboBox<String> comboBoxEstudiosRegist;
    private javax.swing.JComboBox<String> comboBoxSexoMod;
    private javax.swing.JComboBox<String> comboBoxSexoRegist;
    private com.toedter.calendar.JDateChooser dateNacimientoMod;
    private com.toedter.calendar.JDateChooser dateNacimientoRegist;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel jTNombreProveedor;
    private javax.swing.JLabel jTNombreProveedor1;
    private javax.swing.JTabbedPane jTabbedPaneMenuPrincipal;
    private javax.swing.JLabel labelBusquedad;
    private javax.swing.JLabel labelConsultarEvaluaciones;
    private javax.swing.JLabel labelFondoPantalla;
    private javax.swing.JLabel labelFondoPantallaConsulta;
    private javax.swing.JLabel labelModificarDatoss;
    private javax.swing.JLabel labelRegistroPersonal;
    private javax.swing.JTable tableEvaluacionesConsult;
    private javax.swing.JTable tablePersonalBusquedad;
    private javax.swing.JTextField txIdPersonalBusquedad;
    private javax.swing.JTextField txIdPersonalConsult;
    private javax.swing.JLabel txt;
    private javax.swing.JTextField txtApellidMod;
    private javax.swing.JTextField txtApellidRegist;
    private javax.swing.JTextField txtCelularMod;
    private javax.swing.JTextField txtCelularRegist;
    private javax.swing.JTextField txtCorreoMod;
    private javax.swing.JTextField txtCorreoRegist;
    private javax.swing.JTextField txtDireccionMod;
    private javax.swing.JTextField txtDireccionRegist;
    private javax.swing.JTextField txtDuiMod;
    private javax.swing.JTextField txtDuiRegist;
    private javax.swing.JTextField txtFechaActualConsult;
    private javax.swing.JTextField txtFechaActualMod;
    private javax.swing.JTextField txtFechaActualRegist;
    private javax.swing.JTextField txtNombreBusquedad;
    private javax.swing.JTextField txtNombreMod;
    private javax.swing.JTextField txtNombreRegist;
    private javax.swing.JTextField txtTelefonoMod;
    private javax.swing.JTextField txtTelefonoRegist;
    // End of variables declaration//GEN-END:variables

}

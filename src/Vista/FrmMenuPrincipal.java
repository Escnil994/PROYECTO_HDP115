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
    private int numFilaTablePersonal;
    private int numFilaTableEvaluacion;
    private int duiSelec;

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
        btnEliminarMod = new javax.swing.JButton();
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
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCerrar = new javax.swing.JMenu();
        jMenuItemCerrarSesion = new javax.swing.JMenuItem();
        jMenuItemSalirSistema = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SEPENIPSMER - MENU PRINCIPAL");
        setIconImage(getIconImage());
        setResizable(false);

        jTabbedPaneMenuPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPaneMenuPrincipalMouseClicked(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegistrarPersonal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnRegistrarPersonal.setText("Registrar");
        btnRegistrarPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarPersonalActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 620, 150, 40));

        jLabel20.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel20.setText("Dui:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        jLabel21.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel21.setText("Apellidos:");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        jTNombreProveedor1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jTNombreProveedor1.setText("Sexo:");
        jPanel1.add(jTNombreProveedor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        txtApellidRegist.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtApellidRegist, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 260, -1));

        txtDuiRegist.setBackground(new java.awt.Color(255, 255, 255));
        txtDuiRegist.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDuiRegistKeyTyped(evt);
            }
        });
        jPanel1.add(txtDuiRegist, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 260, -1));

        jLabel32.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel32.setText("Dirección:");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        jLabel37.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel37.setText("Nombres:");
        jPanel1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        txtNombreRegist.setBackground(new java.awt.Color(255, 255, 255));
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

        txtTelefonoRegist.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefonoRegist.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoRegistKeyTyped(evt);
            }
        });
        jPanel1.add(txtTelefonoRegist, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 260, -1));

        txtCelularRegist.setBackground(new java.awt.Color(255, 255, 255));
        txtCelularRegist.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCelularRegistKeyTyped(evt);
            }
        });
        jPanel1.add(txtCelularRegist, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 260, -1));

        jLabel43.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel43.setText("Fecha de nacimiento:");
        jPanel1.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 560, -1, -1));

        jPanel1.add(comboBoxEstudiosRegist, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 260, -1));

        dateNacimientoRegist.setDateFormatString("yyyy-MM-dd");
        dateNacimientoRegist.setFocusable(false);
        dateNacimientoRegist.setMinSelectableDate(new java.util.Date(-62135744325000L));
        jPanel1.add(dateNacimientoRegist, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 560, 260, -1));
        dateNacimientoRegist.getAccessibleContext().setAccessibleName("");
        dateNacimientoRegist.getAccessibleContext().setAccessibleDescription("");

        jLabel59.setBackground(new java.awt.Color(0, 0, 0));
        jLabel59.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel59.setText("Fecha:");
        jPanel1.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, -1, -1));

        txtFechaActualRegist.setEditable(false);
        jPanel1.add(txtFechaActualRegist, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 30, 110, -1));

        jLabel44.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel44.setText("Celular:");
        jPanel1.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, -1, -1));

        btnCancelRegist.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCancelRegist.setText("Cancelar");
        btnCancelRegist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelRegistActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelRegist, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 620, 150, 40));

        txtCorreoRegist.setBackground(new java.awt.Color(255, 255, 255));
        txtCorreoRegist.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoRegistKeyTyped(evt);
            }
        });
        jPanel1.add(txtCorreoRegist, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 500, 260, -1));

        labelRegistroPersonal.setBackground(new java.awt.Color(204, 204, 204));
        labelRegistroPersonal.setForeground(new java.awt.Color(51, 51, 255));
        labelRegistroPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de personal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(51, 51, 255))); // NOI18N
        jPanel1.add(labelRegistroPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 970, 670));

        LabelFondoPantallaRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/fondoPantalla2.png"))); // NOI18N
        LabelFondoPantallaRegistro.setMaximumSize(new java.awt.Dimension(500, 500));
        LabelFondoPantallaRegistro.setMinimumSize(new java.awt.Dimension(500, 500));
        LabelFondoPantallaRegistro.setName(""); // NOI18N
        jPanel1.add(LabelFondoPantallaRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 690));

        jTabbedPaneMenuPrincipal.addTab("Registrar ", jPanel1);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setBackground(new java.awt.Color(0, 0, 0));
        jLabel33.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel33.setText("Búsqueda por ID personal:");
        jPanel4.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        jLabel18.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel18.setText("Dui:");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, -1, -1));

        jLabel19.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel19.setText("Apellidos:");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, -1, -1));

        jTNombreProveedor.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jTNombreProveedor.setText("Sexo:");
        jPanel4.add(jTNombreProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, -1, -1));

        txtApellidMod.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.add(txtApellidMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 230, -1));

        txtDuiMod.setBackground(new java.awt.Color(255, 255, 255));
        txtDuiMod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDuiModKeyTyped(evt);
            }
        });
        jPanel4.add(txtDuiMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 230, -1));

        jLabel25.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel25.setText("Dirección:");
        jPanel4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, -1, -1));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel4.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 620, 160, 40));

        btnDesbloquearCampos.setText("Desbloquear Campos");
        btnDesbloquearCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesbloquearCamposActionPerformed(evt);
            }
        });
        jPanel4.add(btnDesbloquearCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 620, 190, 40));

        jLabel36.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel36.setText("Nombres:");
        jPanel4.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, -1, -1));

        txtNombreMod.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.add(txtNombreMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 230, -1));

        jLabel26.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel26.setText("Estudios:");
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 560, -1, -1));

        txtNombreBusquedad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreBusquedadKeyPressed(evt);
            }
        });
        jPanel4.add(txtNombreBusquedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 220, -1));

        tablePersonalBusquedad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablePersonalBusquedad.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablePersonalBusquedad.getTableHeader().setReorderingAllowed(false);
        tablePersonalBusquedad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePersonalBusquedadMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablePersonalBusquedad);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 930, 180));
        jPanel4.add(txtDireccionMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, 230, -1));

        comboBoxSexoMod.setEditable(true);
        comboBoxSexoMod.setEnabled(false);
        jPanel4.add(comboBoxSexoMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 350, 260, -1));

        txIdPersonalBusquedad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txIdPersonalBusquedadKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txIdPersonalBusquedadKeyTyped(evt);
            }
        });
        jPanel4.add(txIdPersonalBusquedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 220, -1));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel4.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 620, 160, 40));

        btnEliminarMod.setText("Eliminar");
        btnEliminarMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarModActionPerformed(evt);
            }
        });
        jPanel4.add(btnEliminarMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 620, 160, 40));

        jLabel27.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel27.setText("Correo:");
        jPanel4.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 500, -1, -1));

        jLabel28.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel28.setText("Telefono:");
        jPanel4.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, -1, -1));

        btnCancelarBusquedad.setText("Cancelar");
        btnCancelarBusquedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarBusquedadActionPerformed(evt);
            }
        });
        jPanel4.add(btnCancelarBusquedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, 160, 40));

        txtTelefonoMod.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefonoMod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoModKeyTyped(evt);
            }
        });
        jPanel4.add(txtTelefonoMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, 260, -1));

        txtCelularMod.setBackground(new java.awt.Color(255, 255, 255));
        txtCelularMod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCelularModKeyTyped(evt);
            }
        });
        jPanel4.add(txtCelularMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 450, 260, -1));

        jLabel29.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel29.setText("Fecha de nacimiento:");
        jPanel4.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 560, -1, -1));

        comboBoxEstudiosMod.setEditable(true);
        comboBoxEstudiosMod.setEnabled(false);
        jPanel4.add(comboBoxEstudiosMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 560, 230, -1));

        dateNacimientoMod.setDateFormatString("yyyy-MM-dd");
        jPanel4.add(dateNacimientoMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 560, 260, -1));

        jLabel30.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel30.setText("Celular:");
        jPanel4.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 450, -1, -1));

        jLabel58.setBackground(new java.awt.Color(0, 0, 0));
        jLabel58.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel58.setText("Fecha:");
        jPanel4.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, -1, -1));

        txtFechaActualMod.setEditable(false);
        jPanel4.add(txtFechaActualMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 110, -1));

        txtCorreoMod.setBackground(new java.awt.Color(255, 255, 255));
        txtCorreoMod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoModKeyTyped(evt);
            }
        });
        jPanel4.add(txtCorreoMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 500, 260, -1));

        labelModificarDatoss.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Modificar datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(51, 51, 255))); // NOI18N
        jPanel4.add(labelModificarDatoss, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 970, 360));

        jLabel38.setBackground(new java.awt.Color(0, 0, 0));
        jLabel38.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel38.setText("Seleccionar un registro:");
        jPanel4.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jLabel41.setBackground(new java.awt.Color(0, 0, 0));
        jLabel41.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel41.setText("Búsqueda por Nombre:");
        jPanel4.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        labelBusquedad.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Búsquedad de personal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(51, 51, 255))); // NOI18N
        jPanel4.add(labelBusquedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 970, 310));

        labelFondoPantalla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/fondoPantalla2.png"))); // NOI18N
        labelFondoPantalla.setMaximumSize(new java.awt.Dimension(500, 500));
        labelFondoPantalla.setMinimumSize(new java.awt.Dimension(500, 500));
        labelFondoPantalla.setName(""); // NOI18N
        jPanel4.add(labelFondoPantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 700));

        jTabbedPaneMenuPrincipal.addTab("Buscar/Modificar", jPanel4);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableEvaluacionesConsult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableEvaluacionesConsult.getTableHeader().setReorderingAllowed(false);
        tableEvaluacionesConsult.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableEvaluacionesConsultMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(tableEvaluacionesConsult);

        jPanel6.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 950, 260));

        btnBuscarConsult.setText("Cancelar");
        btnBuscarConsult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarConsultActionPerformed(evt);
            }
        });
        jPanel6.add(btnBuscarConsult, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, 150, 40));

        btnEliminarEvaluConult.setText("Eliminar evaluación");
        btnEliminarEvaluConult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEvaluConultActionPerformed(evt);
            }
        });
        jPanel6.add(btnEliminarEvaluConult, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 470, 210, 40));

        jLabel61.setBackground(new java.awt.Color(0, 0, 0));
        jLabel61.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel61.setText("Fecha:");
        jPanel6.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, 50, -1));

        txtFechaActualConsult.setEditable(false);
        txtFechaActualConsult.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFechaActualConsultKeyPressed(evt);
            }
        });
        jPanel6.add(txtFechaActualConsult, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 30, 110, -1));

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
        btnImprimirEvaluacionConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirEvaluacionConsultaActionPerformed(evt);
            }
        });
        jPanel6.add(btnImprimirEvaluacionConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 540, 210, 40));

        txIdPersonalConsult.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txIdPersonalConsultKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txIdPersonalConsultKeyTyped(evt);
            }
        });
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
        jPanel6.add(labelConsultarEvaluaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 970, 650));

        labelFondoPantallaConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/fondoPantalla2.png"))); // NOI18N
        labelFondoPantallaConsulta.setMaximumSize(new java.awt.Dimension(500, 500));
        labelFondoPantallaConsulta.setMinimumSize(new java.awt.Dimension(500, 500));
        labelFondoPantallaConsulta.setName(""); // NOI18N
        jPanel6.add(labelFondoPantallaConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 990, 670));

        jTabbedPaneMenuPrincipal.addTab("Consultar", jPanel6);

        jMenuCerrar.setText("Opciones");

        jMenuItemCerrarSesion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemCerrarSesion.setText("Cerrar Sesion");
        jMenuItemCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCerrarSesionActionPerformed(evt);
            }
        });
        jMenuCerrar.add(jMenuItemCerrarSesion);

        jMenuItemSalirSistema.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemSalirSistema.setText("Salir");
        jMenuItemSalirSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirSistemaActionPerformed(evt);
            }
        });
        jMenuCerrar.add(jMenuItemSalirSistema);

        jMenuBar1.add(jMenuCerrar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 989, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPaneMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCerrarSesionActionPerformed
        //Metodo para cerrar el sesion
        if (JOptionPane.showConfirmDialog(rootPane, "Estás seguro de cerrar sesion.", "Cerrar sesion", 1) == 0) {
            miCoordinador.cerrarFrmMenuPrincipal();
            miCoordinador.mostrarFmrInicioSesion();

        }

    }//GEN-LAST:event_jMenuItemCerrarSesionActionPerformed

    private void jMenuItemSalirSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalirSistemaActionPerformed
        //Metodo para cerrar el sistema
        if (JOptionPane.showConfirmDialog(rootPane, "Estás seguro de cerrar el sistema.", "Cerrar sistema", 1) == 0) {
            System.exit(0);
        }

    }//GEN-LAST:event_jMenuItemSalirSistemaActionPerformed


    private void jCalendar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCalendar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCalendar1ActionPerformed

    private void btnImprimirEvaluacionConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirEvaluacionConsultaActionPerformed

    }//GEN-LAST:event_btnImprimirEvaluacionConsultaActionPerformed

    private void btnBuscarConsultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarConsultActionPerformed
        miCoordinador.cargarConsultaPersonalEvaluacion(tableEvaluacionesConsult);
        limpiarCamposTextBusquedadEvaluacione();
    }//GEN-LAST:event_btnBuscarConsultActionPerformed

    private void btnEliminarModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarModActionPerformed

        numFilaTablePersonal = tablePersonalBusquedad.getSelectedRow();
        if (numFilaTablePersonal < 0) {
            JOptionPane.showMessageDialog(null, "Seleccione por favor un registro de la tabla de busquedad");
        } else {
            if (JOptionPane.showConfirmDialog(rootPane, "Estás seguro de eliminar el personal con ID: " 
                    + tablePersonalBusquedad.getValueAt(numFilaTablePersonal, 0).toString(), "Eliminar", 1) == 0) {
                miCoordinador.realizarvalidarEliminarPersonalBd(parseInt(tablePersonalBusquedad.getValueAt(numFilaTablePersonal, 0).toString()));
                mostrarPersonaTablaBusquedad();
            }

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarModActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiarCamposTextModificar();
        desblockOblockCamposMod(false);
    }//GEN-LAST:event_btnCancelarActionPerformed


    private void btnDesbloquearCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesbloquearCamposActionPerformed
        //Asignst campos de la tabla busquedad a los campos de texto de la seccion de modificar
        numFilaTablePersonal = tablePersonalBusquedad.getSelectedRow();
        if (numFilaTablePersonal < 0) {
            JOptionPane.showMessageDialog(null, "Seleccione por favor un registro de la tabla de busquedad");
        } else {
            try {

                txtDuiMod.setText(tablePersonalBusquedad.getValueAt(numFilaTablePersonal, 2).toString());
                txtNombreMod.setText(tablePersonalBusquedad.getValueAt(numFilaTablePersonal, 3).toString());
                txtApellidMod.setText(tablePersonalBusquedad.getValueAt(numFilaTablePersonal, 4).toString());
                comboBoxSexoMod.setSelectedItem(tablePersonalBusquedad.getValueAt(numFilaTablePersonal, 5).toString());
                comboBoxEstudiosMod.setSelectedItem(tablePersonalBusquedad.getValueAt(numFilaTablePersonal, 6).toString());
                txtTelefonoMod.setText(tablePersonalBusquedad.getValueAt(numFilaTablePersonal, 8).toString());
                txtCelularMod.setText(tablePersonalBusquedad.getValueAt(numFilaTablePersonal, 9).toString());
                txtCorreoMod.setText(tablePersonalBusquedad.getValueAt(numFilaTablePersonal, 10).toString());
                txtDireccionMod.setText(tablePersonalBusquedad.getValueAt(numFilaTablePersonal, 11).toString());
                String formato = dateNacimientoRegist.getDateFormatString();
                java.util.Date date = dateNacimientoMod.getDate();
                SimpleDateFormat sdf = new SimpleDateFormat(formato);
                dateNacimientoMod.setDate(sdf.parse(tablePersonalBusquedad.getValueAt(numFilaTablePersonal, 7).toString()));
                desblockOblockCamposMod(true);
            } catch (ParseException ex) {
                Logger.getLogger(FrmMenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnDesbloquearCamposActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        numFilaTablePersonal = tablePersonalBusquedad.getSelectedRow();
        if (numFilaTablePersonal < 0) {
            JOptionPane.showMessageDialog(null, "Seleccione por favor un registro de la tabla de busquedad");
        } else {
            if (txtNombreMod.getText().isEmpty() || txtNombreMod.getText().isEmpty()
                    || txtDireccionMod.getText().isEmpty() || comboBoxSexoMod.getSelectedItem().toString() == "Seleccionar"
                    || comboBoxEstudiosMod.getSelectedItem().toString() == "Seleccionar"
                    || txtCorreoMod.getText().isEmpty() || txtDuiMod.getText().isEmpty()
                    || txtTelefonoMod.getText().isEmpty() || txtCelularMod.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Faltan campos de texto por llenar");
            } else {
                miPersonalVo.setIdPersonal(parseInt(tablePersonalBusquedad.getValueAt(numFilaTablePersonal, 0).toString()));
                miPersonalVo.setNombre(txtNombreMod.getText());
                miPersonalVo.setApellido(txtApellidMod.getText());
                miPersonalVo.setDireccion(txtDireccionMod.getText());
                miPersonalVo.setSexo(comboBoxSexoMod.getSelectedItem().toString());
                miPersonalVo.setEstudio(comboBoxEstudiosMod.getSelectedItem().toString());
                miPersonalVo.setCorreo(txtCorreoMod.getText());
                miPersonalVo.setDui(parseInt(txtDuiMod.getText()));
                miPersonalVo.setTelefono(parseInt(txtTelefonoMod.getText()));
                miPersonalVo.setCelular(parseInt(txtCelularMod.getText()));
                duiSelec = parseInt(tablePersonalBusquedad.getValueAt(numFilaTablePersonal, 2).toString());
                //jDateChooser el nombre la variable  del componente jdatecgooser
                try {

                    String formato = dateNacimientoMod.getDateFormatString();
                    java.util.Date date = dateNacimientoMod.getDate();
                    SimpleDateFormat sdf = new SimpleDateFormat(formato);
                    miPersonalVo.setFechaNacimiento(String.valueOf(sdf.format(date)));
                    if (miCoordinador.realizarActualizarPersonal(miPersonalVo, duiSelec, txtFechaActualMod.getText())) {
                        JOptionPane.showMessageDialog(null, "Personal modificado exitosamente");
                        limpiarCamposTextModificar();
                        desblockOblockCamposMod(false);
                        mostrarPersonaTablaBusquedad();
                    } else {
                        JOptionPane.showMessageDialog(null, "Verifique la informacion ingresada en los campos de texto");
                    }

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Ingrese una fecha valida, en formato yyyy-MM-dd");

                }

                //textFecha nombre de la variable del componenten jtextfiel
            }
        }
    }//GEN-LAST:event_btnModificarActionPerformed


    private void txtDuiModKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDuiModKeyTyped
        validarCaracteresNumericos(evt);
    }//GEN-LAST:event_txtDuiModKeyTyped
    private void mostrarPersonaTablaBusquedad() {
        miPersonalVo.setNombre("");//Cancela las busqueda y muestra todos los registros del peronal
        miCoordinador.cargarBusquedaNombresPersonal(miPersonalVo, tablePersonalBusquedad);    //para mostrar todos los registros 
    }


    private void btnRegistrarPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPersonalActionPerformed
        if (txtNombreRegist.getText().isEmpty() || txtNombreRegist.getText().isEmpty()
                || txtDireccionRegist.getText().isEmpty() || comboBoxSexoRegist.getSelectedItem().toString() == "Seleccionar"
                || comboBoxEstudiosRegist.getSelectedItem().toString() == "Seleccionar"
                || txtCorreoRegist.getText().isEmpty() || txtDuiRegist.getText().isEmpty()
                || txtTelefonoRegist.getText().isEmpty() || txtCelularRegist.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Faltan campos de texto por llenar");
        } else {

            miPersonalVo.setNombre(txtNombreRegist.getText());
            miPersonalVo.setApellido(txtApellidRegist.getText());
            miPersonalVo.setDireccion(txtDireccionRegist.getText());
            miPersonalVo.setSexo(comboBoxSexoRegist.getSelectedItem().toString());
            miPersonalVo.setEstudio(comboBoxEstudiosRegist.getSelectedItem().toString());
            miPersonalVo.setCorreo(txtCorreoRegist.getText());
            miPersonalVo.setDui(parseInt(txtDuiRegist.getText()));
            miPersonalVo.setTelefono(parseInt(txtTelefonoRegist.getText()));
            miPersonalVo.setCelular(parseInt(txtCelularRegist.getText()));

            //jDateChooser el nombre la variable  del componente jdatecgooser
            try {

                String formato = dateNacimientoRegist.getDateFormatString();
                java.util.Date date = dateNacimientoRegist.getDate();
                SimpleDateFormat sdf = new SimpleDateFormat(formato);
                miPersonalVo.setFechaNacimiento(String.valueOf(sdf.format(date)));
                setMiAdministradorVo(miCoordinador.getMiCorAdministradorVo());
                if (miCoordinador.realizarRegistrarPersonal(miPersonalVo, miAdministradorVo.getIdAdmin(), txtFechaActualRegist.getText())) {
                    JOptionPane.showMessageDialog(null, "Personal registrado exitosamente");
                    limpiarCamposTextRegistro();
                } else {
                    JOptionPane.showMessageDialog(null, "Verifique la informacion ingresada en los campos de texto");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ingrese una fecha valida, en formato yyyy-MM-dd");

            }

            //textFecha nombre de la variable del componenten jtextfiel
        }
    }//GEN-LAST:event_btnRegistrarPersonalActionPerformed

    private void txIdPersonalConsultKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txIdPersonalConsultKeyPressed
        int code = evt.getKeyCode();
        if (code == KeyEvent.VK_ENTER && !(txIdPersonalBusquedad.getText().isEmpty())) {
            int idPersonal = (parseInt(txIdPersonalConsult.getText()));
            if (!(miCoordinador.cargarBusquedaIdPersonalEvaluacion(idPersonal, tableEvaluacionesConsult))) {
                JOptionPane.showMessageDialog(null, "El  IdPersonal que realizo la evaluacion no se encuentra " + idPersonal);
            }
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_txIdPersonalConsultKeyPressed

    private void btnEliminarEvaluConultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEvaluConultActionPerformed
        numFilaTableEvaluacion = tableEvaluacionesConsult.getSelectedRow();
        if (numFilaTablePersonal < 0) {
            JOptionPane.showMessageDialog(null, "Seleccione por favor un registro de la tabla de busquedad");
        } else {
            if (JOptionPane.showConfirmDialog(rootPane, "Estás seguro de eliminar la evaluacion con ID: "
                    + tableEvaluacionesConsult.getValueAt(numFilaTableEvaluacion, 0).toString(), "Eliminar", 1) == 0) {

                miCoordinador.realizaValidarEliminarEvaluacionIntBd(parseInt(tableEvaluacionesConsult.getValueAt(numFilaTableEvaluacion, 0).toString()));
                miCoordinador.cargarConsultaPersonalEvaluacion(tableEvaluacionesConsult);
            }
        }
    }//GEN-LAST:event_btnEliminarEvaluConultActionPerformed

    private void txtDuiRegistKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDuiRegistKeyTyped
        validarCaracteresNumericos(evt);
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDuiRegistKeyTyped

    private void txtTelefonoRegistKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoRegistKeyTyped
        validarCaracteresNumericos(evt);
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoRegistKeyTyped

    private void txtCelularRegistKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCelularRegistKeyTyped
        validarCaracteresNumericos(evt);
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCelularRegistKeyTyped

    private void txtCorreoRegistKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoRegistKeyTyped
        validarCorreoCaracteres(txtCorreoRegist, evt);
    }//GEN-LAST:event_txtCorreoRegistKeyTyped

    private void txtFechaActualConsultKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaActualConsultKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActualConsultKeyPressed

    private void btnCancelRegistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelRegistActionPerformed
        limpiarCamposTextRegistro();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelRegistActionPerformed

    private void jTabbedPaneMenuPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPaneMenuPrincipalMouseClicked
        mostrarPersonaTablaBusquedad();
        miCoordinador.cargarConsultaPersonalEvaluacion(tableEvaluacionesConsult);
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPaneMenuPrincipalMouseClicked

    private void txtNombreBusquedadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreBusquedadKeyPressed
        miPersonalVo.setNombre(txtNombreBusquedad.getText());
        miCoordinador.cargarBusquedaNombresPersonal(miPersonalVo, tablePersonalBusquedad);

    }//GEN-LAST:event_txtNombreBusquedadKeyPressed

    private void btnCancelarBusquedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarBusquedadActionPerformed
        limpiarCamposTextBusquedad();
        mostrarPersonaTablaBusquedad();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarBusquedadActionPerformed

    private void txIdPersonalBusquedadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txIdPersonalBusquedadKeyTyped
        validarCaracteresNumericos(evt);
    }//GEN-LAST:event_txIdPersonalBusquedadKeyTyped

    private void txIdPersonalBusquedadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txIdPersonalBusquedadKeyPressed
        int code = evt.getKeyCode();
        if (code == KeyEvent.VK_ENTER && !(txIdPersonalBusquedad.getText().isEmpty())) {
            miPersonalVo.setIdPersonal(parseInt(txIdPersonalBusquedad.getText()));
            if (!(miCoordinador.cargarBusquedaIdPersonal(miPersonalVo, tablePersonalBusquedad))) {
                JOptionPane.showMessageDialog(null, "El  Nombre buscado no se encuentra: " + miPersonalVo.getIdPersonal());
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txIdPersonalBusquedadKeyPressed

    private void txtCorreoModKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoModKeyTyped
        validarCorreoCaracteres(txtCorreoMod, evt);
    }//GEN-LAST:event_txtCorreoModKeyTyped

    private void txtCelularModKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCelularModKeyTyped
        validarCaracteresNumericos(evt);
    }//GEN-LAST:event_txtCelularModKeyTyped

    private void txtTelefonoModKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoModKeyTyped
        validarCaracteresNumericos(evt);
    }//GEN-LAST:event_txtTelefonoModKeyTyped

    private void tablePersonalBusquedadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePersonalBusquedadMouseClicked
        numFilaTablePersonal = tablePersonalBusquedad.getSelectedRow();
    }//GEN-LAST:event_tablePersonalBusquedadMouseClicked

    private void txIdPersonalConsultKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txIdPersonalConsultKeyTyped
        validarCaracteresNumericos(evt);
        // TODO add your handling code here:
    }//GEN-LAST:event_txIdPersonalConsultKeyTyped

    private void tableEvaluacionesConsultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableEvaluacionesConsultMouseClicked
        numFilaTableEvaluacion = tableEvaluacionesConsult.getSelectedRow();
        // TODO add your handling code here:
    }//GEN-LAST:event_tableEvaluacionesConsultMouseClicked
    public void validarCorreoCaracteres(JTextField campo, java.awt.event.KeyEvent evt) {
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

    public void limpiarCamposTextBusquedadEvaluacione() {
        //Metodo para limpiar los campos de texto de la parte de busqueda personal
        txIdPersonalConsult.setText(null);
        DateRealizacionConsult.setCalendar(null);
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
        } else {
            comboBoxEstudiosMod.setEditable(true);
            comboBoxSexoMod.setEditable(true);
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
    private javax.swing.JButton btnEliminarEvaluConult;
    private javax.swing.JButton btnEliminarMod;
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
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCerrar;
    private javax.swing.JMenuItem jMenuItemCerrarSesion;
    private javax.swing.JMenuItem jMenuItemSalirSistema;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollBar jScrollBar1;
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

package Formulario;

import Conexion.Cls_Conexion;
import Logica.Cls_Alarma;
import Logica.Cls_Sensores;
import Logica.VariablesConfig;
import java.awt.CardLayout;
import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;


public class Original extends javax.swing.JFrame {

    private final Cls_Sensores Sensores_Registrados;
    private final Cls_Alarma Actividad;
    private final VariablesConfig DatosConfig;
    private final Timer Temporizador;
    private Boolean tempIsPaused;
  
    private Cls_Conexion cnn;
   
     
     public Original() {
        initComponents();
       
        Sensores_Registrados = new Cls_Sensores(cnn);
        Actividad = new Cls_Alarma(cnn);
        DatosConfig = new VariablesConfig();
        Temporizador = new Timer();
        
    add(btnMenu);
    add(btn_configuracion); 
    add(btnSensores);
    
    
    
    /*
    PanelSensores.add(Sensor1);
    PanelSensores.add(Sensor2);
    PanelSensores.add(Sensor3);
    PanelSensores.add(Sensor4);
    PanelSensores.add(Sensor5);
    PanelSensores.add(Sensor6);
    */
   // add(PanelSensores);
        /*
        jtf_UserDDBB.setText(DatosConfig.dimeUser());
        jtf_PassDDBB.setText(DatosConfig.dimePass());
        jtf_DDBB.setText(DatosConfig.dimeDDBB());
        jtf_Puerto.setText(DatosConfig.dimePuerto());
        jtf_LocalServer.setText(DatosConfig.dimeLocalServer());
        jtf_RemoteServer.setText(DatosConfig.dimeRemoteServer());
        jtf_RemoteServer2.setText(DatosConfig.dimeRemoteServer2());
*/
        int auxInt = 1;
      
        
        Actividad.Armado_Notificaciones = true;

        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/ALERTA.png")).getImage());
        setLocationRelativeTo(null);

        
        tempIsPaused = false;
        TimerTask Tarea = new TimerTask() {
            @Override
            public void run() {
                if (!tempIsPaused) {
                    //System.out.println("Temporizador Actualizado");
                    try {
                        listar_Actividad();
                        listar_Sensores();
                    } catch (InterruptedException | ClassNotFoundException | SQLException ex) {
                        Logger.getLogger(Original.class.getName()).log(Level.SEVERE, null, ex);
                        System.out.println("Fallo en Temporizador");
                    }
                }
            }
        };
        Temporizador.schedule(Tarea, 10, 1000);
         
    }

    private void listar_Actividad() throws InterruptedException, ClassNotFoundException, SQLException {
   
    }

    private void listar_Sensores() throws InterruptedException {

    }

    private void Refresh_Tabulados_Sensores(Boolean estado) {
       
        //Al modificar,  pausamos el timer principal y bloqueamos el tabcontrol.
        tempIsPaused = estado;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Encabezado = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CardL = new javax.swing.JPanel();
        PanelPrincipal = new javax.swing.JPanel();
        Sensor1 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        btnS1 = new javax.swing.JToggleButton();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jlb_Sensor1 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        Sensor2 = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        btnS2 = new javax.swing.JToggleButton();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jlb_Sensor2 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        Sensor4 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        btnS4 = new javax.swing.JToggleButton();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jlb_Sensor4 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        Sensor7 = new javax.swing.JPanel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        btnS7 = new javax.swing.JToggleButton();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jlb_Sensor7 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        Sensor5 = new javax.swing.JPanel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        btnS5 = new javax.swing.JToggleButton();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jlb_Sensor5 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        Sensor10 = new javax.swing.JPanel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        btnS10 = new javax.swing.JToggleButton();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jlb_Sensor10 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        Sensor9 = new javax.swing.JPanel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        btnS9 = new javax.swing.JToggleButton();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jlb_Sensor9 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        Sensor8 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        btnS8 = new javax.swing.JToggleButton();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jlb_Sensor8 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        Sensor6 = new javax.swing.JPanel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        btnS6 = new javax.swing.JToggleButton();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jlb_Sensor6 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        Sensor3 = new javax.swing.JPanel();
        jLabel86 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        btnS3 = new javax.swing.JToggleButton();
        jLabel100 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jlb_Sensor3 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        PanelConexion = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        PanelConfgSensores = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnSensores = new javax.swing.JButton();
        btn_configuracion = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        Encabezado.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo-sanjose.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("Monitor de Actividad");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/beat-512.png"))); // NOI18N

        javax.swing.GroupLayout EncabezadoLayout = new javax.swing.GroupLayout(Encabezado);
        Encabezado.setLayout(EncabezadoLayout);
        EncabezadoLayout.setHorizontalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EncabezadoLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(79, 79, 79)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EncabezadoLayout.setVerticalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EncabezadoLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(EncabezadoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        CardL.setBackground(new java.awt.Color(204, 255, 204));
        CardL.setLayout(new java.awt.CardLayout());

        PanelPrincipal.setBackground(new java.awt.Color(0, 51, 102));
        PanelPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelPrincipal.setName(""); // NOI18N
        PanelPrincipal.setPreferredSize(new java.awt.Dimension(1000, 100));

        Sensor1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Sensor1.setPreferredSize(new java.awt.Dimension(1000, 100));

        jLabel39.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel39.setText("Activo hace:");

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/userIcon.png"))); // NOI18N

        btnS1.setBackground(new java.awt.Color(0, 255, 51));
        btnS1.setText("ON");
        btnS1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnS1ActionPerformed(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel41.setText("Habitación");

        jLabel42.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel42.setText("3 min");

        jlb_Sensor1.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jlb_Sensor1.setText("201");

        jLabel45.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel45.setText("Joselito");

        javax.swing.GroupLayout Sensor1Layout = new javax.swing.GroupLayout(Sensor1);
        Sensor1.setLayout(Sensor1Layout);
        Sensor1Layout.setHorizontalGroup(
            Sensor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Sensor1Layout.createSequentialGroup()
                .addGroup(Sensor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Sensor1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel41))
                    .addGroup(Sensor1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jlb_Sensor1)))
                .addGap(29, 29, 29)
                .addGroup(Sensor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel40)
                    .addComponent(jLabel45))
                .addGap(18, 18, 18)
                .addGroup(Sensor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Sensor1Layout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(btnS1))
                    .addGroup(Sensor1Layout.createSequentialGroup()
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Sensor1Layout.setVerticalGroup(
            Sensor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Sensor1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Sensor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Sensor1Layout.createSequentialGroup()
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlb_Sensor1))
                    .addGroup(Sensor1Layout.createSequentialGroup()
                        .addGroup(Sensor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Sensor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Sensor1Layout.createSequentialGroup()
                                    .addGroup(Sensor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnS1)
                                        .addComponent(jLabel39))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE))
                                .addComponent(jLabel40)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel45)))
                .addGap(12, 12, 12))
        );

        Sensor2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Sensor2.setPreferredSize(new java.awt.Dimension(1000, 100));

        jLabel74.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel74.setText("Activo hace:");

        jLabel75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/userIcon.png"))); // NOI18N

        btnS2.setBackground(new java.awt.Color(0, 255, 51));
        btnS2.setText("ON");
        btnS2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnS2ActionPerformed(evt);
            }
        });

        jLabel76.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel76.setText("Habitación");

        jLabel77.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel77.setText("1 minutos");

        jlb_Sensor2.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jlb_Sensor2.setText("202");

        jLabel80.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel80.setText("Carol");

        javax.swing.GroupLayout Sensor2Layout = new javax.swing.GroupLayout(Sensor2);
        Sensor2.setLayout(Sensor2Layout);
        Sensor2Layout.setHorizontalGroup(
            Sensor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Sensor2Layout.createSequentialGroup()
                .addGroup(Sensor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Sensor2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel76))
                    .addGroup(Sensor2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jlb_Sensor2)))
                .addGap(29, 29, 29)
                .addGroup(Sensor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel75)
                    .addGroup(Sensor2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel80)))
                .addGap(10, 10, 10)
                .addGroup(Sensor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Sensor2Layout.createSequentialGroup()
                        .addComponent(jLabel74)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(btnS2))
                    .addComponent(jLabel77))
                .addContainerGap())
        );
        Sensor2Layout.setVerticalGroup(
            Sensor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Sensor2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Sensor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Sensor2Layout.createSequentialGroup()
                        .addComponent(jLabel76)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlb_Sensor2))
                    .addGroup(Sensor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel74)
                        .addComponent(btnS2))
                    .addGroup(Sensor2Layout.createSequentialGroup()
                        .addGroup(Sensor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel75))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel80)))
                .addGap(12, 12, 12))
        );

        Sensor4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Sensor4.setPreferredSize(new java.awt.Dimension(1000, 100));

        jLabel46.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel46.setText("Activo hace:");

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/userIcon.png"))); // NOI18N

        btnS4.setBackground(new java.awt.Color(0, 255, 51));
        btnS4.setText("ON");
        btnS4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnS4ActionPerformed(evt);
            }
        });

        jLabel48.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel48.setText("Habitación");

        jLabel49.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel49.setText("9 minutos");

        jlb_Sensor4.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jlb_Sensor4.setText("204");

        jLabel52.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel52.setText("Tristán");

        javax.swing.GroupLayout Sensor4Layout = new javax.swing.GroupLayout(Sensor4);
        Sensor4.setLayout(Sensor4Layout);
        Sensor4Layout.setHorizontalGroup(
            Sensor4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Sensor4Layout.createSequentialGroup()
                .addGroup(Sensor4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Sensor4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel48))
                    .addGroup(Sensor4Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jlb_Sensor4)))
                .addGap(29, 29, 29)
                .addGroup(Sensor4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Sensor4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel52))
                    .addGroup(Sensor4Layout.createSequentialGroup()
                        .addComponent(jLabel47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Sensor4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Sensor4Layout.createSequentialGroup()
                                .addComponent(jLabel46)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                                .addComponent(btnS4))
                            .addGroup(Sensor4Layout.createSequentialGroup()
                                .addComponent(jLabel49)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        Sensor4Layout.setVerticalGroup(
            Sensor4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Sensor4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Sensor4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Sensor4Layout.createSequentialGroup()
                        .addComponent(jLabel48)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlb_Sensor4)
                        .addGap(29, 29, 29))
                    .addGroup(Sensor4Layout.createSequentialGroup()
                        .addGroup(Sensor4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Sensor4Layout.createSequentialGroup()
                                .addGroup(Sensor4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel46)
                                    .addComponent(btnS4))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(Sensor4Layout.createSequentialGroup()
                                .addGroup(Sensor4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel47))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel52)))
                        .addContainerGap())))
        );

        Sensor7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Sensor7.setPreferredSize(new java.awt.Dimension(1000, 100));

        jLabel81.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel81.setText("Activo hace:");

        jLabel82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/userIcon.png"))); // NOI18N

        btnS7.setBackground(new java.awt.Color(0, 255, 51));
        btnS7.setText("ON");
        btnS7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnS7ActionPerformed(evt);
            }
        });

        jLabel83.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel83.setText("Habitación");

        jLabel84.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel84.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel84.setText("2 minutos");

        jlb_Sensor7.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jlb_Sensor7.setText("207");

        jLabel87.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel87.setText("Santi");

        javax.swing.GroupLayout Sensor7Layout = new javax.swing.GroupLayout(Sensor7);
        Sensor7.setLayout(Sensor7Layout);
        Sensor7Layout.setHorizontalGroup(
            Sensor7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Sensor7Layout.createSequentialGroup()
                .addGroup(Sensor7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Sensor7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel83))
                    .addGroup(Sensor7Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jlb_Sensor7)))
                .addGap(29, 29, 29)
                .addGroup(Sensor7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel82)
                    .addGroup(Sensor7Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel87)))
                .addGap(10, 10, 10)
                .addGroup(Sensor7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Sensor7Layout.createSequentialGroup()
                        .addComponent(jLabel81)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnS7))
                    .addComponent(jLabel84))
                .addContainerGap())
        );
        Sensor7Layout.setVerticalGroup(
            Sensor7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Sensor7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Sensor7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Sensor7Layout.createSequentialGroup()
                        .addGroup(Sensor7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Sensor7Layout.createSequentialGroup()
                                .addComponent(jLabel83)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlb_Sensor7))
                            .addGroup(Sensor7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel81)
                                .addComponent(btnS7)))
                        .addGap(29, 29, 29))
                    .addGroup(Sensor7Layout.createSequentialGroup()
                        .addGroup(Sensor7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel82))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel87)
                        .addContainerGap())))
        );

        Sensor5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Sensor5.setPreferredSize(new java.awt.Dimension(1000, 100));

        jLabel88.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel88.setText("Activo hace:");

        jLabel89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/userIcon.png"))); // NOI18N

        btnS5.setBackground(new java.awt.Color(0, 255, 51));
        btnS5.setText("ON");
        btnS5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnS5ActionPerformed(evt);
            }
        });

        jLabel90.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel90.setText("Habitación");

        jLabel91.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel91.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel91.setText("12 min");

        jlb_Sensor5.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jlb_Sensor5.setText("205");

        jLabel94.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel94.setText("Blanca");

        javax.swing.GroupLayout Sensor5Layout = new javax.swing.GroupLayout(Sensor5);
        Sensor5.setLayout(Sensor5Layout);
        Sensor5Layout.setHorizontalGroup(
            Sensor5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Sensor5Layout.createSequentialGroup()
                .addGroup(Sensor5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Sensor5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel90))
                    .addGroup(Sensor5Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jlb_Sensor5)))
                .addGap(29, 29, 29)
                .addGroup(Sensor5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel89)
                    .addComponent(jLabel94))
                .addGap(18, 18, 18)
                .addGroup(Sensor5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel91, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(Sensor5Layout.createSequentialGroup()
                        .addComponent(jLabel88)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(btnS5)))
                .addContainerGap())
        );
        Sensor5Layout.setVerticalGroup(
            Sensor5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Sensor5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Sensor5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Sensor5Layout.createSequentialGroup()
                        .addComponent(jLabel90)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlb_Sensor5))
                    .addGroup(Sensor5Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(Sensor5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Sensor5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel88)
                                .addComponent(btnS5))
                            .addGroup(Sensor5Layout.createSequentialGroup()
                                .addGroup(Sensor5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel89))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel94)))))
                .addGap(20, 20, 20))
        );

        Sensor10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Sensor10.setPreferredSize(new java.awt.Dimension(1000, 100));

        jLabel95.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel95.setText("Activo hace:");

        jLabel96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/userIcon.png"))); // NOI18N

        btnS10.setBackground(new java.awt.Color(0, 255, 51));
        btnS10.setText("ON");
        btnS10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnS10ActionPerformed(evt);
            }
        });

        jLabel97.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel97.setText("Habitación");

        jLabel98.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel98.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel98.setText("24 minutos");

        jlb_Sensor10.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jlb_Sensor10.setText("210");

        jLabel101.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel101.setText("Carmen");

        javax.swing.GroupLayout Sensor10Layout = new javax.swing.GroupLayout(Sensor10);
        Sensor10.setLayout(Sensor10Layout);
        Sensor10Layout.setHorizontalGroup(
            Sensor10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Sensor10Layout.createSequentialGroup()
                .addGroup(Sensor10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Sensor10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel97))
                    .addGroup(Sensor10Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jlb_Sensor10)))
                .addGap(29, 29, 29)
                .addGroup(Sensor10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel96)
                    .addComponent(jLabel101))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Sensor10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Sensor10Layout.createSequentialGroup()
                        .addComponent(jLabel95)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addComponent(btnS10))
                    .addGroup(Sensor10Layout.createSequentialGroup()
                        .addComponent(jLabel98)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Sensor10Layout.setVerticalGroup(
            Sensor10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Sensor10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Sensor10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Sensor10Layout.createSequentialGroup()
                        .addComponent(jLabel97)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlb_Sensor10))
                    .addGroup(Sensor10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel95)
                        .addComponent(btnS10))
                    .addGroup(Sensor10Layout.createSequentialGroup()
                        .addGroup(Sensor10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel96))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel101)))
                .addGap(17, 17, 17))
        );

        Sensor9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Sensor9.setPreferredSize(new java.awt.Dimension(1000, 100));

        jLabel111.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel111.setText("Activo hace:");

        jLabel112.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/userIcon.png"))); // NOI18N

        btnS9.setBackground(new java.awt.Color(0, 255, 51));
        btnS9.setText("ON");
        btnS9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnS9ActionPerformed(evt);
            }
        });

        jLabel113.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel113.setText("Habitación");

        jLabel114.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel114.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel114.setText("12 minutos");

        jlb_Sensor9.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jlb_Sensor9.setText("209");

        jLabel116.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel116.setText("Blanca");

        javax.swing.GroupLayout Sensor9Layout = new javax.swing.GroupLayout(Sensor9);
        Sensor9.setLayout(Sensor9Layout);
        Sensor9Layout.setHorizontalGroup(
            Sensor9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Sensor9Layout.createSequentialGroup()
                .addGroup(Sensor9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Sensor9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel113))
                    .addGroup(Sensor9Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jlb_Sensor9)))
                .addGap(29, 29, 29)
                .addGroup(Sensor9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel112)
                    .addComponent(jLabel116))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Sensor9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Sensor9Layout.createSequentialGroup()
                        .addComponent(jLabel114)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(Sensor9Layout.createSequentialGroup()
                        .addComponent(jLabel111)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(btnS9)))
                .addContainerGap())
        );
        Sensor9Layout.setVerticalGroup(
            Sensor9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Sensor9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Sensor9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Sensor9Layout.createSequentialGroup()
                        .addComponent(jLabel113)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlb_Sensor9))
                    .addGroup(Sensor9Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(Sensor9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Sensor9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel111)
                                .addComponent(btnS9))
                            .addGroup(Sensor9Layout.createSequentialGroup()
                                .addGroup(Sensor9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel114, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel112))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel116)))))
                .addGap(20, 20, 20))
        );

        Sensor8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Sensor8.setPreferredSize(new java.awt.Dimension(1000, 100));

        jLabel51.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel51.setText("Activo hace:");

        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/userIcon.png"))); // NOI18N

        btnS8.setBackground(new java.awt.Color(0, 255, 51));
        btnS8.setText("ON");
        btnS8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnS8ActionPerformed(evt);
            }
        });

        jLabel54.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel54.setText("Habitación");

        jLabel55.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel55.setText("9 minutos");

        jlb_Sensor8.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jlb_Sensor8.setText("208");

        jLabel57.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel57.setText("Tristán");

        javax.swing.GroupLayout Sensor8Layout = new javax.swing.GroupLayout(Sensor8);
        Sensor8.setLayout(Sensor8Layout);
        Sensor8Layout.setHorizontalGroup(
            Sensor8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Sensor8Layout.createSequentialGroup()
                .addGroup(Sensor8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Sensor8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel54))
                    .addGroup(Sensor8Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jlb_Sensor8)))
                .addGap(29, 29, 29)
                .addGroup(Sensor8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel53)
                    .addGroup(Sensor8Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel57)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Sensor8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Sensor8Layout.createSequentialGroup()
                        .addComponent(jLabel51)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(btnS8))
                    .addGroup(Sensor8Layout.createSequentialGroup()
                        .addComponent(jLabel55)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Sensor8Layout.setVerticalGroup(
            Sensor8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Sensor8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Sensor8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Sensor8Layout.createSequentialGroup()
                        .addComponent(jLabel54)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlb_Sensor8)
                        .addGap(29, 29, 29))
                    .addGroup(Sensor8Layout.createSequentialGroup()
                        .addGroup(Sensor8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Sensor8Layout.createSequentialGroup()
                                .addGroup(Sensor8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel51)
                                    .addComponent(btnS8))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(Sensor8Layout.createSequentialGroup()
                                .addGroup(Sensor8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel53))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel57)))
                        .addContainerGap())))
        );

        Sensor6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Sensor6.setPreferredSize(new java.awt.Dimension(1000, 100));

        jLabel105.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel105.setText("Activo hace:");

        jLabel106.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/userIcon.png"))); // NOI18N

        btnS6.setBackground(new java.awt.Color(0, 255, 51));
        btnS6.setText("ON");
        btnS6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnS6ActionPerformed(evt);
            }
        });

        jLabel107.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel107.setText("Habitación");

        jLabel108.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel108.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel108.setText("24 minutos");

        jlb_Sensor6.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jlb_Sensor6.setText("206");

        jLabel110.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel110.setText("Carmen");

        javax.swing.GroupLayout Sensor6Layout = new javax.swing.GroupLayout(Sensor6);
        Sensor6.setLayout(Sensor6Layout);
        Sensor6Layout.setHorizontalGroup(
            Sensor6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Sensor6Layout.createSequentialGroup()
                .addGroup(Sensor6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Sensor6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel107))
                    .addGroup(Sensor6Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jlb_Sensor6)))
                .addGap(29, 29, 29)
                .addGroup(Sensor6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel106)
                    .addComponent(jLabel110))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Sensor6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Sensor6Layout.createSequentialGroup()
                        .addComponent(jLabel105)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(btnS6))
                    .addGroup(Sensor6Layout.createSequentialGroup()
                        .addComponent(jLabel108)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Sensor6Layout.setVerticalGroup(
            Sensor6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Sensor6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Sensor6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Sensor6Layout.createSequentialGroup()
                        .addComponent(jLabel107)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlb_Sensor6))
                    .addGroup(Sensor6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel105)
                        .addComponent(btnS6))
                    .addGroup(Sensor6Layout.createSequentialGroup()
                        .addGroup(Sensor6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel106))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel110)))
                .addGap(17, 17, 17))
        );

        Sensor3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Sensor3.setPreferredSize(new java.awt.Dimension(1000, 100));

        jLabel86.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel86.setText("Activo hace:");

        jLabel93.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/userIcon.png"))); // NOI18N

        btnS3.setBackground(new java.awt.Color(0, 255, 51));
        btnS3.setText("ON");
        btnS3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnS3ActionPerformed(evt);
            }
        });

        jLabel100.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel100.setText("Habitación");

        jLabel102.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel102.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel102.setText("2 min");

        jlb_Sensor3.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jlb_Sensor3.setText("203");

        jLabel104.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel104.setText("Santi");

        javax.swing.GroupLayout Sensor3Layout = new javax.swing.GroupLayout(Sensor3);
        Sensor3.setLayout(Sensor3Layout);
        Sensor3Layout.setHorizontalGroup(
            Sensor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Sensor3Layout.createSequentialGroup()
                .addGroup(Sensor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Sensor3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel100))
                    .addGroup(Sensor3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jlb_Sensor3)))
                .addGap(29, 29, 29)
                .addGroup(Sensor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel93)
                    .addGroup(Sensor3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel104)))
                .addGap(18, 18, 18)
                .addGroup(Sensor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Sensor3Layout.createSequentialGroup()
                        .addComponent(jLabel86)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(btnS3))
                    .addComponent(jLabel102, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        Sensor3Layout.setVerticalGroup(
            Sensor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Sensor3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Sensor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Sensor3Layout.createSequentialGroup()
                        .addGroup(Sensor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Sensor3Layout.createSequentialGroup()
                                .addComponent(jLabel100)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlb_Sensor3))
                            .addGroup(Sensor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel86)
                                .addComponent(btnS3)))
                        .addGap(29, 29, 29))
                    .addGroup(Sensor3Layout.createSequentialGroup()
                        .addGroup(Sensor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel93))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel104)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPrincipalLayout.createSequentialGroup()
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Sensor9, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                            .addComponent(Sensor7, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Sensor5, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Sensor3, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Sensor1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Sensor10, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Sensor8, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Sensor4, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Sensor2, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(Sensor6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Sensor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sensor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Sensor4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sensor3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Sensor6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sensor5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Sensor7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sensor8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Sensor9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sensor10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CardL.add(PanelPrincipal, "PanelPrincipal");

        PanelConexion.setBackground(new java.awt.Color(204, 204, 204));
        PanelConexion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Parámetros de Conexión");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("PassDDBB:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("UserDDBB:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setText("DDBB:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setText("Puerto:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel13.setText("LocalServer:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel14.setText("RemoteServer:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel15.setText("RemoteServer2:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jButton1.setText("Editar");

        jButton2.setText("Guardar");

        javax.swing.GroupLayout PanelConexionLayout = new javax.swing.GroupLayout(PanelConexion);
        PanelConexion.setLayout(PanelConexionLayout);
        PanelConexionLayout.setHorizontalGroup(
            PanelConexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelConexionLayout.createSequentialGroup()
                .addGroup(PanelConexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelConexionLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(PanelConexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelConexionLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4)
                            .addGroup(PanelConexionLayout.createSequentialGroup()
                                .addGroup(PanelConexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addGroup(PanelConexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(PanelConexionLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(61, 61, 61)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(PanelConexionLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jButton1)
                        .addGap(116, 116, 116)
                        .addComponent(jButton2)))
                .addContainerGap(378, Short.MAX_VALUE))
        );
        PanelConexionLayout.setVerticalGroup(
            PanelConexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelConexionLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel4)
                .addGap(38, 38, 38)
                .addGroup(PanelConexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelConexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelConexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelConexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelConexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelConexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelConexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addGroup(PanelConexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(114, Short.MAX_VALUE))
        );

        CardL.add(PanelConexion, "PanelConexion");

        PanelConfgSensores.setBackground(new java.awt.Color(204, 204, 204));
        PanelConfgSensores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel5.setText("Configuracion de Sensores");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Sensor 1");

        jTextField8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextField9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Sensor 2");

        jTextField10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Sensor 3");

        jTextField11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Sensor 4");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("Sensor 5");

        jTextField12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("Sensor 6");

        jTextField13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setText("Sensor 7");

        jTextField14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextField15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setText("Sensor 8");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setText("Sensor 9");

        jTextField16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setText("Sensor 10");

        jTextField17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jButton3.setText("Modificar");

        jButton4.setText("Aceptar");

        javax.swing.GroupLayout PanelConfgSensoresLayout = new javax.swing.GroupLayout(PanelConfgSensores);
        PanelConfgSensores.setLayout(PanelConfgSensoresLayout);
        PanelConfgSensoresLayout.setHorizontalGroup(
            PanelConfgSensoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelConfgSensoresLayout.createSequentialGroup()
                .addGroup(PanelConfgSensoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelConfgSensoresLayout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel5))
                    .addGroup(PanelConfgSensoresLayout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addGroup(PanelConfgSensoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelConfgSensoresLayout.createSequentialGroup()
                                .addGroup(PanelConfgSensoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addGroup(PanelConfgSensoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel21)
                                        .addGroup(PanelConfgSensoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel17)
                                            .addComponent(jLabel18)
                                            .addComponent(jLabel19)
                                            .addComponent(jLabel20))))
                                .addGap(18, 18, 18)
                                .addGroup(PanelConfgSensoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(PanelConfgSensoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(PanelConfgSensoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(PanelConfgSensoresLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jButton3)
                                .addGap(66, 66, 66)
                                .addComponent(jButton4)))))
                .addContainerGap(179, Short.MAX_VALUE))
        );

        PanelConfgSensoresLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTextField10, jTextField11, jTextField12, jTextField13, jTextField14, jTextField15, jTextField16, jTextField17, jTextField8, jTextField9});

        PanelConfgSensoresLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel16, jLabel17, jLabel18, jLabel19, jLabel20, jLabel21, jLabel22, jLabel7, jLabel8, jLabel9});

        PanelConfgSensoresLayout.setVerticalGroup(
            PanelConfgSensoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelConfgSensoresLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel5)
                .addGap(48, 48, 48)
                .addGroup(PanelConfgSensoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelConfgSensoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelConfgSensoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelConfgSensoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelConfgSensoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelConfgSensoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelConfgSensoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelConfgSensoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelConfgSensoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelConfgSensoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(PanelConfgSensoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        PanelConfgSensoresLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jTextField10, jTextField11, jTextField12, jTextField13, jTextField14, jTextField15, jTextField16, jTextField17, jTextField8, jTextField9});

        PanelConfgSensoresLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel16, jLabel17, jLabel18, jLabel19, jLabel20, jLabel21, jLabel22, jLabel7, jLabel8, jLabel9});

        CardL.add(PanelConfgSensores, "PanelConfgSensores");

        btnSensores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Pir motion.PNG"))); // NOI18N
        btnSensores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSensoresActionPerformed(evt);
            }
        });

        btn_configuracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ajustes.png"))); // NOI18N
        btn_configuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_configuracionActionPerformed(evt);
            }
        });

        btnMenu.setBackground(new java.awt.Color(51, 153, 255));
        btnMenu.setText("Inicio");
        btnMenu.setActionCommand("PanelSensores");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Encabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(CardL, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSensores, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_configuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMenu))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnMenu)
                        .addGap(22, 22, 22)
                        .addComponent(btn_configuracion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSensores))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CardL, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnS1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnS1ActionPerformed
        String armS1 = btnS1.getText();
        if (armS1.equals("ON")) {
            btnS1.setText("OFF");
            btnS1.setBackground(Color.red);

        } else if (armS1.equals("OFF")) {
            btnS1.setText("ON");
            btnS1.setBackground(Color.green);

        } else {
            System.out.println("Error**S1******************************************");
        }
        
             
    }//GEN-LAST:event_btnS1ActionPerformed

    private void btnS2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnS2ActionPerformed
        String armS2 = btnS2.getText();
        if (armS2.equals("ON")) {
            btnS2.setText("OFF");
            btnS2.setBackground(Color.red);

        } else if (armS2.equals("OFF")) {
            btnS2.setText("ON");
            btnS2.setBackground(Color.green);

        } else {
            System.out.println("Error**S2******************************************");
        }
    }//GEN-LAST:event_btnS2ActionPerformed

    private void btnS4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnS4ActionPerformed
        String armS3 = btnS4.getText();
        if (armS3.equals("ON")) {
            btnS4.setText("OFF");
            btnS4.setBackground(Color.red);

        } else if (armS3.equals("OFF")) {
            btnS4.setText("ON");
            btnS4.setBackground(Color.green);

        } else {
            System.out.println("Error**S3******************************************");
        }
    }//GEN-LAST:event_btnS4ActionPerformed

    private void btnS7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnS7ActionPerformed
        String armS4 = btnS7.getText();
        if (armS4.equals("ON")) {
            btnS7.setText("OFF");
            btnS7.setBackground(Color.red);

        } else if (armS4.equals("OFF")) {
            btnS7.setText("ON");
            btnS7.setBackground(Color.green);

        } else {
            System.out.println("Error**S4******************************************");
        }
    }//GEN-LAST:event_btnS7ActionPerformed

    private void btnS5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnS5ActionPerformed
        String armS5 = btnS5.getText();
        if (armS5.equals("ON")) {
            btnS5.setText("OFF");
            btnS5.setBackground(Color.red);

        } else if (armS5.equals("OFF")) {
            btnS5.setText("ON");
            btnS5.setBackground(Color.green);

        } else {
            System.out.println("Error**S5******************************************");
        }
    }//GEN-LAST:event_btnS5ActionPerformed

    private void btnS10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnS10ActionPerformed
        String armS6 = btnS10.getText();
        if (armS6.equals("ON")) {
            btnS10.setText("OFF");
            btnS10.setBackground(Color.red);

        } else if (armS6.equals("OFF")) {
            btnS10.setText("ON");
            btnS10.setBackground(Color.green);

        } else {
            System.out.println("Error**S10******************************************");
        }
    }//GEN-LAST:event_btnS10ActionPerformed

    private void btn_configuracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_configuracionActionPerformed
        System.out.println("Configuraación activada...");
        CardLayout card = (CardLayout)CardL.getLayout();
        card.show(CardL, "PanelConexion");
       
    }//GEN-LAST:event_btn_configuracionActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        CardLayout card = (CardLayout)CardL.getLayout();
        card.show(CardL, "PanelPrincipal");
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnS3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnS3ActionPerformed
        String armS3 = btnS3.getText();
        if (armS3.equals("ON")) {
            btnS3.setText("OFF");
            btnS3.setBackground(Color.red);

        } else if (armS3.equals("OFF")) {
            btnS3.setText("ON");
            btnS3.setBackground(Color.green);

        } else {
            System.out.println("Error**S3******************************************");
        }
        
    }//GEN-LAST:event_btnS3ActionPerformed

    private void btnS8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnS8ActionPerformed
        String armS8 = btnS8.getText();
        if (armS8.equals("ON")) {
            btnS8.setText("OFF");
            btnS8.setBackground(Color.red);

        } else if (armS8.equals("OFF")) {
            btnS8.setText("ON");
            btnS8.setBackground(Color.green);

        } else {
            System.out.println("Error**S8******************************************");
        }
    }//GEN-LAST:event_btnS8ActionPerformed

    private void btnS6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnS6ActionPerformed
        String armS6 = btnS6.getText();
        if (armS6.equals("ON")) {
            btnS6.setText("OFF");
            btnS6.setBackground(Color.red);

        } else if (armS6.equals("OFF")) {
            btnS6.setText("ON");
            btnS6.setBackground(Color.green);

        } else {
            System.out.println("Error**S8******************************************");
        }
    }//GEN-LAST:event_btnS6ActionPerformed

    private void btnS9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnS9ActionPerformed
        String armS9 = btnS9.getText();
        if (armS9.equals("ON")) {
            btnS9.setText("OFF");
            btnS9.setBackground(Color.red);

        } else if (armS9.equals("OFF")) {
            btnS9.setText("ON");
            btnS9.setBackground(Color.green);

        } else {
            System.out.println("Error**S9******************************************");
        }
    }//GEN-LAST:event_btnS9ActionPerformed

    private void btnSensoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSensoresActionPerformed
                CardLayout card = (CardLayout)CardL.getLayout();
        card.show(CardL, "PanelConfgSensores");
    }//GEN-LAST:event_btnSensoresActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

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
            java.util.logging.Logger.getLogger(Original.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Original.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Original.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Original.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Original().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CardL;
    private javax.swing.JPanel Encabezado;
    private javax.swing.JPanel PanelConexion;
    private javax.swing.JPanel PanelConfgSensores;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JPanel Sensor1;
    private javax.swing.JPanel Sensor10;
    private javax.swing.JPanel Sensor2;
    private javax.swing.JPanel Sensor3;
    private javax.swing.JPanel Sensor4;
    private javax.swing.JPanel Sensor5;
    private javax.swing.JPanel Sensor6;
    private javax.swing.JPanel Sensor7;
    private javax.swing.JPanel Sensor8;
    private javax.swing.JPanel Sensor9;
    private javax.swing.JButton btnMenu;
    private javax.swing.JToggleButton btnS1;
    private javax.swing.JToggleButton btnS10;
    private javax.swing.JToggleButton btnS2;
    private javax.swing.JToggleButton btnS3;
    private javax.swing.JToggleButton btnS4;
    private javax.swing.JToggleButton btnS5;
    private javax.swing.JToggleButton btnS6;
    private javax.swing.JToggleButton btnS7;
    private javax.swing.JToggleButton btnS8;
    private javax.swing.JToggleButton btnS9;
    private javax.swing.JButton btnSensores;
    private javax.swing.JButton btn_configuracion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel jlb_Sensor1;
    private javax.swing.JLabel jlb_Sensor10;
    private javax.swing.JLabel jlb_Sensor2;
    private javax.swing.JLabel jlb_Sensor3;
    private javax.swing.JLabel jlb_Sensor4;
    private javax.swing.JLabel jlb_Sensor5;
    private javax.swing.JLabel jlb_Sensor6;
    private javax.swing.JLabel jlb_Sensor7;
    private javax.swing.JLabel jlb_Sensor8;
    private javax.swing.JLabel jlb_Sensor9;
    // End of variables declaration//GEN-END:variables
}

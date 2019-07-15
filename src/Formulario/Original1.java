package Formulario;

import Conexion.Cls_Conexion;
import Logica.Cls_Alarma;
import Logica.Cls_Sensores;
import Logica.VariablesConfig;
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


public class Original1 extends javax.swing.JFrame {

    private final Cls_Sensores Sensores_Registrados;
    private final Cls_Alarma Actividad;
    private final VariablesConfig DatosConfig;
    private final Timer Temporizador;
    private Boolean tempIsPaused;
  
    private Cls_Conexion cnn;
   
     
     public Original1() {
        initComponents();
       
        Sensores_Registrados = new Cls_Sensores(cnn);
        Actividad = new Cls_Alarma(cnn);
        DatosConfig = new VariablesConfig();
        Temporizador = new Timer();
        
   
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
                    System.out.println("Temporizador Actualizado");
                    try {
                        listar_Actividad();
                        listar_Sensores();
                    } catch (InterruptedException | ClassNotFoundException | SQLException ex) {
                        Logger.getLogger(Original1.class.getName()).log(Level.SEVERE, null, ex);
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
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PanelSensores = new javax.swing.JPanel();
        Sensor1 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        btnS1 = new javax.swing.JToggleButton();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jlb_Sensor1 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        Sensor2 = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        btnS2 = new javax.swing.JToggleButton();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jlb_Sensor2 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        Sensor3 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        btnS3 = new javax.swing.JToggleButton();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jlb_Sensor4 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        Sensor4 = new javax.swing.JPanel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        btnS4 = new javax.swing.JToggleButton();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jlb_Sensor3 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        Sensor5 = new javax.swing.JPanel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        btnS5 = new javax.swing.JToggleButton();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jlb_Sensor5 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        Sensor6 = new javax.swing.JPanel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        btnS6 = new javax.swing.JToggleButton();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jlb_Sensor6 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        btn_configuracion = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

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
                .addGap(223, 223, 223)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(35, 35, 35))
        );
        EncabezadoLayout.setVerticalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EncabezadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EncabezadoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(35, 50, 119));

        jScrollPane1.setBackground(new java.awt.Color(153, 153, 0));

        PanelSensores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelSensores.setPreferredSize(new java.awt.Dimension(1000, 100));

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
        jLabel42.setText("3 minutos");

        jLabel43.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel43.setText("Notificaciones");

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
                .addGap(47, 47, 47)
                .addComponent(jLabel39)
                .addGap(18, 18, 18)
                .addComponent(jLabel42)
                .addGroup(Sensor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Sensor1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel43))
                    .addGroup(Sensor1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(btnS1)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        Sensor1Layout.setVerticalGroup(
            Sensor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Sensor1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Sensor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Sensor1Layout.createSequentialGroup()
                        .addGroup(Sensor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel40)
                            .addComponent(jLabel39)
                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel45))
                    .addGroup(Sensor1Layout.createSequentialGroup()
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlb_Sensor1))
                    .addGroup(Sensor1Layout.createSequentialGroup()
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnS1)))
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

        jLabel78.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel78.setText("Notificaciones");

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
                .addGap(47, 47, 47)
                .addComponent(jLabel74)
                .addGap(18, 18, 18)
                .addComponent(jLabel77)
                .addGroup(Sensor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Sensor2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel78))
                    .addGroup(Sensor2Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(btnS2)))
                .addContainerGap(43, Short.MAX_VALUE))
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
                    .addGroup(Sensor2Layout.createSequentialGroup()
                        .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnS2))
                    .addGroup(Sensor2Layout.createSequentialGroup()
                        .addGroup(Sensor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel75)
                            .addComponent(jLabel74)
                            .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel80)))
                .addGap(12, 12, 12))
        );

        Sensor3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Sensor3.setPreferredSize(new java.awt.Dimension(1000, 100));

        jLabel46.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel46.setText("Activo hace:");

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/userIcon.png"))); // NOI18N

        btnS3.setBackground(new java.awt.Color(0, 255, 51));
        btnS3.setText("ON");
        btnS3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnS3ActionPerformed(evt);
            }
        });

        jLabel48.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel48.setText("Habitación");

        jLabel49.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel49.setText("9 minutos");

        jLabel50.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel50.setText("Notificaciones");

        jlb_Sensor4.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jlb_Sensor4.setText("204");

        jLabel52.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel52.setText("Tristán");

        javax.swing.GroupLayout Sensor3Layout = new javax.swing.GroupLayout(Sensor3);
        Sensor3.setLayout(Sensor3Layout);
        Sensor3Layout.setHorizontalGroup(
            Sensor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Sensor3Layout.createSequentialGroup()
                .addGroup(Sensor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Sensor3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel48))
                    .addGroup(Sensor3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jlb_Sensor4)))
                .addGap(29, 29, 29)
                .addGroup(Sensor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Sensor3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel52)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel46)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel49)
                        .addGap(61, 61, 61)
                        .addComponent(btnS3)
                        .addContainerGap(69, Short.MAX_VALUE))
                    .addGroup(Sensor3Layout.createSequentialGroup()
                        .addComponent(jLabel47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel50)
                        .addGap(45, 45, 45))))
        );
        Sensor3Layout.setVerticalGroup(
            Sensor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Sensor3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Sensor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Sensor3Layout.createSequentialGroup()
                        .addComponent(jLabel48)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlb_Sensor4)
                        .addGap(29, 29, 29))
                    .addGroup(Sensor3Layout.createSequentialGroup()
                        .addGroup(Sensor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Sensor3Layout.createSequentialGroup()
                                .addGroup(Sensor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel47)
                                    .addComponent(jLabel46)
                                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel52))
                            .addGroup(Sensor3Layout.createSequentialGroup()
                                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnS3)))
                        .addContainerGap())))
        );

        Sensor4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Sensor4.setPreferredSize(new java.awt.Dimension(1000, 100));

        jLabel81.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel81.setText("Activo hace:");

        jLabel82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/userIcon.png"))); // NOI18N

        btnS4.setBackground(new java.awt.Color(0, 255, 51));
        btnS4.setText("ON");
        btnS4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnS4ActionPerformed(evt);
            }
        });

        jLabel83.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel83.setText("Habitación");

        jLabel84.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel84.setText("2 minutos");

        jLabel85.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel85.setText("Notificaciones");

        jlb_Sensor3.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jlb_Sensor3.setText("203");

        jLabel87.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel87.setText("Santi");

        javax.swing.GroupLayout Sensor4Layout = new javax.swing.GroupLayout(Sensor4);
        Sensor4.setLayout(Sensor4Layout);
        Sensor4Layout.setHorizontalGroup(
            Sensor4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Sensor4Layout.createSequentialGroup()
                .addGroup(Sensor4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Sensor4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel83))
                    .addGroup(Sensor4Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jlb_Sensor3)))
                .addGap(29, 29, 29)
                .addGroup(Sensor4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel82)
                    .addGroup(Sensor4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel87)))
                .addGap(47, 47, 47)
                .addComponent(jLabel81)
                .addGap(18, 18, 18)
                .addComponent(jLabel84)
                .addGroup(Sensor4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Sensor4Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel85))
                    .addGroup(Sensor4Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(btnS4)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        Sensor4Layout.setVerticalGroup(
            Sensor4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Sensor4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Sensor4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Sensor4Layout.createSequentialGroup()
                        .addGroup(Sensor4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Sensor4Layout.createSequentialGroup()
                                .addComponent(jLabel83)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlb_Sensor3))
                            .addGroup(Sensor4Layout.createSequentialGroup()
                                .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnS4)))
                        .addGap(29, 29, 29))
                    .addGroup(Sensor4Layout.createSequentialGroup()
                        .addGroup(Sensor4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel82)
                            .addComponent(jLabel81)
                            .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        jLabel91.setText("12 minutos");

        jLabel92.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel92.setText("Notificaciones");

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
                .addGroup(Sensor5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Sensor5Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel88)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel91)
                        .addGap(55, 55, 55)
                        .addComponent(btnS5)
                        .addContainerGap(68, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Sensor5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel92)
                        .addGap(41, 41, 41))))
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
                        .addGroup(Sensor5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel88)
                            .addGroup(Sensor5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Sensor5Layout.createSequentialGroup()
                                    .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(Sensor5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnS5)))
                                .addComponent(jLabel89, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel94)))
                .addGap(17, 17, 17))
        );

        Sensor6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Sensor6.setPreferredSize(new java.awt.Dimension(1000, 100));

        jLabel95.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel95.setText("Activo hace:");

        jLabel96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/userIcon.png"))); // NOI18N

        btnS6.setBackground(new java.awt.Color(0, 255, 51));
        btnS6.setText("ON");
        btnS6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnS6ActionPerformed(evt);
            }
        });

        jLabel97.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel97.setText("Habitación");

        jLabel98.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel98.setText("24 minutos");

        jLabel99.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel99.setText("Notificaciones");

        jlb_Sensor6.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jlb_Sensor6.setText("206");

        jLabel101.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel101.setText("Carmen");

        javax.swing.GroupLayout Sensor6Layout = new javax.swing.GroupLayout(Sensor6);
        Sensor6.setLayout(Sensor6Layout);
        Sensor6Layout.setHorizontalGroup(
            Sensor6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Sensor6Layout.createSequentialGroup()
                .addGroup(Sensor6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Sensor6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel97))
                    .addGroup(Sensor6Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jlb_Sensor6)))
                .addGap(29, 29, 29)
                .addGroup(Sensor6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel96)
                    .addComponent(jLabel101))
                .addGroup(Sensor6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Sensor6Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel95)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel98)
                        .addGap(54, 54, 54)
                        .addComponent(btnS6)
                        .addContainerGap(69, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Sensor6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel99)
                        .addGap(41, 41, 41))))
        );
        Sensor6Layout.setVerticalGroup(
            Sensor6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Sensor6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Sensor6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Sensor6Layout.createSequentialGroup()
                        .addComponent(jLabel97)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlb_Sensor6))
                    .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Sensor6Layout.createSequentialGroup()
                        .addGroup(Sensor6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel96)
                            .addComponent(jLabel95)
                            .addGroup(Sensor6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnS6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel101)))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout PanelSensoresLayout = new javax.swing.GroupLayout(PanelSensores);
        PanelSensores.setLayout(PanelSensoresLayout);
        PanelSensoresLayout.setHorizontalGroup(
            PanelSensoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelSensoresLayout.createSequentialGroup()
                .addGroup(PanelSensoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelSensoresLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Sensor5, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Sensor6, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelSensoresLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(PanelSensoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanelSensoresLayout.createSequentialGroup()
                                .addComponent(Sensor4, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Sensor3, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelSensoresLayout.createSequentialGroup()
                                .addComponent(Sensor1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Sensor2, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(28, 28, 28))
        );
        PanelSensoresLayout.setVerticalGroup(
            PanelSensoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSensoresLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(PanelSensoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Sensor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sensor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelSensoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Sensor3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sensor4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelSensoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Sensor5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sensor6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(PanelSensores);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        btn_configuracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ajustes.png"))); // NOI18N
        btn_configuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_configuracionActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Pir motion.PNG"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Encabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_configuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btn_configuracion)
                        .addGap(44, 44, 44)
                        .addComponent(jButton1)))
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

    private void btnS4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnS4ActionPerformed
        String armS4 = btnS4.getText();
        if (armS4.equals("ON")) {
            btnS4.setText("OFF");
            btnS4.setBackground(Color.red);

        } else if (armS4.equals("OFF")) {
            btnS4.setText("ON");
            btnS4.setBackground(Color.green);

        } else {
            System.out.println("Error**S4******************************************");
        }
    }//GEN-LAST:event_btnS4ActionPerformed

    private void btnS5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnS5ActionPerformed
        String armS5 = btnS5.getText();
        if (armS5.equals("ON")) {
            btnS5.setText("OFF");
            btnS5.setBackground(Color.red);

        } else if (armS5.equals("OFF")) {
            btnS5.setText("ON");
            btnS5.setBackground(Color.green);

        } else {
            System.out.println("Error**S2******************************************");
        }
    }//GEN-LAST:event_btnS5ActionPerformed

    private void btnS6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnS6ActionPerformed
        String armS6 = btnS6.getText();
        if (armS6.equals("ON")) {
            btnS6.setText("OFF");
            btnS6.setBackground(Color.red);

        } else if (armS6.equals("OFF")) {
            btnS6.setText("ON");
            btnS6.setBackground(Color.green);

        } else {
            System.out.println("Error**S2******************************************");
        }
    }//GEN-LAST:event_btnS6ActionPerformed

    private void btn_configuracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_configuracionActionPerformed
        System.out.println("Configuraación activada...");
    }//GEN-LAST:event_btn_configuracionActionPerformed

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
            java.util.logging.Logger.getLogger(Original1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Original1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Original1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Original1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Original1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Encabezado;
    private javax.swing.JPanel PanelSensores;
    private javax.swing.JPanel Sensor1;
    private javax.swing.JPanel Sensor2;
    private javax.swing.JPanel Sensor3;
    private javax.swing.JPanel Sensor4;
    private javax.swing.JPanel Sensor5;
    private javax.swing.JPanel Sensor6;
    private javax.swing.JToggleButton btnS1;
    private javax.swing.JToggleButton btnS2;
    private javax.swing.JToggleButton btnS3;
    private javax.swing.JToggleButton btnS4;
    private javax.swing.JToggleButton btnS5;
    private javax.swing.JToggleButton btnS6;
    private javax.swing.JButton btn_configuracion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlb_Sensor1;
    private javax.swing.JLabel jlb_Sensor2;
    private javax.swing.JLabel jlb_Sensor3;
    private javax.swing.JLabel jlb_Sensor4;
    private javax.swing.JLabel jlb_Sensor5;
    private javax.swing.JLabel jlb_Sensor6;
    // End of variables declaration//GEN-END:variables
}

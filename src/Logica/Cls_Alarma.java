package Logica;

import Conexion.Cls_Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import ds.desktop.notify.DesktopNotify;
import java.sql.Timestamp;
import java.util.Calendar;
import Cls_Sonido.Sonidos;


public class Cls_Alarma {
    
    private DefaultTableModel TABLA;
    private ResultSet RS;
    private PreparedStatement PS;
    private final Cls_Conexion cnn;

    public boolean Armado_Notificaciones = true;
    //private final String SQL_SELECT = "SELECT *FROM `Actividad`, `Sensores` WHERE  (`Actividad`.`sensor` = `Sensores`.id_sensor) AND `Actividad`.`sensor`<>'0'" + "ORDER BY `Actividad`.`hora` DESC LIMIT 1;";
    private final String SQL_SELECT = "SELECT *FROM `Actividad`, `Sensores` WHERE (`Actividad`.`sensor` = `Sensores`.id_sensor) AND `Actividad`.`sensor` IN ('1','2','3','4','5','6','7','8','9','10') ORDER BY `Actividad`.`hora` DESC LIMIT 1";

    private static final Sonidos SonidoX = new Sonidos();
    public String Cadena_Estado = "";
    public String Inactividad_Minutos = "";
    private String UltRegistro_Hora = "";
    private String UltRegistro_Sensor = "";

    public Cls_Alarma(Cls_Conexion cnn) {
        PS = null;
        this.cnn = cnn;
    }

    private DefaultTableModel ConfiguraTitulos_Actividad() {
        TABLA = new DefaultTableModel();
        TABLA.addColumn("Sensor");
        TABLA.addColumn("Último Registro");
        return TABLA;
    }

    //Método para listar los datos leyendo desde la DDBB
    public DefaultTableModel Tabla_Actividad() throws InterruptedException, ClassNotFoundException, SQLException {

        try {
            ConfiguraTitulos_Actividad();
            PS = cnn.getConnection().prepareStatement(SQL_SELECT);
            RS = PS.executeQuery();
            Object[] fila = new Object[9];

            while (RS.next()) {

                fila[0] = RS.getString(7);
                fila[1] = RS.getTimestamp(2);

                TABLA.addRow(fila);
                java.util.Calendar calendarHoy = Calendar.getInstance();
                java.util.Date hoy = calendarHoy.getTime();
                Timestamp horaPC = new Timestamp(hoy.getTime());

                String sensor;
                int estado;
                Timestamp UltimoRegistroDDBB = RS.getTimestamp(2);
                estado = RS.getInt(5);
                sensor = RS.getString(7);

                long Inactividad_mS = Math.abs((UltimoRegistroDDBB.getTime()) - (horaPC.getTime()));
                long Inactividad_min = (Inactividad_mS / 60) / 1000;
                Cadena_Estado = String.valueOf(estado);
                Inactividad_Minutos = String.valueOf(Inactividad_min);

                String message = "";
                message += "Inactividad_Minutos= " + Inactividad_Minutos + "\n";
                message += "String Estado = " + Cadena_Estado + "\n";
                message += ("------------------------------------------------------------------------------------") + "\n";
                message += ("Último Registro hace: " + Inactividad_min + " minutos en el sensor: " + sensor) + "\n";
                message += ("Estado: " + estado) + "\n";
                message += ("UltimoRegistroDDBB: " + UltimoRegistroDDBB) + "\n";
                message += ("horaPC: " + horaPC) + "\n";
                message += ("Inactividad_mS: " + Inactividad_mS) + "\n";
                message += ("------------------------------------------------------------------------------------") + "\n";
                System.out.println(message);
                if ((estado >= 1) && (Armado_Notificaciones)) {

                    if (!UltRegistro_Hora.equals("") && !UltRegistro_Sensor.equals("") && !(UltRegistro_Hora.equals(UltimoRegistroDDBB.toString()) && UltRegistro_Sensor.equals(sensor))) {
                        DesktopNotify.showDesktopMessage("Alerta de Movimiento en sensor: " + sensor, "Revisa la cámara", DesktopNotify.TIP, 15000L);
                        System.out.println("DesktopNotify Enviado");
                        SonidoX.Sonido_Mouse();
                    }

                } else {
                    System.out.println("Sin cambios");
                }
                UltRegistro_Hora = UltimoRegistroDDBB.toString();
                UltRegistro_Sensor = sensor;
            }

        } catch (SQLException e) {
            System.out.println("Error al Listar los datos desde Cls_Alarma: " + e.getMessage());
        } finally {
            PS = null;
            RS = null;
            //CN.close();
        }
        return TABLA;
    }
}

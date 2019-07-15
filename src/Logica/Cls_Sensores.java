package Logica;

import Conexion.Cls_Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class Cls_Sensores {

    private DefaultTableModel TABLA_Sensores;
    private ResultSet RS_Sensores;
    private PreparedStatement PS_Sensores;
    private final Cls_Conexion cnn;

    public List<Cls_Sensor> SensorNumero = new ArrayList<>();

    private final String SQL_SELECT_Sensores = "SELECT * FROM `Sensores`";

    public Cls_Sensores(Cls_Conexion cnn) {
        PS_Sensores = null;
        //Le pasamos una conexion ya creada
        this.cnn = cnn;
    }

    private DefaultTableModel setTitulos_Sensores() {
        TABLA_Sensores = new DefaultTableModel();
        TABLA_Sensores.addColumn("Id_sensor");
        TABLA_Sensores.addColumn("nombre_sensor");
        TABLA_Sensores.addColumn("Grupo");
        TABLA_Sensores.addColumn("PinD");
        return TABLA_Sensores;
    }

    //Método para listar los datos leyendo desde la DDBB
    public DefaultTableModel TomoDatos_Sensores() throws InterruptedException {

        try {
            setTitulos_Sensores();

            PS_Sensores = cnn.getConnection().prepareStatement(SQL_SELECT_Sensores);
            RS_Sensores = PS_Sensores.executeQuery();
            Object[] fila = new Object[4];

            SensorNumero.clear();
            while (RS_Sensores.next()) {
                fila[0] = RS_Sensores.getString(1);
                fila[1] = RS_Sensores.getString(2);
                fila[2] = RS_Sensores.getString(3);
                fila[3] = RS_Sensores.getString(4);
                TABLA_Sensores.addRow(fila);

                SensorNumero.add(new Cls_Sensor(RS_Sensores.getString(1), false, RS_Sensores.getString(2), RS_Sensores.getString(3), RS_Sensores.getString(4)));
            }

        } catch (SQLException e) {
            System.out.println("Error al Listar los datos desde Consulta Sensores: " + e.getMessage());

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Cls_Sensores.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            PS_Sensores = null;
            RS_Sensores = null;
            cnn.close();
        }
        return TABLA_Sensores;
    }
}
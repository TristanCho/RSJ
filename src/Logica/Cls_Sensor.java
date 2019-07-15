package Logica;

public class Cls_Sensor {

    private String Id_sensor;
    private boolean activo;
    private String nombre;
    private String Grupo;
    private String PinD;

    public Cls_Sensor() {
    }

    public Cls_Sensor(String Id_sensor, boolean activo, String nombre, String Grupo, String PinD) {
        this.Id_sensor = Id_sensor;
        this.activo = activo;
        this.nombre = nombre;
        this.Grupo = Grupo;
        this.PinD = PinD;
    }

    public String getId_sensor() {
        return Id_sensor;
    }

    public void setId_sensor(String Id_sensor) {
        this.Id_sensor = Id_sensor;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGrupo() {
        return Grupo;
    }

    public void setGrupo(String Grupo) {
        this.Grupo = Grupo;
    }

    public String getPinD() {
        return PinD;
    }

    public void setPinD(String PinD) {
        this.PinD = PinD;
    }
}

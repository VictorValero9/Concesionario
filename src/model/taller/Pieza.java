package model.taller;

public class Pieza {
    private String nombrePieza;
    private int cantidad;
    private int idPieza;

    public Pieza(String nombrePieza, int cantidad, int idPieza) {
        this.nombrePieza = nombrePieza;
        this.cantidad = cantidad;
        this.idPieza = idPieza;
    }

    public String getNombrePieza() {
        return nombrePieza;
    }

    public void setNombrePieza(String nombrePieza) {
        this.nombrePieza = nombrePieza;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getIdPieza() {
        return idPieza;
    }

    public void setIdPieza(int idPieza) {
        this.idPieza = idPieza;
    }
}

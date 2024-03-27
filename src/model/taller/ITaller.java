package model.taller;

import model.vehicle.Vehiculo;

import java.util.List;

public interface ITaller {

    void crearPieza(String nombrePieza, int cantidad, int idPieza);
    void eliminarPieza(Pieza pieza);
    List<Pieza> mostrarPiezas();
    void arreglarVehiculo(Vehiculo vehiculo);
    void recibirVehiculo(Vehiculo vehiculo);
    List<Vehiculo> mostrarVehiculosEnReparacion();





}

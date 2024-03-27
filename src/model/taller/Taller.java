package model.taller;

import model.vehicle.Vehiculo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Taller implements ITaller {

    private Map<Integer, Pieza> stockPiezas;
    private List<Vehiculo> vehiculosEnReparacion;

    public Taller() {
        this.stockPiezas = new HashMap<>();
        this.vehiculosEnReparacion = new ArrayList<>();
    }
    @Override
    public void crearPieza(String nombrePieza, int cantidad, int idPieza) {
        stockPiezas.put(idPieza, new Pieza(nombrePieza, cantidad, idPieza));
    }

    @Override
    public void eliminarPieza(Pieza pieza){
        stockPiezas.remove(pieza.getIdPieza());
    }

    @Override
    public List<Pieza> mostrarPiezas() {
        return new ArrayList<>(stockPiezas.values());
    }

    @Override
    public void arreglarVehiculo(Vehiculo vehiculo) {
        System.out.println("Arreglando vehiculo");
        vehiculosEnReparacion.remove(vehiculo);
    }

    @Override
    public void recibirVehiculo(Vehiculo vehiculo) {
        System.out.println("Recibiendo vehiculo");
        vehiculosEnReparacion.add(vehiculo);
    }
    @Override
    public List<Vehiculo> mostrarVehiculosEnReparacion() {
        System.out.println("Vehiculos en reparacion");
        
        return new ArrayList<>(vehiculosEnReparacion);
    }


}

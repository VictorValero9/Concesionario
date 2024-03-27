package model.store;

import model.vehicle.Vehiculo;

import java.util.List;

public interface IStore {
    void venderVehiculo(int idVehiculo);
    List<Vehiculo> mostrarCatalogo();
    void recibirVisita();
    void comprarVehiculo(Vehiculo vehiculo);
    void actualizarStockVenta(int cantidad);
    void agregarVehiculoCatalago(Vehiculo vehiculo);
    void eliminarVehiculoCatalogo(Vehiculo vehiculo);



}

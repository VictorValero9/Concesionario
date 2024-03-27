package model.store;
import model.vehicle.Vehiculo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Store implements IStore{
    private List<Vehiculo> catalogo;
    public Store() {
        this.catalogo = new ArrayList<>();
    }

    @Override
    public void venderVehiculo(int idVehiculo) {
        Iterator<Vehiculo> iterator = catalogo.iterator();
        while (iterator.hasNext()) {
            Vehiculo vehiculo = iterator.next();
            if (vehiculo.getIdVehiculo() == idVehiculo) {
                iterator.remove();
                vehiculo.setStock(vehiculo.getStock() - 1);
                break;
            }
        }
    }

    @Override
    public List<Vehiculo> mostrarCatalogo() {
        for (Vehiculo vehiculo : catalogo) {
            System.out.println(vehiculo.getName());
            System.out.println(vehiculo.getStock());
            System.out.println(vehiculo.getPrecio());
            System.out.println(vehiculo.getMarca());
            System.out.println("=====================================");
        }
        return catalogo;
    }

    @Override
    public void recibirVisita() {
        System.out.println("Recibiendo visita");
        System.out.println("Esperamos que encuentre lo que busca");
    }

    @Override
    public void comprarVehiculo(Vehiculo vehiculo) {
        catalogo.add(vehiculo);
        vehiculo.addStock(1);
    }

    @Override
    public void actualizarStockVenta(int cantidad) {
        for (Vehiculo vehiculo : catalogo) {
            vehiculo.removeStock(cantidad);
        }
    }

    @Override
    public void agregarVehiculoCatalago(Vehiculo vehiculo) {
        catalogo.add(vehiculo);
        vehiculo.addStock(1);
    }

    @Override
    public void eliminarVehiculoCatalogo(Vehiculo vehiculo) {
        catalogo.remove(vehiculo);
        vehiculo.removeStock(1);
    }



}

package model.factura;

import model.vehicle.Vehiculo;

public class Factura {
    private Vehiculo vehiculoVendido;
    private int cantidadVendida;

    public Factura(Vehiculo vehiculoVendido, int cantidadVendida) {
        this.vehiculoVendido = vehiculoVendido;
        this.cantidadVendida = cantidadVendida;
    }

    public double getTotal(){
        return vehiculoVendido.getPrecio() * cantidadVendida;
    }

    public void mostrarFactura(){
        System.out.println("Vehiculo: " + vehiculoVendido.getName());
        System.out.println("Marca: " + vehiculoVendido.getMarca());
        System.out.println("Precio: " + vehiculoVendido.getPrecio());
        System.out.println("Cantidad: " + cantidadVendida);
        System.out.println("Total: " + getTotal());
    }
}

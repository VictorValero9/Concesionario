import model.factura.Factura;
import model.store.Store;
import model.taller.Taller;
import model.vehicle.Deportivo;
import model.vehicle.MixtoAdaptable;
import model.vehicle.Turismo;
import model.vehicle.Vehiculo;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Deportivo(1, "DeportivoFerrari", "Ferrari", 10, 100000);
        Vehiculo vehiculo2 = new MixtoAdaptable(2, "MixtoAdaptable", "Toyota", 5, 50000);
        Vehiculo vehiculo3 = new Turismo(3, "Turismo", "Toyota", 5, 50000);

        Store concesionario = new Store();

        concesionario.agregarVehiculoCatalago(vehiculo1);
        concesionario.agregarVehiculoCatalago(vehiculo2);
        concesionario.agregarVehiculoCatalago(vehiculo3);

        concesionario.recibirVisita();
        concesionario.mostrarCatalogo();

        vehiculo1.encenderMotor();
        vehiculo1.pisarAcelerador(6);
        vehiculo1.pisarFreno(2);
        vehiculo1.encenderIntermitentes();
        vehiculo1.girarVolante("derecha");
        vehiculo1.encenderLuces();
        vehiculo1.apagarLuces();
        vehiculo1.pisarEmbrague();
        vehiculo1.cambiarMarcha(3);
        vehiculo1.soltarEmbrague();
        vehiculo1.encenderIntermitentes();
        vehiculo1.girarVolante("izquierda");
        vehiculo1.encenderIntermitentes();
        vehiculo1.girarVolante("izquierda");
        vehiculo1.pisarEmbrague();
        vehiculo1.cambiarMarcha(2);
        vehiculo1.soltarEmbrague();
        vehiculo1.pisarAcelerador(10);
        vehiculo1.pisarFreno(7);
        vehiculo1.encenderIntermitentes();
        vehiculo1.girarVolante("izquierda");
        vehiculo1.encenderIntermitentes();
        vehiculo1.girarVolante("derecha");
        vehiculo1.apagarMotor();


        concesionario.venderVehiculo(vehiculo1.getIdVehiculo());
        concesionario.venderVehiculo(vehiculo2.getIdVehiculo());

        System.out.println("Despues de la venta");
        System.out.println("=====================================");
        concesionario.mostrarCatalogo();

        Factura factura = new Factura(vehiculo1, 1);
        factura.mostrarFactura();


        Taller taller = new Taller();
        taller.recibirVehiculo(vehiculo1);
        taller.arreglarVehiculo(vehiculo1);


    }
}
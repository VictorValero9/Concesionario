package model.vehicle;

public interface ISimulacionVehiculo {
    void girarVolante(String direccion);
    void cambiarMarcha(int marcha);
    void pisarAcelerador(int intensidad);
    void pisarFreno(int intensidad);
    void encenderMotor();
    void apagarMotor();
    void encenderLuces();
    void apagarLuces();
    void pisarEmbrague();
    void soltarEmbrague();
    void encenderIntermitentes();
    void apagarIntermitentes();



}

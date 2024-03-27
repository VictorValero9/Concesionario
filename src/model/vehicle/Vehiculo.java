package model.vehicle;

import model.store.IStore;

public abstract class Vehiculo implements ISimulacionVehiculo {
    private int idVehiculo;
    private String name;
    private String marca;
    private double precio;
    private String matricula;
    private int stock;

    public Vehiculo(int idVehiculo, String name, String marca, int stock, double precio) {
        this.idVehiculo = idVehiculo;
        this.name = name;
        this.marca = marca;
        this.stock = stock;
        this.precio = precio;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    public void addStock(int quantity){
        this.stock += quantity;
    }

    public void removeStock(int quantity){
        this.stock -= quantity;
    }

    public void showInfo(){
        System.out.println("ID: " + idVehiculo);
        System.out.println("Nombre: " + name);
        System.out.println("Marca: " + marca);
        System.out.println("Matricula: " + matricula);
        System.out.println("Stock: " + stock);
    }

    @Override
    public void girarVolante(String direccion){
        System.out.println("Girando volante hacia " + direccion);
    }

    @Override
    public void pisarAcelerador(int intensidad){
        System.out.println("Pisando acelerador con intensidad: " + intensidad);
    }

    @Override
    public void pisarFreno(int intensidad){
        System.out.println("Pisando freno con intensidad: " + intensidad);
    }

    @Override
    public void encenderMotor(){
        System.out.println("Encendiendo motor");
    }

    @Override
    public void apagarMotor(){
        System.out.println("Apagando motor");
    }

    @Override
    public void encenderLuces(){
        System.out.println("Encendiendo luces");
    }

    @Override
    public void apagarLuces(){
        System.out.println("Apagando luces");
    }

    @Override
    public void pisarEmbrague(){
        System.out.println("Pisando embrague");
    }

    @Override
    public void soltarEmbrague(){
        System.out.println("Soltando embrague");
    }

    @Override
    public void encenderIntermitentes(){
        System.out.println("Encendiendo intermitentes");
    }

    @Override
    public void apagarIntermitentes(){
        System.out.println("Apagando intermitentes");
    }

    @Override
    public void cambiarMarcha(int marcha){
        System.out.println("Cambiando a marcha: " + marcha);
    }


}

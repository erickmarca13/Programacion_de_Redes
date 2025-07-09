package Prueba;

public class BancoPruebas {
    public static void main(String[] args) {
        
        Thread vehiculo1 = new Thread(new Vehiculo(1, 1));
        Thread vehiculo2 = new Thread(new Vehiculo(2, 2));
        Thread vehiculo3 = new Thread(new Vehiculo(3, 3));

      
        vehiculo1.start();
        vehiculo2.start();
        vehiculo3.start();
    }
}

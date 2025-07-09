package Prueba;

public class Vehiculo implements Runnable {
    private int idVehiculo;
    private int pista;

    public Vehiculo(int idVehiculo, int pista) {
        this.idVehiculo = idVehiculo;
        this.pista = pista;
    }

    @Override
    public void run() {
        try {
            System.out.println("Vehículo " + idVehiculo + " entrando en la pista " + pista);
            int tiempo = (int) (Math.random() * 3) + 3; // entre 3 y 5 segundos
            Thread.sleep(tiempo * 1000);
            System.out.println("Vehículo " + idVehiculo + " completó la prueba en la pista " + pista + " en " + tiempo + " segundos.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

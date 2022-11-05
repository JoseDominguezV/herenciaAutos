public class Vehiculo {
    private String placa;
    private Marca marca;
    private Double valor;
    protected int velocidad = 0;
    protected boolean encendido = false;

    public Vehiculo(String placa, Marca marca, Double valor) {
        this.placa = placa;
        this.marca = marca;
        this.valor = valor;
    }

    public void acelerar() {
        if (encendido) {
            velocidad = velocidad + 10;
            System.out.println("Esta acelerando, velocidad actual: " + velocidad + "km/h");
        } else {
            System.out.println("El vehiculo no esta encendio");
        }
    }

    public void frenar() {
        if (velocidad > 0) {
            velocidad = velocidad - 10;
            System.out.println("Esta frenando, velocidad actual: " + velocidad + "km/h");
        } else {
            System.out.println("El vehiculo no se encuentra en movimiento");
        }
    }

    public void encender() {
        encendido = true;
        System.out.println("Se encendio el vehiculo \n"
                + "Placa: " + placa
                + "\nMarca: " + marca
                + "\nValor: " + valor);
    }

    public void apagar() {
        encendido = false;
        System.out.println("Se apagp el vehiculo");
    }

}

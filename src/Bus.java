
public class Bus extends Vehiculo {
    private Empresa empresa;

    public Bus(String placa, Marca marca, Double valor) {
        super(placa, marca, valor);
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    @Override
    public void acelerar() {
            if (velocidad < 80){
                super.acelerar();
            }else {
                System.out.println("Tenga la bondad de ir mas despacio pirobo");
            }
        }
    }


public class Main {
    public static void main(String[] args) {
        System.out.println("---------------Bus---------------");
        Bus miBucesito = new Bus("ABC123", Marca.KIA, 150000.0);
        miBucesito.setEmpresa(Empresa.EXPRESO_PALMIRA);
        System.out.println(miBucesito.getEmpresa().nombre);
        miBucesito.encender();
        miBucesito.acelerar();
        miBucesito.acelerar();
        miBucesito.acelerar();
        miBucesito.acelerar();
        miBucesito.acelerar();
        miBucesito.acelerar();
        miBucesito.acelerar();
        miBucesito.acelerar();
        miBucesito.acelerar();

        System.out.println("--------------Camioneta-------------");
        Camioneta miCamionetica = new Camioneta("BCA321",Marca.CHEVROLET, 200000.0);
        miCamionetica.encender();
        miCamionetica.acelerar();
        miCamionetica.acelerar();
        miCamionetica.acelerar();
        miCamionetica.acelerar();
        miCamionetica.acelerar();
        miCamionetica.acelerar();
        miCamionetica.acelerar();
        miCamionetica.acelerar();
        miCamionetica.acelerar();
    }
}

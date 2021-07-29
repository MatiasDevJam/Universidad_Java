package mx.com.gm.mundopc;

public class Raton extends DispositivoEntrada {

    private final int idTeclado;
    private static int contadorRatones;

    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idTeclado = ++Raton.contadorRatones;
    }

    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + idTeclado + ", " + super.toString() + '}';
    }

}

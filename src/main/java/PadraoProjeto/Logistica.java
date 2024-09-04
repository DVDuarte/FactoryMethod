package PadraoProjeto;

public abstract class Logistica {

    public abstract Transporte criarTransporte();

    public void entregar() {
        Transporte transporte = criarTransporte();
        transporte.entregar();
    }
}
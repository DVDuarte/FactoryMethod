package PadraoProjeto;

public class LogisticaCicloviaria extends Logistica {
    @Override
    public Transporte criarTransporte() {
        return new Bicicleta();
    }
}
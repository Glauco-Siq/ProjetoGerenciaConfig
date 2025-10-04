package logicaImportacao;

public class ICMS implements Imposto{

    @Override
    public double calcularImposto(double valor) {
        return valor + (0.18 * valor);
    }
}

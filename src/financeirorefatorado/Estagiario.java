package financeirorefatorado;

public class Estagiario implements Pagamento{


    @Override
    public void paga(double valor) {  // antigo public void pagaEstagiario(Estagiario estagiario)

    }

    @Override
    public double getSalarioBase() { // antigo estagiario.getBolsa()
        return 0;
    }

    @Override
    public double getBonificacoes() { // antigo estagiario.getAuxilios()
        return 0;
    }
}

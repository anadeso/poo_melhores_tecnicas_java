package financeirorefatorado;

public class Chefe implements Pagamento{


    @Override
    public void paga(double valor) {// antigo public void depositaNaConta(double valor)

    }

    @Override
    public double getSalarioBase() { // esse continua igual
        return 0;
    }

    @Override
    public double getBonificacoes() { // antigo chefinho.getBonificacoes()
        return 0;
    }
}

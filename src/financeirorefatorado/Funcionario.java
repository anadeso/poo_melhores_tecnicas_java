package financeirorefatorado;

public class Funcionario implements Pagamento{

    @Override
    public void paga(double valor) { // antigo public void pagaFuncionario(Funcionario funcionario) {

    }

    @Override
    public double getSalarioBase() { // antigo funcionario.getSalario()
        return 0;
    }

    @Override
    public double getBonificacoes() { // antigo funcionario.getBonus()
        return 0;
    }
}

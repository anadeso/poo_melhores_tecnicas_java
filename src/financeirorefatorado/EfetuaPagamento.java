package financeirorefatorado;

public class EfetuaPagamento {

    public void pagaFuncionario(Pagamento pagamento){
         pagamento.paga(pagamento.getSalarioBase() + pagamento.getBonificacoes());
    }
}

public class GerenciadorDeDividas {

    public void efetuaPagamento(Divida divida, double valor, String cnpjPagador, String nomePagador){
        Pagamento pagamento = new Pagamento();
        pagamento.setPagador(nomePagador);
        pagamento.setCnpjPagador(cnpjPagador);
        pagamento.setValor(valor);
        divida.getPagamentos().registra(pagamento);
    }
}

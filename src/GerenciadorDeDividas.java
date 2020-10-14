public class GerenciadorDeDividas {

    public void efetuaPagamento(Divida divida, double valor, Documento documentoPagador, String nomePagador){
        Pagamento pagamento = new Pagamento();
        pagamento.setPagador(nomePagador);
        pagamento.setDocumentoPagador(documentoPagador);
        pagamento.setValor(valor);
        divida.registra(pagamento);
    }
}

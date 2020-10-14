
public class Divida {
    private double total;
    private String credor;
    private Documento documentoCredor;

    private Pagamentos pagamentos  = new Pagamentos();

    /*public Pagamentos getPagamentos() {
        return pagamentos;
    }*/

    public Documento getDocumentoCredor() {
        return documentoCredor;
    }

    public void setDocumentoCredor(Documento documentoCredor) {
        this.documentoCredor = documentoCredor;
    }

    public double valorAPagar(){
        return this.total - this.pagamentos.getValorPago();
    }

    public double getTotal() {
        return this.total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public String getCredor() {
        return this.credor;
    }
    public void setCredor(String credor) {
        this.credor = credor;
    }
    // novo método responsável por registrar um pagamento
    public void registra(Pagamento pagamento) {
        pagamentos.registra(pagamento);
    }

    public double getValorPago() {
        return pagamentos.getValorPago();
    }
}
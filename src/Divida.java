
public class Divida {
    private double total;
    private String credor;
    private Cnpj cnpjCredor;

    private Pagamentos pagamentos  = new Pagamentos();

    public Pagamentos getPagamentos() {
        return pagamentos;
    }

    public double valorAPagar(){
        return this.total - this.pagamentos.getValorPago();
    }
    public Cnpj getCnpjCredor() {
        return cnpjCredor;
    }

    public void setCnpjCredor(Cnpj cnpjCredor) {
        this.cnpjCredor = cnpjCredor;
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

}
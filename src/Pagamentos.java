import javax.print.Doc;
import java.util.*;

public class Pagamentos implements Iterable<Pagamento> {

    Collection<Pagamento> pagamentos = new ArrayList<Pagamento>();

    private double valorPago;

    public double getValorPago() {
        return this.valorPago;
    }
    // Metodos pagamento
    public Collection<Pagamento> pagamentosAntesDe(Calendar data) {
        ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
        for (Pagamento pagamento : this) {
            if (pagamento.getData().before(data)) {
                pagamentosFiltrados.add(pagamento);
            }
        }
        return pagamentosFiltrados;
    }
    public Collection<Pagamento> pagamentosComValorMaiorQue(double valorMinimo) {
        Collection<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
        for (Pagamento pagamento : this) {
            if (pagamento.getValor() > valorMinimo) {
                pagamentosFiltrados.add(pagamento);
            }
        }
        return pagamentosFiltrados;
    }
    public Collection<Pagamento> pagamentosDo(Documento documentoPagador) {
        Collection<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
        for (Pagamento pagamento : this.pagamentos) {
            if (pagamento.getDocumentoPagador().equals(documentoPagador)) {
                pagamentosFiltrados.add(pagamento);
            }
        }
        return pagamentosFiltrados;
    }

    private void paga(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor invalido para pagamento");
        }
        if (valor > 100) {
            valor = valor - 8;
        }
        this.valorPago += valor;
    }

    public void registra(Pagamento pagamento) {
        this.pagamentos.add(pagamento);
        this.paga(pagamento.getValor());
    }

    public boolean foiRealizado(Pagamento pagamento){
        return pagamentos.contains(pagamento);
    }


    @Override
    public Iterator<Pagamento> iterator() {
        return this.pagamentos.iterator();
    }
}

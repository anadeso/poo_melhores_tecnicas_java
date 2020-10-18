import java.util.HashMap;
import java.util.Map;

public class BalancoEmpresa {

    private ArmazenadorDeDivida divida;

    public BalancoEmpresa(ArmazenadorDeDivida bd) {
        this.divida = bd;
    }

    public void registrarDivida(Divida divida){

        if (divida.getDocumentoCredor() != null){
            this.divida.salva(divida);
        }

    }

    public void pagoDivida(Documento documentoCredor, Pagamento pagamentos){

        Divida divida = this.divida.carrega(documentoCredor);

        if (divida != null) {
            //Pagamento pagamento = new Pagamento();
            // divida.getPagamentos().registra(pagamento);
            // se torna
            divida.registra(pagamentos);
        }
        this.divida.salva(divida);
    }
}

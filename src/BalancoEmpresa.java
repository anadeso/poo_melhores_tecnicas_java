import java.util.HashMap;

public class BalancoEmpresa {

    private HashMap<Documento, Divida> dividas = new HashMap<Documento, Divida>();

    public void registrarDivida(Divida divida){

        if (divida.getDocumentoCredor() != null){
            dividas.put(divida.getDocumentoCredor(), divida);
        }

    }

    public void pagoDivida(Documento documentoCredor, Pagamento pagamentos){

        Divida divida = dividas.get(documentoCredor);

        if (divida != null) {
            Pagamento pagamento = new Pagamento();
            // divida.getPagamentos().registra(pagamento);
            // se torna
            divida.registra(pagamento);

        }
    }
}

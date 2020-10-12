import java.util.HashMap;
import java.util.HashSet;

public class BalancoEmpresa {

    private HashMap<Cnpj, Divida> dividas = new HashMap<Cnpj, Divida>();

    public void registrarDivida(Divida divida){

        dividas.put(divida.getCnpjCredor(), divida);

    }

    public void pagoDivida(Cnpj cnpjCredor, Pagamento pagamentos){

        Divida divida = dividas.get(cnpjCredor);

        if (divida != null) {
            Pagamento pagamento = new Pagamento();
            divida.getPagamentos().registra(pagamento);

        }
    }
}

import java.util.Calendar;

public class MinhaAplicacao {

    public static void main(String[] args) {

        //BancoDeDados bd = new BancoDeDados("localhost", "usuario", "1234");
        Arquivo bd = new Arquivo();
        BalancoEmpresa balanco = new BalancoEmpresa(bd);
        registraDividas(balanco);
        realizaPagamentos(balanco);
        //bd.desconeta();

    }
    private static void registraDividas(BalancoEmpresa balanco) {

        Divida d1 = new Divida();
        Divida d2 = new Divida();

        d1.setCredor("Uma empresa");
        d1.setDocumentoCredor(new Cnpj("00.000.001/0001-01"));
        d1.setTotal(1000);

        d2.setCredor("Meu vizinho");
        d2.setDocumentoCredor(new Cpf("000.000.000-00"));
        d2.setTotal(100);

        balanco.registrarDivida(d1);
        balanco.registrarDivida(d2);

    }
    private static void realizaPagamentos(BalancoEmpresa balanco) {

        Pagamento p1 = new Pagamento();
        Pagamento p2 = new Pagamento();

        p1.setDocumentoPagador(new Cnpj("00.000.002/0001-02"));
        p1.setPagador("Uma empresa legal");
        p1.setValor(1000);
        p1.setData(Calendar.getInstance());
    }
}



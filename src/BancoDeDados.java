import javax.print.Doc;
import java.util.HashMap;
import java.util.Map;

public class BancoDeDados implements ArmazenadorDeDivida{

    private final Map<Documento, Divida> dividasNoBanco = new HashMap<Documento, Divida>();

    public BancoDeDados(String endereco, String usuario, String senha) {
        System.out.println("Conectado");
    }

    public void salva(Divida divida){
        dividasNoBanco.put(divida.getDocumentoCredor(), divida);
    }

    public Divida carrega(Documento documento){
        return dividasNoBanco.get(documento);
    }

    public void desconeta(){
        System.out.println("Desconectado");
    }
}

import java.util.Objects;

public class Cnpj {

    private String valor;

    /*public Cnpj(String valor) {
        this.valor = valor;
    }*/

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    // Metodo CNPJ
    public boolean ehValido() {
        return primeiroDigitoVerificador() == primeiroDigitoCorreto()
                && segundoDigitoVerificador() == segundoDigitoCorreto();
    }

    private int primeiroDigitoVerificador() {
        // Extrai o segundo dígito verificador do CNPJ armazenado
        // no atributo cnpj
        return 2;
    }

    private int primeiroDigitoCorreto() {
        // Extrai o primeiro dígito verificador do CNPJ armazenado
        // no atributo cnpj
        return 1;
    }

    private int segundoDigitoVerificador() {
        // Calcula o primeiro dígito verificador correto para
        // o CNPJ armazenado no atributo cnpj
        return 4;
    }

    private int segundoDigitoCorreto() {
        // Calcula o primeiro dígito verificador correto para
        // o CNPJ armazenado no atributo cnpj
        return 3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cnpj)) return false;
        Cnpj cnpj = (Cnpj) o;
        return Objects.equals(getValor(), cnpj.getValor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getValor());
    }

    @Override
    public String toString() {
        return this.valor;
    }
}

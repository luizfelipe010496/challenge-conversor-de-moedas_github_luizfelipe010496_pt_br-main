package historico;

public class HistoricoConversao {
    private String moedaBase;
    private String moedaDestino;
    private double valor;
    private double taxa;
    private double valorConvertido;

    public HistoricoConversao(String moedaBase, String moedaDestino, double valor, double taxa, double valorConvertido) {
        this.moedaBase = moedaBase;
        this.moedaDestino = moedaDestino;
        this.valor = valor;
        this.taxa = taxa;
        this.valorConvertido = valorConvertido;
    }

    @Override
    public String toString() {
        return "Conversão de " + valor + " " + moedaBase +
                " para " + moedaDestino +
                " com taxa " + taxa +
                " = " + valorConvertido + " " + moedaDestino;
    }
}

package conversor;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static java.net.http.HttpClient.newHttpClient;

public class ConversorMoeda {
    private double valor;
    private double taxa;
    private double convertido;
    private static final String API_KEY = "95cc8184a1abfdd6f094a4ae"; //Chave fornecida pela API externa!

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getConvertido() {
        return convertido;
    }

    public double getTaxa() {
        return taxa;
    }

    public boolean buscarTaxa(String moedaBase, String moedaDestino) {
        try {
            String url = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/" + moedaBase;
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
            HttpClient client = newHttpClient();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            JsonObject json = JsonParser.parseString(response.body()).getAsJsonObject();
            JsonObject conversionRates = json.getAsJsonObject("conversion_rates");

            this.taxa = conversionRates.get(moedaDestino).getAsDouble();
            return true;

        } catch (Exception e) {
            System.out.println("Erro ao buscar taxa de câmbio: " + e.getMessage());
            return false;
        }
    }

    public void converter() {
        this.convertido = this.valor * this.taxa;
    }

    public void exibirResultado(String simboloMoeda) {
        System.out.printf("Valor convertido: %s%.2f%n", simboloMoeda, convertido);
    }
}

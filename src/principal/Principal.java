package principal;

import conversor.ConversorMoeda;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import historico.HistoricoConversao;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;


public class Principal {
    public static void main(String[] args) {
        int opcao = 0;
        Scanner leitura = new Scanner(System.in);
        ConversorMoeda conversor = new ConversorMoeda();
        List<HistoricoConversao> historico = new ArrayList<>();

        String menu = """
                \n*******************************
                ** Bem vindo(a) ao conversor de moedas!
                ** Digite uma opção válida desejada **
                1 - Real brasileiro =>> Dólar
                2 - Dólar =>> Real brasileiro
                3 - Peso argentino =>> Dólar
                4 - Dólar =>> Peso argentino
                5 - Peso colombiano =>> Dólar
                6 - Dólar =>> Peso colombiano
                7 - Sair
                *******************************
                """;

        while (opcao != 7) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao >= 1 && opcao <= 6) {
                System.out.print("Digite o valor que deseja converter: ");
                double valor = leitura.nextDouble();
                conversor.setValor(valor);

                // Define moedas base e destino
                String moedaBase = "", moedaDestino = "", simbolo = "";

                switch (opcao) {
                    case 1 -> { moedaBase = "BRL"; moedaDestino = "USD"; simbolo = "U$"; }
                    case 2 -> { moedaBase = "USD"; moedaDestino = "BRL"; simbolo = "R$"; }
                    case 3 -> { moedaBase = "ARS"; moedaDestino = "USD"; simbolo = "U$"; }
                    case 4 -> { moedaBase = "USD"; moedaDestino = "ARS"; simbolo = "$"; }
                    case 5 -> { moedaBase = "COP"; moedaDestino = "USD"; simbolo = "U$"; }
                    case 6 -> { moedaBase = "USD"; moedaDestino = "COP"; simbolo = "$"; }
                }

                if (conversor.buscarTaxa(moedaBase, moedaDestino)) {
                    conversor.converter();
                    conversor.exibirResultado(simbolo);
                    HistoricoConversao registro = new HistoricoConversao(
                            moedaBase, moedaDestino, valor,
                            conversor.getTaxa(), conversor.getConvertido()
                    );
                    historico.add(registro);
                } else {
                    System.out.println("Não foi possível obter a taxa de câmbio.");
                }
            } else if (opcao == 7) {
                System.out.println("Programa finalizado!");
            } else {
                System.out.println("Opção inválida!");
            }
        }
        // Gerar arquivos .txt e .json
        try {
            // Arquivo .txt
            FileWriter txtWriter = new FileWriter("conversoes.txt");
            for (HistoricoConversao h : historico) {
                txtWriter.write(h.toString() + "\n");
            }
            txtWriter.close();

            // Arquivo .json
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            FileWriter jsonWriter = new FileWriter("conversoes.json");
            jsonWriter.write(gson.toJson(historico));
            jsonWriter.close();

            System.out.println("Histórico de conversões salvo em .txt e .json com sucesso!");

        } catch (Exception e) {
            System.out.println("Erro ao salvar arquivos: " + e.getMessage());
        }
    }
}

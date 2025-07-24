
# PROJETO CONVERSOR DE MOEDAS  

(Português brasileiro)

⚠️LEIA-ME!⚠️  

> Este projeto realiza a conversão de moedas entre diferentes países utilizando taxa de câmbio real obtida via API (ExchangeRate-API). A aplicação é interativa, com menu em terminal, e permite salvar os resultados em arquivos `.json` e `.txt`.

---

## ❗Sobre o projeto

Projeto desenvolvido durante o curso da **Alura**, no programa **Oracle Next Education - ONE (8º Grupo)**. A aplicação tem como objetivo converter valores entre moedas de diferentes países, com base nas taxas de câmbio atualizadas por API, tudo feito com Java, usando classes e objetos, além de recursos como `HttpClient`, `Gson` e `Scanner`.

---

## ⚙️ Roteiro ("Script")

> A seguir, estão listadas as funcionalidades e a lógica do algoritmo no arquivo `Principal.java` e classes associadas:

- [X] Menu interativo com opções de conversão entre Real, Dólar, Peso Argentino e Peso Colombiano;
- [X] Leitura do valor a ser convertido via terminal;
- [X] Criação da classe `ConversorMoeda` para centralizar os atributos e métodos de conversão;
- [X] Requisição HTTP para a ExchangeRate-API (em `PrincipalComBusca.java`);
- [X] Uso da biblioteca `Gson` para processar o JSON da API;
- [X] Impressão do resultado convertido no terminal;
- [X] Geração de arquivo `.json` com os dados da conversão;
- [X] Geração de arquivo `.txt` com resumo da operação.

---

## 🚀 Layout do Aplicativo

> Por ser um projeto de terminal, não possui interface gráfica (GUI), mas sim interação por linha de comando (CLI). O menu é exibido diretamente no console com opções numeradas para fácil navegação.

---

## ▶️ Como rodar a aplicação

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/conversor-moedas-java.git
   ```

2. Abra no IntelliJ IDEA, Eclipse ou outro IDE Java de sua preferência.

3. Certifique-se de que as bibliotecas estão importadas:
   - `Gson` (disponível via Maven/Gradle ou manual)
   - Java SDK 11 ou superior

4. Execute o `Principal.java` ou `PrincipalComBusca.java` como aplicação Java.

---

## 🔧 Linguagens, Libs e Projetos

- 💻 **Java 17** ou superior
- 📦 **Gson** para parse de JSON
- 🌐 **HttpClient** (Java Nativo) para chamadas à API
- 📜 **ExchangeRate-API** ([https://www.exchangerate-api.com/](https://www.exchangerate-api.com/))
- 📄 Escrita de arquivos `.json` e `.txt` com `FileWriter`

---

## 💻 Pré-requisitos

Antes de começar, verifique se você atendeu aos seguintes requisitos:

- Java 11 ou superior instalado e configurado no PATH
- IDE (IntelliJ, Eclipse, VS Code com suporte a Java)
- Conexão com a Internet para acessar a API de câmbio
- Biblioteca **Gson** adicionada ao classpath
- Permissão para escrita de arquivos locais

---

## 😄 Seja um dos contribuidores!

> Quer fazer parte desse projeto? Clique [AQUI](CONTRIBUTING.md) para saber como contribuir!

---

## 🤝 Desenvolvedores/Colaboradores  

| [<img src="https://avatars.githubusercontent.com/u/30264786?v=4" width=115><br><sub>Luiz Ferreira</sub>](https://github.com/luizfelipe010496) |  [<img src="https://avatars.githubusercontent.com/u/4975968?s=200&v=4" width=115><br><sub>Alura Team</sub>](https://github.com/alura-cursos) |  [<img src="https://www.oracle.com/a/ocom/img/rh03-one-br-logo.png" width=115><br><sub>Oracle Next Education</sub>](https://github.com/oracle) |
| :---: | :---: | :---: |

---

## 📝 Licença

(License)  

<p>Distribuído sob a licença pública livre (No License).</p>

2025 - Conversor de Moedas Java ☕

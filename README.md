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

1. Clone o repositório ou faça o download direatamente do ".zip":
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




# CURRENCY CONVERTER PROJECT

(English)

⚠️README!⚠️

> This project performs a currency conversion between several international currencies using static exchange rates and API support.

## ❗About the project

Project developed during the Alura course for the Oracle Next Education - ONE program (8th Group). The program is a Java application that allows converting values between currencies like BRL, USD, ARS, and COP.

## ⚙️ Project Script

Here are the main features and logic flow used in the files (`Principal.java`, `ConversorMoeda.java`, and others):

- [X] Main menu created using `Scanner` to prompt the user;
- [X] Option selection via integer input (1 to 7);
- [X] Encapsulation of exchange logic inside the `ConversorMoeda` class with getter and setter methods;
- [X] Static exchange rate values used for offline mode;
- [X] Optional integration with an API (`https://v6.exchangerate-api.com`) to retrieve real-time currency rates;
- [X] Generation of result output into both `.txt` and `.json` formats using Gson and FileWriter.

## 🚀 Application Layout

> The application is console-based (CLI), following a simple textual interface structure.

## ▶️ How to Run the Application

Clone the repository or download the ".zip" directly:

```bash
javac Principal.java conversor/ConversorMoeda.java
java principal.Principal
```

To run the API-integrated version (`PrincipalComBusca`), ensure you are connected to the internet.

## 🔧 Languages, Libraries, and Tools

- Java 17+
- Gson (for JSON formatting and saving)
- Java HttpClient (for REST API requests)
- IntelliJ IDEA or Eclipse (recommended IDEs)
- ExchangeRate-API (optional external integration)

## 💻 Prerequisites

Before starting, make sure you meet these requirements:

- Java JDK installed (version 17 or higher)
- Access to the terminal or console to run Java classes
- Optional: Internet access to use the real-time API exchange mode
- A JSON-compatible viewer (optional for `filmes.json`)
- Basic understanding of object-oriented programming and Java

## 😄 Want to Contribute?
>Would you like to join this project? Click [HERE](CONTRIBUTING.md).

## 🤝 Developers / Collaborators

| [<img src="https://avatars.githubusercontent.com/u/30264786?v=4" width=115><br><sub>Luiz Ferreira</sub>](https://github.com/luizfelipe010496) |  [<img src="https://avatars.githubusercontent.com/u/4975968?s=200&v=4" width=115><br><sub>Alura Team</sub>](https://github.com/alura-cursos) |  [<img src="https://www.oracle.com/a/ocom/img/rh03-one-br-logo.png" width=115><br><sub>Oracle Next Education</sub>](https://github.com/oracle) |
| :---: | :---: | :---: |

## 📝 License

<p>Distributed under the No License License.</p>
2025 - Currency Converter
# challenge-conversor-de-moedas_github_luizfelipe010496_pt_br-main

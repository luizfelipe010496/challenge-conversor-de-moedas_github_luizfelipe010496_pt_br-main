
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

To run the application:

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

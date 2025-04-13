# 💱 Conversor de Moedas

Projeto simples em Java para conversão de moedas utilizando entrada do usuário via console. O sistema exibe um menu com opções de conversão entre Dólar (USD), Real (BRL) e Peso Argentino (ARS).

---

## 📋 Funcionalidades

- Conversão de:
    - Dólar para Real
    - Real para Dólar
    - Dólar para Peso Argentino
    - Peso Argentino para Dólar
    - Real para Peso Argentino
    - Peso Argentino para Real
- Interface via terminal
- Estrutura modular com separação de responsabilidades

---

## 🧠 Tecnologias Utilizadas

- Java 17+
- Maven (opcional)
- IDE de sua escolha (IntelliJ, Eclipse, VSCode...)
- [ExchangeRate API](https://app.exchangerate-api.com/)
- Gson

---

## 🗂️ Estrutura de Pastas
```
src/ 
└── dev/lucaslowhan/conversor/ 
    ├── domain/ 
    │   ├── Conversion.java
    │   ├── Conversion.java 
    │   └── ConversorService.java 
    └── menu/ 
    │   └── Menu.java
    └── main/
        └── Main.java

```

---

## ▶️ Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/conversor-moedas.git
    ```
2. Compile o projeto:
    ```bash
   javac src/dev/lucaslowhan/conversor/main/Main.java
   ```
3. Execute o menu principal:
    ```bash
   java dev.lucaslowhan.conversor.main.Main
   ```
## 📌 Exemplo de Uso
```bash
--- CONVERSOR DE MOEDAS ---
--- ESCOLHA UMA OPÇÃO   ---
1- Dolar para Real
2- Real para Dolar
3- Dolar para Peso Argentino
4- Peso Argentino para Dolar
5- Real para Peso Argentino
6- Peso Argentino para Real
0- SAIR
Opção: 1
Digite em dolares, quanto deseja converter para reais:
10
O valor USD 10.0 convertido para real é: BRL 50.34
```
## ✍️ Autor
Lucas Lowhan

Estudante de Engenharia de Software

[LinkedIn](https://www.linkedin.com/in/lucaslowhan/) • [GitHub](https://github.com/lucaslowhan)


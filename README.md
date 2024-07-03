# Currency Converter

Este projeto é um conversor de moedas desenvolvido em Java que utiliza a API "ExchangeRate-API" para obter as taxas de câmbio atuais. O programa oferece um menu interativo acessado via terminal, permitindo ao usuário escolher entre diversas conversões de moeda.

## Funcionalidades

- Conversão de BRL (Real Brasileiro) para USD (Dólar Americano)
- Conversão de USD (Dólar Americano) para BRL (Real Brasileiro)
- Conversão de EUR (Euro) para USD (Dólar Americano)
- Conversão de USD (Dólar Americano) para EUR (Euro)
- Conversão de CAD (Dólar Canadense) para USD (Dólar Americano)
- Conversão de USD (Dólar Americano) para CAD (Dólar Canadense)
- Conversão de CNY (Yuan Chinês) para USD (Dólar Americano)
- Conversão de USD (Dólar Americano) para CNY (Yuan Chinês)

## Como usar

### Pré-requisitos

- Java 8 ou superior
- Biblioteca Gson
- Chave de API da ExchangeRate-API

### Instalação

1. Clone este repositório:
    ```bash
    git clone https://github.com/seu_usuario/currency-converter.git
    ```

2. Navegue até o diretório do projeto:
    ```bash
    cd currency-converter
    ```

3. Adicione a biblioteca Gson ao seu projeto. Se você estiver usando o Maven, adicione a seguinte dependência ao seu `pom.xml`:
    ```xml
    <dependency>
        <groupId>com.google.code.gson</groupId>
        <artifactId>gson</artifactId>
        <version>2.8.8</version>
    </dependency>
    ```

### Uso

1. Compile o projeto:
    ```bash
    javac -cp ".:gson-2.8.8.jar" *.java
    ```

2. Execute o programa:
    ```bash
    java -cp ".:gson-2.8.8.jar" Main
    ```

3. Siga as instruções do menu para escolher a conversão de moeda desejada.

### Exemplo de Menu

```plaintext
Choose one of these currency conversions:

  1 - BRL to USD
  2 - USD to BRL
  3 - EUR to USD
  4 - USD to EUR
  5 - CAD to USD
  6 - USD to CAD
  7 - CNY to USD
  8 - USD to CNY

****************

  9 - END
```

## Contribuições

Contribuições são bem-vindas! fique à vontade para abrir uma issue ou enviar um pull request.
Obrigado :)

## Licença

Este projeto está licenciado sob a licença MIT. Veja o arquivo LICENSE para mais detalhes.

---

Você pode adaptar este README conforme necessário para incluir informações adicionais ou para ajustar detalhes específicos do seu projeto.

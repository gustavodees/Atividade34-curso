# Conversor de Moeda (Dólar para Real) em Java

Este projeto implementa um programa Java que permite calcular o valor total em Reais para uma determinada quantia em Dólares, considerando uma taxa de câmbio e o Imposto sobre Operações Financeiras (IOF).

**Autor:** gustavodees

## Arquivos Incluídos

* `model/Cambio.java`: Contém a definição da classe `Cambio`, responsável por armazenar a taxa do dólar, a quantidade desejada em dólares e a taxa do IOF, além de realizar os cálculos necessários para a conversão.
* `principal/Main.java`: Contém a classe principal com o método `main`, que interage com o usuário para obter a quantidade de dólares a serem comprados e exibe o valor total a ser pago em Reais.

## Como Usar

1.  **Salve os arquivos:** Salve o código nos diretórios corretos:
    * Crie uma pasta chamada `model` e dentro dela salve o arquivo `Cambio.java`.
    * Crie uma pasta chamada `principal` e dentro dela salve o arquivo `Main.java`.
2.  **Compile o código:** Abra um terminal ou prompt de comando, navegue até o diretório raiz do seu projeto e compile os arquivos Java utilizando o comando:

    ```bash
    javac principal/Main.java model/Cambio.java
    ```

3.  **Execute o programa:** Após a compilação, execute a classe principal `Main` com o comando:

    ```bash
    java principal.Main
    ```

4.  **Entrada de Dados:** O programa exibirá o valor atual do dólar (definido no código) e solicitará que você digite a quantidade de dólares que deseja comprar. Insira o valor e pressione Enter.

5.  **Resultado:** O programa exibirá o valor do dólar, a quantidade de dólares que você deseja comprar e o valor total em Reais a ser pago, já incluindo o IOF.

## Explicação do Código

### `model/Cambio.java`

Este arquivo define a classe `Cambio`, que realiza a lógica de conversão de moeda.

* **Atributos:**
    * `precoDolar` (double): Representa a taxa de câmbio do dólar.
    * `CompraDolar` (double): Representa a quantidade de dólares que o usuário deseja comprar.
    * `iof` (double): Representa a taxa do Imposto sobre Operações Financeiras (IOF).
* **Construtores:**
    * `Cambio()`: Construtor padrão que inicializa o preço do dólar em 3.10, a quantidade de dólares para compra em 0 e a taxa do IOF em 0.06 (6%).
    * `Cambio(double precoDolar, double compraDolar, double iof)`: Construtor que permite definir o preço do dólar, a quantidade de dólares para compra e a taxa do IOF ao criar um objeto da classe.
* **Getters e Setters:** Métodos públicos para acessar e modificar os atributos da classe `Cambio`.
    * `getCompraDolar()`, `setCompraDolar()`
    * `getPrecoDolar()`, `setPrecoDolar()`
    * `getIof()`, `setIof()`
* **Métodos de Cálculo:**
    * `getCalcularIof()`: Calcula o valor do IOF a ser pago, multiplicando a taxa do IOF pelo valor da conversão (preço do dólar * quantidade de dólares).
    * `getConverter()`: Calcula o valor da conversão em Reais, multiplicando o preço do dólar pela quantidade de dólares a serem comprados.
    * `getValorTotal()`: Calcula o valor total a ser pago em Reais, somando o valor da conversão com o valor do IOF.
* **Método `toString()`:**
    * `@Override public String toString()`: Sobrescreve o método `toString` para exibir o valor do dólar, a quantidade de dólares desejada e o valor total a ser pago, formatado para facilitar a leitura.

### `principal/Main.java`

Este arquivo contém a classe `Main`, que é o ponto de entrada do programa.

* **Método `main`:**
    1.  Cria uma instância da classe `Cambio`.
    2.  Cria um objeto da classe `Scanner` para permitir a leitura da entrada do usuário.
    3.  Exibe o valor atual do dólar (obtido através do método `getPrecoDolar()` do objeto `Cambio`).
    4.  Solicita ao usuário que digite a quantidade de dólares que deseja comprar.
    5.  Lê a quantidade de dólares inserida pelo usuário e a define no objeto `Cambio` utilizando o método `setCompraDolar()`.
    6.  Chama o método `toString()` do objeto `Cambio`, que por sua vez calcula e imprime o valor total a ser pago em Reais.
    7.  O método `toString()` da classe `Cambio` já realiza a impressão no console e retorna uma string vazia, que é então impressa pelo `System.out.println` no `Main`.

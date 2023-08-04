package dataStructuresMethods;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {

        // Variável fixa que será usada para definir o tamanho do array
        final int TAMANHO_ARRAY = 5;

        //Criando um array de String
        String[] colors = new String[TAMANHO_ARRAY];

        // Definindo o vetor '0'(primeiro vetor) com a string 'purple'
        colors[0] = "purple";
        // Definindo o vetor '0'(segundo vetor) com a string 'blue'
        colors[1] = "blue";

       /*
        * Este print irá retornar um código estranho ([Ljava.lang.String;@2f4d3709)
        * pois o 'colors' é uma estrutura Array e não um String(texto). Então, ao
        * imprimir diretamente uma estrutura Array diretamente, apenas o código que
        * representa o objeto do array na memória do programa.
        */
        System.out.println("\nImpressão da estrutura 'colors' feita diretamente pelo Array:");
        System.out.println(colors);

       /*
        * Essa é a forma correta de imprimir o conteúdo de Strings(textos) presentes
        * dentro do Array. Dentro do método de impressão é chamada a classe Arrays da
        * biblioteca java que será responsável por obter os métodos que serão usados
        * para trabalhar com Arrays. Ao chamar a classe 'Arrays' é chamado o método
        * '.toString' que irá receber a estrutura Array (colors) em seu parâmetro e irá
        * retornar uma representação em forma de String (texto) dos elementos do array.
        *
        * [purple, blue, null, null, null]
        */
        System.out.println("\nImpressão da estrutura 'colors' utilizando o método 'toString' da classe Arrays:");
        System.out.println(Arrays.toString(colors));

       /*
        * No caso do exemplo abaixo o método de imprimir irá acessar diretamente o conteúdo
        * de um determinado vetor dentro do array e irá retornar na forma que foi implementado,
        * nesse caso, uma String(texto)
        *
        * no vetor 0 possuimos a String 'purple'
        * no vetor 1 possuimos a String 'blue'
        *
        * nos demais vetores irão retornar 'null' que significa nulo, ou seja um objeto inexistente,
        * afinal não foi introduzido nenhum valor oas vetores 2, 3 e 4.
        */
        System.out.println("\nImpressão de todos os valores de 'colors' feitos individualmente:");
        System.out.println(colors[0]);
        System.out.println(colors[1]);
        System.out.println(colors[2]);
        System.out.println(colors[3]);
        System.out.println(colors[4]);

        // Introdução da String 'yello' ao vetor 2
        colors[2] = "yellow";

        System.out.println("\nImpressão dos valores de 'colors' através do 'toString' após a adição da String 'yellow' ao Array:");
        System.out.println(Arrays.toString(colors));

        // Criação de uma estrutura Array de inteiros 'int' com atribuição de 2 valores '100' e '200'
        int[] numbers = {100, 200};

        System.out.println("\nImpressão dos valores do Array 'numbers':");
        System.out.println(Arrays.toString(numbers));

       /*
        * Estrutura de repetição que será responsável por percorrer todos os vetores do array 'colors'
        * e para cada vetor irá imprimir seu respectivo valor.
        *
        * A estrutura 'for' define a variável inteira 'i' como 0 e define que ela deverá ser sempre
        * menor que o tamanho da estrutura Array 'colors'. e a cada execução o valor da variável 'i' será
        * acrescentado por 1. A cada execução o método de impressão irá imprimir um vetor do Array 'colors'
        * com base no parâmetro 'i', indo do 0 até o fim do array, dessa forma, acessando todos os valores
        * dos vetores.
        */

        System.out.println("\nEstrutura de repetição percorrendo todos os vetores de 'colors': \n");
        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }

        // Forma reversa de implementar a estrutura de repetição (do último até o primeiro)
        System.out.println("\nEstrutura de repetição percorrendo todos os vetores de 'colors' de maneira reversa: \n");
        for (int i = colors.length - 1; i >= 0; i--) {
            System.out.println(colors[i]);
        }

        // Impressão do tamanho do array 'colors' através do método 'length'
        System.out.println("\nTamanho do Array 'colors': " + colors.length);

        // Mais uma maneira de imprimir todos os valores do array através de uma estrutura de repetição 'ForEach'
        System.out.println("\nEstrutura de repetição percorrendo todos os vetores de 'colors' usando 'ForEach'");
        for (String color : colors) {
            System.out.println(color);
        }

        // Método da classe 'Arrays' que tem como função percorrer os vetores de um array
        System.out.println("\nMétodo 'stream' e 'forEach' da classe 'Arrays' percorrendo todos os vetores de 'colors':");
        Arrays.stream(colors).forEach(System.out::println);
    }
}

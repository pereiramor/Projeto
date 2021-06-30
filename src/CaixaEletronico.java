public class CaixaEletronico {
    public static void main(String[] args) {
        //Cedulas disponiveis no caixa eletronico
        int[] cedulas = {100, 50, 20, 10, 5, 2, 1};
        //Quantidade total de cedulas entregues ao cliente
        int quantidadeTotal = 0;
        //Valor a ser sacado pelo cliente
        int valorReais = 163;
        //Percorrendo todas as cedulas disponiveis no caixa eletronico
        for (int i = 0; i < cedulas.length; i++) {
            //Quantidade de cedulas para o valor cedulas[i]
            int quantidadeCedulas = valorReais / cedulas[i];
            //Impressão da quantidade de cedulas
            System.out.println("Quantidade de cedulas de " + cedulas[i] +
                    ":" + quantidadeCedulas);
            //REsto da divisão
            valorReais %= cedulas[i];
            quantidadeTotal += quantidadeCedulas;
        }

        //Impressão
        System.out.println("Quantidade total:" + quantidadeTotal);
    }
}
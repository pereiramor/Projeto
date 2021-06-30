public class Matriz {
    public static void main(String[] args) {
        double matriz[][] = new double[4][4]; // declaracao e construcao da matriz
        for (int i = 0; i < matriz.length; i++) //percorre a matriz no eixo i
        {
            for (int j = 0; j < matriz[i].length; j++) // percorre a matriz no eixo j
            {
                matriz[i][j] = i * j; // atribui o valor a celula
            }
        }
        for (int i = 0; i < matriz.length; i++) // percorre a matriz no eixo i
        {
            for (int j = 0; j < matriz[i].length; j++) // percorre a matriz no eixo j
            {
                //Imprime o resultado
                System.out.println("valor da posição [" + i + " " + j + "]:" +
                        matriz[i][j]);
            }
        }
    }
}

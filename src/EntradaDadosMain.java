import java.util.Scanner;

public class EntradaDadosMain {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("digite uma linha ");
        String linha = s.nextLine (); //le a linha
        System.out.print("digite um numero");
        int i = s.nextInt(); // le um inteiro
        System.out.println("digite um numero");
        double d = s.nextDouble(); //le um ponto-flutuante


        double resultado = i*d;
        System.out.println("Imprime: linha" + linha + "inteiro:"+ i + " double" +d + "resultado" + resultado);

    }
}


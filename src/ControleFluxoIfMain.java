public class ControleFluxoIfMain {

    public static void main(String[] args) {

        int ano = 2020;
        double salario = 15000.00;

        if (ano < 0) {
            System.out.println("Não é um ano!");
        } else if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println("É bissexto!");
        } else {
            System.out.println("Não é bissexto");
        }
        if (10 == 20) {
            System.out.println ("É igual");
        } else {
            System.out.println ("Não é igual");
        }
         if (salario>= 15000.00) {
             System.out.println("É o Carrion!");
         } else{
                 System.out.println ("Não é o Carrion!");
             }
        }
    }


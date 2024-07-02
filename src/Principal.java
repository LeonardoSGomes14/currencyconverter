import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int option = 0;

        String menu = """
                Choose one of these currency conversions:
                  
                  1 - BRL to USD
                  2 - USD to BRL
                  3 - EUR to USD
                  4 - usd to EUR
                  5 - CAD to USD
                  6 - USD to CAD
                  7 - CNY to USD
                  8 - USD to CNY
                  
                 ****************
                 
                 9 - CONVERSION HISTORY
                 10 - END
                           
                  """;


        while (option != 10) {
            System.out.println(menu);
            option = read.nextInt();
            if (option > 10 || option <= 0) {
                System.out.println("Opção inválida. Tente novamente");
            } else {
//                switch (option) {
//                    case 1:
//                }
            }
        }
    }
}
package com.currenyconverter.principal;

import com.currenyconverter.format.TerminalFormat;
import com.currenyconverter.operations.Converter;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        Converter converter = new Converter();

        int option = 0;

        String menu = """
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
                           
                  """;


        while (option != 9) {
            System.out.println(menu);
            option = read.nextInt();
            if (option > 9 || option <= 0) {
                System.out.println("invalid option. Try again");
            } else {
                switch (option) {
                    case 1:
                        Double currency = converter.exOperations("BRL", "USD");
                        System.out.println("Provide the value to be converted.");
                        read.nextLine();
                        String qntcoin = read.nextLine().replace(",", ".");
                        Double coin = Double.parseDouble(qntcoin);

                        Double finalResult = (coin * currency);

                        String txt = String.format("The value of R$%.2f converted to USD is %.2f", coin, finalResult  );

                        System.out.println();
                        TerminalFormat.center("************************************ ");
                        TerminalFormat.center(txt);
                        TerminalFormat.center("Press enter to continue");
                        TerminalFormat.center("************************************ ");
                        read.nextLine();
                        TerminalFormat.TerminalForm();
                        break;


                    case 2:
                        currency = converter.exOperations("USD", "BRL");
                        System.out.println("Provide the value to be converted.");
                        read.nextLine();
                        qntcoin = read.nextLine().replace(",", ".");
                        coin = Double.parseDouble(qntcoin);

                        finalResult = (coin * currency);

                        txt = String.format("The value of $%.2f converted to BRL is %.2f", coin, finalResult);

                        System.out.println();
                        TerminalFormat.center("************************************ ");
                        TerminalFormat.center(txt);
                        TerminalFormat.center("Press enter to continue");
                        TerminalFormat.center("************************************ ");
                        read.nextLine();
                        TerminalFormat.TerminalForm();
                        break;


                    case 3:
                        currency = converter.exOperations("EUR", "USD");
                        System.out.println("Provide the value to be converted.");
                        read.nextLine();
                         qntcoin = read.nextLine().replace(",", ".");
                         coin = Double.parseDouble(qntcoin);

                         finalResult = (coin * currency);

                         txt = String.format("The value of €%.2f converted to USD is %.2f", coin, finalResult  );

                        System.out.println();
                        TerminalFormat.center("************************************ ");
                        TerminalFormat.center(txt);
                        TerminalFormat.center("Press enter to continue");
                        TerminalFormat.center("************************************ ");
                        read.nextLine();
                        TerminalFormat.TerminalForm();
                        break;


                    case 4:
                         currency = converter.exOperations("USD", "EUR");
                        System.out.println("Provide the value to be converted.");
                        read.nextLine();
                         qntcoin = read.nextLine().replace(",", ".");
                         coin = Double.parseDouble(qntcoin);

                         finalResult = (coin * currency);

                         txt = String.format("The value of $%.2f converted to EUR is %.2f", coin, finalResult  );

                        System.out.println();
                        TerminalFormat.center("************************************ ");
                        TerminalFormat.center(txt);
                        TerminalFormat.center("Press enter to continue");
                        TerminalFormat.center("************************************ ");
                        read.nextLine();
                        TerminalFormat.TerminalForm();
                        break;


                    case 5:
                         currency = converter.exOperations("CAD", "USD");
                        System.out.println("Provide the value to be converted.");
                        read.nextLine();
                         qntcoin = read.nextLine().replace(",", ".");
                         coin = Double.parseDouble(qntcoin);

                         finalResult = (coin * currency);

                         txt = String.format("The value of  C$%.2f converted to USD is %.2f", coin, finalResult  );

                        System.out.println();
                        TerminalFormat.center("************************************ ");
                        TerminalFormat.center(txt);
                        TerminalFormat.center("Press enter to continue");
                        TerminalFormat.center("************************************ ");
                        read.nextLine();
                        TerminalFormat.TerminalForm();
                        break;


                    case 6:
                         currency = converter.exOperations("USD", "CAD");
                        System.out.println("Provide the value to be converted.");
                        read.nextLine();
                         qntcoin = read.nextLine().replace(",", ".");
                         coin = Double.parseDouble(qntcoin);

                         finalResult = (coin * currency);

                         txt = String.format("The value of $%.2f converted to CAD is %.2f", coin, finalResult  );

                        System.out.println();
                        TerminalFormat.center("************************************ ");
                        TerminalFormat.center(txt);
                        TerminalFormat.center("Press enter to continue");
                        TerminalFormat.center("************************************ ");
                        read.nextLine();
                        TerminalFormat.TerminalForm();
                        break;


                    case 7:
                        currency = converter.exOperations("CNY", "USD");
                        System.out.println("Provide the value to be converted.");
                        read.nextLine();
                        qntcoin = read.nextLine().replace(",", ".");
                        coin = Double.parseDouble(qntcoin);

                        finalResult = (coin * currency);

                        txt = String.format("The value of  ¥%.2f converted to USD is %.2f", coin, finalResult  );

                        System.out.println();
                        TerminalFormat.center("************************************ ");
                        TerminalFormat.center(txt);
                        TerminalFormat.center("Press enter to continue");
                        TerminalFormat.center("************************************ ");
                        read.nextLine();
                        TerminalFormat.TerminalForm();
                        break;


                    case 8:
                        currency = converter.exOperations("BRL", "USD");
                        System.out.println("Provide the value to be converted.");
                        read.nextLine();
                        qntcoin = read.nextLine().replace(",", ".");
                        coin = Double.parseDouble(qntcoin);

                        finalResult = (coin * currency);

                        txt = String.format("The value of $%.2f converted to CNY is %.2f", coin, finalResult  );

                        System.out.println();
                        TerminalFormat.center("************************************ ");
                        TerminalFormat.center(txt);
                        TerminalFormat.center("Press enter to continue");
                        TerminalFormat.center("************************************ ");
                        read.nextLine();
                        TerminalFormat.TerminalForm();
                        break;

                    case 9:
                        System.out.println("thanks to operate with us! :)");

                }
            }
        }
    }
}
package calculadora;
import calculadora.opraçoes;

import java.sql.SQLOutput;
import java.util.Scanner;
public class newCalc {

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.println("CALCULADORA");
        System.out.println();
        System.out.println("Informe qual operação deseja realizar ");
        System.out.println("1 Adição, 2 Subtração, 3 Multiplicação, 4 Divisão");

        int opering = input.nextInt();

         double number1;
         double number2;

        switch (opering){

            case 1:
                System.out.println("Adição");
                System.out.println();
                System.out.println("Informe os valores ");
                number1 = input.nextDouble();
                number2 = input.nextDouble();
                opraçoes opp = new opraçoes(number1,number2);
                System.out.printf("Resultado = %.0f%n ", opp.Soma());
                break;
            case 2:
                System.out.println("Subtração ");
                System.out.println();
                System.out.println("Informe os valores ");
                number1 = input.nextDouble();
                number2 = input.nextDouble();
                opraçoes op2 = new opraçoes(number1,number2);
                System.out.printf("Resultado = %.0f%n ", op2.Subtr());
                break;
            case 3:
                System.out.println("Multiplicação ");
                System.out.println();
                System.out.println("Informe os valores ");
                number1 = input.nextDouble();
                number2 = input.nextDouble();
                opraçoes op3 = new opraçoes(number1,number2);
                System.out.printf("Resultado = %.0f%n ", op3.Multp());
                break;
            case 4:
                System.out.println("Divisão ");
                System.out.println();
                System.out.println("Informe os valores ");
                number1 = input.nextDouble();
                number2 = input.nextDouble();
                opraçoes op4 = new opraçoes(number1, number2);
                System.out.println("Resultado = "+ op4.Div());
                break;
        }

















    }
}

package pi230317;

import java.util.Scanner;

public class BhaskaraAvesso {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double x1, x2, a, b, c, produto, soma;
        
        //ENTRADAS
        System.out.print("x1: ");
        x1 = leitor.nextDouble();
        System.out.print("x2: ");
        x2 = leitor.nextDouble();
        System.out.print("c: ");
        c = leitor.nextDouble();
        
        //PROCESSAMENTO
        produto = x1 * x2;
        soma = x1 + x2;
        a = c / produto;
        b = -(soma * a);
        
        //SAÍDA
        System.out.println("A equação que tem como raizes " + x1 + " e " + x2 + " é " + a + "x² + " + b + " x + "+ c);
        

    }

}

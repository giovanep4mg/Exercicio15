// escrever um programa que o usuario digite um numero 
//avisar se est� entre 100 a 200 ! 
package Exercicio15;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
    int numero;
    
    Scanner leitor = new Scanner(System.in);
    
    System.out.println("Digite um valor: ");
    numero = leitor.nextInt();
    
    if (numero >= 100 && numero <= 200) {
        System.out.println("o numero est� no intervalo");
    } else {
        System.out.println("o numero n�o est� no intervalo");
    }
        
    }
    
}

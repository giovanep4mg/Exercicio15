// escrever um programa que o usuario digite um numero 
//avisar se está entre 100 a 200 ! 
package Exercicio15;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
    int numero;
    
    Scanner leitor = new Scanner(System.in);
    
    System.out.println("Digite um valor: ");
    numero = leitor.nextInt();
    
    if (numero >= 100 && numero <= 200) {
        System.out.println("o numero está no intervalo");
    } else {
        System.out.println("o numero não está no intervalo");
    }
        
    }
    
}

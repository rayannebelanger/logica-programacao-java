/******************************************************************************

Escreva um programa que imprima um triângulo isósceles com asteriscos, dado o valor desua altura. A altura do triângulo é representada por um número inteiro N. Seu programadeve funcionar para triângulos com lados de todos os tamanhos entre 2 e 20.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		int lado;
		int i;
		int x;
		
		System.out.println("Informe o lado do quadrado: ");
		lado = dado.nextInt();
		
		    if((lado >= 1) && (lado <= 20)) {
		    for(x = 0; x < lado; x++){
		    for(i = 0; i < lado; i++){
		        System.out.print("*");
		    }
		        System.out.print("\n");
		    
		}
	  }
	}
}


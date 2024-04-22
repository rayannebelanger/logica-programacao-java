/******************************************************************************

Escreva um programa em Java que leia 3 números inteiros. O primeiro número representa um dia, o segundo número representa um mêse o terceiro número representa um ano. Dados os três números, imprima o signo representado por aquela data. Se a data não existir, imprima “Data Invalida” OBS.: Considere que alguns meses tem 30 ou 31 dias, que fevereiro pode ter 28 ou 29 diasem anos bissextos.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		int data, mes, ano;
		
		System.out.println("Informe a data: ");
		data = dado.nextInt();
		
		System.out.println("Informe o número do mês: ");
		mes = dado.nextInt();
		
		System.out.println("Informe o ano: ");
		ano = dado.nextInt();
		
		
		if((mes == 3) && (data >= 21) && (data <= 31)) {
		    System.out.println("Áries");
		} else if ((mes ==  4) && (data >= 1) && (data <= 19)) {
		    System.out.println("Áries");
		} else if((mes == 4) && (data >= 20) && (data <= 30)) {
		    System.out.println("Touro");
		} else if((mes == 5) && (data >= 1) && (data <= 20)) {
		    System.out.println("Touro");
		} else if((mes == 5) && (data >= 21) && (data <= 31)) {
		    System.out.println("Gêmeos");
		} else if((mes == 6) && (data >= 1) && (data <= 21)) {
		    System.out.println("Gêmeos");
		} else if((mes == 6) && (data >= 22) && (data <= 30)) {
		    System.out.println("Câncer");
		} else if((mes == 7) && (data >= 1) && (data <= 22)) {
		    System.out.println("Câncer");
		} else if((mes == 7) && (data >= 23) && (data <= 31)) {
		    System.out.println("Leão");
		} else if((mes == 8) && (data >= 1) && (data <= 22)) {
		    System.out.println("Leão");
		} else if((mes == 8) && (data >= 23) && (data <= 31)) {
		    System.out.println("Virgem");
		} else if((mes == 9) && (data >= 1) && (data <= 22)) {
		    System.out.println("Virgem");
		} else if((mes == 9) && (data >= 23) && (data <= 30)) {
		    System.out.println("Libra");
		} else if((mes == 10) && (data >= 1) && (data <= 22)) {
		    System.out.println("Libra");
		} else if((mes == 10) && (data >= 23) && (data <= 31)) {
		    System.out.println("Escorpião");
		} else if((mes == 11) && (data >= 1) && (data <= 21)) {
		    System.out.println("Escorpião");
		} else if((mes == 11) && (data >= 22) && (data <= 30)) {
		    System.out.println("Sagitário");
		} else if((mes == 12) && (data >= 1) && (data <= 21)) {
		    System.out.println("Sagitário");
		} else if((mes == 12) && (data >= 22) && (data <= 31)) {
		    System.out.println("Capricórnio");
		} else if((mes == 1) && (data >= 1) && (data <= 19)) {
		    System.out.println("Capricórnio");
		} else if((mes == 1) && (data >= 20) && (data <= 31)) {
		    System.out.println("Aquário");
		} else if((mes == 2) && (data >= 1) && (data <= 18)) {
		    System.out.println("Aquário");
		} else if((mes == 2) && (data >= 19) && (data <= 28)){
		    System.out.println("Peixes");
		} else if((mes == 3) && (data >= 1) && (data <= 20)) {
		    System.out.println("Peixes");
		} else if ((mes == 2) && (data == 29)) {
		    if((ano % 4 == 0) && (ano % 100 != 0)) {
		        System.out.println("Peixes");
		    } else if ((ano % 4 == 0) && (ano % 100 == 0) && (ano % 400 == 0)){
		        System.out.println("Peixes");
		    } else if ((ano % 4 != 0)) {
		        System.out.println("Data inválida!");
		    } else if ((ano % 4 == 0) && (ano % 100 == 0) && (ano % 400 != 0)) {
		        System.out.println("Data inválida!");
		    }
	} else {
	    System.out.println("Data inválida!");
	}
}
}
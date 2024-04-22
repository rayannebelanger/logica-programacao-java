/******************************************************************************

Programa para receber uma variável volume do tipo int e imprime a descrição do volume recebido 

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int volume;
		Scanner dado = new Scanner(System.in);
		
		System.out.println("Informe o volume: ");
		volume = dado.nextInt();
		
		if (volume <= 0) {
		    System.out.println("Min Volume"); 
		} else if ((volume > 0) && (volume <= 25)) {
		    System.out.println("Low Volume");
		} else if ((volume > 25) && (volume <= 75)) {
		    System.out.println("Medium Volume");
		} else if ((volume > 75) && (volume < 100)) {
		    System.out.println("High Volume");
		} else if (volume >= 100) {
		    System.out.println("Max Volume");
		}
	}
}

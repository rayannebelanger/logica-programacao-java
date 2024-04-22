/******************************************************************************

Programa  que   receba  3   (três)  números   inteiros   e   os   apresente   na ordem decrescente

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("Informe o primeiro número:");
		a = dado.nextInt();
		
		System.out.println("Informe o segundo número: ");
		b = dado.nextInt();
		
		System.out.println("Informe o terceiro número: ");
		c = dado.nextInt();
		
		if ((a >= b) && (b >= c)) {
		    System.out.println(a + "," + b + "," + c);
		} else if ((a >= c) && (c >= b)) {
		    System.out.println(a + "," + c + "," + b);
		} else if ((b >= a) && (a >= c)) {
		    System.out.println(b + "," + a + "," + c);
		} else if ((b >= c) && (c >= a)) {
		    System.out.println(b + "," + c + "," + a);
		} else if ((c >= a) && (a >= b)) {
		    System.out.println(c + "," + a + "," + b);
		} else if ((c >= b) && (b >= a)) {
		    System.out.println(c + "," + b + "," + a);
		}
	}
}

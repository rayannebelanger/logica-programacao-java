/******************************************************************************

Resolver equações do 2 grau

*******************************************************************************/
import java.util.Scanner;
import java.lang.Math;
public class Main
{
	public static void main(String[] args) {
		double a, b, c, delta, x1, x2, raiz;
		Scanner dado = new Scanner(System.in);
		
		System.out.println("Informe A: ");
		a = dado.nextDouble();
		
		System.out.println("Informe B: ");
		b = dado.nextDouble();
		
		System.out.println("Informe C: ");
		c = dado.nextDouble();
		
        delta = (b * b) - (4 * a * c);
		
		raiz = Math.sqrt(delta);
		
		x1 = ((- b) - raiz) / (2 * a); 
		x2 = ((- b) + raiz) / (2 * a);
		
		if (a == 0) {
		    System.out.println("Coeficiente não pode ser zero!");
		} else if (delta > 0) {
		    System.out.println("As raízes são " + x1 + " e " + x2);
		} else if (delta == 0) {
		    System.out.println("A unica raiz é " + x1);
		} else if (delta < 0) {
		    System.out.println("Não há raizes");
		}
    
	}
}

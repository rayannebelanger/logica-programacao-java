/******************************************************************************

Mostrar em quais outros anos a criança deve tomar as próximas doses de vacina, sabendo que há um total de quatro (4) doses de vacina.
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		int ano;
		int periodicidade;
		int i = 0;
		
		System.out.println("Ano da primeira dose: ");
		ano = dado.nextInt();
		
		System.out.println("Periodicidade da vacina: ");
		periodicidade = dado.nextInt();
		
		if(periodicidade <= 0) {
		    System.out.println("Digite um período maior que zero!");
		} else {
		    while (i < 3) {
		        System.out.println(ano = ano + periodicidade);
		        i++;
		    }
		}
		
	}
}

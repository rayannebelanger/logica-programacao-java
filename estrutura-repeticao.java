/******************************************************************************

Uma mochila com capacidade de até dezoito kg, receber o peso de muitos livros e parar quando ultrapassar a capacidade

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		int peso_livro = 0;
		int soma_peso = 0;
		int i = 0;
		
        for(i = 0; soma_peso <= 18; i++) {
            
            System.out.println("Informe o peso do livro: ");
            peso_livro = dado.nextInt();
            
            soma_peso += peso_livro;
        } 
            System.out.println(i - 1);
	}
}

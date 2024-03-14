package exercicio02;
import java.util.Scanner;

	//2) Escreva um algoritmo para ler um valor do teclado e exibir como resposta o número antecessor.
	
public class Exercicio02 {
	
	public static void main(String[]args) {
		System.out.println("Digite um número: ");
		
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		int resultado = numero - 1;
		
		System.out.println("O antecessor do número " + numero + " é: " + resultado);

		
	}

}

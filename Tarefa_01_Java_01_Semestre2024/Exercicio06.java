package exercicio06;

	import java.util.Scanner;

public class Exercicio06 {
	
	//*6) Escreva um algoritmo para ler dois valores do teclado e exibir como resposta a divisão dos valores.*\\

	public static void main(String[]args) {
		
		System.out.println("Digite um valor: ");
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		
		System.out.println("Digite outro valor: ");
		
		int n2 = sc.nextInt();
		int resultado = n1/n2;
		
		System.out.println("A divisão entre " + n1 + " e " + n2 + " é: " +resultado);
	}
}

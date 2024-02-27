package exercicio05;
	
	import java.util.Scanner;

public class Exercicio05 {
	
	//*5) Escreva um algoritmo para ler dois valores do teclado e exibir como resposta a multiplicação dos valores.*\\
	
	public static void main(String[]args) {
		
		System.out.println("Digite um valor: ");
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		
		System.out.println("Digite outro valor: ");
		
		int n2 = sc.nextInt();
		int resultado = n1*n2;
		
		System.out.println("O resultado de " + n1 + " * " + n2 + " é: " +resultado);
		
		
		
	}

}

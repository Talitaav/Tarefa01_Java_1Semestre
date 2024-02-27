package exercicio03;

	import java.util.Scanner;

public class Exercicio03 {
	
		//* 3) Escreva um algoritmo para ler dois valores do teclado e exibir como resposta a soma dos valores.*\\
	
	public static void main(String[]args) {
		
		System.out.println("Digite um valor: ");
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		
		System.out.println("Digite outro valor: ");
		
		int n2 = sc.nextInt();
		
		int resultado = n1+n2;
		
		System.out.println("A soma dos valores " + n1 + " e "  + n2 + " é: " +resultado);
	}

}

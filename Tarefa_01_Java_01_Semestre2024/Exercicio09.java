package exercicio;
import java.util.Scanner;

public class Exercicio09 {
	
	//9) Escreva um algoritmo para ler as dimensões de um quadrado (lado), calcular e escrever a área do quadrado. Dica a=l²
	
	public static void main(String[]args) {
		
		System.out.println("Digite um número:");
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int resultado = a*a;
		
		System.out.println("A área do quadrado é: " +resultado);
	}

}

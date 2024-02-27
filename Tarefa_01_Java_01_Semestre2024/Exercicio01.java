package exercicio01;

	import java.util.Scanner;


public class Exercicio01 {

	public static void main(String[]args) {
		System.out.println("Digite um número para saber o seu sucessor: ");
		
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		int resultado = numero + 1;
		
		System.out.println("O sucessor do número " + numero + " é "+ resultado);
		
	}
}

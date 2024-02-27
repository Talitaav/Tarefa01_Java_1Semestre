package exercicio;

	import java.util.Scanner;

public class Exercicio11 {

	//*11) Escreva um algoritmo para ler as dimensões de um trapézio (base amior, base menor e altura), calcular e escrever a área do trapézio. a=(B+b).h/2*\\
	
	public static void main(String[]args) {
		
		System.out.println("Digite a base maior: ");
		Scanner sc = new Scanner(System.in);
		
		int maior = sc.nextInt();
		
		System.out.println("Digite a base menor: ");
		int menor = sc.nextInt();
		
		System.out.println("Digite a altura: ");
		int altura = sc.nextInt();
		int resultado = (maior+menor)*altura/2;
		
		System.out.println("A área do trapézio é: " +resultado);
	}
}

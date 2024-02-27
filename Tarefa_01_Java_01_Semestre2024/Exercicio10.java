package exercicio;

	import java.util.Scanner;

public class Exercicio10 {


//*10) Escreva um algoritmo para ler as dimensões de um losango (diagonal maior, diagonal menor), calcular e escrever a área do losango. Dica a=D.d/2*\\

	static void main(String[]args) {
	
		System.out.println("Digite a diagonal maior do losango: ");
		
		Scanner sc = new Scanner(System.in);
		int dmaior = sc.next();
		
		System.out.println("Digite a diagonal menor do losango: ");
		int dmenor = sc.next();
		int resultado = (dmaior*dmenor)/2;
		
		System.out.println("A área do losangolo é: " +resultado);
	
	

	}
}

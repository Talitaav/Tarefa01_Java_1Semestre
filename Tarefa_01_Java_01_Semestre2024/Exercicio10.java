package exercicio;
import java.util.Scanner;

public class Exercicio10 {


//10) Escreva um algoritmo para ler as dimensões de um losango (diagonal maior, diagonal menor), calcular e escrever a área do losango. Dica a=D.d/2

	static void main(String[]args) {
	
		System.out.println("Digite a diagonal maior do losango: ");
		
		Scanner sc = new Scanner(System.in);
		float dmaior = sc.nextFloat();
		
		System.out.println("Digite a diagonal menor do losango: ");
		float dmenor = sc.nextFloat();
		float resultado = (dmaior*dmenor)/2;
		
		System.out.println("A área do losangolo é: " +resultado);
	
	

	}
}

package exercicio;
import java.util.Scanner;

public class Exercicio12 {
	
	//12) Escreva um algoritmo para ler as dimensões de um circulo (raio), calcular e escrever a área do circulo. a=pi*r²
	
	public static void main(String[]args) {
		
		System.out.println("Digite um número pasar calcular área do cirlculo: ");
		
		Scanner sc = new Scanner(System.in);
		
		double raio = sc.nextDouble();
		double area = Math.PI * raio * raio;

		System.out.println("A área do circulo é: " +area);
	}
}

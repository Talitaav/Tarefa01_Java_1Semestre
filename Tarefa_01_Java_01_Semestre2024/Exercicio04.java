package exercicio04;
	
	import java.util.Scanner;
	
public class Exercicio04 {
	
	//*4) Escreva um algoritmo para ler dois valores do teclado e exibir como resposta a subtração dos valores.*\\
	
	public static void main(String[]args) {
		
		System.out.println("Digite uma valor: ");
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		System.out.println("Digite outro valor: ");
		
		int n2 = sc.nextInt();
		int resultado = n1-n2;
		
		System.out.println("O resultado entre os valores " + n1 +  " e " + n2 + " é: " + resultado);
				
		
	}
		
	}


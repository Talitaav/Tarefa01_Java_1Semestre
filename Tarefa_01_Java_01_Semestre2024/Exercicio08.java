package exercicio08;

	import java.util.Scanner;

public class Exercicio08 {

//*8) Escreva um algoritmo para ler as dimensões de um triângulo (base e altura), calcular e escrever a área do triângulo. Dica a=b.h/2 *//

    public static void main(String[]args){

        System.out.print("Digite um número: ");

        Scanner sc = new Scanner(System.in);

        int b1 = sc.nextInt();

        System.out.print("Digite um novo número: ");

        int a2 = sc.nextInt();
        int resultado = (b1*a2)/2;

        System.out.print("A área do retângulo é: " + b1 + + a2 + + resultado);
    

    }
}
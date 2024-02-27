package exercicio07;

	import java.util.Scanner;

public class Exercicio06 {

    //*7) Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a área do retângulo. Dica a=b.h*\\

    public static void main(String[]args){

        System.out.print("Digite a base do retângulo: ");

        Scanner sc = new Scanner(System.in);

        float b1 = sc.nextFloat();

        System.out.print("Digite a altura do retângulo: ");

        float a2 = sc.nextFloat();
        float resultado = b1*a2;

        System.out.print("A área do retângulo é: " + b1 + + a2 + + resultado);
    

    }
}

package Projetos_LPA.aula8;

import java.util.Scanner;

public class exercicio_ternario1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe um número inteiro: ");
		int num = scanner.nextInt();
		
		System.out.println((num % 2 == 0) ? "O número é par" : "O número é ímpar");
		
		scanner.close();

	}

}

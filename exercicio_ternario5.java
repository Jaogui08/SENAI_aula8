package Projetos_LPA.aula8;

import java.util.Scanner;

public class exercicio_ternario5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe um número inteiro: ");
		int num = scanner.nextInt();
		
		System.out.println((num % 5 == 0) ? "O número é multiplo de 5" : "O número não é multiplo de 5");
		
		scanner.close();

	}

}

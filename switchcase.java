package Projetos_LPA.aula8;

import java.util.Scanner;

public class switchcase {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Escolha um número entre 1 a 3: ");
		int num = scanner.nextInt();
		
		switch (num) {
		case 1:
			System.out.println("O número escolhido foi o 1");
			break;
		case 2:
			System.out.println("O número escolhido foi o 2");
			break;
		case 3:
			System.out.println("O número escolhido foi o 3");
			break;
			
		default:
			System.out.println("Número inválido");
			break;
		}
		
		scanner.close();

	}

}

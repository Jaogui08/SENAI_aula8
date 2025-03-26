package Projetos_LPA.aula8;

import java.util.Scanner;

public class mesano_switch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o mês em que estamos: ");
		String mes = scanner.nextLine();
		
		switch (mes.toLowerCase()) {
		case "janeiro":
			System.out.println("Estamos no mês 1");
			break;
		case "fevereiro":
			System.out.println("Estamos no mês 2");
			break;
		case "março":
			System.out.println("Estamos no mês 3");
			break;
		case "abril":
			System.out.println("Estamos no mês 4");
			break;
		case "maio":
			System.out.println("Estamos no mês 5");
			break;
		case "junho":
			System.out.println("Estamos no mês 6");
			break;
		case "julho":
			System.out.println("Estamos no mês 7");
			break;
		case "agosto":
			System.out.println("Estamos no mês 8");
			break;
		case "setembro":
			System.out.println("Estamos no mês 9");
			break;
		case "outubro":
			System.out.println("Estamos no mês 10");
			break;
		case "novembro":
			System.out.println("Estamos no mês 11");
			break;
		case "dezembro":
			System.out.println("Estamos no mês 12");
			break;
		default:
			System.out.println("Mês inválido");
			break;
		}
		
		scanner.close();

	}

}

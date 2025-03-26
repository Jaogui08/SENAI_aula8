package Projetos_LPA.aula8;

import java.util.Scanner;

public class switchcase2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o seu usuário: ");
		String user = scanner.nextLine();
		
		switch (user) {
		case "jaogui08":
			System.out.println("Usuário correto");
			break;
 		
 		default:
 			System.out.println("Usuário incorreto");
 			scanner.close();
 			return;
		}
		
		System.out.print("\nInforme sua senha: ");
		String senha = scanner.nextLine();
		
		switch (senha) {
		case "123456":
			System.out.println("Bem-vindo ao sistema SENAI");
			break;
			
		default:
			System.out.println("Senha incorreta");
			break;
		}
		
		scanner.close();

	}

}

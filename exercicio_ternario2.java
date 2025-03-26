package Projetos_LPA.aula8;

import java.util.Scanner;

public class exercicio_ternario2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String usermaquina = "jaogui08";
		String senhamaquina = "123456";
		
		System.out.print("Informe o seu login: ");
		String user = scanner.nextLine();
		
		System.out.print("Informe sua senha: ");
		String senha = scanner.nextLine();
		
		System.out.println((user.equals(usermaquina)) && (senha.equals(senhamaquina)) ? "Bem-vindo ao sistema SENAI" : "Dados incorretos");
		
		
		scanner.close();

	}

}

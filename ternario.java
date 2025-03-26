package Projetos_LPA.aula8;

import java.util.Scanner;

public class ternario {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe sua idade: ");
		int idade = scanner.nextInt();
		
		String mensagem = idade >= 18 ? "Você é maior de idade" : "Você é menor de idade";
		System.out.println(mensagem);
        
		scanner.close();
	}

}

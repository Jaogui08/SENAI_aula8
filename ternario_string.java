package Projetos_LPA.aula8;

import java.util.Scanner;

public class ternario_string {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nome1, nome2;
		
		System.out.print("Informe um nome: ");
		nome1 = scanner.nextLine();
		
		System.out.print("Informe um segundo nome: ");
		nome2 = scanner.nextLine();
		
		String msg = (nome1.equals(nome2)) ? "Nomes iguais" : "Nomes diferentes";
		System.out.println(msg);
		
		scanner.close();

	}

}

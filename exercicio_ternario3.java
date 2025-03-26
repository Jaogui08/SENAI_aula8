package Projetos_LPA.aula8;

import java.util.Scanner;

public class exercicio_ternario3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe a primeira nota: ");
		double n1 = scanner.nextDouble();
		
		System.out.print("Informe a segunda nota: ");
		double n2 = scanner.nextDouble();
		
		System.out.print("Informe a terceira nota: ");
		double n3 = scanner.nextDouble();
		
		System.out.print("Informe a quarta nota: ");
		double n4 = scanner.nextDouble();
		
		double media = (n1+n2+n3+n4)/4;
		
		System.out.println(media >= 6 ? "\nAluno aprovado" : "\nAluno reprovado");
		
		scanner.close();

	}

}

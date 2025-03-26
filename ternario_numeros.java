package Projetos_LPA.aula8;

import java.util.Scanner;

public class ternario_numeros {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o primeiro número: ");
		int num1 = scanner.nextInt();
		
		System.out.print("Informe o segundo número: ");
		int num2 = scanner.nextInt();
		
		String msg = num1 >= num2 ? "O primeiro número é maior ou igual ao segundo" : "O primeiro número é menor";
		System.out.println(msg);
		
		scanner.close();

	}

}

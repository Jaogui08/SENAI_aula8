package Projetos_LPA.aula8;

import java.util.Scanner;

public class exercicio_ternario4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe qual o seu salário atual: ");
		double salario = scanner.nextDouble();
		
		System.out.print("Informe a quantos anos você trabalha na empresa: ");
		int anos = scanner.nextInt();  // 5/100 = 00,5
		
		double bonus, salariobonus;
		
		if (anos <= 3) {
			bonus = (salario*0.05);
			salariobonus = (salario+bonus);
			System.out.println("Você recebeu um bônus de 5% no salário e ele aumentou para: " + salariobonus + " reais");
		} else {
			bonus = (salario*0.07);
			salariobonus = (salario+bonus);
			System.out.println("Você recebeu um bônus de 7% no salário e ele aumentou para: " + salariobonus + " reais");
		}
		
		scanner.close();

	}

}

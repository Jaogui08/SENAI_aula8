package Projetos_LPA.aula8;

import java.util.Scanner;

public class exercicio_ternario4_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double salario, bonus;
		int anos;
		
		System.out.print("Informe o seu salário atual: ");
		salario = scanner.nextDouble();
		
		System.out.print("Informe a quantos anos você trabalha na empresa: ");
		anos = scanner.nextInt();
		
		bonus = (anos <= 3 ? salario*0.05 : salario*0.07);	
		System.out.println("Você recebeu um bônus e seu salário aumentou para: " + (salario+bonus));
		
		scanner.close();
		}
	

	}



package br.com.calculadora;

import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		Calculo teste1 = new Calculo();
		Scanner trocador = new Scanner(System.in);

		// Declaracao de variavel
		int continuar;

		do {
			System.out.println("Informe o 1° numero: ");
			teste1.x = trocador.nextDouble();

			System.out.println("Informe o 2° numero: ");
			teste1.y = trocador.nextDouble();

			// Limpeza do buffer(memória)
			trocador.nextLine();

			System.out.println("Informe o operador: ");
			System.out.println("+ = Somar");
			System.out.println("- = Subtrair");
			System.out.println("* = Multiplicar");
			System.out.println("/ = Dividir");
			teste1.operador = trocador.nextLine();

			/*
			 * //saida de dados com if..else //Sempre que tiver so uma linha no comando não
			 * precisa //usar o colchetes {} 
			 if(teste1.operador == "+")
			 System.out.println("Resultado: " +teste1.somar()); 
			 else if(teste1.operador =="-") 
			 System.out.println("Resultado: " +teste1.subtrair()); 
			 else if(teste1.operador == "*") 
			 System.out.println("Resultado: "+teste1.multiplicar()); 
			 else if(teste1.operador == "/")
			 System.out.println("Resultado: " +teste1.dividir());
			 else
			 System.out.println("Operação Invalida");
			 
			 * //Para usar esse IF Else temos que alterar o operador de String //para o tipo
			 * Int.
			 */

			switch (teste1.operador) {
			case "+":
				System.out.println("O resultado é " + teste1.somar());
				break;
			case "-":
				System.out.println("O resultado é " + teste1.subtrair());
				break;
			case "*":
				System.out.println("O resultado é " + teste1.multiplicar());
				break;
			case "/":
				System.out.println("O resultado é " + teste1.dividir());
				break;
			default:
				System.out.println("Opção invalida! Tente novamente.");
				break;
			}

			System.out.println("\n Deseja continuar? 1 - Sim e 2 - Não");
			continuar = trocador.nextInt();

		} while (continuar == 1);
		System.out.println("Programa encerrado! Obrigado!");
	}
}

package ProjetoDoacao;

import java.util.Scanner;

public class InstMedicos {
	
	void medicos () {
		
		FormasDePagamento form = new FormasDePagamento();
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("M�dicos sem Fronteiras - cuidados de sa�de no mundo inteiro");
		System.out.println("-----------------------------------------------------------");
		System.out.println("Qual valor voc� quer doar: ");
		System.out.println("[1] [2] [3]");
		int numero = leia.nextInt();
		
		switch (numero) {
		 
			case 1:
				System.out.println("");
				form.formaDePagamento();
			break;
			
			case 2:
				System.out.println("");
				form.formaDePagamento();
			break;
			
			case 3:
				System.out.println("");
				form.formaDePagamento();
			break;
		}
	}

}

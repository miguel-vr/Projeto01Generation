package ProjetoDoacao;

import java.util.Scanner;

	public class InstLuizaMel {

		void luizaMel () {
			
			FormasDePagamento form = new FormasDePagamento();
		
			Scanner leia = new Scanner(System.in);
		
		
			System.out.println("Luiza Mell - instituto de ajuda aos animais");
			System.out.println("-------------------------------------------");
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

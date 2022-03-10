package ProjetoDoacao;

import java.util.Scanner;


	public class Instituicoes {

		void instituicoes() {
			
			InstLuizaMel lui = new InstLuizaMel();
			InstMedicos med = new InstMedicos();
			InstAcnur acn = new InstAcnur();
		
				Scanner entrada = new Scanner(System.in);
		
				System.out.println("Para qual instituição você quer doar");
				System.out.println("[1] [2] [3]");
				int num1 = entrada.nextInt();
		
				switch (num1) {
					case 1:
						lui.luizaMel();
					break;
			
					case 2:
						med.medicos();
					break;
			
					case 3:
						acn.acnur();
					break;
				}
		
		}
}

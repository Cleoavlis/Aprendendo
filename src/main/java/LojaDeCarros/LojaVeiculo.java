package LojaDeCarros;

import java.util.Scanner;


public class LojaVeiculo {

	public static void main(String [] args) {

		Scanner entrada = new Scanner (System.in);
			String nome,endereco,telefone,empr_trab;		double score;
		System.out.println("Seja Bem vindo a loja FLASH VEICULOS ");
			
			System.out.println("Digite o seu nome");
			nome = entrada.nextLine(); //entrada.nextLine();
			
			System.out.println("Digite seu endereço ");
			endereco = entrada.nextLine();// entrada.nextLine();
			
			System.out.println("Digite seu telefone");
			telefone = entrada.next(); entrada.nextLine();
			
			System.out.println("Digite o nome da empresa que trabalhar: ");
			empr_trab = entrada.nextLine(); //entrada.nextLine();
			
			System.out.println("Agora digite seu salário");
			double salario = entrada.nextDouble(); entrada.nextLine();
			
	        System.out.println("Digite seu Score:");
			score = entrada.nextDouble(); entrada.nextLine();
			
System.out.println("NOME: "+nome+ "\n"+ "ENDEREÇO: "+endereco + "\n"+ "TELEFONE: "+telefone);

System.out.println("NOME DA EMPRESA QUE TRABALHA: "+empr_trab+ "\n"+ "SALÁRIO: "+ salario + "\n"+  "SCORE: " +score );
			
			if (score>=500 & salario>=1500){
				
			System.out.println("PARABÉNS VOCÊ ESTA APTO PARA O FINANCIAMENTO");
			
			String opc = """
					ESCOLHA SEU CARRO:
					Opção 1 -  Hyunday valor R$ 60 mil
					Opção 2- Chevrolet valor R$ 30 mil
					""";
			System.out.println(opc); 
			
String veiculo= entrada.next();

switch (veiculo) {

			case "1": 
			case "Hyunday":
			case "hyunday":
			case "HYUNDAY":
				
				System.out.println("Parabens o veículo escolhido foi Hyunday");
				
				System.out.println("Você pode finaciar seu veículo em até 60 meses"+"\n"+ "Em quantas vezes deseja finaciar?");
				System.out.println("  ");
				String menu =
			            """
			    ** ESCOLHA EM QUANTAS VEZES DESEJA FINANCIAR **
			    
			           Opção 1- 60x
			           Opção 2- 48x
			           Opção 3- 36x
			           Opção 4- 24x
			            """;
			    System.out.println(menu);

				int valorv = 60000;
				
				int financiar = entrada.nextInt();
				
				switch (financiar){
				case 1,60:
					
				System.out.println("O valor da parcela em 60x é de R$ " + (valorv/60));
				
				System.out.println("FINANCIAMENTO CONCLUÍDO");

				break;
				case 2,48:
					
				System.out.println("O valor da parcela em 48x é de R$ " + (valorv/48));
				
				System.out.println("FINANCIAMENTO CONCLUÍDO");

				break;
				
				case 3,36:
					
				System.out.println("O valor da parcela em 36x de R$ " + (valorv/36));
				
				System.out.println("FINANCIAMENTO CONCLUÍDO");
				
				break;
				
				case 4,24:
					
				System.out.println("O valor da parcela em 24x é de R$ " + (valorv/24));
				System.out.println("FINANCIAMENTO CONCLUÍDO");

				break;
				
				default:				System.out.println("NÃO ESTÁ DISPONÍVEL ESSA OPÇÃO");
					 break;
				}
			break;
			
			case "2":
			case "Chevrolet":
			case "chevrolet":
			case "CHEVROLET":	
				
			System.out.println("Parabens o veículo escolhido foi Chevrolet");
			
			System.out.println("Você pode finaciar seu veículo em até 60 meses"+"\n"+ "Em quantas vezes deseja finaciar?");
			System.out.println("  ");
			
			String Menu =
			        """
    ** ESCOLHA EM QUANTAS VEZES DESEJA FINANCIAR**
			       Opção 1- 60x
			       Opção 2- 48x
			       Opção 3- 36x
			       Opção 4- 24x
			        """;
			
			System.out.println(Menu);

			int valorv1 = 30000;
			 
			int financiar1 = entrada.nextInt();
			
			switch (financiar1){
			
			case 1,60:
				
			System.out.println("O valor da parcelado em 60x é de R$ " + (valorv1/60));
			
			System.out.println("FINANCIAMENTO CONCLUÍDO");
			
			break;
						
			case 2,48:
				
			System.out.println("O valor da parcela em 48x é de R$ " + (valorv1/48));
			
			System.out.println("FINANCIAMENTO CONCLUÍDO");

			break;
			
			case 3,36:
				
			System.out.println("O valor da parcela em 36x é de R$ "+(valorv1/36));
			
			System.out.println("FINANCIAMENTO CONCLUÍDO");

			break;
			
			case 4,24:
				
			System.out.println("O valor da parcela em 36x é de R$ "+(valorv1/24));
			
			System.out.println("FINANCIAMENTO CONCLUÍDO");

			break;
			
			default:
				
				System.out.println("Opção inexistente");
				
			break;
			}
			
			default:				System.out.println("NO MOMENTO TEMOS APENAS ESSE DOIS MODELOS DISPONÍVEL, REFAÇA A OPERAÇÃO");
			break;

} 
} 
			else { 
				System.out.println(""
						+ "");
				System.out.println("***FINANCIAMENTO NÃO AUTORIZADO***");
				

			
		}
			System.out.println(""
					+ "");
		System.out.println("FIM DA EXECUÇÃO");
		
	} }


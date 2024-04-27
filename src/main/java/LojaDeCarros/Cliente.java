package LojaDeCarros;

import java.util.Scanner;

public class Cliente {
	public static void main(String[] args) {

	Scanner entrada = new Scanner (System.in);
	String nome,endereco, telefone, empresa;
	float salario,score;

	
	System.out.println("Digite o seu nome");
	nome = entrada.next();
				System.out.println("Digite seu endereço e ");
	endereco = entrada.next(); 
	System.out.println("Infomer nome da empresa que trabalha");
	empresa = entrada.next();
				System.out.println("Digite seu telefone");
	telefone = entrada.next();
							System.out.println("");
				System.out.println("Digite seu salário:");
	salario = entrada.nextFloat();
	            System.out.println("Digite seu Score:");
	score = entrada.nextInt();
	System.out.println("NOME: "+nome+ " ENDEREÇO: "+endereco + " TELEFONE: "+telefone);
	System.out.println( " SALÁRIO: "+ salario + " SCORE: " +score +"Trabalho"+empresa );	

}}

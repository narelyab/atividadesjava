package aula03;

import java.util.Scanner;

public class atv7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 System.out.println("digite a quantidade de alunos");
		 int quantidade = scanner.nextInt();
		 double soma =0;
	
		 for (int i = 1 ; i <= quantidade ; i++) {
			 System.out.println("digite a nota do aluno " + i +" :");
			 double nota = scanner.nextDouble();
			 soma += nota;
			 
		 }
		 double media = soma / quantidade;
		  System.out.printf("a media da sala  e : %.2f%n ",media );
		  scanner.close();
		  
		 

	}

}

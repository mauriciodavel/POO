package Aluno;
import java.util.Scanner;

import Aluno.Curso;

public class VerificaAprovacao {
	
	
	
	public static void main(String[] args) {
		
		double lerNota;
		
		Curso poo = new Curso();
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome("João");
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite a nota do aluno: ");
		
		lerNota = teclado.nextDouble();
		
		aluno1.setNota(lerNota);
		
		String resultado = poo.VerificaResultado(aluno1.getNota());
		
		System.out.println("O aluno "+aluno1.getNome() + " obteve o resultado " + resultado);
		
		
	}

}

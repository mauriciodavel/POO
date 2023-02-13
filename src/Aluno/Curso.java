package Aluno;

public class Curso {
	
	String nome;
	String tipo;
	Double duracao;
	String resultado;
	
	public void FazerInscricao() {
		
					
	}
	
	public String VerificaResultado(double notaAluno){
		double nota = notaAluno;
		if (nota > 7.0) {
			resultado = "Aprovado";
		} else {
			resultado = "Reprovado";
			
		}
		return resultado;
		
	}
	

}

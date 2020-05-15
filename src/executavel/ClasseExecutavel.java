package executavel;

import Classes.Aluno;

public class ClasseExecutavel {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		 aluno.setNome("francisco");
		 aluno.setNota1(90);
		 aluno.setNota2(70);
		 aluno.setNota3(85);
		System.out.println(aluno.getNome());
		System.out.println(aluno.getMediaNota());
	}

}

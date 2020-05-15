package executavel;

import javax.swing.JOptionPane;

import Classes.Aluno;
import sun.tools.asm.Cover;

public class ClasseExecutavel {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		 aluno.setNome("francisco");
		 aluno.setNota1(90);
		 aluno.setNota2(70);
		 aluno.setNota3(85);
		System.out.println(aluno.getNome());
		System.out.println(aluno.getMediaNota());
		System.out.println(aluno.getAprovado()?"Aluno aprovado":"Aluno reprovado");
		
		String materia1 = JOptionPane.showInputDialog("Digite a Materia 1 : "); 
		String nota1 = JOptionPane.showInputDialog("Digite a nota 1 : ");
		
		String materia2 = JOptionPane.showInputDialog("Digite a Materia 2: "); 
		String nota2 = JOptionPane.showInputDialog("Digite a nota 2 : ");
		
		String materia3 = JOptionPane.showInputDialog("Digite a Materia 3 : "); 
		String nota3 = JOptionPane.showInputDialog("Digite a nota 3 : ");
		
		aluno.setMateria1(materia1);
		aluno.setNota1(Double.parseDouble(nota1));
		
		aluno.setMateria2(materia2);
		aluno.setNota2(Double.parseDouble(nota2));
		
		aluno.setMateria3(materia3);
		aluno.setNota3(Double.parseDouble(nota3));
		
		
		
		System.out.println(aluno);
	}

}

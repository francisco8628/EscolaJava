package executavel;

import javax.swing.JOptionPane;

import Classes.Aluno;
import sun.tools.asm.Cover;

public class ClasseExecutavel {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		
		
		
		String materia1 = JOptionPane.showInputDialog("Digite a Materia 1 : "); 
		aluno.getMateria().setMateria1(materia1);
		String nota1 = JOptionPane.showInputDialog("Digite a nota 1 : ");
		aluno.getMateria().setNota1(Double.parseDouble(nota1));
		
		String materia2 = JOptionPane.showInputDialog("Digite a Materia 2: "); 
		aluno.getMateria().setMateria2(materia2);
		String nota2 = JOptionPane.showInputDialog("Digite a nota 2 : ");
		aluno.getMateria().setNota2(Double.parseDouble(nota2));
		
		String materia3 = JOptionPane.showInputDialog("Digite a Materia 3 : "); 
		aluno.getMateria().setMateria3(materia3);
		String nota3 = JOptionPane.showInputDialog("Digite a nota 3 : ");
		aluno.getMateria().setNota3(Double.parseDouble(nota3));
		
		
		aluno.setNome("francisco");
		System.out.println(aluno.getNome());
		
		System.out.println("A materia : " +aluno.getMateria().getMateria1()+ ", tem nota : "+aluno.getMateria().getNota1());
		System.out.println("A materia : " +aluno.getMateria().getMateria2()+ ", tem nota : "+aluno.getMateria().getNota2());
		System.out.println("A materia : " +aluno.getMateria().getMateria3()+ ", tem nota : "+aluno.getMateria().getNota3());
		
		System.out.println("A media do aluno é : "+aluno.getMediaNota());
		System.out.println(aluno.getAprovado()?"Aluno aprovado":"Aluno reprovado");
	}

}

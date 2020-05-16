package executavel;



import javax.swing.JOptionPane;



import Classes.Aluno;
import Classes.Materia;


public class ClasseExecutavel {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		String numMateria=JOptionPane.showInputDialog("Quantas materias tem o aluno ?");
		
		for (int i = 0;  i<=Integer.parseInt(numMateria)-1; i++) {
			
			Materia materia = new Materia();
			
			String mate=JOptionPane.showInputDialog("Digite  a materia "+(i+1));
			materia.setMateria(mate);
			
			String nota=JOptionPane.showInputDialog("Digite  a nota"+(i+1));
			materia.setNota(Double.parseDouble(nota));
			
			aluno.getMaterias().add(materia);
		}
		
		int remove = JOptionPane.showConfirmDialog(null, "deseja remover alguma materia");
		
		if (remove==0) {
			
			String escolha=JOptionPane.showInputDialog("Digite de 1 a "+numMateria);
			if(Integer.parseInt(escolha)-1<aluno.getMaterias().size()) {
			
			aluno.getMaterias().remove(Integer.parseInt(escolha)-1);
			}
			else {
				
				System.out.println("valor não encontrado");
			}
		}
		
		for (int i = 0;i<aluno.getMaterias().size();i++) {
			
			System.out.println("A materia: "+aluno.getMaterias().get(i).getMateria());
			System.out.println("tem nota: "+aluno.getMaterias().get(i).getNota());
			System.out.println("-----------------------------------------------------------------");
		}
		
		System.out.println("A media das notas é : "+aluno.getMediaNota());
		System.out.println("O aluno Está :" +(aluno.getAprovado()? " Aprovado":"Reprovado"));
		
	}

}



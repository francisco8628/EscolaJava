package executavel;



import javax.swing.JOptionPane;



import Classes.Aluno;
import Classes.Materia;


public class ClasseExecutavel {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		//double notas[] = new double[4];
		
		String numMateria=JOptionPane.showInputDialog("Quantas materias tem o aluno ?");
		
		for (int i = 0;  i<=Integer.parseInt(numMateria)-1; i++) {
			
			Materia materia = new Materia();
			
			String mate=JOptionPane.showInputDialog("Digite  a materia "+(i+1));
			materia.setMateria(mate);
			
			double notas[] = new double[2];
			for(int x =0;x<2;x++) {
		   	
			String nota=JOptionPane.showInputDialog("Digite  a nota"+(x+1));
			notas [x] = Double.parseDouble(nota);
			
			
			
			}
			materia.setNota(notas);
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
		
		for (Materia m : aluno.getMaterias()) {
			
			//Materia materia = new Materia();
			
			System.out.println("A materia: "+m.getMateria());
			System.out.println("tem notas: ");
			
			for(int a = 0;a<2;a++) {
				
				System.out.println(m.getNota()[a]);
			}
			System.out.println("-----------------------------------------------------------------");
		}
		
		System.out.println("A media das notas é : "+aluno.getMediaNota());
		System.out.println("O aluno Está :" +(aluno.getAprovado()? " Aprovado":"Reprovado"));
		
	}

}



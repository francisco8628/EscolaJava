package Classes;

import java.util.ArrayList;
import java.util.List;



public class Aluno {
	
	  private String nome;    //nome do aluno

      private int idade;      //idade do aluno
      
      private List<Materia>materias = new ArrayList<Materia>();  //uma lista do objeto materia
      
    

	

	public List<Materia> getMaterias() {
		return materias;
	}

	public void setMaterias(List<Materia> materias) {
		this.materias = materias;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}



	 
	public double getMediaNota() {
		double mediaTotal = 0;
	
		for (Materia materia : materias) {

			mediaTotal += materia.getMediaMateria();

		}
         //return somaNotas / 4;4
		return mediaTotal/ materias.size();//retorna o tamannho do objeto
			
		}
		
	
      
	public boolean getAprovado() {
		
		double media = getMediaNota();
		
		if(media>=70) {
			
			return true;
			
		}
		else {
			return false;
		}
		
		
		
	}
}
	


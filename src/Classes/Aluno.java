package Classes;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	
	  private String nome;

      private int idade;  
      
      private List<Materia>materias = new ArrayList<Materia>();
      
    

	

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
		double media = 0;
	
		for (Materia materia : materias) {
		
			media+= materia.getNota();
		}
		
		
		return media / materias.size();
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
	


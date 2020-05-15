package Classes;

public class Aluno {
	
	  private String nome;

      private int idade;  
      
      private Materia materia = new Materia();
      
   

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
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
		
		return (materia.getNota1()+materia.getNota2()+materia.getNota3())/3;
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

package Classes;

public class Aluno {
	
	  private String nome;

      private int idade;

      private String Materia1;
      private String Materia2;
      private String Materia3;
      
      private double nota1;      
      private double nota2;      
      private double nota3;
      
      

	public String getMateria2() {
		return Materia2;
	}

	public void setMateria2(String materia2) {
		Materia2 = materia2;
	}

	public String getMateria3() {
		return Materia3;
	}

	public void setMateria3(String materia3) {
		Materia3 = materia3;
	}

	public void setMateria1(String materia1) {
		Materia1 = materia1;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
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

	public String getMateria1() {
		return Materia1;
	}

	public void setMateria(String materia) {
		Materia1 = materia;
	}

	 
	public double getMediaNota() {
		
		return (nota1+nota2+nota3)/3;
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

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", Materia1=" + Materia1 + ", Materia2=" + Materia2
				+ ", Materia3=" + Materia3 + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + "]";
	}
}

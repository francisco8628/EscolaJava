package Classes;

import java.util.Arrays;

public class Materia {
	
	private String materia;  //nome da materia
	
	private double nota[]= new double[2]; //cada materia tera 2 notas

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public double[] getNota() {
		return nota;
	}

	public void setNota(double[] nota) {
		this.nota = nota;
	}

    public double getMediaMateria() { 
    	double mediaBimestre=0;
    	for(int i = 0;i<nota.length;i++) {
    		
    		mediaBimestre +=nota[i];
    	}
		
    	return mediaBimestre / nota.length;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((materia == null) ? 0 : materia.hashCode());
		result = prime * result + Arrays.hashCode(nota);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Materia other = (Materia) obj;
		if (materia == null) {
			if (other.materia != null)
				return false;
		} else if (!materia.equals(other.materia))
			return false;
		if (!Arrays.equals(nota, other.nota))
			return false;
		return true;
	}
    
    
    

}

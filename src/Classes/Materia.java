package Classes;

public class Materia {
	
	private String Materia1;
    private String Materia2;
    private String Materia3;
    
    private double nota1;      
    private double nota2;      
    private double nota3;
    
	public String getMateria1() {
		return Materia1;
	}
	public void setMateria1(String materia1) {
		Materia1 = materia1;
	}
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Materia1 == null) ? 0 : Materia1.hashCode());
		result = prime * result + ((Materia2 == null) ? 0 : Materia2.hashCode());
		result = prime * result + ((Materia3 == null) ? 0 : Materia3.hashCode());
		long temp;
		temp = Double.doubleToLongBits(nota1);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(nota2);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(nota3);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		if (Materia1 == null) {
			if (other.Materia1 != null)
				return false;
		} else if (!Materia1.equals(other.Materia1))
			return false;
		if (Materia2 == null) {
			if (other.Materia2 != null)
				return false;
		} else if (!Materia2.equals(other.Materia2))
			return false;
		if (Materia3 == null) {
			if (other.Materia3 != null)
				return false;
		} else if (!Materia3.equals(other.Materia3))
			return false;
		if (Double.doubleToLongBits(nota1) != Double.doubleToLongBits(other.nota1))
			return false;
		if (Double.doubleToLongBits(nota2) != Double.doubleToLongBits(other.nota2))
			return false;
		if (Double.doubleToLongBits(nota3) != Double.doubleToLongBits(other.nota3))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Materia [Materia1=" + Materia1 + ", Materia2=" + Materia2 + ", Materia3=" + Materia3 + ", nota1="
				+ nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + "]";
	}
    
    

}

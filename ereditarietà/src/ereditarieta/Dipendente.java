package ereditarieta;

public class Dipendente {
	
	protected String nome;  //protected permette la visibilità alla classe figlia
	protected double salario;
	
	void incrementaSalario(double incremento){
		this.salario=this.salario+incremento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	public void print() {
		System.out.println("Dipendente: "+nome);
	}
	
}

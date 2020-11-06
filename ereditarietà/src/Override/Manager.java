package Override;

public class Manager extends Dipendente{
	private String dipartimento;
	
	public void cambiaDipartimento(String dipartimento) {
		this.dipartimento=dipartimento;
	}
    // viene ridefinito il metodo print()
	@Override
	public void print() {
		System.out.println("Manager:"+nome);
	}
}

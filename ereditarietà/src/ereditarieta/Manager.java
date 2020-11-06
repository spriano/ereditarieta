package ereditarieta;
/**
 * questa classe eredita tutti i membri della classe Dipendente
 * e aggiunge un campo compartoGestito ed un metodo setter per il campo
 */
public class Manager extends Dipendente{
	private String dipartimento;
	
	public void cambiaDipartimento(String dipartimento) {
		this.dipartimento=dipartimento;
	}

}

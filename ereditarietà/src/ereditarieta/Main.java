package ereditarieta;

public class Main {

	public static void main(String[] args) {
		Dipendente d=new Dipendente();
		d.setNome("Mario Rossi");
		Manager m =new Manager();
		m.setNome("Luca Verdi");  // metodo ereditato
		d.print();
		m.print(); // metodo ereditato
		
		// un oggetto di tipo Dipendente non può eseguire un metodo aggiunto
		// nella classe Manager.
		//d.cambiaDiparimento("produzione");
		
	}

}

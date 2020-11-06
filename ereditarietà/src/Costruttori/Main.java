package Costruttori;

public class Main {

	public static void main(String[] args) {
		Dipendente d=new Dipendente("Paolo Rossi",1500);
		d.setNome("Mario Rossi");
		Manager m =new Manager("Luca Verdi",4000,"Produzione");
		m.setNome("Luca Verdi");  // metodo ereditato
		d.print();
		m.print(); // metodo ereditato
		
		// un oggetto di tipo Dipendente non può eseguire un metodo aggiunto
		// nella classe Manager.
		//d.cambiaDiparimento("produzione");
		
	}

}

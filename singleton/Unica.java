package creational.singleton;

public class Unica {
	//Propriedades da Classe
	private static Unica instance = null;
	
	//M�todo Construtor da Classe
	private Unica() {
		
	}
	
	//M�todos da Classe
	public static Unica getInstance() {
		if (instance == null) {
			instance = new Unica();
		}
		
		return instance;
	}

}

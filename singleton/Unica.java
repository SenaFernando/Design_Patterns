package creational.singleton;

public class Unica {
	//Propriedades da Classe
	private static Unica instance = null;
	
	//Método Construtor da Classe
	private Unica() {
		
	}
	
	//Métodos da Classe
	public static Unica getInstance() {
		if (instance == null) {
			instance = new Unica();
		}
		
		return instance;
	}

}

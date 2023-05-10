package creational.builder;

public class Diretor {
  //Prioridades da Classe
	private CarroBuilder montadora = null;
	
	//Método Contrsutor da Classe
	public Diretor(CarroBuilder montadora) {
		this.montadora = montadora;
	}
	
	//Método get da Classe
	public CarroProduto getCarro() {
		return montadora.getCarro();
	}
	
	//Método da Classe
	public void construirCarro() {
		montadora.buildPreco();
		montadora.buildMotor();
		montadora.buildAno();
		montadora.buildModelo();
		montadora.buildMontadora();
	}
}

package creational.builder;

public class Diretor {
  //Prioridades da Classe
	private CarroBuilder montadora = null;
	
	//M�todo Contrsutor da Classe
	public Diretor(CarroBuilder montadora) {
		this.montadora = montadora;
	}
	
	//M�todo get da Classe
	public CarroProduto getCarro() {
		return montadora.getCarro();
	}
	
	//M�todo da Classe
	public void construirCarro() {
		montadora.buildPreco();
		montadora.buildMotor();
		montadora.buildAno();
		montadora.buildModelo();
		montadora.buildMontadora();
	}
}

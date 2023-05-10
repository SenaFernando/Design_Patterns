package creational.builder;

public class FerrariBuilder extends CarroBuilder {
	public void buildPreco() {
		getCarro().setPreco(1500000);
	}
	
	public void buildMotor() {
		getCarro().setMotor("4,7");
	}
	public void buildAno() {
		getCarro().setAno(2023);
	}
	public void buildModelo() {
		getCarro().setModelo("Spyder");
	}
	public void buildMontadora() {
		getCarro().setMontadora("Ferrari");
	}
}

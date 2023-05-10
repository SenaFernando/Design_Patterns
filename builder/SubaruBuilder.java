package creational.builder;

public class SubaruBuilder extends CarroBuilder {
	public void buildPreco() {
		getCarro().setPreco(100000);
	}
	
	public void buildMotor() {
		getCarro().setMotor("2.0");
	}
	public void buildAno() {
		getCarro().setAno(2023);
	}
	public void buildModelo() {
		getCarro().setModelo("WRX");
	}
	public void buildMontadora() {
		getCarro().setMontadora("Subaru");
	}
}

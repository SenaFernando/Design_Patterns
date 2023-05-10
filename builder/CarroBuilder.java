package creational.builder;

public abstract class CarroBuilder {
// Propriedades da classe
private CarroProduto objCarroProduto = new CarroProduto();

// Método get da classe
public CarroProduto getCarro() {
return objCarroProduto;
}

// Métodos abstratos da classe
public abstract void buildPreco();

public abstract void buildMotor();

public abstract void buildAno();

public abstract void buildModelo();

public abstract void buildMontadora();
}
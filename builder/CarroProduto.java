package creational.builder;

public class CarroProduto {
//Prioridades da classe
private double preco =0;
private String motor = "";
private int ano = 0;
private String modelo="";
private String montadora ="";
public double getPreco() {
	return preco;
}
public void setPreco(double preco) {
	this.preco = preco;
}
public String getMotor() {
	return motor;
}
public void setMotor(String motor) {
	this.motor = motor;
}
public int getAno() {
	return ano;
}
public void setAno(int ano) {
	this.ano = ano;
}
public String getModelo() {
	return modelo;
}
public void setModelo(String modelo) {
	this.modelo = modelo;
}
public String getMontadora() {
	return montadora;
}
public void setMontadora(String montadora) {
	this.montadora = montadora;
}
}

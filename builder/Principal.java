package creational.builder;

public class Principal {
	public static void main(String args[]) {
		//Declaração de Variáveis
		Diretor objDiretor = null;
		
		//Processamento
		objDiretor = new Diretor (new FerrariBuilder());
		objDiretor.construirCarro();
		System.out.println(
		"Carro:" + objDiretor.getCarro().getModelo() + "\n" + 
		"Montadora:" + objDiretor.getCarro().getMontadora() + "\n" + 
		"Ano:" + objDiretor.getCarro().getAno() + "\n" + 
		"Motor:" + objDiretor.getCarro().getModelo() + "\n" + 
		"Preco:" + objDiretor.getCarro().getPreco());
		
		System.out.println();
		
		objDiretor = new Diretor (new SubaruBuilder());
		objDiretor.construirCarro();
		System.out.println(
		"Carro:" + objDiretor.getCarro().getModelo() + "\n" + 
		"Montadora:" + objDiretor.getCarro().getMontadora() + "\n" + 
		"Ano:" + objDiretor.getCarro().getAno() + "\n" + 
		"Motor:" + objDiretor.getCarro().getModelo() + "\n" + 
		"Preco:" + objDiretor.getCarro().getPreco());
	}
	
	

}

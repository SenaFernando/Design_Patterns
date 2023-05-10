package structural.adapter;

public class Principal {
	public static void main(String[]args) {
		//Declaração de variáveis
		Target objTarget = null;
	
		//Processamento
		objTarget = new AdaptadorJPG();
		objTarget.carregar("background.jpg");
		objTarget.renderizar(100, 100);
		
		System.out.println();
		
		objTarget = new AdaptadorGIF();
		objTarget.carregar("animação.gif");
		objTarget.renderizar(100, 400);
	
	}

}

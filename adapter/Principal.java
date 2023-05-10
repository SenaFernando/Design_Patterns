package structural.adapter;

public class Principal {
	public static void main(String[]args) {
		//Declara��o de vari�veis
		Target objTarget = null;
	
		//Processamento
		objTarget = new AdaptadorJPG();
		objTarget.carregar("background.jpg");
		objTarget.renderizar(100, 100);
		
		System.out.println();
		
		objTarget = new AdaptadorGIF();
		objTarget.carregar("anima��o.gif");
		objTarget.renderizar(100, 400);
	
	}

}

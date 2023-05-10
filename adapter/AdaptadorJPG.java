package structural.adapter;

public class AdaptadorJPG extends imagemJPG implements Target {
	public void carregar(String nomeDoArquivo) {
		super.carregarImagemJPG(nomeDoArquivo);
	}
	
	public void renderizar(int x,int y) {
		super.renderizarImagemJPG(x,y);
		
	}

}

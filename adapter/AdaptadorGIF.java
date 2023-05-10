package structural.adapter;

public class AdaptadorGIF extends GIFimagem implements Target {
	public void carregar(String nomeDoArquivo) {
		super.GIFcarregarImagem(nomeDoArquivo);
	}
	
	public void renderizar(int x, int y) {
		super.GIFplotar((double) x, (double) y);
	}

}

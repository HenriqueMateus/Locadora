package usaLocadora;

public class Disco extends Item {
	
	private String nomeArtista;
	private int quantidadeFaixas;
	private String midia;
	
	public Disco(String titulo, String anoLancamento, String comentario, String nomeArtista, int quantidadeFaixas, String midia) {
		super(titulo, anoLancamento, comentario);
		this.setNomeArtista(nomeArtista);
		this.setQuantidadeFaixas(quantidadeFaixas);
		this.setMidia(midia);
		// TODO Auto-generated constructor stub
		
	}

	public String getNomeArtista() {
		return nomeArtista;
	}

	public void setNomeArtista(String nomeArtista) {
		this.nomeArtista = nomeArtista;
	}

	public int getQuantidadeFaixas() {
		return quantidadeFaixas;
	}

	public void setQuantidadeFaixas(int quantidadeFaixas) {
		this.quantidadeFaixas = quantidadeFaixas;
	}

	public String getMidia() {
		return midia;
	}

	public void setMidia(String midia) {
		this.midia = midia;
	}

	@Override
	public void listaInformacao() {
		System.out.print("---------------------");
		System.out.printf("%n Título: %s%n"
				+ " Ano de Lançamento: %s%n"
				+ " Comentário: %s%n"
				+ " Diretor: %s%n"
				+ " Duração: %d%n"
				+ " Gênero: %s%n",
				this.getTitulo(), this.getAnoLancamento(),
				this.getComentario(), this.getNomeArtista(),
				this.getQuantidadeFaixas(), this.getMidia());
		System.out.print("---------------------");
	}
	

}

package usaLocadora;

public class Filme extends Item {
	
	private String nomeDiretor;
	private float duracao;
	private String genero;
	
	public Filme(String titulo, String anoLancamento, String comentario, String nomeDiretor, float duracao, String genero) {
		super(titulo, anoLancamento, comentario);
		this.setNomeDiretor(nomeDiretor);
		this.setDuracao(duracao);
		this.setGenero(genero);
		// TODO Auto-generated constructor stub
	}

	public String getNomeDiretor() {
		return nomeDiretor;
	}

	public void setNomeDiretor(String nomeDiretor) {
		this.nomeDiretor = nomeDiretor;
	}

	public float getDuracao() {
		return duracao;
	}

	public void setDuracao(float duracao) {
		this.duracao = duracao;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public void listaInformacao() {
		System.out.print("---------------------");
		System.out.printf("%n T�tulo: %s%n"
				+ " Ano de Lan�amento: %s%n"
				+ " Coment�rio: %s%n"
				+ " Diretor: %s%n"
				+ " Dura��o: %f%n"
				+ " G�nero: %s%n",
				this.getTitulo(), this.getAnoLancamento(),
				this.getComentario(), this.getNomeDiretor(),
				this.getDuracao(), this.getGenero()
		);
		System.out.print("---------------------");
	}

}

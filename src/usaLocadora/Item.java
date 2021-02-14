package usaLocadora;

public abstract class Item {
	public String titulo;
	public String anoLancamento;
	public String comentario;
	//constructor 
	public Item (String titulo, String anoLancamento, String comentario) {
		this.setAnoLancamento(anoLancamento);
		this.setTitulo(titulo);
		this.setComentario(comentario);
	}
	
	//Setters/getters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(String anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	//abstract meted
	public abstract void listaInformacao();
}

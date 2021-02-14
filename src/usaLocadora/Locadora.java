package usaLocadora;

public class Locadora {
	
	private Disco[] listaDiscos;
	private Filme[] listaFilmes;
	private int d, f;
	
	public Locadora() {
		this.listaDiscos = new Disco[2];
		this.listaFilmes = new Filme[2];
		this.d = 0;
		this.f = 0;
		
	}
	public void novoDisco(Disco d) {
		for(this.d = 0; this.d < this.listaDiscos.length; this.d ++) {
			if(this.listaDiscos[this.d] == null) {
				this.listaDiscos[this.d] = d;
				break;
			}
		}
	}
	public void listarDiscos() {
		for(this.d = 0; this.d < this.listaDiscos.length; this.d ++) {
			System.out.printf("%n Informações do Disco %d%n", this.d + 1);
			this.listaDiscos[this.d].listaInformacao();
		}
	}
	public void novoFilme(Filme f) {
		for(this.f = 0; this.f < this.listaFilmes.length; this.f ++) {
			if(this.listaFilmes[this.f] == null) {
				this.listaFilmes[this.f] = f;
				break;
			}
		}
	}
	public void listarFilmes() {
		for(this.f = 0; this.f < this.listaFilmes.length; this.f ++) {
			System.out.printf("%n Informações do Filme %d%n", this.f + 1);
			this.listaFilmes[this.f].listaInformacao();
		}
	}
	
}

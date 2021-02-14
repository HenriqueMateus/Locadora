package usaLocadora;

public class LocadoraMain {

	public static void main (String[] args) {
		// TODO Auto-generated method stub
		Locadora usaLocadora = new Locadora();
		
		Disco sambaSocialClube = new Disco("Samba Social Clube 5", "2014", "V�rios Sambas", "V�rios Artistas", 12, "CD");
		usaLocadora.novoDisco(sambaSocialClube);
		Disco podeEntrar = new Disco("Pode Entrar", "2009", "Ivete e Convidados", "Ivete Sangalo", 14, "DVD");
		usaLocadora.novoDisco(podeEntrar);
		Filme smurfs2 = new Filme("Smurfs 2", "2013", "Gargamel cria a vers�o malvada dos Smurfs", "Raja Gosnell", 140, "Anima��o");
		usaLocadora.novoFilme(smurfs2);
		Filme mercenarios2 = new Filme("Os mercen�rios 2", "2012", "De volta o mundo","Simon West" ,210, "Anima��o");
		usaLocadora.novoFilme(mercenarios2);
		
		usaLocadora.listarDiscos();
		usaLocadora.listarFilmes();
	}

}

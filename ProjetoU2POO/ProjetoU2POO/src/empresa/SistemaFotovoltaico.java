package empresa;

public class SistemaFotovoltaico {
	private int Npaineis, Ninversores;
	private double potenciaPlaca, potenciaInversor;
	public SistemaFotovoltaico() {
	}
	
	public void setNpaineis(int npaineis) {
		Npaineis = npaineis;
	}

	public void setNinversores(int ninversores) {
		Ninversores = ninversores;
	}

	public int getNpaineis() {
		return Npaineis;
	}
	public int getNinversores() {
		return Ninversores;
	}

	//Métodos
	
	//Nesse método, o funcionário pode passar o valor da potencia da placa e do inversor diretamente
	//ou
	//através de placa e inversor que o cliente deseja adquirir, dados preços.
	public void calcularDimensionamento(int consumoMensal, double potenciaPlaca, double potenciaInversor, double irradiacao) {
		 setNpaineis((int)Math.ceil((consumoMensal)/(irradiacao*potenciaPlaca*30)));
		 setNinversores((int)Math.ceil((getNpaineis()*potenciaPlaca)/potenciaInversor));
		
		System.out.println("Número de paineis necessários: " + getNpaineis());
		System.out.println("Número de inversores necessários: " + getNinversores());
	}
}

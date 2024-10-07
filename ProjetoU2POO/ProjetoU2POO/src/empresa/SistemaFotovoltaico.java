package empresa;

import cliente.Projeto;

public class SistemaFotovoltaico {
	private int Npaineis, potenciaPlaca;
	public SistemaFotovoltaico() {
		
	}
	
	public void calcularDimensionamento(Projeto projeto, double irradiacao) {
		for (Equipamentos equipamento : projeto.getEquipamentos()) {
			
		}
		Npaineis = (consumoMensal)/(irradiacao*potenciaPlaca*30);
	}
}

package cliente;

import java.util.ArrayList;
import java.util.List;

import empresa.Equipamentos;

public class Projeto {
	private Cliente cliente;
	private int consumoMedio;
	private List<Equipamentos> equipamentos;
	
	public Projeto(Cliente cliente, int consumoMedio) {
		this.cliente = cliente;
		this.consumoMedio = consumoMedio;
		this.equipamentos = new ArrayList<>();
	}

	public Cliente getCliente() {
		return cliente;
	}

	public int getConsumoMedio() {
		return consumoMedio;
	}

	public List<Equipamentos> getEquipamentos() {
		return equipamentos;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setConsumoMedio(int consumoMedio) {
		this.consumoMedio = consumoMedio;
	}

	public void setEquipamentos(List<Equipamentos> equipamentos) {
		this.equipamentos = equipamentos;
	}
}

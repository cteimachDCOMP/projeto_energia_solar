package main;

import cliente.Cliente;
import cliente.RequisicaoProjeto;
import empresa.Fabricante;
import empresa.Inversor;
import empresa.PlacaSolar;

import java.util.ArrayList;

public class SistemaEnergia {
    private ArrayList<Cliente> clientes;
    private ArrayList<RequisicaoProjeto> projetos;
    private ArrayList<Fabricante> fabricantes;
    private ArrayList<PlacaSolar> placasSolares;
    private ArrayList<Inversor> inversores;

    public SistemaEnergia() {
        this.clientes = new ArrayList<>();
        this.projetos = new ArrayList<>();
        this.fabricantes = new ArrayList<>();
        this.placasSolares = new ArrayList<>();
        this.inversores = new ArrayList<>();
    }

    // Getters e Setters
    public ArrayList<Cliente> getClientes() {
    	return clientes; 
    	}
    public void setClientes(ArrayList<Cliente> clientes) { 
    	this.clientes = clientes; 
    	}

    public ArrayList<RequisicaoProjeto> getProjetos() { 
    	return projetos; 
    	}
    public void setProjetos(ArrayList<RequisicaoProjeto> projetos) { 
    	this.projetos = projetos; 
    	}

    public ArrayList<Fabricante> getFabricantes() { 
    	return fabricantes; 
    	}
    public void setFabricantes(ArrayList<Fabricante> fabricantes) { 
    	this.fabricantes = fabricantes; 
    	}

    public ArrayList<PlacaSolar> getPlacasSolares() { 
    	return placasSolares; 
    	}
    public void setPlacasSolares(ArrayList<PlacaSolar> placasSolares) { 
    	this.placasSolares = placasSolares; 
    	}

    public ArrayList<Inversor> getInversores() { 
    	return inversores; 
    	}
    public void setInversores(ArrayList<Inversor> inversores) { 
    	this.inversores = inversores; 
    	}
}

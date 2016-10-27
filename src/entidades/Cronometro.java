package entidades;

import java.util.ArrayList;

public class Cronometro {
	
	public int tiempoSim;
	public int tiempoD;
	public ArrayList<Integer> N;
	
	public Cronometro(){
	}
	public Cronometro(int tiempoSim, int tiempoD) {
		super();
		this.tiempoSim = tiempoSim;
		this.tiempoD = tiempoD;
	}


	public double getTiempoSim() {
		return tiempoSim;
	}
	
	
	public int getTiempoD() {
		return tiempoD;
	}
	
	public void setTiempoD(int tiempoD) {
		this.tiempoD = tiempoD;
	}
	
	public void inicializar(int cantidadClientesSistema){
		this.tiempoSim= 0;
		this.N = new ArrayList<Integer>();
		for(int i = 0;i<=cantidadClientesSistema;i++){
			this.N.add(i,0);
		}
	}

	public void iterador (int tiempoD)throws Exception{
		Thread.sleep(tiempoD);
		this.tiempoSim= this.tiempoSim+1;
	}
	
	public double solTiempo(){
		return this.tiempoSim;
	}
	
	public void display(){
		System.out.println(this.tiempoD);
	}
	
	public void estaActualizar(int numClienteEnElSistema){
		this.N.set(numClienteEnElSistema, (this.N.get(numClienteEnElSistema)+1));
	}
	
	public void estaObtener(){
		for(int i = 0;i<this.N.size();i++){
			if (this.N.get(i)!= 0)
            System.out.println("Se obtuvo "+ this.N.get(i)+ " veces la cantidad de clientes "+ i);
		}
	}
}

package test;
import entidades.Cronometro;
public class TestSistema {

	public static void main(String[] args) throws Exception {
		
		Cronometro cronos = new Cronometro();
		cronos.inicializar(10);//Aca indicas la cantidad de clientes que va a tener el sistema
		cronos.estaActualizar(0);
		System.out.println(cronos.tiempoSim);
		cronos.iterador(2000);
		cronos.estaActualizar(5);//Actualizas que hubo 5 clientes
		System.out.println(cronos.tiempoSim);
		cronos.iterador(2000);
		cronos.estaActualizar(5);//Actualizas que hubo 5 clientes de nuevo
		System.out.println(cronos.tiempoSim);
		cronos.estaObtener();//Obtenes las estadisticas
	}

}

package paquete_inicial;

public class Contador {
	
	private int contador;

	public Contador(int contador) {
		super();
		this.contador = contador;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

	@Override
	public String toString() {
		return "Contador [contador=" + contador + "]";
	}
	
}
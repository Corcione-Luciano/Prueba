
public class Enemigo {
	private String nombre;
	private int vida;
	private int da�oAtaque;
	
	public Enemigo(String n) {
		this.nombre = n;
		this.vida = 100;
		this.da�oAtaque = 5;
	}
	
	public Enemigo(String n, int vida, int da�o) {
		this.nombre = n;
		this.vida = vida;
		this.da�oAtaque = da�o;
	}

	public void recibirDa�o(int da�o) {
		this.vida -= da�o;
		
		if(this.vida < 0) {
			this.vida = 0;
			this.da�oAtaque = 0;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public int getVida() {
		return vida;
	}

	public int getDa�oAtaque() {
		return da�oAtaque;
	}
	
	@Override
	public String toString() {
		return this.nombre + ", vida: " + this.vida;
	}
	
}

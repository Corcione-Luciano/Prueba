
public class Enemigo {
	private String nombre;
	private int vida;
	private int dañoAtaque;
	
	public Enemigo(String n) {
		this.nombre = n;
		this.vida = 100;
		this.dañoAtaque = 5;
	}
	
	public Enemigo(String n, int vida, int daño) {
		this.nombre = n;
		this.vida = vida;
		this.dañoAtaque = daño;
	}

	public void recibirDaño(int daño) {
		this.vida -= daño;
		
		if(this.vida < 0) {
			this.vida = 0;
			this.dañoAtaque = 0;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public int getVida() {
		return vida;
	}

	public int getDañoAtaque() {
		return dañoAtaque;
	}
	
	@Override
	public String toString() {
		return this.nombre + ", vida: " + this.vida;
	}
	
}

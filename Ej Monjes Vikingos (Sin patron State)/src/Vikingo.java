
public class Vikingo {
	
	private String estado = "Normal";
	private String nombre;
	private int vida = 100;
	private int da�oAtaque = 10;
	
	public Vikingo(String n) {
		this.nombre = n;
	}
	public Vikingo() {
		this.nombre = "Ragnar";		// por defecto todos los vikingos se llaman Ragnar
	}
	
	public void recibirDa�o(Vikingo x) {
		if(estado.equals("Normal") && x.vida > 0){
			this.estado = "Colerico";
			this.da�oAtaque = 20;
			this.vida -= x.da�oAtaque;
		}else {
			if(estado.equals("Colerico") && x.vida > 0) {
				this.estado = "Berserker";
				this.da�oAtaque = 30;
				this.vida -= 2* x.da�oAtaque;
			}else {
				if(estado.equals("Berserker") && x.vida > 0) {
					this.vida -= 0.5 * x.da�oAtaque;
				}
			}
				
		}
		
		if(this.vida < 1) {
			this.estado = "Muerto";
			this.vida = 0;
		}
	}
	
	public void meditar() {
		if(estado.equals("Normal")){
			this.estado = "Calmado";
			this.da�oAtaque = 10;
		}else {
			if(estado.equals("Colerico")  ||  estado.equals("Berserker")){
				this.estado = "Normal";
				this.da�oAtaque = 10;
			}
		}
	}
	
	public void atacar(Vikingo x) {
		x.recibirDa�o(this);
		if(estado.equals("Calmado")){
			this.estado = "Normal";
		}
		
		
	}
	
	@Override
	public String toString() {
		return this.nombre + ", estado: " + this.estado + ", vida: " + this.vida;
	}
	
	public static void main(String[] args) {
		Vikingo c1 = new Vikingo("Heinze");
		Vikingo c2 = new Vikingo("Samuel");
		
		System.out.println(c1);
		System.out.println(c2);
		c1.recibirDa�o(c2);
		System.out.println("*************************");
		System.out.println(c1);
		System.out.println(c2);
		c2.recibirDa�o(c1);
		System.out.println("*************************");
		System.out.println(c1);
		System.out.println(c2);
		c2.recibirDa�o(c1);
		System.out.println("*************************");
		System.out.println(c1);
		System.out.println(c2);
		c2.recibirDa�o(c1);
		System.out.println("*************************");
		System.out.println(c1);
		System.out.println(c2);
		c2.meditar();
		System.out.println("*************************");
		System.out.println(c2);
		c2.meditar();
		System.out.println("*************************");
		System.out.println(c1);
		System.out.println(c2);
		c2.atacar(c1);
		System.out.println("*************************");
		System.out.println(c1);
		System.out.println(c2);
	}

}

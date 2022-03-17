public class Carti {
	int pagina;
	public Carti(int pagina)
	{
		this.pagina = pagina;

	}
	@Override
	public String toString() {
		return "Cartea are [" + "" + pagina + "] de pagina ";
	}
	
	public boolean equals(Carti c) {
		if((this.pagina==c.pagina))
			return true;
		return false;
	}
	
}

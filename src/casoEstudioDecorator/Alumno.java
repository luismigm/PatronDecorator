package casoEstudioDecorator;

public abstract class Alumno {
	String nombre = "Alumno genérico";
	boolean pegatina;
	public Alumno ()
	{
		pegatina = false;
	}
	public boolean getPegatina ()
	{
		return pegatina;
	}
	public void setPegatina (boolean pegatina)
	{
		this.pegatina = pegatina;
	}
	public String getNombre()
	{
		return nombre;
	}
}

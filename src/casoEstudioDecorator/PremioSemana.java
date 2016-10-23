package casoEstudioDecorator;

public class PremioSemana extends Premio{
	String titulo;
	Alumno alumno;
	public PremioSemana(Alumno alumno) {

		// TODO Auto-generated constructor stub
		super(nombre);
		titulo = null;
		this.alumno = alumno;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean getPegatina() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setPegatina(boolean pegatina) {
		// TODO Auto-generated method stub
		
	}
	public void setTitulo(String titulo)
	{
		this.titulo = titulo;
	}
	public String getTitulo()
	{
		return titulo;
	}

}

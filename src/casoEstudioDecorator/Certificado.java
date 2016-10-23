package casoEstudioDecorator;

public class Certificado extends Premio{
	boolean certificado;
	public Certificado(String nombre, boolean certificado) {
		// TODO Auto-generated constructor stub
		super(nombre);
		this.certificado = certificado;
	}



	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return super.nombre;
	}

	@Override
	public boolean getPegatina() {
		// TODO Auto-generated method stub
		return super.pegatina;
	}

	@Override
	public void setPegatina(boolean pegatina) {
		// TODO Auto-generated method stub
		super.pegatina = pegatina;
	}
	public void setCertificado(boolean certificado)
	{
		this.certificado = certificado;
	}
	public String getCertificado()
	{
		if(certificado)
		{
			return "Tiene certificado";
		}
		return "No tiene certificado";
	}
}

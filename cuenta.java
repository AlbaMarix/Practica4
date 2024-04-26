package entidadFinanciera;

public class cuenta
{
	private String nombre;
	private String cuenta;
	private double saldo;
	private double tipoInteres;

	public cuenta(){}

	public cuenta(String nom, String cue, double sal, double tipo)
	{
		nombre=nom;
		cuenta=cue;
		saldo=sal;
	}

	public double estado()
	{
		return this.saldo;
	}

	public void ingresar(double cantidad) throws Exception
	{
		if(cantidad<0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		saldo=saldo+cantidad;
	}

	public void retirar(double cantidad) throws Exception
	{
		if(cantidad <=0)
			throw new Exception("No se puede retirar una cantidad negativa");
		if (saldo<cantidad)
			throw new Exception("No hay suficiente saldo");
		saldo=saldo-cantidad;
	}
}


package es.studium.interfaces;

public class Acumulador implements IModificacion, INumerico, IConstantes  //para implementar una interfaz: nos saldrá un error en el nombre de la clase, pulsamos sobre el nombre y le damos a la opción de add unimplements methods (podemos implementar todas las interfaces que queramos)
{
	private int valor; //getters and setters
	
	public Acumulador(int i) //constructor por parámetros
	{
		valor = i;
	}

	public int getValor()
	{
		return valor;
	}

	public void setValor(int valor)
	{
		this.valor = valor;
	}

	@Override
	public void incremento(int a)
	{
		valor = valor + a; //valor += a;
	}

	@Override
	public void setPrecision(int p)
	{
		valor = p;

	}

	@Override
	public void setMaximo(int m)
	{
		valor = m;

	}

}


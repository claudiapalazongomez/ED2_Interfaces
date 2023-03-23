package es.studium.interfaces;

public class Principal
{

	public static void main(String[] args)
	{
		//POLIFORMISMO
		Acumulador acumulador1 = new Acumulador(10); //instanciamos el objeto y le damos al atributo el valor 10
		acumulador1.incremento(15);
		System.out.println(acumulador1.getValor());
		
		//Seguimos llamando a los métodos
		acumulador1.setPrecision(12);
		acumulador1.setMaximo(50);
		acumulador1.setValor(INumerico.NUMERO_E); //Aquí le pasamos las constantes que se encuentran en la interfaz
		acumulador1.setValor(IConstantes.VALOR_MAXIMO);
		acumulador1.setValor(IConstantes.VALOR_MINIMO);
		
		//IModificacion acumulador2 = new IModificacion() //no se puede hacer porque las interfaces NO tienen constructores
		IModificacion acumulador2 = new Acumulador(12); //utilizamos la interfaz como tipo de dato de la referencia al objeto 
		acumulador2.incremento(24); //solo podemos obtener este método por tratarse de una interfaz
		
		INumerico acumulador3 = new Acumulador(24);
		acumulador3.setPrecision(10);
		acumulador3.setMaximo(100);
		
		IConstantes acumulador4 = new Acumulador(10);
	}

}

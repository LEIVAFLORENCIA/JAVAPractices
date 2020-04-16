package poo;
import java.util.*;

public class UsoEmpleado {
	public static void main(String[] args) {
		
		/*Empleado empleado1=new Empleado("Leandro Perez", 85000, 1990, 12, 17);
		Empleado empleado2=new Empleado("Ana Lopez", 95000, 1995, 06, 02);
		Empleado empleado3=new Empleado("Maria Martin", 10500, 2002, 03, 15);
		
		empleado1.subeSueldo(5);
		empleado2.subeSueldo(5);
		empleado3.subeSueldo(5);
		
		System.out.println("Nombre: " + empleado1.dimeNombre() + " Sueldo: " + empleado1.dimeSueldo()
		+ " Fecha de Alta: " + empleado1.dimeAltaContrato());
		
		System.out.println("Nombre: " + empleado2.dimeNombre() + " Sueldo: " + empleado2.dimeSueldo()
		+ " Fecha de Alta: " + empleado2.dimeAltaContrato());
		
		System.out.println("Nombre: " + empleado3.dimeNombre() + " Sueldo: " + empleado3.dimeSueldo()
		+ " Fecha de Alta: " + empleado3.dimeAltaContrato());*/
		
		//Mas eficiente hacerlo con un array
		Empleado[] misEmpleados=new Empleado[3];
	
		misEmpleados[0]=new Empleado("Leandro Perez", 85000, 1990, 12, 17);
		misEmpleados[1]=new Empleado("Ana Lopez", 95000, 1995, 06, 02);
		misEmpleados[2]=new Empleado("Maria Marton", 10500, 2002, 03, 15);
		
		for(Empleado e: misEmpleados) {
			e.subeSueldo(5);
		}
		
		for(Empleado e: misEmpleados) {
			System.out.println("Nombre: " + e.dimeNombre() + " Sueldo: " + e.dimeSueldo()
					+ " Fecha de Alta: " + e.dimeAltaContrato());

		// Podriamos hacerlo con un bucle FOR
		/*for(int i=0; i<misEmpleados.length; i++) {
			misEmpleados[i].subeSueldo(5);
		}
		for(int i=0; i<misEmpleados.length; i++) {
			System.out.println("Nombre: " + misEmpleados[i].dimeNombre() + " Sueldo: " + misEmpleados[i].dimeSueldo()
					+ " Fecha de Alta: " + misEmpleados[i].dimeAltaContrato());
		}*/
		}
	}
}


class Empleado{
	
	//CONSTRUCTOR
	public Empleado(String nom, double sue, int anio, int mes, int dia) {
		
		nombre=nom;
		sueldo=sue;
		GregorianCalendar calendario=new GregorianCalendar(anio, mes-1, dia); //-1 porque Enero seria 0
		altaContrato=calendario.getTime();
	}
	
	public String dimeNombre() { //GETTER
		return nombre;
	}
	
	public double dimeSueldo() { //GETTER
		return sueldo;
	}
	
	public Date dimeAltaContrato() { //GETTER
		return altaContrato;
	}
	
	public void subeSueldo(double porcentaje) { //SETTER
		
		double aumento=sueldo*porcentaje/100;
		sueldo+=aumento;
	}
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
}
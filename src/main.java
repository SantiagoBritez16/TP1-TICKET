import java.util.Date;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		java.util.Date fecha = new Date();
	
		String nombre;
		String domicilio;
		double cant1 = 0;
		double cant2 = 0;
		String descripcion1;
		String descripcion2;
		double pUnit1 = 0;
		double pUnit2 = 0;
		
		
		
		
		System.out.println("Ingrese nombre del cliente");
		nombre = scan.nextLine();
		System.out.println("Ingrese domicilio del cliente");
		domicilio = scan.nextLine();
		System.out.println("Ingrese descripcion");
		descripcion1 = scan.nextLine();
		System.out.println("Ingrese cantidad");
		cant1 = scan.nextDouble();
	    System.out.println("Ingrese precio");
	    pUnit1 = scan.nextDouble();
	    scan.nextLine();
	    System.out.println("Ingrese descripcion");
	    descripcion2 = scan.nextLine();
		System.out.println("Ingrese cantidad");
		cant2 = scan.nextDouble();
	    System.out.println("Ingrese precio");
	    pUnit2 = scan.nextDouble();
	    
	    double pTotal1 = pUnit1*cant1;
		double pTotal2 = pUnit2*cant2;
		double subtotal= pTotal1 + pTotal2;
		double iva= subtotal * 0.21;
		double total= subtotal + iva;
		
		
		System.out.println("*************************************************************************************");
	    System.out.println("Fecha:" + fecha);
		System.out.println("*************************************************************************************");
		System.out.println("Nombre:" + nombre);
		System.out.println("Domicili:" + domicilio);
		System.out.println("*************************************************************************************");
		System.out.println("Cant \t |Descripcion \t |P.unit \t |P.total");
		System.out.println(cant1 + "\t |" +  descripcion1 + "\t\t |"+ pUnit1 + "\t\t |" + pTotal1);
		System.out.println(cant2 + "\t |" +  descripcion2 + "\t\t |"+ pUnit2 + "\t\t |" + pTotal2);
		System.out.println("*************************************************************************************");
		System.out.println("Iva:" + iva);
		System.out.println("Subtotal(Sin iva):" + subtotal);
		System.out.println("Total:" + total);
		System.out.println("*************************************************************************************");
}
}


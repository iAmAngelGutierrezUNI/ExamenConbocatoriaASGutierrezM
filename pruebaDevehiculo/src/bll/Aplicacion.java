package bll;

import java.util.Scanner;

public class Aplicacion {
	private Scanner scan = new Scanner(System.in);
	public void MostrarOpciones() {
		System.out.println("1......Comprar vehiculo......");
		System.out.println("2......Realizar servicio adicional......");
		System.out.println("3......salir......");
		
		
	}
	public void run() {
		String opc;
		MostrarOpciones();
		
		opc = scan.nextLine();
		
		switch (opc) {
		case "1": 
			System.out.println("opcion para comprar vehiculo.");
			run();
			break;
		case "2": 
			System.out.println("servicio adicional.");
			run();
			break;
		case "3": 
			System.exit(0);
			break;

		default: 
			System.out.println("opcion invalida.");
			run();
			break;
		}
	}
}

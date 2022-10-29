package ui;

import java.util.List;
import java.util.Scanner;

import dol.Vehiculo;

public class formaVehiculo {
	private Scanner scan = new Scanner(System.in);
	private Vehiculo carro;
	private List<Vehiculo>listaCaro;
	public formaVehiculo(Scanner scan) {
		super();
		this.scan = scan;
	}
	public formaVehiculo(Vehiculo carro) {
		super();
		this.carro = carro;
	}
	public formaVehiculo(List<Vehiculo> listaCaro) {
		super();
		this.listaCaro = listaCaro;
	}
	public Vehiculo CrearVehiculo() {
		String opc;
		Vehiculo carro = new Vehiculo();
		System.out.println("Por favor dijite modelo del Vehiculo.");
		marcas();
		opc = scan.nextLine();
		switch (opc) {
		case "1": 
			carro.setMarca("Toyota");
			break;
		case "2": 
			carro.setMarca("Kia");
			break;
		case "3":
			carro.setMarca("Audi");
			break;
		case "4":
			carro.setMarca("Hyuday");
			break;
		case "5":
			carro.setMarca("Roll Royse");
			break;
		case "6":
			carro.setMarca("Otros");
			break;
			
		default:
			System.out.println("opcion invalida.");
			 CrearVehiculo();
		}
		return carro;
		
		
	}
	public void marcas() {
		System.out.println("1. Toyota");
		System.out.println("2.Kia");
		System.out.println("3. Audi");
		System.out.println("4. Hyuday");
		System.out.println("5. Roll Royse");
		System.out.println("6. Otros");
		}
}

package dol;

public class Vehiculo {
	private String marca;
	private String madelo;
	private String año;
	private String chasis;
	private String placa;
	public Vehiculo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vehiculo(String marca, String madelo, String año, String chasis, String placa) {
		super();
		this.marca = marca;
		this.madelo = madelo;
		this.año = año;
		this.chasis = chasis;
		this.placa = placa;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getMadelo() {
		return madelo;
	}
	public void setMadelo(String madelo) {
		this.madelo = madelo;
	}
	public String getAño() {
		return año;
	}
	public void setAño(String año) {
		this.año = año;
	}
	public String getChasis() {
		return chasis;
	}
	public void setChasis(String chasis) {
		this.chasis = chasis;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	
	

}

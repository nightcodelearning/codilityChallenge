package com.zoologico;

public class Perro extends Animal implements Habilidades{

	private String nombrePerro;
	private int edadPerro;
	
	public String getNombrePerro() {
		return nombrePerro;
	}

	public void setNombrePerro(String nombrePerro) {
		this.nombrePerro = nombrePerro;
	}

	public int getEdadPerro() {
		return edadPerro;
	}

	public void setEdadPerro(int edadPerro) {
		this.edadPerro = edadPerro;
	}

	@Override
	public void getClasificacion() {
		System.out.println("clasificacion del perro = mamifero");
		
	}

	@Override
	public void hablar() {
		System.out.println("el perro ladra");// TODO Auto-generated method stub
		
	}

	@Override
	public void romperCosas() {
		System.out.println("el perro rompe el control remoto");
		
	}

	@Override
	public void hacerNecesidades() {
		System.out.println("el perro orina en el patio");
		
	}

	@Override
	public String hacerTruco() {
		String valor="";
		valor= "el perro salta";
		return valor;
	}
	
	
	

}

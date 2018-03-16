package com.zoologico;

public abstract class Animal  {
	
	public int numPatas;
	
	public boolean esDomestico=false;
	
	public String genero="";
	
	public abstract void getClasificacion();
	
	
	public void getAlimento() {
		System.out.println("Alimento desde clase animal");
	}

}

package com.formulario.devops;

import java.sql.Date;

@SuppressWarnings("unused")
public class User {
  

    
    private float impuesto;
    int sueldo;
    int ahorro;
    int diezxciento;
    
    public int getDiezxciento() {
		return diezxciento;
	}

	public void setDiezxciento(int diezxciento) {
		this.diezxciento = diezxciento;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	int saldo;
    
    public double getImpuesto() {
		return impuesto;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	public int getAhorro() {
		return ahorro;
	}

	public void setAhorro(int ahorro) {
		this.ahorro = ahorro;
	}

	public void setImpuesto(float impu) {
		this.impuesto = impu;
	}

	     
    // override toString()
 
}
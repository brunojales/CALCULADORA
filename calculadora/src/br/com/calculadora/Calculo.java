package br.com.calculadora;

public class Calculo {
	/**TESTANDO A CONFIG DO TOKEN DO GIT**/
	
	public double x;
	public double y;
	public double result;
	public String operador;
	
	public double somar () {
		this.result = this.x + this.y;
		return this.result;	
	}
	
	public double subtrair() {
		this.result = this.x - this.y;
		return this.result;
	}
	
	public double multiplicar(){
		this.result = this.x * this.y;
		return this.result;
	}
	
	public double dividir() {
		this.result = this.x / this.y;
		return this.result;
	}
	
	
	
}

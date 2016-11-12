# estructuraDatos

//Clase Aplicacion

/*********************Estructura de Datos*****************
 * Nombre: Carlos Aguirre
 * Grupo: GR1
 * Fecha: 12-11-2016
*/

package ejercicio1;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Aplicacion {

	public static void main (String args[]){

		Aplicacion aplicacion= new Aplicacion();

		String dato="";
		int cantidadPuntos;
		int componenteX=0;
		int componenteY=0;
		Scanner in=new Scanner(System.in);


		System.out.println("Ingrese el numero de puntos que desea ingresar : ");

		dato=in.nextLine();
		aplicacion.validarDato(dato);	

		cantidadPuntos=Integer.parseInt(dato);
		
		if(cantidadPuntos<0){

			System.out.println("No existen cantidades de puntos negativas ");
			return;

		}

		Punto[] puntos = new Punto[cantidadPuntos];
		
		for(int i=0; i<cantidadPuntos; i++){

			System.out.println("Punto "+ (i+1) + ": \nX:");
			dato=in.nextLine();
			aplicacion.validarDato(dato);
			componenteX=Integer.parseInt(dato);
			
			dato="";
			
			System.out.println("Y:");
			dato=in.nextLine();
			aplicacion.validarDato(dato);
			componenteY=Integer.parseInt(dato);
			
			puntos[i] = new Punto(componenteX, componenteY);

		}
		
		System.out.println("Puntos Ingresados : ");

		for(int i=0; i<cantidadPuntos; i++){

			System.out.println("Punto "+ (i+1) +" :"+ puntos[i].toString());

		}

		
		if(cantidadPuntos>5){

			System.out.println("No se aceptan figuras con mas de 4 vértices");

		}
		
		System.out.println("Ha ingresado: "+ aplicacion.verificarTipoFigura(puntos));
		
		aplicacion.ingresoFiguraYCalculoArea(puntos);


	}

	public void validarDato(String dato){

		if(dato==""){

			System.out.println("No ha ingresado ningun dígito numérico");
			JOptionPane.showMessageDialog(null,"No ha ingresado ningun digito numérico", "Error al ingresar dato",0);
			return;

		}

		try{

			Integer.parseInt(dato);

		}catch(Exception error){

			System.out.println("No ha ingresado ningun dígito numérico");
			return;

		}

	}

	public void ingresoFiguraYCalculoArea(Punto[] puntos){

		if(puntos.length==2){

			Circulo circulo= new Circulo();

			circulo.setPuntoCentro(puntos[0]);
			circulo.setRadio(Math.sqrt(Math.pow((puntos[1].getX()-puntos[0].getX()), 2)+Math.pow((puntos[1].getY()-puntos[0].getY()), 2)));

			System.out.println("El área del círculo es: "+circulo.calcularArea());


		}

		if(puntos.length==3){

			Triangulo triangulo= new Triangulo();

			triangulo.setPunto1(puntos[0]);
			triangulo.setPunto2(puntos[1]);
			triangulo.setPunto3(puntos[2]);

			System.out.println("El área del triángulo es: "+triangulo.calcularArea());
		}

		if(puntos.length==4 && Math.sqrt(Math.pow((puntos[1].getX()-puntos[0].getX()), 2)+Math.pow((puntos[1].getY()-puntos[0].getY()), 2))==Math.sqrt(Math.pow((puntos[3].getX()-puntos[2].getX()), 2)+Math.pow((puntos[3].getY()-puntos[2].getY()), 2))){

			Rectangulo rectangulo= new Rectangulo();

			rectangulo.setPunto1(puntos[0]);
			rectangulo.setPunto2(puntos[1]);
			rectangulo.setPunto3(puntos[2]);
			rectangulo.setPunto4(puntos[3]);

			System.out.println("Ha ingresado un rectángulo: ");
			
			System.out.println("El área del rectángulo es: "+rectangulo.calcularArea());
		}else{
			
			System.out.println("No se aceptan cuadrilateros irregulares");
			return;
		}
	}

	public String verificarTipoFigura(Punto[] puntos){

		if(puntos.length==1)
			return "punto";

		if(puntos.length==2)
			return "circulo";


		if(puntos.length==3)
			return "triangulo";


		if(puntos.length==4)
			return "cuadrilatero";

		return "";
	}

}


//Clase Punto
package ejercicio1;

public class Punto{

	private int x;
	private int y;
	
	public Punto(){
		
		x=y=0;
	}
	
	
	public Punto(int x,int y ){
		
		this.x = x;
		this.y = y;
		
	}
	
	
	
	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
	
		
}

//Clase Rectangulo
package ejercicio1;

public class Rectangulo extends FiguraGeometrica {
	
	private Punto punto1;
	private Punto punto2;
	private Punto punto3;
	private Punto punto4;
	
	public Rectangulo(){
	
	punto1= new Punto(0, 0);
	punto2= new Punto(1, 0);
	punto3= new Punto(0, 1);
	punto4= new Punto(1, 1);
	
	}	
	
	public Rectangulo(Punto punto1, Punto punto2,Punto punto3,Punto punto4){
		
	this.punto1= punto1;
	this.punto2= punto2;
	this.punto3= punto3;
	this.punto4= punto4;
		
	}

	public Punto getPunto1() {
		return punto1;
	}

	public void setPunto1(Punto punto1) {
		this.punto1 = punto1;
	}

	public Punto getPunto2() {
		return punto2;
	}

	public void setPunto2(Punto punto2) {
		this.punto2 = punto2;
	}

	public Punto getPunto3() {
		return punto3;
	}

	public void setPunto3(Punto punto3) {
		this.punto3 = punto3;
	}

	public Punto getPunto4() {
		return punto4;
	}

	public void setPunto4(Punto punto4) {
		this.punto4 = punto4;
	}

	@Override
	public String toString() {
		return "Rectangulo; \nPunto1= (" + punto1 + ") \nPunto2= (" + punto2 + 
				") \nPunto3= (" + punto3 + ") \nPunto4= (" + punto4 + ")";
	}
	
	public double calcularArea(){
		
		double AreaCalculada=0;
		double Base=0;
		double Altura=0;
		
		Base=Math.sqrt(Math.pow(punto2.getX()-punto1.getX(), 2))+(Math.pow(punto2.getY()-punto1.getY(), 2));
		
		Altura=Math.sqrt(Math.pow(punto3.getX()-punto2.getX(), 2))+(Math.pow(punto3.getY()-punto2.getY(), 2));
		
		AreaCalculada=Altura*Base;
		
		return AreaCalculada;
		
	}

}

//CLase Circulo
package ejercicio1;

public class Circulo extends FiguraGeometrica{
	
	private Punto puntoCentro;
	private double radio;

	
	public Circulo(){
		
		this.puntoCentro=new Punto();
		this.radio=1;
		
	}
	
	public Circulo(Punto puntoCentro, double radio){
		
		this.puntoCentro=puntoCentro;
		this.radio=radio;
		
	}

	public Punto getPuntoCentro() {
		return puntoCentro;
	}

	public void setPuntoCentro(Punto puntoCentro) {
		this.puntoCentro = puntoCentro;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public String toString() {
		return "Circulo: \nCentro= (" + puntoCentro + ")  \nradio=" + radio;
	}
		
	public double calcularArea(){
		
		double AreaCalculada=0;
		
		AreaCalculada= (3.1416*Math.pow(radio, 2));
				
		return AreaCalculada;
		
		
	}
	
}

//Clase Triangulo
package ejercicio1;

public class Triangulo extends FiguraGeometrica {
	
	private Punto punto1;
	private Punto punto2;
	private Punto punto3;
	
	
	public Triangulo(){
	
	punto1= new Punto(0, 0);
	punto2= new Punto(1, 0);
	punto3= new Punto(1, 1);
		
	}	
	
	public Triangulo(Punto punto1, Punto punto2,Punto punto3){
		
	this.punto1= punto1;
	this.punto2= punto2;
	this.punto3= punto3;
			
	}

	public Punto getPunto1() {
		return punto1;
	}

	public void setPunto1(Punto punto1) {
		this.punto1 = punto1;
	}

	public Punto getPunto2() {
		return punto2;
	}

	public void setPunto2(Punto punto2) {
		this.punto2 = punto2;
	}

	public Punto getPunto3() {
		return punto3;
	}

	public void setPunto3(Punto punto3) {
		this.punto3 = punto3;
	}

	@Override
	public String toString() {
		return "Triangulo [punto1=" + punto1 + ", punto2=" + punto2 + ", punto3=" + punto3 + "]";
	}

	public double calcularArea(){
		
		double dblAreaCalculada=0;
		double dblBase=0;
		double dblAltura=0;
		
		dblBase=Math.sqrt(Math.pow(punto2.getX()-punto1.getX(), 2))+(Math.pow(punto2.getY()-punto1.getY(), 2));
		
		dblAltura= Math.sqrt(Math.pow(punto3.getY()-punto2.getY(), 2));
		
		dblAreaCalculada=(dblBase*dblAltura)/2;
	
	return dblAreaCalculada;
	
	
}


}


//CLase Linea

package ejercicio1;

public class Linea {
	
	private Punto puntoA;
	private Punto puntoB;
	
	public Linea(){
	
	puntoA= new Punto(0,0);
	puntoB= new Punto(1,1);
	
	}
	
	public Linea(Punto puntoA, Punto puntoB){
		
	this.puntoA= puntoA;
	this.puntoB= puntoB;
		
	}

	public Punto getPuntoA() {
		return puntoA;
	}

	public void setPuntoA(Punto puntoA) {
		this.puntoA = puntoA;
	}

	public Punto getPuntoB() {
		return puntoB;
	}

	public void setPuntoB(Punto puntoB) {
		this.puntoB = puntoB;
	}

	@Override
	public String toString() {
		return "Linea \nA= (" + puntoA + ") \nB= (" + puntoB + ")";
	}

	
	
}


//Clase FiguraGeometrica

package ejercicio1;

public abstract class FiguraGeometrica {
		
	public abstract double calcularArea();

}

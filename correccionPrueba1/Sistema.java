package correccionPrueba1;

import java.util.Random;
import java.util.Scanner;

public class Sistema {

	static Profesor profesores[] = new Profesor[6];

	static Alumno alumnos[] = new Alumno[16];

	static Materia materias[]= new Materia[3]; 
	
	static String espacios = "                                                            ";

	public static void main (String[]args){

		Scanner entrada= new Scanner(System.in);
		String entr;

		ingresarDatos();

		System.out.println("Reportes Institucionales\n 1.Materias por Profesor \n2.Alumnos por Materia \n3.Alumnos por Profesor \nElija una opcion...");
		entr=entrada.nextLine();


		if(entr.equals(" ")){

			System.out.println("No ha seleccionado una opción, ingrese el número de su elección:");

		}
		if(entr.equals("1")){

			for(int i=0; i<profesores.length; i++){
				System.out.println("\nProfesor: "+profesores[i].getNombre1()+espacios.substring(0,10-profesores[i].getNombre1().length())+profesores[i].getApellido1()+ "\nMaterias:");
				materiasPorProfesor(profesores[i].getId());
			}

		}else if(entr.equals("2")){

			for(int i=0; i<materias.length; i++){
				System.out.println("\nMateria: "+materias[i].getCodigo_()+"   "+materias[i].getNombre_()+ "\nAlumnos:");
				alumnosPorMateria(materias[i].getCodigo_());
			}
		}else if(entr.equals("3")){

			for(int i=0; i<profesores.length; i++){
				System.out.println("\nProfesor: "+profesores[i].getNombre1()+" "+profesores[i].getApellido1()+ "\nAlumnos:");
				alumnosPorProfesor(profesores[i].getId());
			}
		}

	}

	public static String generarCedulas(){

		Random rnd = new Random();
		String cedula = "";

		cedula+=String.valueOf((int) Math.random()*(1999999999-1000000000)+1000000000);

		return cedula;
	}

	public static void ingresarDatos(){

		profesores[0] = new Profesor("1707364501", "Galo","Alberto","Peña","Lara",30);
		profesores[1] = new Profesor("1707364502", "Marco","Antonio","Perez","Velasquez",34);
		profesores[2] = new Profesor("1707364503", "Juan","David","Carrera","Herrera",28);
		profesores[3] = new Profesor("1707364504", "Alicia","Paulina","Hernández","Acurio",40);
		profesores[4] = new Profesor("1707364505", "Mishell","Mercedes","Velastegui","Valverde",37);
		profesores[5] = new Profesor("1707364506", "Andrea","Patricia","Loachamin","Heredia",31);

		Profesor profesoresProgram[] = new Profesor[2];
		profesoresProgram[0]=profesores[2];
		profesoresProgram[1]=profesores[4];

		Profesor profesoresCalculo[] = new Profesor[2];
		profesoresCalculo[0]=profesores[0];
		profesoresCalculo[1]=profesores[3];

		Profesor profesoresEstadistica[] = new Profesor[2];
		profesoresEstadistica[0]=profesores[1];
		profesoresEstadistica[1]=profesores[5];

		alumnos[0]= new Alumno("1707362301", "Alberto", "Bernardo", "Enriquez", "Carrera", 17);
		alumnos[1]=	new Alumno("1707362302", "Ana", "Carlina", "Silva", "Yánez", 18);
		alumnos[2]= new Alumno("1707362303", "Franciska", "Karla", "Cajas", "Plaza", 19);
		alumnos[3]= new Alumno("1707362304", "Enrique", "Fernando", "López", "Oña", 20);
		alumnos[4]= new Alumno("1707362305", "Melanie", "Mercedes", "Montenegro", "Valverde", 21);
		alumnos[5]=	new Alumno("1707362306", "Carlos", "Arturo", "Maldonado", "Aguirre", 17);
		alumnos[6]= new Alumno("1707362307", "Luis", "Antonio", "Cano", "Hernández", 18);
		alumnos[7]= new Alumno("1707362308", "Cinthia", "Alexandra", "Borja", "Maldoando", 19);
		alumnos[8]= new Alumno("1707362309", "Jessica", "Fernanda", "Carrera", "Rodriguéz", 20);
		alumnos[9]=	new Alumno("1707362310", "José", "Andrés", "Kure", "Cano", 22);
		alumnos[10]=new Alumno("1707362311", "Adré", "Marcelo", "Ortega", "Zuleta", 17);
		alumnos[11]=new Alumno("1707362312", "César", "Enriquez", "Castillo", "Silva", 18);
		alumnos[12]=new Alumno("1707362313", "Alejandra", "Mishell", "Paredes", "Mendoza", 19);
		alumnos[13]=new Alumno("1707362314", "Daysi", "Marcela", "Espín", "Díaz", 20);
		alumnos[14]=new Alumno("1707362315", "Dennise", "Laura", "Cárdenaz", "MAncero",21);
		alumnos[15]=new Alumno("1707362316", "David", "Alejandro", "Llamuca", "Aguilera", 17);

		Alumno alumnosProgram[] = new Alumno[10];
		alumnosProgram[0]=	alumnos[0];
		alumnosProgram[1]=	alumnos[2];
		alumnosProgram[2]=	alumnos[4];
		alumnosProgram[3]=	alumnos[6];
		alumnosProgram[4]=	alumnos[8];
		alumnosProgram[5]=	alumnos[10];
		alumnosProgram[6]=	alumnos[12];
		alumnosProgram[7]=	alumnos[14];
		alumnosProgram[8]=	alumnos[1];
		alumnosProgram[9]=	alumnos[3];

		Alumno alumnosCalculo[] = new Alumno[10];
		alumnosCalculo[0]=	alumnos[5];
		alumnosCalculo[1]=	alumnos[7];
		alumnosCalculo[2]=	alumnos[9];
		alumnosCalculo[3]=	alumnos[11];
		alumnosCalculo[4]=	alumnos[13];
		alumnosCalculo[5]=	alumnos[15];
		alumnosCalculo[6]=	alumnos[2];
		alumnosCalculo[7]=	alumnos[4];
		alumnosCalculo[8]=	alumnos[6];
		alumnosCalculo[9]=	alumnos[8];

		Alumno alumnosEstadistica[] = new Alumno[10];
		alumnosEstadistica[0]=	alumnos[0];
		alumnosEstadistica[1]=	alumnos[15];
		alumnosEstadistica[2]=	alumnos[1];
		alumnosEstadistica[3]=	alumnos[14];
		alumnosEstadistica[4]=	alumnos[2];
		alumnosEstadistica[5]=	alumnos[13];
		alumnosEstadistica[6]=	alumnos[3];
		alumnosEstadistica[7]=	alumnos[12];
		alumnosEstadistica[8]=	alumnos[4];
		alumnosEstadistica[9]=	alumnos[11];


		materias[0] = new Materia("Programacion",3,123,alumnosProgram, profesoresProgram);
		materias[1] = new Materia("Calculo"     ,2,456,alumnosEstadistica, profesoresCalculo);
		materias[2] = new Materia("Estadística" ,2,789,alumnosCalculo, profesoresEstadistica);

	}

	public static void materiasPorProfesor(String idProfesor){

		for(int i=0; i<materias.length;i++){

			for(int j=0; j<materias[i].getProfesores().length;j++){
				if(materias[i].getProfesores()[j].getId().equals(idProfesor))
					System.out.println(materias[i].getCodigo_()+espacios.substring(0, 10-String.valueOf(materias[i].getCodigo_()).length())+materias[i].getNombre_());
			}
		}

	}

	public static void alumnosPorMateria(int codigoMateria){

		for(int j=0; j<materias.length;j++){

			for(int i=0; i<materias[j].getAlumnos().length;i++){

				System.out.println(materias[j].getAlumnos()[i].getNombre1()+espacios.substring(0, 10-materias[j].getAlumnos()[i].getNombre1().length())+materias[j].getAlumnos()[i].getApellido1());

			}

		}

	}

	public static void alumnosPorProfesor(String idProfesor){

		for(int i=0; i<materias.length;i++){
			
			for(int j=0; j<materias[i].getProfesores().length;j++){
				
				if(materias[i].getProfesores()[j].getId().equals(idProfesor)){
					
					for(int k=0; k<materias[i].getAlumnos().length;k++){
						
						System.out.println((k+1)+espacios.substring(0, 3-String.valueOf(k+1).length())+materias[i].getAlumnos()[k].getNombre1()+espacios.substring(0, 10-materias[i].getAlumnos()[k].getNombre1().length())+materias[i].getAlumnos()[k].getApellido1());
						
					}
					
				}
				
			}
			
		}
		
	}
}

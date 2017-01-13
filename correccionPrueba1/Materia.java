package correccionPrueba1;

import java.util.Arrays;

public class Materia {
	
	private String nombre_;
	private int horas_;
	private int codigo_;
	private Alumno[] alumnos;
	private Profesor[] profesores;
	
	public Materia(String nombre, int horas, int codigo, Alumno[] alumnos, Profesor[] profesores){
		
		this.nombre_=nombre;
		this.horas_=horas;
		this.codigo_=codigo;
		this.alumnos=alumnos;
		this.profesores=profesores;
				
	}

	public String getNombre_() {
		return nombre_;
	}

	public void setNombre_(String nombre_) {
		this.nombre_ = nombre_;
	}

	public int getHoras_() {
		return horas_;
	}

	public void setHoras_(int horas_) {
		this.horas_ = horas_;
	}

	public int getCodigo_() {
		return codigo_;
	}

	public void setCodigo_(int codigo_) {
		this.codigo_ = codigo_;
	}

	public Alumno[] getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(Alumno[] alumnos) {
		this.alumnos = alumnos;
	}

	public Profesor[] getProfesores() {
		return profesores;
	}

	public void setProfesores(Profesor[] profesores) {
		this.profesores = profesores;
	}

	@Override
	public String toString() {
		return "Materia [nombre_=" + nombre_ + ", horas_=" + horas_ + ", codigo_=" + codigo_ + ", alumnos="
				+ Arrays.toString(alumnos) + ", profesores=" + Arrays.toString(profesores) + "]";
	}
	
	
	


}

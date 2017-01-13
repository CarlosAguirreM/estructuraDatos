package correccionPrueba1;

public class Profesor extends Persona{

	public Profesor(String id, String Nombre1, String Nombre2, String Apellido1, String Apellido2, int edad) {
		super(id, Nombre1, Nombre2, Apellido1, Apellido2, edad);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Profesor [getId()=" + getId() + ", getNombre1()=" + getNombre1() + ", getNombre2()=" + getNombre2()
				+ ", getApellido1()=" + getApellido1() + ", getApellido2()=" + getApellido2() + ", getEdad()="
				+ getEdad() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}

package correccionPrueba1;

public abstract class Persona {
	private String id;
	private String nombre1;
	private String nombre2;
	private String apellido1;
	private String apellido2;
	private int edad;
	
	public Persona(int edad){
		this.id = "17038668394";
		this.nombre1="Alicia";
		this.nombre2="Beatriz";
		this.apellido1="Collantes";
		this.apellido2="Dávila";
		this.edad=edad;
		
	}
	
	public Persona(String id, String nombre1, String nombre2, String apellido1, String apellido2, int edad){
		this.id = id;
		this.nombre1=nombre1;
		this.nombre2=nombre2;
		this.apellido1=apellido1;
		this.apellido2=apellido2;
		this.edad=edad;
		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre1() {
		return nombre1;
	}
	public void setNombre1(String nombre1) {
		this.nombre1 = nombre1;
	}
	public String getNombre2() {
		return nombre2;
	}
	public void setNombre2(String nombre2) {
		this.nombre2 = nombre2;
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
}

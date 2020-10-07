package clases;

public class Asignatura {
	private int codigo;
	private String nombreAsignatura;
	private int creditos;

	public Asignatura(int codigo, String nombreAsignatura, int creditos) {
		super();
		this.codigo = codigo;
		this.nombreAsignatura = nombreAsignatura;
		this.creditos = creditos;
	}
	
	public Asignatura() {
		
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombreAsignatura() {
		return nombreAsignatura;
	}
	public void setNombreAsignatura(String nombreAsignatura) {
		this.nombreAsignatura = nombreAsignatura;
	}
	public int getCreditos() {
		return creditos;
	}
	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}
	@Override
	public String toString() {
		return "Asignatura [codigo=" + codigo + ", nombreAsignatura=" + nombreAsignatura + ", creditos=" + creditos
				+ "]";
	}
	
	
}

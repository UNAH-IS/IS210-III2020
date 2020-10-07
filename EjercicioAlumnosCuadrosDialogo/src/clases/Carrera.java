package clases;

public class Carrera {
	private int codigo;
	private String nombreCarrera;
	private int cantidadAsignaturas;

	public Carrera(int codigo, String nombreCarrera, int cantidadAsignaturas) {
		this.codigo = codigo;
		this.nombreCarrera = nombreCarrera;
		this.cantidadAsignaturas = cantidadAsignaturas;
	}
	
	public Carrera() {}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombreCarrera() {
		return nombreCarrera;
	}

	public void setNombreCarrera(String nombreCarrera) {
		this.nombreCarrera = nombreCarrera;
	}

	public int getCantidadAsignaturas() {
		return cantidadAsignaturas;
	}

	public void setCantidadAsignaturas(int cantidadAsignaturas) {
		this.cantidadAsignaturas = cantidadAsignaturas;
	}

	@Override
	public String toString() {
		return "Carrera [codigo=" + codigo + ", nombreCarrera=" + nombreCarrera + ", cantidadAsignaturas="
				+ cantidadAsignaturas + "]";
	}
	
}

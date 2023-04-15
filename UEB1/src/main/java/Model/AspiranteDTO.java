package Model;

public class AspiranteDTO {
	private String nombre;
	private String fecha;
	private String colegio;
	private String carrera;
	private String estrato;
	private String homologado;
	private int costo;

	public AspiranteDTO(String nombre, String fecha, String colegio, String carrera, String estrato,
			String homologado) {

		this.nombre = nombre;
		this.fecha = fecha;
		this.colegio = colegio;
		this.carrera = carrera;
		this.estrato = estrato;
		this.homologado = homologado;
	}

	

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}



	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	/**
	 * @return the fecha
	 */
	public String getFecha() {
		return fecha;
	}



	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}



	/**
	 * @return the colegio
	 */
	public String getColegio() {
		return colegio;
	}



	/**
	 * @param colegio the colegio to set
	 */
	public void setColegio(String colegio) {
		this.colegio = colegio;
	}



	/**
	 * @return the carrera
	 */
	public String getCarrera() {
		return carrera;
	}



	/**
	 * @param carrera the carrera to set
	 */
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}



	/**
	 * @return the estrato
	 */
	public String getEstrato() {
		return estrato;
	}



	/**
	 * @param estrato the estrato to set
	 */
	public void setEstrato(String estrato) {
		this.estrato = estrato;
	}



	/**
	 * @return the homologado
	 */
	public String getHomologado() {
		return homologado;
	}



	/**
	 * @param homologado the homologado to set
	 */
	public void setHomologado(String homologado) {
		this.homologado = homologado;
	}



	/**
	 * @return the costo
	 */
	public int getCosto() {
		return costo;
	}



	/**
	 * @param costo the costo to set
	 */
	public void setCosto(int costo) {
		this.costo = costo;
	}



	@Override
	public String toString() {
		return "Estudiante" + "nombre=" + nombre + ", fecha=" + fecha + ", colegio=" + colegio + ", carrera=" + carrera
				+ ", estrato=" + estrato + ", homologado=" + homologado + "]";
	}

}

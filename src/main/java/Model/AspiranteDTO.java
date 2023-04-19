package Model;

public class AspiranteDTO {
	private String nombre;
	private String fecha;
	private String edad;
	private String colegio;
	private String carrera;
	private String estrato;
	private String homologado;
	private String costo;

	public AspiranteDTO(String nombre, String fecha, String edad, String colegio, String carrera, String estrato,
			String homologado, String costo) {
		super();
		this.nombre = nombre;
		this.fecha = fecha;
		this.edad = edad;
		this.colegio = colegio;
		this.carrera = carrera;
		this.estrato = estrato;
		this.homologado = homologado;
		this.costo = costo;
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
	public String getCosto() {
		return costo;
	}

	/**
	 * @param costo the costo to set
	 */
	public void setCosto(String costo) {
		this.costo = costo;
	}

	/**
	 * @return the edad
	 */
	public String getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(String edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		String res = "";
		res += this.nombre + ";" + this.fecha + ";" + this.edad + ";" + this.colegio + ";" + this.carrera + ";"
				+ this.estrato + ";" + this.homologado + ";" + this.costo + "\n";
		return res;
	}

}

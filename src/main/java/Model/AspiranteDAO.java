package Model;

import java.io.IOException;
import java.util.ArrayList;

import Model.persistance.FileHandler;



public class AspiranteDAO {
	private ArrayList<AspiranteDTO> list;

	


	public AspiranteDAO() {
		list = new ArrayList<AspiranteDTO>();

	}


	
	public String listar(ArrayList<AspiranteDTO> lista) {
		String rta = "";


		for (int i = 0; i < lista.size(); i++) {
			rta = lista.toString();
		}
		return rta;
	}

	public AspiranteDTO buscar(String aux, ArrayList<AspiranteDTO> lista) {

		AspiranteDTO encontrado = null;

		if (!lista.isEmpty()) {
			for (int i = 0; i < lista.size(); i++) {
				if (lista.get(i).getNombre().equals(aux)) {
					encontrado = lista.get(i);
					return encontrado;
				}
			}
		}
		return encontrado;
	}
	


	

	public void agregarAspirante(String nombre, String fecha, String edad, String colegio, String carrera,
			String estrato, String homologado, String costo) {

		list.add(new AspiranteDTO(nombre, fecha, edad, colegio, carrera, estrato, homologado, costo));

	}

	public ArrayList<AspiranteDTO> getList() {
		return list;
	}

	public void setList(ArrayList<AspiranteDTO> list) {
		this.list = list;
	}

}

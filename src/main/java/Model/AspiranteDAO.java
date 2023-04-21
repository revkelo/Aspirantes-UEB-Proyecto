package model;


import java.util.ArrayList;


public class AspiranteDAO {
	private ArrayList<AspiranteDTO> list;

	public AspiranteDAO() {
		list = new ArrayList<AspiranteDTO>();

	}

	

	public int buscar(String aux) {

		for (int i = 0; i < list.size(); i++) {

			if (aux.equals(list.get(i).getNombre())) {
				return i;
			}

		}

		return -1;
	}

	public void agregarAspirante(String nombre, String fecha, String edad, String colegio, String carrera, String estrato,
			String homologado, String costo) {

		list.add(new AspiranteDTO(nombre, fecha,edad, colegio, carrera, estrato, homologado,costo));

	}

	public ArrayList<AspiranteDTO> getList() {
		return list;
	}

	public void setList(ArrayList<AspiranteDTO> list) {
		this.list = list;
	}

}

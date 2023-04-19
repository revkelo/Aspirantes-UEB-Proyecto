package model;

import java.util.ArrayList;

import model.persistance.FileHandler;

import java.io.FileWriter;
import java.io.IOException;

public class AspiranteDAO {
	private ArrayList<AspiranteDTO> list;

	public AspiranteDAO() {
		list = new ArrayList<AspiranteDTO>();

	}

	public String contentBase() {
		String res = "";
		for (AspiranteDTO s : list) {
			res += s.toString();
		}
		return res;
	}

	public void writeFile() {
		String content = contentBase();
		FileHandler.writeFile("Aspirantes.csv", content);
	}

	public int buscar(String aux) {

		for (int i = 0; i < list.size(); i++) {

			if (aux.equals(list.get(i).getNombre())) {
				return i;
			}

		}

		return -1;
	}

	public void agregarAspirante(String nombre, String fecha, String edad, String colegio, String carrera,
			String estrato, String homologado, String costo) {

		list.add(new AspiranteDTO(nombre, fecha, edad, colegio, carrera, estrato, homologado, costo));
		writeFile();
	}

	public ArrayList<AspiranteDTO> getList() {
		return list;
	}

	public void setList(ArrayList<AspiranteDTO> list) {
		this.list = list;
	}

}

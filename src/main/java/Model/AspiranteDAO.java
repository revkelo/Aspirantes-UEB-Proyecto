package model;


import java.io.IOException;
import java.util.ArrayList;

import model.persistance.FileHandler;



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

    public boolean delete(int index, ArrayList<AspiranteDTO> list) {
        boolean found = false;
        try {
            list.remove(index);
            found = true;
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (Exception e) {
            found = false;
        }
        return found;
    }
    public boolean actualizar(String aux1 , String aux, ArrayList<AspiranteDTO> list ) {
        try {
            int one = buscar(aux1,list);

            list.get(one).setColegio(aux);

            return true;
        } catch (IndexOutOfBoundsException e) {
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public int buscar(String aux, ArrayList<AspiranteDTO> list) {

        for (int i = 0; i < list.size(); i++) {

            if (aux.equals(list.get(i).getNombre())) {
                return i;
            }
        }
        return -1;
    }
    public void agregarAspirante(String nombre, String fecha, String edad, String colegio, String carrera, String estrato,
			String homologado, String costo, String url) {
        list.add(new AspiranteDTO(nombre, fecha, edad, colegio, carrera, estrato, homologado, costo,url));

    }

    public ArrayList<AspiranteDTO> getList() {
        return list;
    }

    public void setList(ArrayList<AspiranteDTO> list) {
        this.list = list;
    }

}
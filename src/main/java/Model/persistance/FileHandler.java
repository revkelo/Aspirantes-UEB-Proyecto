/**
 * Paquete que pertenece al modelo que se encarga de que el objeto persista 
 */
package Model.persistance;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;

import Model.AspiranteDAO;
import Model.AspiranteDTO;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

/**
 * Clase FileHandler del proyecto.
 *
 * @author Daniela
 * @author Jose
 * @author Kevin
 * @author Nicolas
 */

public class FileHandler {

	private AspiranteDAO d;

	private static Scanner reader;

	public static final String CSV_SEPARATOR = ",";

	private static File file;

	public FileHandler() {
		d = new AspiranteDAO();
	}

	public void escribirCSV(ArrayList<AspiranteDTO> lista, String aux) {

		String userHomeFolder = System.getProperty("user.home");
		String csvfilepath = userHomeFolder + "/Desktop/Aspirantes.csv";

		try (PrintWriter writer = new PrintWriter(new FileWriter(csvfilepath), true)) {
			for (int i = 0; i < lista.size(); i++) {

				writer.println(d.listar(lista) + ";" + aux + "\n");
				writer.close();
				writer.flush();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void actualizarCSV(AspiranteDTO aspiranteActualizado, ArrayList<AspiranteDTO> lista) {
		String userHomeFolder = System.getProperty("user.home");
		String csvfilepath = userHomeFolder + "/Desktop/Aspirantes.csv";

		for (int i = 0; i < lista.size(); i++) {
			AspiranteDTO aspirante = lista.get(i);
			if (aspirante.getNombre().equals(aspiranteActualizado.getNombre())) {

				lista.set(i, aspiranteActualizado);
				break;
			}
		}
		escribirCSV(lista, "");
	}

}

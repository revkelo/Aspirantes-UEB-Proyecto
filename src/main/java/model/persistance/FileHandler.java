/**
 * Paquete que pertenece al modelo que se encarga de que el objeto persista 
 */
package model.persistance;

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

import model.AspiranteDAO;
import model.AspiranteDTO;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

/**
 * Clase FileHandler del proyecto.
 *
 * @author Daniela
 * @author Kevin
 * @author Nicolas
 */

public class FileHandler {

	/**
	 * Atributo AspiranteDAO nombrado d
	 */
	private AspiranteDAO d;
	/**
	 * Atributo statico Scanner nombrado reader
	 */
	private static Scanner reader;
	/**
	 * Atributo static para asignar ','
	 */
	public static final String CSV_SEPARATOR = ",";
	/**
	 * Atributo tipo File nombrado file
	 */
	private static File file;

	/**
	 * Metodo construvtor
	 */
	public FileHandler() {
		d = new AspiranteDAO();
	}

	/**
	 * Metodo tipo String que comprueba el archivo
	 * 
	 * @return aux variable tipo String
	 */
	public String comprobarArchivo() {

		String aux;
		String userHomeFolder = System.getProperty("user.home");
		String csvfilepath = userHomeFolder + "/Desktop/Aspirantes.csv";

		String csvfilepath1 = userHomeFolder + "/Escritorio/Aspirantes.csv";

		String csvfilepath2 = userHomeFolder + "/OneDrive/Desktop/Aspirantes.csv";

		String csvfilepath3 = userHomeFolder + "/OneDrive/Escritorio/Aspirantes.csv";

		File archivoCSV = new File(csvfilepath);

		File archivoCSV1 = new File(csvfilepath1);

		File archivoCSV2 = new File(csvfilepath2);

		File archivoCSV3 = new File(csvfilepath3);

		if (!archivoCSV.exists()) {
			aux = "0";
		} else {
			System.out.println("El archivo ya existe.");
			aux = archivoCSV.getAbsolutePath();

		}

		if (!archivoCSV1.exists()) {
			aux = "0";

		} else {
			System.out.println("El archivo ya existe.");
			aux = archivoCSV1.getAbsolutePath();

		}

		if (!archivoCSV2.exists()) {
			aux = "0";
		} else {
			System.out.println("El archivo ya existe.");
			aux = archivoCSV2.getAbsolutePath();

		}

		if (!archivoCSV3.exists()) {
			aux = "0";

		} else {
			System.out.println("El archivo ya existe.");
			aux = archivoCSV3.getAbsolutePath();

		}

		return aux;
	}

	/**
	 * Metodo para escribir en el csv
	 * 
	 * @param lista atributo tipo ArrayList<AspiranteDTO>
	 * @param url   atributo tipo String
	 * @param size  atributo tipo int
	 */
	public void escribirCSV(ArrayList<AspiranteDTO> lista, String url, int size) {

		try {

			try (PrintWriter writer = new PrintWriter(new FileWriter(url), true)) {
				for (int i = 0; i < size; i++) {

					writer.println(lista.get(i).toString());

				}
				writer.close();
				writer.flush();

			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (Exception e) {

		}

	}

}

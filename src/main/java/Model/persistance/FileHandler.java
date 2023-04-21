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

	public void escribirCSV(ArrayList<AspiranteDTO> lista, String aux,String url) {

		try {



			try (PrintWriter writer = new PrintWriter(new FileWriter(url), true)) {
				for (int i = 0; i < lista.size(); i++) {

					writer.println(d.listar(lista) + ";" + aux + "\n");
					writer.close();
					writer.flush();
				}

			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (Exception e) {

		}

	}

}

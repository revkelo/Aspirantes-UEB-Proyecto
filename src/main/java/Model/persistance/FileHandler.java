/**
 * Paquete que pertenece al modelo que se encarga de que el objeto persista 
 */
package Model.persistance;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Properties;
import java.util.Scanner;

/**
 * Clase FileHandler del proyecto.
 *
 * @author Daniela
 * @author Jose
 * @author Kevin
 * @author Nicolas
 */

public class FileHandler {

	/**
	 * Atributo tipo File file.
	 */
	private static File file;

	/**
	 * Atributo tipo PrintWriter writer.
	 */
	private static PrintWriter writer;
	/**
	 * Atributo tipo Properties prop.
	 */


	/**
	 * Metodo encargado de escribir el archivo
	 * 
	 * @param filename variable tipo String
	 * @param content variable tipo String
	 */
	public static void writeFile(String filename, String content) {
		
		file = new File("src\\main\\java\\Model\\persistance\\" + filename);
		System.out.println(file.getParent());
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				System.out.println("can´t create new file");
				System.out.println(e.getMessage());
			}
		}
		try {
			writer = new PrintWriter(file);
			writer.print(content);
		} catch (FileNotFoundException e) {
			System.out.println("file don´t exists");
			e.printStackTrace();
		}
		writer.close();
	}




}

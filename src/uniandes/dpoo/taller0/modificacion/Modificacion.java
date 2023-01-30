package uniandes.dpoo.taller0.modificacion;

import java.io.FileNotFoundException;
import java.io.IOException;

import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;
import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;

/**
 * Esta clase  cargará la información de los atletas e imprimirá el nombre del
país con más medallistas
 */
public class Modificacion {

	public static void main(String[] argumentos) throws FileNotFoundException, IOException
	{
		CalculadoraEstadisticas calc = LoaderOlimpicos.cargarArchivo("./data/atletas.csv");
		System.out.println("Hola, mundo!");
		System.out.println(calc.paisConMasMedallistas());
	}
}

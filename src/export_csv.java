import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class export_csv {
    public static void main(String[] args) {
        System.out.println("---EXPORTANDO CSV CON JAVA---");

        String[][] equipos = {
                {"S08001", "Dell", "En mantenimiento"},
                {"S8002", "Asus", "Operativo"}
        };
        String rutaArchivo = "reporte_equipos.csv";

        try {
            FileWriter archivo = new FileWriter(rutaArchivo);
            PrintWriter escritor = new PrintWriter(archivo);

            escritor.println("Numero Serie, Marca, Estado Actual");
            for (int i = 0; i < equipos.length; i++) {
                escritor.println(equipos[i][0] + "," + equipos[i][1] + "," + equipos[i][2]);
            }
            escritor.close();
            System.out.println("Reporte generado. ");

        } catch (IOException e) {
            System.out.println("Errorr al guardar" + e.getLocalizedMessage());
        }
    }
}

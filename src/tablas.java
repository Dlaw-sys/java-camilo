import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class tablas {
    public static void main (String[] args){
        Scanner lector = new Scanner(System.in);
        System.out.println("---CALCULADORA DESCUENTO---");

        System.out.println("ingrese el valor del libro");
        double  precio1= lector.nextDouble();

        System.out.println("ingrese el valor del borrador");
        double precio2= lector.nextDouble();

        System.out.println("ingrese el valor del lapiz");
        double precio3= lector.nextDouble();

        double subtotal = precio1 + precio2 + precio3;

        System.out.println("eres estudiante SI/NO");
        String respuesta = lector.next();

        boolean es_estudiante;

        if (respuesta.equals("SI")){
            es_estudiante= true;
        } else {
            es_estudiante = false;
        }

         double descuento = 0.0;
        if (subtotal > 50 && es_estudiante){
            descuento = subtotal *0.20;


        }








        }







    }


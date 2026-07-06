import java.util.ArrayList;
public class NICOLY {
    public static void main(String[] args) {

        ArrayList<String> frutas = new ArrayList<String>();
        frutas.add("Fresa");
        frutas.add("Pera");
        frutas.add("Sandia");

        System.out.println(frutas.get(1));

        frutas.set(1, "Mango");
        System.out.println(frutas.get(1));
        frutas.remove(0);
        System.out.println(frutas);

        for (int i = 0; i < frutas.size(); i++) {
            System.out.println(((i + 1) + "." + frutas.get(i)));
        }
    }
}
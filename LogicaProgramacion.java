import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class LogicaProgramacion{

    public static void main(String[] args) {

        HashMap<String, String> diccionario = new HashMap<>();

        diccionario.put("hola", "hello");
        diccionario.put("adios", "goodbye");
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("casa", "house");
        diccionario.put("escuela", "school");
        diccionario.put("comida", "food");
        diccionario.put("agua", "water");
        diccionario.put("libro", "book");
        diccionario.put("mesa", "table");
        diccionario.put("silla", "chair");
        diccionario.put("ventana", "window");
        diccionario.put("puerta", "door");
        diccionario.put("cielo", "sky");
        diccionario.put("carro", "car");
        diccionario.put("ciudad", "city");
        diccionario.put("amigo", "friend");
        diccionario.put("familia", "family");
        diccionario.put("trabajo", "work");
        diccionario.put("dinero", "money");

        ArrayList<String> palabras = new ArrayList<>(diccionario.keySet());

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int correctas = 0;
        int incorrectas = 0;

        System.out.println("=== DICCIONARIO ESPAÑOL - INGLÉS ===");

        for (int i = 0; i < 5; i++) {

            String palabraEspañol = palabras.get(random.nextInt(palabras.size()));

            System.out.println("\nTraduce la palabra: " + palabraEspañol);

            String respuesta = scanner.nextLine();

            String traduccionCorrecta = diccionario.get(palabraEspañol);

            if (respuesta.equalsIgnoreCase(traduccionCorrecta)) {
                System.out.println("Correcto");
                correctas++;
            } else {
                System.out.println("Incorrecto");
                System.out.println("La respuesta correcta es: " + traduccionCorrecta);
                incorrectas++;
            }
        }

        System.out.println("\n=== RESULTADOS ===");
        System.out.println("Respuestas correctas: " + correctas);
        System.out.println("Respuestas incorrectas: " + incorrectas);

        scanner.close();
    }
}
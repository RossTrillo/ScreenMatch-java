import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome practice");
        System.out.println("Película Crepúsculo");

        //Declaración de variables
        int fechaDeLanzamiento = 1995;
        double evaluacion = 4.8;
        boolean incluidoEnElPlanBasico = true;
        String nombre = "Crepuesculo";
        String sinopsis = """
                La mejor pelicula de los adolescentes
                """;
        double mediaEvaluacionUsuario = 0;
       // System.out.println(nombre);
        System.out.println(fechaDeLanzamiento);
        System.out.println(evaluacion);
        System.out.println(incluidoEnElPlanBasico);
        System.out.println(sinopsis);

        double mediaEvaluacion = (4.5 + 4.8 + 3.0) / 3;
        System.out.println("Media de la evaluación de Matrix: " + mediaEvaluacion);

        if (fechaDeLanzamiento >= 2023) {
            System.out.println("Pelicula popular");
        } else {
            System.out.println("Pelicula retro que vale la pena ver");
        }
      for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la evaluación que le darías a Matrix");
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;
        }
        System.out.println("La media de la pelicula Matrix calificada por el usuario es: " + mediaEvaluacionUsuario/3);
    }
}
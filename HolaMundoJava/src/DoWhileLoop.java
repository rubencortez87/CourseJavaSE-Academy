import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        int response = 0;

        do {
            System.out.println("Selecciona el número de la opción deseadas");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("0. Salir");

            Scanner scanner = new Scanner(System.in);

            switch (response) {
                case 0:
                    System.out.println("Thanks for visit us");
                    break;
                    case 1:
                        System.out.println("Movies");
                        break;
                case 2:
                    System.out.println("Series");
                    break;
                    default:
                        System.out.println("Select a correct option");
            }

        }while (response != 0);
        System.out.println("The end of the program");

    }
}

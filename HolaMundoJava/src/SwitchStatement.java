public class SwitchStatement {
    public static void main(String[] args) {

        String colorModeSelected = "Dark";

        switch (colorModeSelected) {
            case "Ligth":
                System.out.println("Seleccionaste Ligth Mode");
                break;
            case "Night": //Ambar
                System.out.println("Seleccionaste Night Mode");
                break;
            case "Blue Dark":
                System.out.println("Seleccionaste Blue Mode");
                break;
            case "Dark":
                System.out.println("Seleccionaste Dark Mode");
                break;
                default:
                    System.out.println("Selecciona una opción");


        }

    }

}
import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        int response = 0;
        System.out.println("Selecciona el número de la opción deseada");
        System.out.println("1. Movies");
        System.out.println("2. Sseries");
        System.out.println("0. Salir");

        do{
        Scanner sc = new Scanner(System.in);
        response = Integer.valueOf(sc.nextLine());

        switch(response){
            case 0:
                System.out.println("Gracias por visitarnos");
                break;
            case 1:
                System.out.println("Movies");
                break;
            case 2:
                System.out.println("Series");
                break;
            default:
                System.out.println("Selecciona una opción correcta");
                break;
            }
        }while(response != 0);
    }
}

public class Familia {
    public static void main(String[] args) {
        //nombres
        String nombrePropio = "Francisco Armando";
        String padreNombre = "Francisco Maurilio";
        String madreNombre = "Rosalva Patricia";
        String hermanaNombre = "Angela Patricia";

        //edades
        int miEdad = 25;
        int padreEdad = 45;
        int madreEdad = 52;
        int hermanaEdad = 24;

        System.out.println("Les presento a mi familia");
        System.out.println("Mi nombre es: " + nombrePropio + " y tengo " + miEdad + " años de edad");
        System.out.println("Mi padre se llama: " + padreNombre + " y tiene " + padreEdad + " años de edad");
        System.out.println("Mi madre se llama: " + madreNombre + " y tiene" + madreEdad + " años de edad");
        System.out.println("Mi hermana se llama " + hermanaNombre + " y tiene " + hermanaEdad + " años de edad");
    }
}
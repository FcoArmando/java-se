public class Casting {
    public static void main(String[] args) {
        //En un año ubiqué 30 perritos
        //¿Cuantos perritos ubique al mes

        double perroMensual = 30.0 / 12.0;
        System.out.println("La cantidad de perros ubicados por mes es: " + perroMensual);

        //estimación
        int estimadoPerroMensual = (int) perroMensual;
        System.out.println("La cantidad de perros ubicados por mes es: " + estimadoPerroMensual);

        //Exactitud
        int a = 30;
        int b = 12;

        System.out.println((double) a/b);

        double c = (double) a/b;
        System.out.println(c);

        char n = '1';
        int nI =n;

        System.out.println(nI);

        short nS = (short) n;
        System.out.println(nS);


    }
}

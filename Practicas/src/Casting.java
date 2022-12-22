public class Casting {
    public static void main(String[] args) {
        //casteando un caracter a int
        char c = 'z';
        System.out.println((int) c);

        //int a long, de long a short
        int i = 250;
        long iL = i;
        System.out.println("De int: " + i + " a long: " + iL);
        short iS = (short)iL;
        System.out.println("De long: " + iL + " a short: " + iS);
        System.out.println("----------------------------------------------------------------------");

        //double a long
        double d = 301.067;
        long dL = (long) d;
        System.out.println("De double:" + d + " a long: " + dL);
        System.out.println("----------------------------------------------------------------------");

        //int a sumar 5000.66 y convertirlo a float
        i = 100;
        float r = (float) ((float) i + 5000.66);
        System.out.println("El resultado es: " + r);
        System.out.println("----------------------------------------------------------------------");

        //int por 100 convertido a byte
        i = 737;
        i *= 100;
        System.out.println("El resultado es: " + i);
        System.out.println("El resultado en byte es: " + (byte) i);
        System.out.println("----------------------------------------------------------------------");

        //doble dividido entre 25 a long
        d = 298.638;
        d /= 25;
        System.out.println("Resultado" + d);
        System.out.println("Resultado en long: " + (long)d);
    }
}

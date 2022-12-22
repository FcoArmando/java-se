public class IncrementDecrement {
    public static void main(String[] args) {
        int lives = 5;
        lives = lives - 1;
        System.out.println("Vidas: " + lives);

        //operador decremento
        lives--;
        System.out.println("Vidas: " + lives);

        //operador incremento
        lives++;
        System.out.println("Vidas: " + lives);

        //prefifa
        //gana un regalo por ganar una vida
        int gift = 100 + ++lives; //prefijo
        System.out.println("Puntos: " + gift);
        System.out.println("Vidas: " + lives);

    }
}

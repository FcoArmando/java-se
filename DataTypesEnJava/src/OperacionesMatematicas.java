public class OperacionesMatematicas {
    public static void main(String[] args){
        double x = 2.1;
        double y = 3;

        //Devuelve PI
        System.out.println(Math.PI);

        //Devuelve un entero hacia arriba
        System.out.println(Math.ceil(x));

        //Devuelve un entero hacia abajo
        System.out.println(Math.floor(x));

        //Resuelve un número elevado a otro
        System.out.println(Math.pow(x,y));

        //Devuelve el número mayor
        System.out.println(Math.max(x,y));

        //Devuelve la raíz cuadrada
        System.out.println(Math.sqrt(y));

        //Área de un círculo
        //pi * r2
        System.out.println(Math.PI * Math.pow(y,2));

        ///Área de una esfera
        //4*PI*r2
        System.out.println(4 * Math.PI * Math.pow(y,2));

        //Volumen de una esfera
        //(4/3) * PI * r3
        System.out.println((4/3) * Math.PI * Math.pow(y,3));
    }
}
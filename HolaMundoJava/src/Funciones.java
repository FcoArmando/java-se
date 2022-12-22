public class Funciones {
    public static void main(String[] args) {
        double y = 3;
        //Área de un círculo
        //pi * r2
        double area = circleArea(y);
        System.out.println(area);

        ///Área de una esfera
        //4*PI*r2
        area = sphereArea(y);
        System.out.println(area);

        //Volumen de una esfera
        //(4/3) * PI * r3
        area = sphereVolumen(y);
        System.out.println(area);

        System.out.println("PESOS A DÓLARES: "+ converToDolar(1000, "COP"));
    }
    /**
     * Permite calcular el área de un círculo
     * @param r Radio del círculo
     * @return Regresa el cálculo realizado
     */
    public static double circleArea (double r){
        return Math.PI * Math.pow(r,2);
    }

    /**
     * Permite calcular el área de una esfera
     * @param r Radio de la esfera
     * @return Regresa el cálculo del área de la esfera
     */
    public static double sphereArea (double r){
        return 4 * Math.PI * Math.pow(r,2);
    }

    /**
     * Permite calcular el volúmen de una esfera
     * @param r Radio de la esfera
     * @return Regresa el cálculo del área de la esfera
     */
    public static double sphereVolumen (double r){
        return (4/3) * Math.PI * Math.pow(r,3);
    }

    /**
     * Descripción: Función que especificando su moneda convierte una cantidad de dinero a dólares
     * @param cantidad: Cantidad de dinero
     * @param currency: Especificar la moneda a convertir, sólo acepta MXN o COP
     * @return cantidad regresa la cantidad convertida a dólares
     */
    public static double converToDolar (double cantidad, String currency){
        switch(currency){
                case "MXN":
                    cantidad = cantidad * 0.052;
                    break;
                case "COP":
                    cantidad = cantidad * 0.0031;
                    break;
            }
            return cantidad;
        }

    }

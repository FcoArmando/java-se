public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;
        //bono $200
        salary+=200;
        System.out.println(salary);

        //Pensión: $50
        salary -= 50;
        System.out.println(salary);

        //2 horas extras, $30 c/u
        //comida: $45
        salary = salary + (30*2) - 45;
        System.out.println(salary);

        //Actualizando cadenas de texto
        String employeeName = "Armando";
        employeeName = employeeName + " Rodríguez Juárez";
        System.out.println(employeeName);

        employeeName = "Francisco " + employeeName;
        System.out.println("Tu nombre es: " + employeeName);

    }
}

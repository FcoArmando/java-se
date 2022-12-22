public class ForLoop {
    static boolean isTurnOnLight = false;
    public static void main(String[] args) {
        for (int i=0; i<10;i++){
            turnOnOffLight();
            printSOS();
        }
    }
    public static void printSOS(){
        System.out.println("...___...");
    }

    public static boolean turnOnOffLight(){
        isTurnOnLight = (isTurnOnLight) ? false : true;
        return isTurnOnLight;
    }
}

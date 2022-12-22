public class ifStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = false;
        int fileSended = 3;
        if (isBluetoothEnabled){
            fileSended++;
            System.out.println("Archivo enviado");
        }else{
            System.out.println("El bluetooth no está activado");
        }
        System.out.println(isBluetoothEnabled);
        System.out.println("Archivos enviados: "+fileSended);
    }
}

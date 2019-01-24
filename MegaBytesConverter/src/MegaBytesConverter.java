public class MegaBytesConverter {

    public static void main(String[]args){

        printMegaBytesAndKiloBytes(1024);
    }

    public static void printMegaBytesAndKiloBytes (int kiloBytes) {

        int megaBytes = kiloBytes / 1024;
        int remainder = kiloBytes % 1024;

        System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainder + " KB");

        if(kiloBytes < 0) {
            System.out.println("Invalid Value");
        }
    }
}

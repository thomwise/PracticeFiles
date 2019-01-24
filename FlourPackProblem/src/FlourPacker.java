public class FlourPacker {

    public static void main(String[] args) {
        System.out.println(canPack(3, 3, 12));
    }

    public static boolean canPack(int bigPack, int smallPack, int goal) {

        if(bigPack < 0 || smallPack < 0 || goal < 0) {
            return false;
        }

        int b = bigPack;
        while(b >= 0) {
            int s = smallPack;

            System.out.println(b);
            System.out.println(s);
            while(s >= 0){
                if(b*5 + s == goal) {
                    return true;
                }
                s--;
            }
            b--;
        }
        return false;
    }

}

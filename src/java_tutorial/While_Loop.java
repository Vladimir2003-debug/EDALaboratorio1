public class While_Loop {
    public static void main(String[] args) {
        int i = 0;
        //numeros del 1 al 10
        while (i < 10) {
            System.out.println(i);
            i++;
        }

        //do-while
        i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 10);
    }
}
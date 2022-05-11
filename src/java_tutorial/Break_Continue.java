public class Break_Continue {
    public static void main(String[] args) {
        //break
        int i = 0;
        while (i < 10) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
            i++;
        }// sale del while cuando i = 5

        //continue
        for (int j = 0; j < 10; j++) {
            if (j == 4) {
                continue;
            }
            System.out.println(j);
        }

    }
}
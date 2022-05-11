public class Data_Types {
    public static void main(String[] args) {
        //datos primitivos

        //-128 a 127
        byte test1 = 1;
        //-32768 a 32767
        short test2 = 2;
        //-2147483648 a 2147483647
        int test3 = 3;
        //-9223372036854775808 a 9223372036854775807
        long test4 = 4;
        //decimales , 6 o 7 decimales
        float test5 = 5.0f;
        // 15 decimales
        double test6 = 6.0;
        // verdadero o falso
        boolean test7 = false;
        //caracteres
        char test8 = 'a';
        System.out.println(test1 + " " + test2 + " " + test3 + " " 
        + test4 + " " + test5 + " " + test6 + " " + test7 + " " + test8);

        //No primitives 
        String test9 = "Hello World";
        System.out.println(test9);
    }
}

public class Variables{
    public static void main(String[] args) {
        //cadena de caracteres
        String test1 = "Hello world";
        //enteros sin decimales
        int test2 = 23;
        //numeros enteros flotante
        float test3 = 5.99f;
        //caracteres individuales
        char test4 = 'a';
        //valores booleanos
        boolean test5 = true;
        System.out.println(test1 + " " + test2 + " " + test3 + " " + test4 + " " + test5); 
        //Variables inmodificables
        final int test6 = 23;
        System.out.println(test6);
    }
}
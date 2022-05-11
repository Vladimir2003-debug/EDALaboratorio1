public class Strings{
    public static void main(String[] args) {
        String txt1 = "Hello";
        String txt2 = "World";

        //length
        System.out.println(txt1.length());

        //concatenation
        System.out.println(txt1 + " " + txt2);   

        //to upper case and to lower case
        System.out.println(txt1.toUpperCase());
        System.out.println(txt1.toLowerCase());

        //buscar dentro de un String
        System.out.println(txt1.indexOf("l"));//return 2

        //Caracteres especiales
        System.out.println("Salto de linea \n");
    }
}
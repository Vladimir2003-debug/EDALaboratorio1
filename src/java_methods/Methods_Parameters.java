public class Methods_Parameters {
    public static void main(String[] args) {
        myName("Vladimir");
        myName("Arturo");

        //Nombre completo
        myCompleteName("Vladimir", "Sulla");
    }
    //metodos
    public static void myName(String nombre) {
        System.out.println(nombre);
    }
    public static void myCompleteName(String name, String apellido) {
        System.out.println(name + " " + apellido);
    }
}
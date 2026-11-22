public class Saludo {
    public static void main(String[] args) {
        String nombre = args.length > 0 ? args[0] : "Mundo";
        System.out.println("Hola, " + nombre + ", este código se compiló en Jenkins");
    }
}

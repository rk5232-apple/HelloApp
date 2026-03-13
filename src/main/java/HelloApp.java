public class HelloApp {
    public static void main(String[] args) {
        if (args.length > 0) {
            String name = args[0]; // Getting the first argument
            System.out.println("Hello, " + name + "!");
        } else {
            // Default message if no name is provided
            System.out.println("Hello World!");
        }
    }
}
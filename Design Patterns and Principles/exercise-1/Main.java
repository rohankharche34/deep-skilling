public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Testing instance 1");
        
        System.out.println("Are they the same instance? " + (logger1 == logger2));
    }
}

public class Object {

    private static Object instance = new Object();

    private Object() {

    }

    public static Object getInstance() {
        return instance;
    }

    public void printMsg() {
        System.out.println("hello from singleton obj");
    }
}

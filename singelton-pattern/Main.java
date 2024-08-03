public class Main {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        Object newObj = Object.getInstance();
        newObj.printMsg();
    }
}

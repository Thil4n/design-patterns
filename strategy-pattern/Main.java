public class Main {
    public static void main(String[] args) {
        Context context = new Context(new OperationSub());
        System.out.println(context.executeStrategy(2, 4));

    }
}

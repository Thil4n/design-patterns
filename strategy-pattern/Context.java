public class Context {
    Operation operation;

    public Context(Operation _Operation) {
        operation = _Operation;
    }

    public int executeStrategy(int a, int b) {
        return operation.doOperation(a, b);
    }
}

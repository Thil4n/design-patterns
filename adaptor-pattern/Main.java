public class Main {
    public static void main(String[] args) {

        NewLogger newLogger = new NewLoggerImpl();

        OldLogger logger = new NewLoggerAdapter(newLogger);

        logger.logMessage("hi");
    }
}

public class NewLoggerAdapter implements OldLogger {
    NewLogger newLogger;

    public NewLoggerAdapter(NewLogger _NewLogger) {
        newLogger = _NewLogger;
    }

    @Override
    public void logMessageOldWay(String message) {
        newLogger.log(message);
    }
}

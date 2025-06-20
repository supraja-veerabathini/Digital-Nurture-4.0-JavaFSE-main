package SingletonPatternExample;

public class Main {
        public static void main(String[] args) {
            Logger myLogger = Logger.getInstance();
            myLogger.log("This is the first log message.So let us start");

            Logger anotherLogger = Logger.getInstance();
            anotherLogger.log("This is the second log message.It is to test the reuse");

            if (myLogger == anotherLogger) {
                System.out.println("Cool both loggers refer to the same logger instance.");
            } else {
                System.out.println("oh no!not the same instances exist. Singleton probably failed.");
            }
        }
    }



package SingletonPatternExample;

// Logger class using a Singleton setup
public class Logger {

    // Keep track of the one-and-only instance (or so we hope)
    private static Logger singleLogger;

    // Constructor stays private — no direct access allowed
    private Logger() {
        System.out.println("Logger is up. Constructor called.");
    }

    // Here's how to get the one instance. Simple lazy init.
    public static Logger getInstance() {
        if (singleLogger == null) {
            // First time? Make it.
            singleLogger = new Logger();
        }
        return singleLogger;
    }

    // Logging utility
    public void log(String msg) {
        System.out.println("LOG>> " + msg);  // log prefix just for flair
    }

}



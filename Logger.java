package singleton;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
	
    private static Logger loggerInstance;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private Logger() {}

    public static Logger getInstance() {
       if (loggerInstance == null) 
        loggerInstance = new Logger();
       return loggerInstance;
    }
    
//  We can use this optimization method to solve the  multithreading problem (double checked locking pattern)  
//    public static Logger getInstance() {
//        if (loggerInstance == null) {
//            synchronized (Logger.class) {
//                if (loggerInstance == null) {
//                    loggerInstance = new Logger();
//                }
//            }
//        }
//        return loggerInstance;
//    }

  
    private String createLogEntry(String level, String message) {
        String timestamp = dateFormat.format(new Date());
        return String.format("[%s] [%s] %s", timestamp, level, message);
    }
    
    
    // Methods to log messages of different levels
    
    public void info(String message) {
        System.out.println(createLogEntry("INFO", message));
    }

    public void debug(String message) {
        System.out.println(createLogEntry("DEBUG", message));
    }

    public void warn(String message) {
        System.out.println(createLogEntry("WARN", message));
    }

    public void error(String message) {
        System.out.println(createLogEntry("ERROR", message));
    }
    
    
}

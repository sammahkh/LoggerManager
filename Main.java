package singleton;

public class Main {

	public static void main(String[] args) {
		
	 Logger logger = Logger.getInstance();
	 
//	 To ensure that only one object is created
//	 Logger logger2 = Logger.getInstance();
//	 System.out.print(logger +"\n");
//	 System.out.print(logger2 +"\n");

	   logger.info("Application started");
       logger.debug("Debugging application start-up");
       logger.warn("This is a warning message");
       logger.error("An error occurred");
       logger.info("Application ended");
	 
	}
}

//justification for using singleton in logger 
/*
Using a singleton pattern for the Logger component in Java ensures that all log messages are managed uniformly,
preventing inconsistencies.It optimizes resource management by avoiding the performance issues and unnecessary memory usage that could arise from multiple Logger instances.
Additionally, it provides controlled global access to the Logger, ensuring a consistent logging mechanism throughout the application's life cycle.
*/
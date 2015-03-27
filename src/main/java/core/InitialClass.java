package core;

import org.apache.log4j.Logger;

/**
 * Initial class with prepared logger
 * @author Chris
 * @version 27/03/2015
 */
public class InitialClass {

    public static Logger logger = Logger.getLogger(InitialClass.class);

    public static void main(String[] args) {

        logger.info("Initial message");
        logger.info("Just testing IntelliJ's GitHub Plugin...");
    }
}

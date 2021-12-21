package org.netspi.cli;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class InfoLogger {
    private static final Logger logger = LogManager.getLogger(InfoLogger.class.getName());
    
    public static void main(String[] args) throws Exception {
        // System.out.println("Starting program with params:");
        // System.out.println(String.join(" ", args));
        logger.info(String.join(" ", args));
    }
}

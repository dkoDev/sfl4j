package log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Inicio {

	public static void main(String[] args) {

		Logger logger = LoggerFactory.getLogger(Inicio.class);
	    logger.info("Example for SLF$J");
	    logger.trace("Example for SLF$J");
		logger.debug("Example for SLF$J");
	    logger.info("Example for SLF$J");
	    logger.warn("Example for SLF$J");
	    logger.error("Example for SLF$J");

	}

}

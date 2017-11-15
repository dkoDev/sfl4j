package log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Inicio {

	public static void main(String[] args) {

		Logger logger = LoggerFactory.getLogger(Inicio.class);
	    logger.info("Example for SLF4J");
	    logger.trace("Example for SLF4J");
		logger.debug("Example for SLF4J");
	    logger.info("Example for SLF4J");
	    logger.warn("Example for SLF4J");
	    logger.error("Example for SLF4J");

	}

}

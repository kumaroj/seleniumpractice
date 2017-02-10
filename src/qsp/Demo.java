package qsp;

import org.apache.log4j.Logger;

public class Demo {

	public static void main(String[] args) {
		
		Logger l=Logger.getLogger("Demo");
		l.fatal("Fatal1");
		l.error("error1");
		l.warn("warn2");
		l.info("info1");
		l.debug("debug1");
		l.trace("trace1");
		
		l.fatal("Fatal2");
		l.error("error2");
		l.warn("warn2");
		l.info("info2");
		l.debug("debug2");
		l.trace("trace3");
	}

}

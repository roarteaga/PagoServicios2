package com.bancoabc.processor;

import java.util.Collections;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.log4j.Logger;
import org.apache.cxf.jaxrs.client.WebClient;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bancoabc.util.XPathReaderUtil;

/**
 * 
 * To validate the in-bound request.
 * 
 */

public class AuditLog implements Processor {

	/**
	 * To get the Logger instance for log message.
	 */

	private static final Logger LOGGER = Logger
			.getLogger(AuditLog.class);

	/**
	 * Log the request .
	 * 
	 * @param exchange
	 * 
	 */

	@Override
	public void process(Exchange exchange) throws Exception {
		LOGGER.debug("AuditLog::process()::enters");
		
	}

	

}

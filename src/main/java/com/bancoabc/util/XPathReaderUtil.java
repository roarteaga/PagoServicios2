package com.bancoabc.util;

import java.io.IOException;
import java.io.StringReader;

import org.apache.log4j.Logger;
import org.jdom2.Attribute;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.xpath.XPath;

/**
 * 
 * Used to read data from input xml file.
 * 
 */
public class XPathReaderUtil {
	
	private static final Logger LOGGER = Logger
			.getLogger(XPathReaderUtil.class);

	/**
	 * Document.
	 */
	private org.jdom2.Document document;


	public org.jdom2.Document getDocument() {
		return document;
	}

	/**
	 * Bind/set the request to the document
	 * 
	 * @param document
	 */
	public void setDocument(org.jdom2.Document document) {
		this.document = document;
	}

	/**
	 * Constructor which reads input XML file and get it as a DOM.
	 * 
	 * @param inputXml -Input xml file as String. 
	 *            
	 * @throws Exception
	 * 
	 */
	public XPathReaderUtil(String inputXml) throws Exception {
		LOGGER.debug("XPathReaderUtil::XPathReaderUtil()::enters");

		SAXBuilder builder = new SAXBuilder();
		StringReader reader = new StringReader(inputXml);
		try {
			document = builder.build(reader);
		} catch (JDOMException e) {
			LOGGER.error("XPathReaderUtil::XPathReaderUtil()::JDOMException", e);
			throw e;
		} catch (IOException e) {
			LOGGER.error("XPathReaderUtil::XPathReaderUtil()::IOException", e);
			throw new Exception("JDOMException", e);
		}

		LOGGER.debug("XPathReaderUtil::XPathReaderUtil()::exits");
	}

	/**
	 * To get node value from the given XPathExpression.
	 * 
	 * @param xpathExpression
	 * 
	 * @return Node value.
	 * @throws Exception
	 * 
	 */
	public String getNodeValue(String xpathExpression) throws Exception {
		LOGGER.debug("XPathReaderUtil::getNodeValue()::enters");

		String nodeValue = null;
		try {
			org.jdom2.xpath.XPath xpath = XPath.newInstance(xpathExpression);
			Element node = (Element) xpath.selectSingleNode(getDocument());
			nodeValue = node.getText();
			LOGGER.info("XPathReaderUtil::getNodeValue()::Node Value : "
					+ nodeValue);
		} catch (Exception e) {
			LOGGER.error(
					"XPathReaderUtil::getNodeValue()::Error Occurred while getting source, destination or date from the request",
					e);
			throw new Exception("JDOMException", e);
		}

		LOGGER.debug("XPathReaderUtil::getNodeValue()::exits");
		return nodeValue;
	}

}
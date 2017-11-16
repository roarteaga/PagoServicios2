<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:resa="http://pago.servicios.com/pago/"
	xmlns:resb="http://airb.sample.com/quote/" xmlns:quot="http://pago.servicios.com/pago/">

	<xsl:output method="xml" omit-xml-declaration="yes" indent="yes"
		encoding="UTF-8" />

	<xsl:template match="text()|@*" />

	<xsl:template match="//resa:getPagoResponse//getPagoResponse//price">
		<xsl:element name="quot:getPagoResponse">
			<xsl:element name="getPagoResponse">
				<xsl:element name="Pago">
					<xsl:element name="idFactura">
						<xsl:value-of select="//Pago//idFactura"></xsl:value-of>
					</xsl:element>
					<xsl:element name="valor">
						<xsl:value-of select="//Pago//valor"></xsl:value-of>
					</xsl:element>
				</xsl:element>
			</xsl:element>
		</xsl:element>
	</xsl:template>

	<xsl:template match="//resb:getPagoResponse//getPagoResponse//valor">
		<xsl:element name="quot:getPagoResponse">
			<xsl:element name="getQuoteResponse">
				<xsl:element name="price">
					<xsl:element name="airLine">
						<xsl:value-of select="//price//airLine"></xsl:value-of>
					</xsl:element>
					<xsl:element name="price">
						<xsl:value-of select="//price//price"></xsl:value-of>
					</xsl:element>
				</xsl:element>
			</xsl:element>
		</xsl:element>
	</xsl:template>

</xsl:stylesheet>
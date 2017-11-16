<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:res="http://pago.servicios.com/pago/"
	xmlns:quot="http://pago.servicios.com/pago/">

	<xsl:output method="xml" indent="yes" encoding="UTF-8" />

	<xsl:template match="text()|@*" />

	<xsl:template match="//res:getPago//getPago">
		<xsl:element name="quot:getPago">
			<xsl:element name="getPago">
				<xsl:element name="idFactura">
					<xsl:value-of select="idFactura"></xsl:value-of>
				</xsl:element>
				<xsl:element name="valor">
					<xsl:value-of select="valor"></xsl:value-of>
				</xsl:element>
			</xsl:element>
		</xsl:element>
	</xsl:template>
</xsl:stylesheet>
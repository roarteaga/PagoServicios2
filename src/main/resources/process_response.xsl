<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:res="http://pago.servicios.com/pago/">

	<xsl:output method="xml" indent="yes" encoding="UTF-8" />

	<xsl:template match="text()|@*" />

	<xsl:template match="//aggregatedResponse">
		<xsl:element name="res:getPagoResponse">
			<xsl:element name="getPagoResponse">
				<xsl:for-each select="//res:getPagoResponse">
					<xsl:element name="Pago">
						<xsl:element name="idFactura">
							<xsl:value-of select="getPagoResponse//Pago//idFactura"></xsl:value-of>
						</xsl:element>
						<xsl:element name="price">
							<xsl:value-of select="getPagoResponse//Pago//valor"></xsl:value-of>
						</xsl:element>
					</xsl:element>
				</xsl:for-each>
			</xsl:element>
		</xsl:element>
	</xsl:template>
</xsl:stylesheet>
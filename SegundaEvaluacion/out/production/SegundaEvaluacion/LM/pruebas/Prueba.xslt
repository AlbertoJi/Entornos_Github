<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <body>
                <h1>Mi gimnasio XSLT</h1>
                <table border="1">
                    <tr bgcolor="#999694">
                        <th style="text-align:left">Title</th>
                        <th style="text-align:left">Artist</th>
                        <th style="text-align:left">Price</th>
                    </tr>
                    <xsl:for-each select="catalog/cd">
                        <xsl:if test="price>8">
                        <tr>
                            <td><xsl:value-of select="title"/></td>
                            <xsl:choose>
                                <xsl:when test="price > 10">
                                    <td bgcolor="#579694">
                                        <xsl:value-of select="artist"/>
                                    </td>
                                </xsl:when>
                                <xsl:otherwise>
                                    <td><xsl:value-of select="artist"/></td>
                                </xsl:otherwise>
                            </xsl:choose>
                            <td><xsl:value-of select="price"/></td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
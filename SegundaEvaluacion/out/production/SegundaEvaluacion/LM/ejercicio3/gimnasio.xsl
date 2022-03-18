<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

    <xsl:template match="/gimnasio/monitores">
        <html>
            <body>
                <h1>Mi gimnasioXSLT</h1>
                <table border="2">
                    <tr bgcolor="#666666">
                        <th style="text-align:center">Monitor</th>
                        <th style="text-align:center">Salario</th>
                        <th style="text-align:center">Telefono</th>
                    </tr>
                    <xsl:for-each select="monitor">
                        <xsl:sort select="salario"/>
                        <xsl:if test="salario > 1000">
                            <tr>
                                <td><xsl:value-of select="nombre"/></td>
                                <td><xsl:value-of select="salario"/></td>
                                <td><xsl:value-of select="telefono"/></td>
                            </tr>
                        </xsl:if>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>

    <xsl:template match="/gimnasio/actividades">
        <br/>
        <xsl:for-each select="actividad">
            <xsl:choose>
                <xsl:when test="duracion > 50">
                    <span style="color:#F20B0B">
                        <xsl:value-of select="nombre"/>:</span>
                    <span style="color:#F20B0B">
                        <xsl:value-of select="duracion"/>,</span>
                    <span style="color:#F20B0B">
                        <xsl:value-of select="intensidad"/>
                    </span>
                    <br/>
                </xsl:when>
                <xsl:otherwise>
                    <span style="color:#15F20B">
                        <xsl:value-of select="nombre"/>:</span>
                    <span style="color:#15F20B">
                        <xsl:value-of select="duracion"/>,</span>
                    <span style="color:#15F20B">
                        <xsl:value-of select="intensidad"/>
                    </span>
                    <br/>
                </xsl:otherwise>
            </xsl:choose>
        </xsl:for-each>
    </xsl:template>
</xsl:stylesheet>

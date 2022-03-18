<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/gimnasio/monitores">
        <html>
            <body>
                <h1>Mi gimnasioXSLT</h1>
                <b>
                    <xsl:for-each select="monitor">
                        <br/>
                        <xsl:value-of select="nombre"/>
                        <br/>
                        <xsl:value-of select="apellidos"/>
                        <br/>
                    </xsl:for-each>
                </b>
                <br/>
            </body>
        </html>
    </xsl:template>
    <xsl:template match="/gimnasio/actividades">
        <html>
            <body>
                <b>
                    <xsl:for-each select="actividad">Actividad:
                        <span style="color:#666666">
                            <xsl:value-of select="nombre"/>
                        </span>
                        <span style="color:#666666">
                            <xsl:value-of select="duracion"/>
                        </span>
                        <span style="color:#666666">
                            <xsl:value-of select="intensidad"/>
                        </span>
                        <span style="color:#666666">
                            <xsl:value-of select="horario"/>
                        </span>
                        <br/>
                    </xsl:for-each>
                </b>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
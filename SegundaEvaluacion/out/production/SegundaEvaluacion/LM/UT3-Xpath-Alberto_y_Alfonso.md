# Ejercicios XPath

## Ejercicio 2. Factbook
A partir del documento `factbook.xml` que viene como ejemplo al instalar BaseX, genera las expresiones XPath para obtener la siguiente información:

1. Nombre de los continentes.

**Solución:**
```
//continent/@name
```
**Resultado:**
```xml
Europe
Asia
America
Australia/Oceania
Africa
```

2. Nombre del río que ocupa la décima posición.

**Solución:**
```
//river[10]/@name
```
**Resultado:**
```xml
name="Zambezi"
```

3. Nombre de la isla cuya superficie es 13935.

**Solución:**
```
//island[@area="13935"]/@name
```
**Resultado:**
```xml
name="Bahamas"
```

4. Nombre de los países que no tienen frontera con otros países (por tanto, islas).

**Solución:**
```
/mondial/country[count(border)=0]/name
```
**Resultado:**
```xml
name="Faroe Islands"
name="Guernsey"
name="Iceland"
(...)
name="Mayotte"
name="Sao Tome and Principe"
76 resultados
```

5. Nombre de organizaciones que tengan más de 5 miembros.

**Solución:**
```
/mondial/organization[count(*)>5]/@name
```
**Resultado:**
```xml
name="African, Caribbean, and Pacific Countries"
name="African Development Bank"
name="Agency for Cultural and Technical Cooperation"
(...)
name="World Trade Organization"
name="Zangger Committee"
132 resultados
```

6. "Hermanos menores" de la provincia de nombre Madrid, descendiente del país Spain.

**Solución:**
``` 
//country[name="Spain"]/province/@name
//country[name="Spain"]/province/following-sibling::province/@name 
(Este da 16 resultados)
```
**Resultado:**
```xml
17 resultados
```

7. Nombre y gobierno de los países cuya población sea menor que 1.000.000.

**Solución:**
```
//country[@population<1000000]/(name | @government)
```
**Resultado:**
```xml
name="Andorra"
government="     parliamentary democracy that retains as its heads of state a coprincipality"
name="Faroe Islands"
government="part of the Danish realm"
160 resultados
```

8. Nombre de los países que tengan una ciudad llamada Córdoba.

**Solución:**
```
//city[name="Cordoba"]/../../name
```
**Resultado:**
```xml
name="Spain"
name="Argentina"
name="Mexico"
```

9.  Nombre de los lagos ubicados en Russia.

**Solución:**
```
//lake/located[@country="f0_358"]/../@name
```
**Resultado:**
```xml
name="Ozero Ladoga"
name="Ozero Baikal"
name="Ozero Onega"
name="Ozero Taimyr"
name="Ozero Chanka"
name="Ozero Tschany"
```

10. Nombre de los países cuyo territorio está en Europe.

**Solución:**
```
 //country/encompassed[@continent="f0_119"]/../@name
```
**Resultado:**
```xml
name="Albania"
name="Andorra"
name="Austria"
51 resultados
```



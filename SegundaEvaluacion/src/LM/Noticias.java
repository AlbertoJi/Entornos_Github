package LM;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class Noticias {
        public static void main(String[] args) {
                try {
                        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
                        DocumentBuilder db = dbf.newDocumentBuilder();
                        Document doc = db.newDocument();

                        // definimos el elemento raíz del documento
                        Element eRaiz = doc.createElement("noticias");
                        doc.appendChild(eRaiz);

                        // definimos el nodo que contendrá los elementos
                        Element enoticia = doc.createElement("noticia");
                        eRaiz.appendChild(enoticia);

                        // atributo para el nodo coche
                        Attr attr = doc.createAttribute("dia");
                        attr.setValue("22-10-2020");
                        enoticia.setAttributeNode(attr);

                        // definimos cada uno de los elementos y le asignamos un valor
                        Element etitulo = doc.createElement("titulo");
                        etitulo.appendChild(doc.createTextNode("Ejemplo"));
                        enoticia.appendChild(etitulo);

                        Element eautor = doc.createElement("autor");
                        eautor.appendChild(doc.createTextNode("Anonymous "));
                        enoticia.appendChild(eautor);

                        Element eurl = doc.createElement("url");
                        eurl.appendChild(doc.createTextNode("blabla.es"));
                        enoticia.appendChild(eurl);

                        Attr attr1 = doc.createAttribute("direccion");
                        attr1.setValue("http://www.blabla.es");
                        eurl.setAttributeNode(attr1);

                        Element etexto = doc.createElement("texto");
                        etexto.appendChild(doc.createTextNode("TEXTO1"));
                        enoticia.appendChild(etexto);

                        Element efoto = doc.createElement("foto");
                        efoto.appendChild(doc.createTextNode("http://www.blabla.es/122.jpg"));
                        enoticia.appendChild(efoto);

                        Element enoticia1 = doc.createElement("noticia");
                        eRaiz.appendChild(enoticia1);

                        // atributo para el nodo coche
                        Attr attr2 = doc.createAttribute("dia");
                        attr2.setValue("12-12-2012");
                        enoticia1.setAttributeNode(attr2);

                        // definimos cada uno de los elementos y le asignamos un valor
                        Element etitulo1 = doc.createElement("titulo");
                        etitulo1.appendChild(doc.createTextNode("Ejemplo2"));
                        enoticia1.appendChild(etitulo1);

                        Element eautor1 = doc.createElement("autor");
                        eautor1.appendChild(doc.createTextNode("Otro "));
                        enoticia1.appendChild(eautor1);

                        Element eurl1 = doc.createElement("url");
                        eurl1.appendChild(doc.createTextNode("blabla.es"));
                        enoticia1.appendChild(eurl1);

                        Attr attr3 = doc.createAttribute("direcion");
                        attr3.setValue("http://www.blabla.es");
                        eurl1.setAttributeNode(attr3);

                        Element etexto1 = doc.createElement("texto");
                        etexto1.appendChild(doc.createTextNode("TEXTO2"));
                        enoticia1.appendChild(etexto1);

                        Element efoto1 = doc.createElement("foto");
                        efoto1.appendChild(doc.createTextNode("http://www.blabla.es/123.jpg"));
                        enoticia1.appendChild(efoto1);



                        // clases necesarias finalizar la creación del archivo XML
                        TransformerFactory transformerFactory = TransformerFactory.newInstance();
                        Transformer transformer = transformerFactory.newTransformer();
                        DOMSource source = new DOMSource(doc);
                        StreamResult result = new StreamResult(new File("noticias.xml"));

                        transformer.transform(source, result);
                } catch(Exception e) {
                        e.printStackTrace();
                }
        }

}

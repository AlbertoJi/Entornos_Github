package LM;


import org.w3c.dom.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("src\\LM\\libreria.xml");

        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(file);
            doc.getDocumentElement().normalize();

            NodeList nList = doc.getElementsByTagName("libro");
            System.out.println("Número de libros: " + nList.getLength());

            for(int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);

                if(nNode.getNodeType() == Node.ELEMENT_NODE) {
                    System.out.println("\nLibro número: "+temp);
                    Element eElement = (Element) nNode;

                    System.out.println("\nCategoria: " + eElement.getAttribute("categoria"));
                    System.out.println("Título: "
                            + eElement.getElementsByTagName("titulo").item(0).getTextContent());
                    System.out.println("Autor: "
                            + eElement.getElementsByTagName("autor").item(0).getTextContent());
                    System.out.println("Año: "
                            + eElement.getElementsByTagName("anyo").item(0).getTextContent());
                }
            }



        } catch(Exception e) {
            e.printStackTrace();
        }
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.newDocument();

            // definimos el elemento raíz del documento
            Element eRaiz = doc.createElement("libreria");
            doc.appendChild(eRaiz);

            // definimos el nodo que contendrá los elementos
            Element elibro = doc.createElement("libro");
            eRaiz.appendChild(elibro);

            // atributo para el nodo coche
            Attr attr = doc.createAttribute("categoria");
            attr.setValue("1");
            elibro.setAttributeNode(attr);

            // definimos cada uno de los elementos y le asignamos un valor
            Element etitulo = doc.createElement("titulo");
            etitulo.appendChild(doc.createTextNode("1000 recetas de oro"));
            elibro.appendChild(etitulo);

            Element eautor = doc.createElement("autor");
            eautor.appendChild(doc.createTextNode("Karlos Arguiñano"));
            elibro.appendChild(eautor);

            Element eanyo = doc.createElement("anyo");
            eanyo.appendChild(doc.createTextNode("2016"));
            elibro.appendChild(eanyo);

            Element eprecio = doc.createElement("precio");
            eprecio.appendChild(doc.createTextNode("18.95"));
            elibro.appendChild(eprecio);


            // clases necesarias finalizar la creación del archivo XML
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("libreria3.xml"));

            transformer.transform(source, result);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }


}

package LM.ejercicio2;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class sdfakl {
    public static void main(String[] args) {
        File file = new File("src\\LM\\ejercicio2\\gimnasio.xml");
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(file);
            doc.getDocumentElement().normalize();
            System.out.println("Lista de monitores");
            NodeList nList = doc.getElementsByTagName("monitor");
            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;

                    System.out.println("\nMonitor: " + eElement.getAttribute("codigo"));
                    System.out.println("Nombre: "
                            + eElement.getElementsByTagName("nombre").item(0).getTextContent());
                    System.out.println("Apellidos: "
                            + eElement.getElementsByTagName("apellidos").item(0).getTextContent());
                    System.out.println("Telefono: "
                            + eElement.getElementsByTagName("telefono").item(0).getTextContent());
                    System.out.println("Salario: "
                            + eElement.getElementsByTagName("salario").item(0).getTextContent());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package LM;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class Gimnasio {
    public static void main(String[] args) {
        //cambiar ruta si no funciona
        File file = new File("src\\LM\\gimnasio.xml");

//        try {
//            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
//            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
//            Document doc = dBuilder.parse(file);
//            doc.getDocumentElement().normalize();
//            System.out.println("Lista de monitores");
//            NodeList nList = doc.getElementsByTagName("monitor");
//            for (int temp = 0; temp < nList.getLength(); temp++) {
//                Node nNode = nList.item(temp);
//                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
//                    Element eElement = (Element) nNode;
//
//                    System.out.println("\nMonitor: " + eElement.getAttribute("codigo"));
//                    System.out.println("Nombre: "
//                            + eElement.getElementsByTagName("nombre").item(0).getTextContent());
//                    System.out.println("Apellidos: "
//                            + eElement.getElementsByTagName("apellidos").item(0).getTextContent());
//                    System.out.println("Telefono: "
//                            + eElement.getElementsByTagName("telefono").item(0).getTextContent());
//                    System.out.println("Salario: "
//                            + eElement.getElementsByTagName("salario").item(0).getTextContent());
//                }
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(file);
            doc.getDocumentElement().normalize();

            System.out.println("Lista de Actividades");
            NodeList mList = doc.getElementsByTagName("actividades");
            for (int temp = 0; temp < mList.getLength(); temp++) {
                Node mNode = mList.item(temp);
                if (mNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) mNode;

                    System.out.println("\nActividad: " + eElement.getAttribute("codigo"));
                    System.out.println("Nombre: "
                            + eElement.getElementsByTagName("nombre").item(0).getTextContent());
                    System.out.println("Duracion: "
                            + eElement.getElementsByTagName("duracion").item(0).getTextContent());
                    System.out.println("Intensidad: "
                            + eElement.getElementsByTagName("intensidad").item(0).getTextContent());
                    System.out.println("Lugar: "
                            + eElement.getElementsByTagName("lugar").item(0).getTextContent());
                    System.out.println("Horario: "
                            + eElement.getElementsByTagName("día").item(0).getTextContent()
                            + " a las " + eElement.getElementsByTagName("hora").item(0).getTextContent() + " y a las "
                            + eElement.getElementsByTagName("hora").item(1).getTextContent());
                    for (int hor = 0; hor < mList.getLength(); hor++) {
                        int camd = 1;
                        int cam = 2;
                        System.out.println("Horario: "
                                + eElement.getElementsByTagName("día").item(camd++).getTextContent() + " a las "
                                + eElement.getElementsByTagName("hora").item(cam++).getTextContent() + " y a las "
                                + eElement.getElementsByTagName("hora").item(cam++).getTextContent());

                        NodeList mList2 = eElement.getElementsByTagName("monitores");
                        for (int cont = 0; cont < mList.getLength(); cont++) {
                            Node nNode = mList2.item(cont);
                            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                                Element nElement = (Element) nNode;
                                NodeList listaMonitor = nElement.getElementsByTagName("monitor");
                                for (int mon = 0; mon < listaMonitor.getLength() ; mon++) {
                                    Element nElement2 = (Element) listaMonitor.item(mon);
                                    System.out.println("Monitor: " + nElement2.getAttribute("codiga"));

                                }
                        }

                        }
                    }

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}

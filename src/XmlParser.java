import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class XmlParser {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        Sample01 sample01 = new Sample01();
        sample01.parser01();
        /*DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.parse("/Users/freehoon/Desktop/mega.xml");

        Element root = document.getDocumentElement();   //.getNodeName() 으로 최상위 노드를 가지고 올 수 있다.
                                                        //여기서는 response가 최상위 노드이다

        NodeList childeren = root.getChildNodes();
        for(int i = 0; i < childeren.getLength() ; i++){
            System.out.println(i + " : " + childeren.item(i));
            Node node = childeren.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE){
                Element element = (Element) node;
                String nodeName = element.getNodeName();
                System.out.println("nodeName : " + nodeName);
                if(nodeName.equals("body")){
                    NodeList items = element.getChildNodes();
                    for(int j = 0 ; j < items.getLength(); j++){
                        Node itemsNode = childeren.item(j);
                        if(itemsNode.getNodeType() == Node.ELEMENT_NODE){
                            Element itemsElement = (Element) itemsNode;
                            String itemsName = itemsElement.getNodeName();
                            if(itemsName.equals("item")){
                                NodeList itemNode = itemsElement.getChildNodes();

                            }
                        }
                    }
                }
            }
        }//for*/
    }
}

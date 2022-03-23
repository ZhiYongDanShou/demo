package DesignMode.demo02.factory_chouxiang;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.*;

/**
 * @author shkstart
 * @create 2022-03-10 {TIME}
 */
public class XMLUtil {
    public static Object getBean(){
        try{
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("src//DesignMode//demo02//factory_chouxiang//config.xml"));

            NodeList nl= doc.getElementsByTagName("className");
            Node classNode = nl.item(0).getFirstChild();
            String cName = classNode.getNodeValue();

            Class c = Class.forName(cName);
            Object obj = c.newInstance();
            return obj;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}

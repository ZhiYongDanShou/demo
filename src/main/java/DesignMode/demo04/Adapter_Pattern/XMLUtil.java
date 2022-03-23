//package main.java.DesignMode.demo04.Adapter_Pattern;
//
//import org.w3c.dom.Document;
//import org.w3c.dom.Node;
//import org.w3c.dom.NodeList;
//
//import javax.xml.parsers.DocumentBuilder;
//import javax.xml.parsers.DocumentBuilderFactory;
//import java.io.File;
//
///**
// * @author shkstart
// * @create 2022-03-24 {TIME}
// */
//public class XMLUtil {
//    public static Object getBean() {
//        try {
//            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
//            DocumentBuilder builder = dFactory.newDocumentBuilder();
//            Document doc;
//            doc = builder.parse(new File("src/main/resources/config.xml"));
//
//            NodeList nl = doc.getElementsByTagName("className");
//            Node classNode = nl.item(0).getFirstChild();
//            String cName = classNode.getNodeValue();
//
//            Class<?> aClass = Class.forName(cName);
//            return aClass.newInstance();
//        }catch (Exception e){
//            e.printStackTrace();
//            return null;
//        }
//    }
//}

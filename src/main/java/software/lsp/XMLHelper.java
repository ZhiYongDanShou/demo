package software.lsp;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * @author shkstart
 * @create 2021-11-25 {TIME}
 */
public class XMLHelper {
    public XMLHelper() {
    }

    public String getClassName(){
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = null;
        try {
            builder = factory.newDocumentBuilder();
        }catch (ParserConfigurationException e){
            e.printStackTrace();
        }
        Document document = null;
        try {
            document =  builder.parse("OCP.xml");
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        NodeList nList = (document).getElementsByTagName("ClassName");
        return nList.item(0).getFirstChild().getNodeValue();
    }
}

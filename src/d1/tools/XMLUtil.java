package d1.tools;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import java.io.File;

public class XMLUtil {
    public static Object getBean()  {
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dbFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("src/d1/test2/config.xml"));  //2的配置
//            doc = builder.parse(new File("src/d1/test3/config.xml"));  //3的配置
//            doc = builder.parse(new File("src/d1/test4/config.xml"));  //4的配置
//            doc = builder.parse(new File("src/d1/test5/configFood.xml"));  //5的配置
//            doc = builder.parse(new File("src/d1/test7/configBuilder.xml"));  //7的配置
//            doc = builder.parse(new File("src/d1/test8/configModelBuilder.xml"));  //8的配置
            NodeList nl = doc.getElementsByTagName("ClassName");
            Node classNode = nl.item(0).getFirstChild();
            String cName = classNode.getNodeValue();

            Class c = Class.forName(cName);
            Object obj = c.getDeclaredConstructor().newInstance();
            return obj;

        }catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

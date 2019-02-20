package pattern.loveInversionalOfControl;

import pattern.utility.Utility;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.StringReader;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public class Inject {

    private Inject() {
    }


    private static Map<Class, Object> objectList = new ConcurrentHashMap();
    private static JAXBContext context;
    private static Unmarshaller un = null;
    private static List<ClassNames> classesName;
    private static XmlBeans beans;

    static {
        try {
            //get file content in the form of string
            String xml = Utility.getFileContent("beans.xml");
            //initialize a java.io.Reader object with xml content
            StringReader reader = new StringReader(xml);
            context = JAXBContext.newInstance(XmlBeans.class);
            un = context.createUnmarshaller();

            //convert to desired object
            beans = (XmlBeans) un.unmarshal(reader);
            classesName = beans.getNames();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }


    public static <T> T getInstance(Class<T> clazz) {
        Object object = objectList.get(clazz);
        if (object != null)
            return (clazz.cast(object));
        else
            return null;
    }


    private static Object getObjectFromContainer(Class clazz) {
        Object object = objectList.get(clazz);
        return object;
    }

    public static void addObject(Object o) {
        objectList.put(o.getClass(), o);
    }



}

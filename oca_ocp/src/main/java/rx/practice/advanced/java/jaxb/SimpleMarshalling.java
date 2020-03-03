package rx.practice.advanced.java.jaxb;

import java.io.ByteArrayOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
/**
 * This is to tell the JAXB is now part of JDK
 * 
 * @author rxue
 *
 */
public class SimpleMarshalling {
    public static void main(String[] args) {
    	try {
			JAXBContext c = JAXBContext.newInstance(Person.class);
			Marshaller m = c.createMarshaller();
			ByteArrayOutputStream os = new ByteArrayOutputStream();
			Person p = new Person();
			p.setName("hello");
			m.marshal(p, os);
			System.out.println(os.toString());
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}

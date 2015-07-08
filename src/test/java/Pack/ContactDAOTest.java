package Pack;

import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by AversiveDread on 08.07.2015.
 */
public class ContactDAOTest extends TestCase {
@Test
    public void testAddContact() throws Exception {
    ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(new String[] {"config.xml"});
    ContactDAO contactDAOForTest = (ContactDAO) ac.getBean("contactDao");
    Contact contactForTest = (Contact) ac.getBean("cont1");
    contactDAOForTest.addContact(contactForTest);
    assertEquals(contactDAOForTest.contactList.isEmpty(), false);
    }
}
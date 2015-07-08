package Pack;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by AversiveDread on 06.07.2015.
 */
public class JavaContactServiceTest extends Mockito {
    @Test
    public void testCreateContact() throws Exception {
       ContactDAO contactDaoConteiner = mock(ContactDAO.class);
        Contact   contactMock = mock(Contact.class);
        JavaContactService jcs = new JavaContactService();
        jcs.createContact(contactMock,contactDaoConteiner);
        verify(contactDaoConteiner, atLeast(1)).addContact(contactMock);


    }



    public void testCreateContact1() throws Exception {

    }

    public void testAddHobby() throws Exception {

    }

    public void testAddFriendship() throws Exception {

    }

    public void testGetFriendList() throws Exception {

    }

    public void testAddPlace() throws Exception {

    }

    public void testGetConversation() throws Exception {

    }
}
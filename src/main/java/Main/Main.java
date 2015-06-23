package Main;
import Pack.*;
import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//поднимаем контекст
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(new String[] {"config.xml"});
        Pack.JavaContactService jcs1 = (JavaContactService) ac.getBean("jcs1");
//создаем обьекты
        Contact cont1 = (Contact) ac.getBean("cont1");
        Contact cont2 = (Contact) ac.getBean("cont2");
        Contact cont3 = (Contact) ac.getBean("cont3");
        ContactDao contactDao =(ContactDao) ac.getBean("contactDao");
        HobbyDao hobbyDao =(HobbyDao) ac.getBean("hobbyDao");
        jcs1.createContact(cont1,contactDao);
        jcs1.createContact(cont2,contactDao);
        jcs1.createContact(cont3,contactDao);
//добавляем хобби
        Pack.Hobby hobby1 =(Hobby) ac.getBean("hobby1");
        Pack.Hobby hobby2 =(Hobby) ac.getBean("hobby2");
        jcs1.addHobby(cont1,hobby1);
        jcs1.addHobby(cont2,hobby1);
        jcs1.addHobby(cont2,hobby2);
//устанавливаем связь с другими контактами
        jcs1.addFriendship(cont1,cont3);
        jcs1.addFriendship(cont1,cont2);
//выводим необходимую информацию
        jcs1.getFriendList(cont1);
        jcs1.getFriendList(cont2);
        contactDao.deleteContact(cont1);







    }
}

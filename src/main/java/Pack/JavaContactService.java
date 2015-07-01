package Pack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JavaContactService {
    @Autowired
    private ContactDAO contactDao;
    @Autowired
    private HobbyDAO hobbyDao;
    @Autowired
    private PlaceDAO placeDao;
    @Autowired
    private MessageDAO messageDao;

    public JavaContactService() {
    }

    public void createContact (Contact contactToCreate, ContactDAO contactDaoConteiner){
        System.out.print(contactToCreate.firstName+" "+contactToCreate.lastName+" "+contactToCreate.birthDay+" created.");
        contactDaoConteiner.addContact(contactToCreate);

    }
    public void createContact(String firstName, String lastName, String birthDay)
    {
        ContactDTO contactDTO = new ContactDTO();
        contactDTO.setFirstName(firstName);
        contactDTO.setLastName(lastName);
        contactDTO.setBirthday(birthDay);
       contactDao.addContact(contactDTO);
    }


    public void addHobby(Contact cont,Hobby hobby){
        cont.getHobbyList().add(hobby);
        hobby.contactsWithHobbyList.add(cont);
        System.out.println(hobby.title+" "+hobby.description+ " added to "+cont.getFirstName());

    }

    public void addFriendship(Contact cont1,Contact cont2) {
        cont1.friendList.add(cont2);
        cont2.friendList.add(cont1);
    }

    public void getFriendList(Contact cont){
        System.out.println(cont.getFirstName()+"s friendList: ");
        for (int i = 0; i < cont.friendList.size() ; i++) {
            System.out.println(cont.friendList.get(i).getFirstName());
        }


    }
    public void addPlace (String title,String description, double longitude, double latitude)
    {
        PlaceDTO placeDTO = new PlaceDTO();
        placeDTO.setTitle(title);
        placeDTO.setDescription(description);
        placeDTO.setLongtitude(longitude);
        placeDTO.setLatitude(latitude);
        placeDao.addPlace(placeDTO);
    }

    public void getConversation(Contact cont1, Contact cont2){


    }
}


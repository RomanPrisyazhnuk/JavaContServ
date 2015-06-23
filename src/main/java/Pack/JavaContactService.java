package Pack;

import static Pack.Contact.*;

public class JavaContactService {

    public void createContact (Contact contactToCreate, ContactDao contactDaoConteiner){
        System.out.print(contactToCreate.firstName+" "+contactToCreate.lastName+" "+contactToCreate.birthDate+" created.");
        contactDaoConteiner.addContact(contactToCreate);

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


    }public void getConversation(Contact cont1, Contact cont2){


    }
}


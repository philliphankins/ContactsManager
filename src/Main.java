public class Main {

    public static void main(String[] args) {

        class Contact{
            String name;
            String email;
            String phoneNumber;
        }

        class ContactsManager {
            // Fields:
            Contact [] myFriends;
            int friendsCount;
            // Constructor;
            ContactsManager(){
                this.friendsCount = 0;
                this.myFriends = new Contact[500];
            }

            void addContact(Contact contact){
                myFriends[friendsCount] = contact;
                friendsCount++;
            }


        }


    }
}

public class Friend {

    static int numOffFriends;
    String name;

    Friend(String name){
        this.name = name;
        numOffFriends++;
    }

    static void showFriends(){
        System.out.println("You have " + numOffFriends + " total friends");
    }
}

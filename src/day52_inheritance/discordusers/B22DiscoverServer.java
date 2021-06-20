package day52_inheritance.discordusers;

public class B22DiscoverServer {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setId(1234);
        user1.setName("Aizat");
        user1.setRole("student");

        //here created different roles
        //those are inheritance
        //User > Admin
        Admin admin1 = new Admin();
        admin1.setId(1234);
        admin1.setName("Burak Kara");
        admin1.setRole("Admin");

        System.out.println(user1);
        System.out.println(admin1);

        Admin admin2 = new Admin("Gylia", 4138); //we can directly give name and id
        System.out.println(admin2.toString()); //we are adding automatically adding toString
    }
}

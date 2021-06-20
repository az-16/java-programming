package day52_inheritance.discordusers;

public class Admin extends User{

    public Admin() { //child constructor
        super(); // call super class/User class no-args constructor
        // super () works only inside the constructor
        System.out.println("Admin class constructor");
    }
    public Admin(String name, int id) { //why we can not add here String role. b/c it is admin. Role already hard coded inside the admin
        super("Admin", name, id);//via super we are calling parent class constructor-> public User(String role, String name, int id)
        System.out.println("Admin class 2 args constructor");
    }


    @Override
    public String toString() {   //what we did here? copy paste it from User parent class.
                                // Manually changed getRole, getName, getId

        return "User{" +
                "role='" + getRole() + '\'' +
                ", name='" + getName() + '\'' +
                ", id=" + getId() +
                '}';
    }

}

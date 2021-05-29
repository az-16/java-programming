package day19_string_vs_object_string;

public class LoginTest {
    public static void main(String[] args) {
        String expUserName = "cybertek";
        String userName = "Abc123";
        String expPassWord  = "Cybertek";
        String password = "Abc123";
        if(expUserName.equalsIgnoreCase (userName) &&  expPassWord.equals (password)) {
            System.out.println("Pass - user succcessfully logged in");
        }else{
            if (!expUserName.equalsIgnoreCase(userName)){
                System.out.println("Incorrect Username");

            }else{
                System.out.println("Incorrect password");
            }
        }


        }
    }
//}

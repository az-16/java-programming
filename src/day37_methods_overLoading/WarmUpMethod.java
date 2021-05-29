package day37_methods_overLoading;

public class WarmUpMethod {
    public static void main(String[] args) {
        loginVoid("cybertekStudent","abc123"); // POSITIVE TEST // SUNNY DAY
        loginVoid("cybertek", "answer"); //NEGATIVE TEST        // RAINY DAY SCENARIO
        loginVoid("", "");
       // System.out.println(loginVoid("cybertekStudent", "abc123")); //ERROR - VOID - no return value
        System.out.println(login("cybertekStudent","abc123"));

        if(login("cybertekStudent","abc123")){
            System.out.println("Login successful, welcome to Okta");
        }else{
            System.out.println("Login failed");
        }
        boolean isLoginSuccess = login("aizat", "91");
        System.out.println("isLoginSuccess = " +isLoginSuccess);

        if(login("aizat", "91")){
            System.out.println("Welcome to Canvas");
        }else{
            System.out.println("Something wrong with your credentials");
          // String ret =  System.out.println("hello"); //ERROR. IT IS VOID

        }
    }



    /**method:
    loginVoid
    params:
    String username, String password

return type:
    VOID

    in the method:
    Declare : String secretUsername ="cybertekStudent", secretPassword = "abc123"

if(both match)
    PRINT:
    Login Successful, welcome cybertekStudent
            ELSE
    PRINT:
    Incorrect username or password*/
    public static void loginVoid(String userName, String password){
        String secretUserName = "cybertekStudent";
        String secretPassword = "abc123";

        if(userName.equalsIgnoreCase(secretUserName) && password.equals(secretPassword)){
            System.out.println("Login Successful, welcome cybertekStudent");
        }else{
            System.out.println("Incorrect username or password");
        }
    }

    public static boolean login(String userName, String password){
        String secretUserName = "cybertekStudent";
        String secretPassword = "abc123";
        //we can also use at work shorter way. Specially booleans
       // return userName.equals(secretUserName) && password.equals(secretPassword);
        if(userName.equals(secretUserName) && password.equals(secretPassword)){
            return true; //return true, and exit method here. return false will not run
        }   //we can remove else here
            return false;
    }

}

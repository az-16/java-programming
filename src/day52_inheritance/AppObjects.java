package day52_inheritance;

public class AppObjects {
    //here we created app object for discord and instagram
    public static void main(String[] args) {
        MobileApp mobileApp = new MobileApp();
        mobileApp.setName("Youtube");
        mobileApp.useTheApp(10);

        Instagram instagram = new Instagram();
        instagram.setName("Instagram");
        instagram.setVersion(5.3);
        instagram.useTheApp(20); // 20 using the app 20 min

        Discord b22Discord = new Discord();
        b22Discord.setName("Discord");
        b22Discord.setVersion(6.234);
        b22Discord.useTheApp(100);
        b22Discord.download();
        b22Discord.printInfo();
        System.out.println(b22Discord.getName());
    }
}

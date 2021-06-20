package OfficeHours.Practice_6_15_2021;

public class EmailObjects {
    public static void main(String[] args) {

        //object for parent class
        Email email = new Email("Aizat@cybertekschool.com", 43);
        //email.ADDRESS = "email";ERROR: ADDRESS is final can not be chabge t
        System.out.println(email);
        System.out.println(Email.domain);
        System.out.println(Gmail.domain);
        System.out.println(Yahoo.domain);
        System.out.println();

        //object for chiled class
        Gmail gmail = new Gmail("Kamran@gmail.com", 120);
        System.out.println(gmail);
        System.out.println(Email.domain);
        System.out.println(Gmail.domain);
        System.out.println(Yahoo.domain);
        System.out.println();
        // one variable domain Email and Gmail both accessed that printing 2 times Gmail

        Yahoo yahoo = new Yahoo("jamesbond@yahoo.com", 44);
        System.out.println(Email.domain);
        System.out.println(Gmail.domain);
        System.out.println(Yahoo.domain);
        System.out.println();

        Email email2 = new Email("random@email", 4);
        System.out.println(Email.domain);
        System.out.println(Gmail.domain);
        System.out.println(Yahoo.domain);

        Email.sendEmail();
        Gmail.sendEmail();
        Gmail.sendSuperEmail();
        }
//here is no hiding just one static variable belongs 3 objects
    }


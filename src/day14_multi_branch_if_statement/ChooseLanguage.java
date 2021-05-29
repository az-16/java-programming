package day14_multi_branch_if_statement;

public class ChooseLanguage {
    public static void main(String[] args) {
/*
"hello, thank for your call"
          -> 2 : "hola, gracias para llamar"
          -> 3 : "merhaba, aradiginiz icin tesekkurler"
          -> 4 : "privet, spasibo za vash zvonok"
          -> 5 : "Merci ,pour votre appel"
          -----> "lets talk java and english, hello"
 */
        System.out.println("Choose your language");
        int selection = 6;
        if(selection==1) {
        System.out.println("Hello thank you for your call");
    }else if(selection==2) {
        System.out.println("Chong rahmat chalganynyzga");
    }else if(selection ==3) {
            System.out.println("Spasibo za vash zvonok");
        }else if(selection==4) {
            System.out.println("merhaba, aradiginiz icin tesekkurler");
        }else if(selection == 5) {
            System.out.println("Merci ,pour votre appel");
        }else if(selection == 6) {
            System.out.println("hola, gracias para llamar");

        }else{
            System.out.println("Lets talk Java!");
        }
    }
}

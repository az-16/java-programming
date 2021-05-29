package java_my_practice;

public class Unit2Session {
    public static void main(String[] args) {
        String str= "winter is coming";
        System.out.println(str.length());


        String a = "today I will go to the beach";
        boolean b = a.contains("i");
        boolean c = a.substring(12).startsWith("go");
        String result = b && c ? "go" : "don't go";
        System.out.println(result);

       String [] things = {"house", "shed", "slide", "zebra", "park", "garden"};
       for(String s : things){
           switch(s.charAt(1)){
               case 'h':
                   System.out.println(1);
                   break;
               case 'a':
                   System.out.println(2);
               case 's':
                   System.out.println(3);
                   break;
               case 'o':
               default:
                   System.out.println(4);
               case 'p':
                   System.out.println(5);
                   break;
               case 'z':
                   System.out.println(6);
               case 'l':
                   break;
               case 'g':
                   System.out.println(7);

           }
       }
        }

    }


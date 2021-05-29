package java_my_practice;

public class WhileHungry {
    public static void main(String[] args){
         boolean isHungry = true;
         int bananas = 0;
         int countToFull = 7;
         while(isHungry){
             bananas++;
             System.out.println("Eat banana " +bananas);
             if(bananas == countToFull){
                 isHungry = false;
             }
         }
        System.out.println("Had enough bananas. Let's coding");
    }
}

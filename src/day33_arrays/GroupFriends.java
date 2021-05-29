package day33_arrays;

public class GroupFriends {
    public static void main(String[] args) {
        /**
         * declare String array called friends
         * and assign all first names of your group friends
         *
         * Loop through the names in friends array
         * and print
         *     Happy Holidays Nancy!
         *     Happy Holidays Daud!
         */ //           0         1        3          4       5        6
   String[] friends = {"Maria", "Irina", "Gylia", "Meerim", "Artur", "Alena"};

   for (String eachFriend : friends) {
       System.out.println("Happy holidays " + eachFriend +"!");
   }

    String[] pictures = {"tree", "mountain", "bike", "car"};
   for( String eachPictures : pictures){
       System.out.println("Beautiful picture of " + eachPictures);
   }



    }
}

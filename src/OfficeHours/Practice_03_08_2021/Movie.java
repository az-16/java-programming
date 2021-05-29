package OfficeHours.Practice_03_08_2021;

public class Movie {
    public static void main(String[] args){

        /*
         Create a class Movie
    create a main method

    - Each the datatype you feel is most appropriate for each variable.

    - Create the following variables:
        name, genre, duration, release date, rating(G, PG, R, etc..), is a sequels or not, rotten tomatoes rating (out of 100), is on dvd.

    - Print out the Movie information using concatenations and print statements

    ------ Welcome to the Cinema ------

    Tonight we are streaming "$movieName" which was released on $releaseDate
    This $genre movie got a $rottenTomatoesRating rating on Rotten Tomatoes.
    The rating is $rating and it runs for $duration hours.
    This is a sequel $isSequel and is on dvd $isOnDvd.
  */
        String name = "$ Rotten Tomatoes";
        String genre = "Drama";
        int duration = 2;
        String rating = "***";
        boolean isASequelsOrNot = true;
        String rottenTomatoesRating = "86%";
        boolean isOnDvd = true;

        System.out.println("Name of the movie: \t" + name);
        System.out.println("Genre movie: \t\t" + genre);
        System.out.println("Duration movie is - " + duration + "hour 1m");
        System.out.println("Rating: \t\t\t" + rating);
        System.out.println("Is this movie a sequels or not? " + isASequelsOrNot);
        System.out.println("$ Rotten Tomatoes rating: " + rottenTomatoesRating);
        System.out.println("Is on DVD? \t\t\t" + isOnDvd);


    }
}

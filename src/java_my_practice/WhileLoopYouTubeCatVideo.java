package java_my_practice;

public class WhileLoopYouTubeCatVideo {
    public static void main(String[] args) throws InterruptedException {

        /**
         * "starting: World's smallest cat 🐈- BBC"
                *
         * int seconds = 0;
         *
         * video is 1 min 57 seconds
         *
         * while we did not reach to last second
         * print " Watching YouTube video: second: 1"
         *
         * print "Finished watching Cat video, lets start another one"
         */

        System.out.println("Starting: World's smallest cat \uD83D\uDC08- BBC");
       int seconds = 0;
       while( seconds <= 117){
           System.out.println(" Watching \uD83D\uDC08 YouTube video: second: 1" + seconds);
           seconds++;
           Thread.sleep(1000);
       }

        System.out.println("Finished watching Cat video, lets start another one");
    }
}

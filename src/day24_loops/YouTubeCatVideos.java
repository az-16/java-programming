package day24_loops;

public class YouTubeCatVideos {
    public static void main(String[] args) throws InterruptedException {


        /**
         * "starting: World's smallest cat 🐈- BBC"
         *
         * int seconds = 0;
         *
         * video is 1 min 57 seconds
         *
         * while we did not reach to last second
         *     print " Watching YouTube video: second: 1"
         *
         *
         * print "Finished watching Cat video, lets start another one"
         * You do not have permission to send messages in this channel.
         * ﻿
         */
        System.out.println("starting: World's smallest cat\uD83D\uDC08- BBC");

        int seconds  = 0;
        while(seconds <= 117){
            System.out.println(" Watching \uD83D\uDC08 YouTube video: second: 1 " + seconds);
            seconds ++;
            Thread.sleep(1000);
        }
        System.out.println("Finish watching the \uD83D\uDC08 video");
        System.out.println("Lets watch onother one!");





    }
}

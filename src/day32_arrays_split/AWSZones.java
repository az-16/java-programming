package day32_arrays_split;

public class AWSZones {
    public static void main(String[] args) {
        String app = "etsy";
        String zones = "us-east-1,us-west-2,us-west-1";

        System.out.println("----Deploying etsy app to AWS zones....");
        String[] zonesToDeploy = zones.split(","); //we splitting by comma ,
        //how can each loop zone
        for(String eachZone : zonesToDeploy) {
            System.out.println("Deploying ["+app+"] to " + eachZone +"...");
            /**
             * Deploying etsy to us-east-1...
             * Deployment completed for us-east-1
             *
             *
             * Deploying etsy to us-west-1...
             * Deployment completed for us-west-1
             *
             * Deploying etsy to us-west-2...
             * Deployment completed for us-west-2
             *
             *
             * ---All deployments complete----
             * You do not have permission to send messages in this channel.
             */

        }
        System.out.println("----All deployments complete, traffic enabled----");
    }
}

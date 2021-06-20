package day52_inheritance;

public class MobileApp { //our parent class

   private String setName;
  private double version;

    public String getName() {
        return setName;
    }

    public void setName(String name) {
        this.setName = name;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    protected boolean download() {
       System.out.println("App: " + setName +" version" + version +" is downloaded");
       return true;
   }

   public void useTheApp(int minutes) {
       System.out.println("Using " + setName + " app for " + minutes + " minutes");
   }

}

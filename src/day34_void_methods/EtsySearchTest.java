package day34_void_methods;

public class EtsySearchTest {
    public static void main(String[] args) {
        System.out.println("--Starting Etsy Search Smoke Test--");
        openBrowser(); //we called CUSTOM METHOD
        navigateToEtsyUrl();
        searchForWoodenSpoon();
        verifyResultsAreDisplayed();
        System.out.println("---Etsy Search Smoke Test completed - Pass -");
    }

    public static void openBrowser(){
        System.out.println("Launching Chrome browser");
        System.out.println("Browser");
    }
    public static void navigateToEtsyUrl(){
        System.out.println("Navigating to https://www.etsy.com");

    }
   public static void searchForWoodenSpoon(){
       System.out.println("Verify Etsy home page is displayed");
       System.out.println("Type 'Wooden Spoon' in search field and click search");

   }
    public static void verifyResultsAreDisplayed(){
        System.out.println("PASS: Search results are successfully displayed");
    }


}


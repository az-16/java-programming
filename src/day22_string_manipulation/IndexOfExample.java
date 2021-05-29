package day22_string_manipulation;

public class IndexOfExample {
    public static void main(String[] args) {
        String technologies = "java, html, css, selenium, testng, maven, cucumber";
       //first comma
        System.out.println(technologies.indexOf(",")); // 4
        // last comma
       System.out.println(technologies.lastIndexOf(","));
        // for middle one we need to LOOP
        int indexOfJava = technologies.indexOf("java"); //here we storing variable
        System.out.println("java is at index " + indexOfJava);

        int idxOfCss = technologies.indexOf("css");
        System.out.println("CSS is at index " + idxOfCss);

        int idxOfCucumber = technologies.indexOf("cucumber");
        System.out.println("Cucumber is at index " + idxOfCucumber);

        int idxSql = technologies.indexOf("Sql");
        System.out.println("Sql is at index " + idxSql); //  not present -1

        //if technologies contains maven
        if ( technologies.contains("maven")) {
            System.out.println("maven is present");
        }else{
            System.out.println("maven is not present");
        }

        if(technologies.indexOf("maven")> -1){
            System.out.println("maven is present");
        }else{
            System.out.println("maven is not present");
        }
    }
}

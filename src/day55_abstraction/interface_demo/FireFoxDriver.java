package day55_abstraction.interface_demo;

public class FireFoxDriver implements WebDriver{
    @Override
    public void get(String url) {
        System.out.println("FireFox - naviagting to " + url);

    }

    @Override
    public void findElement(String locator) {

    }

    @Override
    public void quit() {

    }

    @Override
    public String getTitle() {
        return null;
    }
}

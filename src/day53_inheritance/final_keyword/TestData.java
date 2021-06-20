package day53_inheritance.final_keyword;

/**
 * TestData that has a list of Contants.
 * Values of below variables cannot be changed anywhere
 */
public final class TestData { //what happened if I make my class final
    public static final String ADMIN_USERNAME = "admin";
    public static final String ADMIN_PASSWORD = "PASSWORD123";
    public static final int MAX_WAIT_TIME = 60;
    public static final boolean STOP_IF_FAIL = true;
}
/**
 * ERROR: Cannot inherit from final class
 */
//class Child extends TestData
//}
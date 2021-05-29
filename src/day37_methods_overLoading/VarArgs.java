package day37_methods_overLoading;

public class VarArgs {
    public static void main(String[] args) {
        addNumbers(3, 19);
        addNumbers(23, 78);
        addNumbers(23,44,2,2,45,232435,45,454,4,4);
        addNumbers();

        //int... myNumber = 10, 4; ERROR, var-args can only be used as method parameter
    }
    //varargs
    public static void addNumbers(int... nums) { //... -> means 0 or more arguments
        //inside the method, it is used as regular array
        int sum = 0;
        for(int n : nums){
            sum += n;
        }
        System.out.println("sum = " +sum);
    }

}

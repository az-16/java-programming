package day30_arrays;

public class StudentArray {
    public static void main(String[] args) {

        /**
         * id        - 0
         * firstName - 1
         * lastName  - 2
         * batchNum  - 3
         * phoneNum  - 4
         * Declare student array and store 5 String values
         * two ways declaring
         *  String[] student1 = {"1234", "Adam"...};
         * String[] student2 = new String[5];
         */
        //longer way is good when you don't know the value
        String[] student1 = new String[5];
        student1[0] = "AD123";
        student1[1] = "Ilon";
        student1[2] = "Mask";
        student1[3] = "B22";
        student1[4] = "312 914 54 56";
        //shorter way
        String[] student2 = {"1234", "Aizat", "Kalybek", "B22", " 312 9145656"};
        System.out.println("student1 id = " + student1[0]);
        System.out.println("student1 firstName = " + student1[1]);
        System.out.println("student1 lastName = " + student1[2]);
        System.out.println("student1 batchName = " + student1[3]);
        System.out.println("student1 phoneNumber = " + student1[4]);

        // check if student1 data array contains 5 items
        //true: PASS: Student1 data array has correct length
        //false: FAIL: data array has incorrect length

        if (student1.length == 5) {
            System.out.println("PASS: Student1 data array has correct length");
        } else {
            System.out.println("FAIL: data array has incorrect length");


            /**check if student1 data array contains 5 items.
             true: PASS: data array has correct length
             false: FAIL: data array has incorrect length */
            if (student1.length == student2.length) {
                System.out.println("PASS: data arrays length match");

            } else {
                System.out.println("FAIL: data arrays length mismatch");
            }
            /**
             * read from array and print first name and last name in all uppercase
             * ADAM SMITH
             * */
        }
                               // Ilon      ILON                    Mask        MASK
            System.out.println(student1[1].toUpperCase() + " " + student1[2].toUpperCase());

        // read mobile from array and store into variable
        String mobileNum = student1[4];
        System.out.println(mobileNum.length());
        System.out.println(mobileNum.startsWith("312"));



    }
}



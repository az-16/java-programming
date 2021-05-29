package java_my_practice;

public class ForEachLoopArray {
    public static void main(String[] args) {
   // keep in mind when array we have indexes
   //                  0   1    2    3   4   5    10  11  12   13
        int[] data = {28, 347, 987, 23, 456, 99, 378, 29, 837, 329}; // iteration
        // for each loop
        for( int eachNum : data){
            System.out.println(eachNum);
        }

        for(int a : data){
            System.out.print(a + " ");

        }
        System.out.println("------FOR LOOP------"); // we have to print emty space. otherwise 0 will be printed with before printed numbers

        // repeat above for loop
        for(int i = 0; i < data.length; i++) {
           // System.out.println(i); // this option will give just numbers b/c array
            System.out.println(data[i]); // here will print index numbers

        }
        // print last value in array using length - 1
                                        // 14 -1
            System.out.println("Last value: " + data[data.length-1]);
        //print all numbers backwards in same line (reverse way);
        for(int idx = data.length - 1; idx >= 0; idx--) {
            System.out.print(data[idx] + " ");
        }
        }


    }


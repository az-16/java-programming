package day14_multi_branch_if_statement;

public class YesOrNo {
    public static void main(String [] args){
        System.out.println("do you delete this file?");
        char selection = 'm';
        boolean answer;
        String result; //it could be string or any. You can do different way
        if(selection=='y') {
            System.out.println("your file will be deleted");
            answer =true;
            result = "deleted";
        }else{
            System.out.println("File deletion cancelled");
            answer = false;
            result = "not deleted";
        }
        System.out.println("Did file get deleted? - " + answer);
        System.out.println("Did file gt deleted? - " + result);
    }

}

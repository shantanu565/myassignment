package Exercise1;

public class Ques8 {
    //Write a program to reverse a string and remove character from index 4 to index 9 from the reversed string using String Buffer
    public static void main(String[] args){
        StringBuffer s=new StringBuffer("Here for testing purpose");
        System.out.println("String buffer  = " + s);


        s.reverse();
        System.out.println("String buffer after reversing = " + s);
        s.delete(4, 9);
        System.out.println("Result: " + s);
    }

}

package Exercise1;

public class Ques7 {
    //Write a program to print your Firstname,LastName & age using static block,static method & static variable respectively

    public static String firstname="Shantanu";
    static String lastname="Saxena";
    static int age=20;

    //block
    static {
        System.out.println(firstname+"from static block");
    }



    public static void main(String[] args){
        printdetail();
        System.out.println(age+"from variable");

    }

    //method
    public static void printdetail () {
        System.out.println(lastname+"from static method");
    }}

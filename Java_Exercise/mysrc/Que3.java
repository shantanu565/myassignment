package Exercise1;

public class Que3 {
    //Write a program to find the number of occurrences of a character in a string without using loop
    public static void main(String[] args){
        String str = "This is cat dog cat dog";
        System.out.println("Length Of String:" + str.length());
        System.out.println("Length Of String Without a :" + str.replace("a", "").length());
        int charcount = str.length() - str.replaceAll("a", "").length();
        System.out.println("Occurrence Of A Char In String: " + charcount);
    }
}

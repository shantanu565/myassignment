package Exercise1;

import java.text.DecimalFormat;

public class Que4 {
    public static void main(String[] args){
        //Calculate the number & Percentage Of Lowercase Letters,Uppercase Letters, Digits And Other Special Characters In A String
        String inputString="This is cat dog cat dog CAT DOG";
        int totalChars = inputString.length();


        int upperCaseLetters = 0;

        int lowerCaseLetters = 0;

        int digits = 0;

        int others = 0;



        for (int i = 0; i < inputString.length(); i++)
        {
            char ch = inputString.charAt(i);

            //If ch is in uppercase, then incrementing upperCaseLetters

            if(Character.isUpperCase(ch))
            {
                upperCaseLetters++;
            }

            //If ch is in lowercase, then incrementing lowerCaseLetters

            else if(Character.isLowerCase(ch))
            {
                lowerCaseLetters++;
            }

            //If ch is a digit, then incrementing digits

            else if (Character.isDigit(ch))
            {
                digits++;
            }

            //If ch is a special character then incrementing others

            else
            {
                others++;
            }
        }

        //Calculating percentage of uppercase letters, lowercase letters, digits and other characters

        double upperCaseLetterPercentage = (upperCaseLetters * 100.0) / totalChars ;

        double lowerCaseLetterPercentage = (lowerCaseLetters * 100.0) / totalChars;

        double digitsPercentage = (digits * 100.0) / totalChars;

        double otherCharPercentage = (others * 100.0) / totalChars;

        DecimalFormat formatter = new DecimalFormat("##.##");

        //Printing percentage of uppercase letters, lowercase letters, digits and other characters

        System.out.println("In '"+inputString+"' : ");

        System.out.println("Uppercase letters are "+formatter.format(upperCaseLetterPercentage)+"% ");

        System.out.println("Lowercase letters are "+formatter.format(lowerCaseLetterPercentage)+"%");

        System.out.println("Digits Are "+formatter.format(digitsPercentage)+"%");

        System.out.println("Other Characters Are "+formatter.format(otherCharPercentage)+"%");

        System.out.println("-----------------------------");
    }
}

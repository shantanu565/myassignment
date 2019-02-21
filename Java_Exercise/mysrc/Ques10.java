package Exercise1;

public class Ques10 {
    /*
    Q10.Write a single program for following operation using overloading
  A) Adding 2 integer number
  B) Adding 2 double
  C) multiplying 2 float
  D) multiplying 2 int
  E) concate 2 string
  F) Concate 3 String
     */

        void sum(int a,int b){
            System.out.println(a+b);
        }
        void sum(double a,double b){
            System.out.println(a+b);
        }
    void multi(float a,float b){
            System.out.println(a*b);
        }
    void multi(int a,int b){
            System.out.println(a*b);}

        void concatit(String s1,String s2){
            System.out.println(s1+s2);
        }
    void concatit(String s1,String s2,String s3){
        System.out.println(s1+s2+s3);
    }

        public static void main(String args[]){
            Ques10 o=new Ques10();
            o.sum(20,20);//now second int literal will be promoted to long
            o.sum(20.1,25.3);
            o.multi(5.7676f, 7.86785f);
            o.multi(4,6);
            o.concatit("Learn","it");
            o.concatit("This","long","version");

        }

}

package Exercise1;

public class Ques11 {
    //Create 3 sub class of bank SBI,BOI,ICICI all 4 should have method called getDetails which provide there specific details like rateofinterest etc,print details of every banks

    public static void main(String args[]) {
          Bank a =new Bank();
          Bank b=new SBI();
          Bank c=new BOI();
          Bank d=new ICICI();

          a.getDetails();
          b.getDetails();
          c.getDetails();
          d.getDetails();

        }
    }

    class Bank {
     int rateofInterest=30;

        public void getDetails() {
            System.out.println("Rate of interest  of Bank:" +rateofInterest);
        }
    }

    class SBI extends Bank {
        int rateofInterest=10;

        public void getDetails() {
            System.out.println("Rate of interest  of SBI Bank:" +rateofInterest);
        }

    }

    class BOI extends Bank {
        int rateofInterest=40;

        public void getDetails() {
            System.out.println("Rate of interest  of BOI Bank:" +rateofInterest);
        }


    }
     class ICICI extends Bank {
         int rateofInterest=60;

         public void getDetails() {
             System.out.println("Rate of interest  of ICICI Bank:" +rateofInterest);
         }



}

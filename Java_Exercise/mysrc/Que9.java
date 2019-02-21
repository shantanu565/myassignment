package Exercise1;


enum House {
    FLAT(5000),HOSTEL(10000),PG(9000),APPARTMENT(6000),BANGLOW(50000);

    private int price;
    House(int p) {
        price = p;
    }
    int getPrice() {
        return price;
    }
}
 class Ques9 {
    public static void main(String args[]){
        System.out.println("House prices:");
        for (House h : House.values()) System.out.println(
                h + " costs " + h.getPrice() + " thousand dollars.");
    }
}


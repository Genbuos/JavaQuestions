package Javawork2;

public class idek {
    public static void main(String[] args) {


        /*GIVEN THE DATA BELOW!
                ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                        Distance 	    = Fee
        0 -  5 miles  = $2
        5 - 15 miles  = $5
        15 - 25 miles = $10
        25 - 50	miles = $15
        More than 50 miles = $20
                +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++



                WRITE A PROGRAM THAT CALCULATES TOTAL COST OF USER'S ITEMS
        YOUR OUTPUT SHOULD BE FORMATTED AS SEEN BELOW!!
                ________________________________________________



        Product      Qty      Price       Miles      Total
                ----         ---      -----      -----      -----
                Rice          20        5.0       10.0      105.0

        Thank you. Come Again!!!*/

        String coll1 ="Product";
        String coll2 = "Qty";
        String coll3 = "Price";
        String coll4 = "Miles";
        String coll5 = "Total";
        String prod = "rice";

      int userDistance = 10;
      int distancefee = 0;

       int price = 5;
       int Quantity = 20;




       if (userDistance<= 5){
           distancefee = 2;
       }if (userDistance>5){
           if (userDistance<=15);
           distancefee = 5;

        }if (userDistance>15){
           if (userDistance<=25);
           distancefee = 10;
        }if (userDistance> 25){
           if (userDistance<=50);
           distancefee = 15;
        }if (userDistance> 50){
           distancefee = 20;
        }
        int total = (Quantity * price) + distancefee;


        System.out.printf(coll1 + " --- " + coll2 + " --- " + coll3 + " --- " + coll4 +" --- " +coll5 + " --- \n");

        System.out.printf(prod + "      " + Quantity + "          " + price + "     " + userDistance + "           " + total +"\n"  );
        System.out.println("-----------------------------------------------");
        System.out.println("Thank you come again!!!");














    }
}

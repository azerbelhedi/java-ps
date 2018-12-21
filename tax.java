import java.util.Scanner ;

class Main{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in) ;

        double oldTax , price , newTax ;
        oldTax = keyboard.nextDouble() ;
        newTax = keyboard.nextDouble() ;
        price = keyboard.nextDouble() ;
        //System.out.println(oldTax + " " + price + " " + newTax) ;
        price = ( price/(100 + oldTax) ) * (100+newTax) ;
        // double dPrice = new Double(Math.round(price*100))/100 ;
        double dPrice =  Math.round(price*100); 
        //System.out.println(price) ;
        System.out.println(dPrice/100) ; 
    }
}
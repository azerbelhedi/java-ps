import java.util.Scanner ;

class Main{
    public static void main(String[] args){
        int myPosition , cityPosition , cities , close = 0;
        //System.out.println("hello again") ;
        Scanner keyboard = new Scanner(System.in) ;
        myPosition = keyboard.nextInt() ;
        //System.out.println("my position is : " + myPosition) ;
        cities = keyboard.nextInt() ;
        for(int i = 0 ; i < cities ; i++){
            cityPosition = keyboard.nextInt() ;
            if(Math.abs(cityPosition - myPosition) <= 50){close++ ;}
        }
        System.out.print(close) ;   
    }
}
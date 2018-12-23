 import java.util.Scanner ;

 class Main{
     public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in) ;
        int n ;
        String[] lines = new String[100] ;
        n = keyboard.nextInt() ;
        n++ ;
        for(int i = 0 ; i < n ; i++){
            lines[i] = keyboard.nextLine() ;
        }    
        //System.out.println("now") ;
        for(int i = 1 ; i < n ; i=i+2 ){
            System.out.println(lines[i]) ;
        }
    }
 }
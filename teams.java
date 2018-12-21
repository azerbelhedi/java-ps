import java.util.Scanner ;

class Main{
    public static void main(String[] args){
        //System.out.println("start teams") ;
        int n ;
        int w1 = 0 , w2 = 0 ;
        Scanner keyboard = new Scanner(System.in) ;
        n = keyboard.nextInt() ;
        //System.out.println(i) ;
        for(int i = 0 ; i < n ; i++ ){
            int a ;
            a = keyboard.nextInt() ;
            w1 += a ;
            a = keyboard.nextInt() ;
            w2 += a ;
        }
        if(w1 > w2){
            System.out.println("L'équipe 1 a un avantage") ;
        }
        else{
            System.out.println("L'équipe 2 a un avantage") ;
        }
        System.out.println("Poids total pour l'équipe 1 : " + w1) ;
        System.out.println("Poids total pour l'équipe 2 : " + w2) ;
    }
}

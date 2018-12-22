import java.util.Scanner ;

class Main{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in) ;
        int[] steps = new int[1000] ;
        int nSteps = keyboard.nextInt() ;
        for(int i = 0 ; i < nSteps ; i++){
            steps[i] = keyboard.nextInt() ;
        }
        for(int i = nSteps - 1 ; i >= 0 ; i--){
            if(steps[i] == 1){System.out.println(2) ; }
            else if(steps[i] == 2){System.out.println(1) ; }
            else if(steps[i] == 3){System.out.println(3) ; }
            else if(steps[i] == 4){System.out.println(5) ; }
            else if(steps[i] == 5){System.out.println(4) ; }
        }
    }

}
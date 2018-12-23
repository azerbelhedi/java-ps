import java.util.Scanner ;

class Main{
    public static int extraLove(int n){
        if(n<=9){return n ; }
        else{
            int s = 0 ;
            while(n != 0){
                s += n % 10 ;
                n /= 10 ;
            }
            return extraLove(s) ;
        }
    }

    public static int love(String name){
        int sum = 0 ;
        int number ;
        for(int i = 0 ; i < name.length(); i++){
            number = name.charAt(i) ;
            number -= 65 ;
            //System.out.println(number) ;
            sum += number ;
        }
        return extraLove(sum) ;
    }
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in) ;
        //System.out.println("hello love") ;
        String name1 , name2 ;
        name1 = keyboard.next() ;
        name2 = keyboard.next() ;
        System.out.print(love(name1) + " " + love(name2)) ;
    }
}
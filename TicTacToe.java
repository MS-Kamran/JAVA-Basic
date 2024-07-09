import java.util.Scanner;
public class TicTacToe{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        boolean win = false;
        int cnt = 0;
        
        char [] c = {'1','2','3','4','5','6','7','8','9'};
        
        System.out.println("X : it's your turn");
        
        while(cnt < 9){
            for (int i = 0; i<9; i++){
                if(i == 2 || i == 5 || i == 8){
                    System.out.print(c[i]);
                    System.out.println();
                } else {
                    System.out.print(c[i]);
                }
            }
            
            System.out.println(" Please enter one of the digits shown on the board.");
            int box = sc.nextInt();
            box -= 1;
            
            if(c[box] == 'X' || c[box] == 'O' || box > 8 || box < 0){
                System.out.println("Invalid Input");
                continue;
            }
            
            if(cnt%2 == 0){
                c[box] = 'X';
            }else{
                c[box] = 'O';
            }
            
            if(c[0] == 'X' && c[1] == 'X' && c[2] == 'X' || 
               c[3] == 'X' && c[4] == 'X' && c[5] == 'X' ||
               c[6] == 'X' && c[7] == 'X' && c[8] == 'X' ||
               c[0] == 'X' && c[3] == 'X' && c[6] == 'X' ||
               c[1] == 'X' && c[4] == 'X' && c[7] == 'X' ||
               c[2] == 'X' && c[5] == 'X' && c[8] == 'X' ||
               c[6] == 'X' && c[4] == 'X' && c[2] == 'X' ||
               c[0] == 'X' && c[4] == 'X' && c[8] == 'X'){
                
                System.out.println("X win");
                win = true;
                break;
            }
            
            if(c[0] == 'O' && c[1] == 'O' && c[2] == 'O' || 
               c[3] == 'O' && c[4] == 'O' && c[5] == 'O' ||
               c[6] == 'O' && c[7] == 'O' && c[8] == 'O' ||
               c[0] == 'O' && c[3] == 'O' && c[6] == 'O' ||
               c[1] == 'O' && c[4] == 'O' && c[7] == 'O' ||
               c[2] == 'O' && c[5] == 'O' && c[8] == 'O' ||
               c[6] == 'O' && c[4] == 'O' && c[2] == 'O' ||
               c[0] == 'O' && c[4] == 'O' && c[8] == 'O'){
                
                System.out.println("O win");
                win = true;
                break;
            }
            cnt++;
        }
        
        if(win == false){
            System.out.println("Match Draw");
        }
    }
}
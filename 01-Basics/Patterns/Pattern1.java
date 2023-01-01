//https://practice.geeksforgeeks.org/problems/square-pattern/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_1
class Solution {

    void printSquare(int n) {
        // code here
        
        //row
        for(int row = 1 ; row<=n ; row++){
            
            //column
            for(int col = 1; col <= n ; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
    //main end
}

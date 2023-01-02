// if-else (Decision Making) 
//https://practice.geeksforgeeks.org/problems/java-switch-case-statement3529/1


// User function Template for Java
class Solution{
    static double switchCase(int choice, List<Double> arr){
        // code here
       double area = 0;
       
       switch(choice){
            // area of Circle
            case 1 : area =  (Math.PI * arr.get(0) * arr.get(0));
                     break;
            // area of Rectangle
            case 2 :  area = (arr.get(0) * arr.get(1));
                     break;
        }
        return area;
    }
    //function end
}

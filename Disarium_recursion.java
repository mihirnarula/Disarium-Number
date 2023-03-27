// disarium number using recursion
package disarium_recursion;
import java.util.*;
public class Disarium_recursion {

    int num;
    int size;
    
    Disarium_recursion(int nn){
        num = nn;
        size = 0;
    }
    void countdigit(){
        int p = num;
        while(p>0){
            p = p/10;
            size++;
        }
    }
    int sumofdigits(int n, int p){
        int d, sum = 0;
        
        for(int i = p-1; i >= 0; i--){
            d = n/(int)(Math.pow(10, i));
            sum = sum + (int)(Math.pow(d,p-1));
            n = n%(int)(Math.pow(10,i));
            }
    return sum;
    }
    
    void check(){
        if(sumofdigits(num,size) == num)
            System.out.println("Disarium Number");
        else
            System.out.println("Not a disarium Number");
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter anumber");
        int no = sc.nextInt();
        Disarium_recursion ob = new Disarium_recursion(no);
        ob.countdigit();
        ob.check();
    }
    
}

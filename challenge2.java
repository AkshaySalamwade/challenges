import java.util.*;
 
class challenge2 {
 
    
    static void printZigZagConcat(String str,int n)
    {
 
        
        if (n == 1)
        {
            System.out.print(str);
            return;
        }
        char[] str1 = str.toCharArray();
 
        
        int len = str.length();
 
        
        String[] arr = new String[n];
        Arrays.fill(arr, "");
 
        
        
        int row = 0;
        boolean down = true; // True if we are moving
        
        for (int i = 0; i < len; ++i)
        {
            
            arr[row] += (str1[i]);
 
           
            if (row == n - 1)
            {
                down = false;
            }
             

            else if (row == 0)
            {
                down = true;
            }
 
            
            if (down)
            {
                row++;
            }
            else
            {
                row--;
            }
        }
 
        
        for (int i = 0; i < n; ++i)
        {
            System.out.print(arr[i]);
        }
    }
 
    
    public static void main(String[] args)
    {   Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        
        int n = sc.nextInt();
        printZigZagConcat(str, n);
    }
}
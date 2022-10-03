/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ThinkPad T490
 */
public class MathUtil {
    // ham tinh n! = 1.2.3.4...n
    // 0!=1!= 1 quy uoc
    // vi giai thua tang cuc manh, 21! tran kieu long (18 so 0)
    // ko co giai thua am
    // quy uoc n nhan vao 0...20
    public static long getFactorial(int n){
        if (n < 0 || n> 20)
            throw new IllegalArgumentException("Invalid argument. n must be between 0 -> 20");
       
        if (n == 0 || n == 1)
            return 1;
            
        long product = 1;
        //tich khoi dau la 1
        for (int i = 2; i <= n; i++) 
            product *= i; 
        
        return product;
        
    }
}

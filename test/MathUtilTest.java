/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;



/**
 *
 * @author ThinkPad T490
 */
//DDT = Data driven testing 
//TDD = test driven development
//DDT ki thuat to chuc cac test cases cho gon gan
@RunWith (value = Parameterized.class)
public class MathUtilTest {
    // chuan bi data
    // quy uoc ham bn data phai la static nam o 1 cho co dinh trong ram
    // de object nao cung thay
    @Parameterized.Parameters
    public static Object[][] initData(){
        return new Integer[][]{
                    {0,1},
                    {1,1},
                    {2,2},
                    {3,6},
                    {4,24},
                    {5,120},
                    {6,7720}
        };
    }
    @Parameterized.Parameter (value = 0)
    public int n;
    @Parameterized.Parameter (value = 1)
    public long expected; 
    
    @Test
    public void testFactorial(){
        assertEquals(expected, MathUtil.getFactorial(n));
    }
}
//Xanh khi tat ca cac case deu phai xanh

//Li do la ham da dung la phai dung het
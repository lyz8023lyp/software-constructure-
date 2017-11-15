/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import static org.testng.Assert.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 *
 * @author yiwzhong
 */
public class ToolsNGTest {
    
    public ToolsNGTest() {
    }

    /**
     * Test of toBinary method, of class Tools.
     */
    @Test(enabled = true)
    public void testToBinary() {
    	Object[][] datas = new Object[][] {{1, "1"},{8,"1000"},
    		{15,"1111"},{2017,"11111100001"},{332,"101001100"}
        };
        for (Object[] data : datas) {
            String result = Tools.toBinary((Integer)data[0]);
            String expResult = (String) data[1];
            assertEquals(result, expResult);
        }
    }


	/**
     * Test of toOctal method, of class Tools.
     */
    @Test(enabled = true)
    public void testToOctal() {
    	Object[][] datas = new Object[][] {{201710, "611756"},{100,"144"},
    		{1000,"1750"},{2017,"3741"},{332,"514"}
        };
        for (Object[] data : datas) {
            String result = Tools.toOctal((Integer)data[0]);
            String expResult = (String) data[1];
            assertEquals(result, expResult);
        }
    }

    /**
     * Test of toHexadecimal method, of class Tools.
     */
    @DataProvider(name="dataForHexadecimal")
    public Object[][] dataForIsHexadecimal(){
    	return new Object[][] {{0, "0"},{8,"8"},
    		{15,"F"},{2017,"7E1"},{332,"14C"}
    		};
    }
    @Test(dataProvider="dataForHexadecimal")
    public void testToHexadecimal(int num,String exp) {
    	String string = Tools.toHexadecimal(num);
    	assertEquals(string, exp);
    }

    /**
     * Test of toOther method, of class Tools.
     */
    @DataProvider(name="dataForOther")
    public Object[][] dataForIsOther(){
    	return new Object[][] {{03741,8,"2017"},{01750,8,"1000"},
    		{0b1111,2,"15"},{0b111111111111111101001100,2,"16777036"},{0xA83D,16,"43069"},
    		{0x1F,16,"31"}
    		};
    }
    @Test(dataProvider="dataForOther")
    public void testToOther(int num, int d, String exp) {
    	String string = Tools.toOther(num, d);
    	assertEquals(string, exp);
    }
    
    /**
     * Test of toChar method, of class Tools.
     */
    /*@Test
    public void testToChar() {
        Object[][] datas = new Object[][] {{1, '1'},
            {5,'5'}, {10,'A'}, {11, 'B'}, {12, 'C'},
            {13, 'D'}, {14,'E'}, {15,'F'}
        };
        for (Object[] data : datas) {
            char result = Tools.toChar((Integer)data[0]);
            char expResult = (Character)data[1];
            assertEquals(result, expResult);
        }
    }
    @DataProvider(name="dataForMatch")
    public Object[][] dataForIsMatch() {
        return new Object[][] { {"12+[(12+23)*4)*5", false},
                {"12+[(12+23)+15]*12", true},
                {"[[(])]", false},
                {"([])()[]", true}};
    }*/

    /**
     * Test of isMatch method, of class Tools.
     */
    /*@Test(dataProvider="dataForMatch")
    public void testIsMatch(String exp, boolean expResult) {
        System.out.println("isMatch");
        boolean result = Tools.isMatch(exp);
        assertEquals(result, expResult);
    }*/
      
}

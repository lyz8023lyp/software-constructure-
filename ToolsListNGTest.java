import static org.testng.Assert.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToolsListNGTest {
    
    public ToolsListNGTest() {
    }

    /**
     * Test of toBinary method, of class Tools.
     */
    @Test(enabled = true)
    public void testToBinary() {
    	Object[][] datas = new Object[][] {{0, "0"},{8,"1000"},
    		{15,"1111"},{2017,"11111100001"},{332,"101001100"}
        };
        for (Object[] data : datas) {
            String result = ToolsList.toBinary((Integer)data[0]);
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
            String result = ToolsList.toOctal((Integer)data[0]);
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
    	String string = ToolsList.toHexadecimal(num);
    	assertEquals(string, exp);
    }

    /**
     * Test of toOther method, of class Tools.
     */
    @DataProvider(name="dataForOther")
    public Object[][] dataForIsOther(){
    	return new Object[][] {{03741,8,"2017"},{01750,8,"1000"},
    		{0b1111,2,"15"},{0b101001100,2,"332"},{0xA83D,16,"43069"},
    		{0x1F,16,"31"}
    		};
    }
    @Test(dataProvider="dataForOther")
    public void testToOther(int num, int d, String exp) {
    	String string = ToolsList.toOther(num, d);
    	assertEquals(string, exp);
    }
      
}


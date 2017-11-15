

public class ToolsList {
	static LinkedStack linkedStack = new LinkedStack();
	/**
     * ��ʮ������numת��Ϊ����������������Ӧ�Ķ����������ַ����ķ�ʽ����
     * 
     * @param num
     * @return 
     */
	public static String toBinary(int num) {
		linkedStack.clear();
		boolean Judge = false;
		int n = 0;
		while(!Judge)
		{
			if(num < 2) {
				linkedStack.push(num);
				Judge = true;
			}else {
				n = num%2;
				num = num/2;
				linkedStack.push(n);
			}
		}
		String string = "";
    	int size = linkedStack.size();
    	for(int i = size;i > 0;i--)
    	{
    		string = string + linkedStack.pop();
    	}
        return string;
	}
	/**
     * ��ʮ������numת��Ϊ�˽�������������Ӧ�İ˽��������ַ����ķ�ʽ����
     * 
     * @param num
     * @return 
     */
	public static String toOctal(int num) {
    	linkedStack.clear();
    	boolean Judge = false;
    	int n = 0;
    	while(!Judge) {
    		if(num < 8) {
    			linkedStack.push(num);
    			Judge = true;
    		}else {
    			n = num%8;
    			num = num/8;
    			linkedStack.push(n);
    		}
    	}
    	String string = "";
    	int size = linkedStack.size();
    	for(int i = size;i > 0;i--)
    	{
    		string = string + linkedStack.pop();
    	}
        return string;
    }
	/**
     * ��ʮ������numת��Ϊʮ����������������Ӧ��ʮ�����������ַ����ķ�ʽ����
     * 
     * @param num
     * @return 
     */
    public static String toHexadecimal(int num) {
    	linkedStack.clear();
    	int n = 0;
    	boolean Judge = false;
    	while(!Judge) {
    		if(num < 16) {
    			linkedStack.push(num);
    			Judge = true;
    		}else {
    			n = num%16;
    			num = num/16;
    			linkedStack.push(n);
    		}
    	}
    	int size = linkedStack.size();
    	String string = "";
    	int x = 0;
    	char y = 'A';
    	for(int i = size; i > 0;i--) {
    		x = (int) linkedStack.pop();
    		if(x < 10)
    			string = string + x;
    		else {
    			y = (char) ('A' + x - 10);
    			string = string + y;
    		}
    	}
        return string;
    }
    /**
     * ����ջ��10����������numת��Ϊd���ƣ�dΪ2��8����16 
     * 
     * @param num
     * @param d
     * @return 
     */
    public static String toOther(int num, int d) {
    	int sum = 0;
    	String string = "";
    	int n = 0;
    	linkedStack.clear();
    	switch (d) {
		case 2:
			int binary = 1;
			while(true) {
				if(num < 2)
				{
					linkedStack.push(num*binary);
					break;
				}else {
					n = num%2;
					num = num/2;
					linkedStack.push(n*binary);
					binary = 2*binary;
				}
			}
			break;
		case 8:
			int Octal = 1;
			while(true) {
				if(num < 8)
				{
					linkedStack.push(num*Octal);
					break;
				}else {
					n = num%8;
					num = num/8;
					linkedStack.push(n*Octal);
					Octal = 8*Octal;
				}
			}
			break;
		case 16:
			int Hexadecimal = 1;
			while(true) {
				if(num < 16)
				{
					linkedStack.push(num*Hexadecimal);
					break;
				}else {
					n = num%16;
					num = num/16;
					linkedStack.push(n*Hexadecimal);
					Hexadecimal = 16*Hexadecimal;
				}
			}
			break;
		default:
			string = string + "����Ľ��ƴ���";
			return string;
		}
    	int size = linkedStack.size();
    	for(int i = size;i > 0;i--) {
    		sum = sum + (int)linkedStack.pop();
    	}
    	string = string + sum;
    	return string;
    }
}

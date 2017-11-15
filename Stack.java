public interface Stack {
    Object pop();   //抛出栈顶元素
    Object peek();  //查看栈顶元素
    void push(Object e); //放入一个元素
    void clear(); //清空栈
    int size();  //栈的大小
    boolean isEmpty();  //判断栈是否为空
}


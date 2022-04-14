/**
 * Created by Administrator on 3/24/2022.
 */
public class Calculator {
    public int sum(int a,int b)
    {
        return a+b;
    }
    public int sub(int a,int b)
    {
        return a-b;
    }
    public int divide(int a,int b)
    {
       if (b==0)
            throw new IllegalStateException("zero divition");
        return a/b;
    }


    public int add(int A,int B){
        return A+B;
    }

}

import org.junit.Test;

import static org.junit.Assert.*;

public class BankTest {
    Bank b = new Bank();

    @Test
    public void divOf12and4shouldReturn3()
    {
        if(b.value<0){
            System.out.print("Enter number less than zero:");
            b.value=b.in.nextInt();

        }
        if (b.value>=0 && b.value<100) {
            System.out.print("Enter number between 0 to 100:");
            b.value=b.in.nextInt();

        }
        if (b.value>=100&&b.value<1000) {
            System.out.print("Enter number between 100 to 1000:");
            b.value=b.in.nextInt();

        }
        if (b.value>1000) {
            System.out.print("Enter number >1000:");
            b.value=b.in.nextInt();

        }

    }
}
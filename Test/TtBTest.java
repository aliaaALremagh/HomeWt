import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Test;

public class TtBTest {
    @Test
    public void test() throws ParseException {
        SimpleDateFormat sdf= new SimpleDateFormat("HH:mm");

        Tt op =new Tt();
        //////
        String result= op.check_ticket_type(sdf.parse("9:29"));
        assertEquals("full",result);
        ///////

        result= op.check_ticket_type(sdf.parse("9:30"));
        assertEquals("saver",result);
        //////

        result= op.check_ticket_type(sdf.parse("16:00"));
        assertEquals("saver",result);
        ////
        result= op.check_ticket_type(sdf.parse("16:01"));
        assertEquals("full",result);
        ////
        result= op.check_ticket_type(sdf.parse("19:30"));
        assertEquals("full",result);
        ///
        result= op.check_ticket_type(sdf.parse("19:31"));
        assertEquals("saver",result);

    }

}
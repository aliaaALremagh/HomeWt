import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Test;

public class TtETest {
    @Test
    public void test() throws ParseException {

        Tt op=new Tt();
        SimpleDateFormat sdf= new SimpleDateFormat("HH:mm");
        String result=op.check_ticket_type(sdf.parse("4:00"));
        assertEquals("full",result);
        /////

        result=op.check_ticket_type(sdf.parse("11:37"));
        assertEquals("saver",result);

        ///////
        result=op.check_ticket_type(sdf.parse("18:22"));
        assertEquals("full",result);
        //////
        result=op.check_ticket_type(sdf.parse("23:00"));
        assertEquals("saver",result);

    }

}
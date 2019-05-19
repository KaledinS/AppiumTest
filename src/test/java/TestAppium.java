import org.junit.Test;

import static org.junit.Assert.*;

public class TestAppium extends TestBase {
    Contact contact = new Contact();

    @Test
    public void testContactCreation() {

        contact.create("First name", "Last name", "7777777");
        contact.search("First name Last name");

        assertTrue(isElementPresent("First name Last name"));

        contact.select("First name Last name");
        assertEquals("First name Last name", contact.verifyName());
        assertEquals("777-7777", contact.verifyPhone());

        contact.delete();


    }
}

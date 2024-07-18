package guru.springframework.sfgpetclinic.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IndexControllerTest {
    IndexController controller;



    @BeforeEach
    void setUp() {
        controller = new IndexController();
    }

    @Test
    void testIndex() {
        assertEquals("index", controller.index());
        assertEquals("index", controller.index(), "Wrong View Returned");
        assertEquals("index", controller.index(), () -> "Wrong View Returned " + "Message");

    }

    @Test
    void testOupsHandler() {
        assertTrue("notimplemented".equals(controller.oupsHandler()),
                () -> "this is some expensive " + "message to build " + "form my test");

    }
}

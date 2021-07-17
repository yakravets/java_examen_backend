package entities;

import application.springboot.entities.Airport;
import application.springboot.entities.Terminal;
import org.junit.Assert;
import org.junit.Test;

public class TestTerminal {

    @Test
    public void TestName() {
        Terminal terminal = new Terminal();
        terminal.setName("Test");
        Assert.assertEquals("Test", terminal.getName());
    }

    @Test
    public void TestId() {
        Terminal terminal = new Terminal();
        terminal.setId(5);
        Assert.assertEquals(5, terminal.getId());
    }

    @Test
    public void TestAirport() {
        Airport airport = new Airport();
        Terminal terminal = new Terminal();
        terminal.setAirport(airport);
        Assert.assertNotNull(terminal.getAirport());
    }

    @Test
    public void TestConstructorWithParameters() {
        Airport airport = new Airport();
        Terminal terminal = new Terminal("Test", airport);
        Assert.assertNotNull(terminal);
    }
}
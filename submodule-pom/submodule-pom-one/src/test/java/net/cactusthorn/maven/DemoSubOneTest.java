package net.cactusthorn.maven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

@SuppressWarnings("checkstyle:magicnumber")
public class DemoSubOneTest {

    @Test
    public void plus() {
        DemoSubOne demo = new DemoSubOne();
        long value = demo.plus(150L);
        assertEquals(250L, value);
    }
}

package net.cactusthorn.maven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

@SuppressWarnings("checkstyle:magicnumber")
public class DemoOneTest {

    @Test
    public void plus() {
        DemoOne demo = new DemoOne();
        long value = demo.plus(150L);
        assertEquals(250L, value);
    }
}

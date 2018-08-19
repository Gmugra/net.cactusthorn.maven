package net.cactusthorn.maven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

@SuppressWarnings("checkstyle:magicnumber")
public class DemoOneIT {

    @Test
    public void plus() {
        DemoOne demo = new DemoOne();
        long value = demo.plus(250);
        assertEquals(350L, value);
    }
}

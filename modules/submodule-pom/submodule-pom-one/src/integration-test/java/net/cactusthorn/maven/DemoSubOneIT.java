package net.cactusthorn.maven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

@SuppressWarnings("checkstyle:magicnumber")
public class DemoSubOneIT {

    @Test
    public void plus() {
        DemoSubOne demo = new DemoSubOne();
        long value = demo.plus(250);
        assertEquals(350L, value);
    }
}

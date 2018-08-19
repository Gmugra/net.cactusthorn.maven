package net.cactusthorn.maven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

@SuppressWarnings("checkstyle:magicnumber")
public class DemoOneGeneratedTest {

    @Test
    public void plus() {
        DemoOneGenerated demo = new DemoOneGenerated();
        long value = demo.plus(150L);
        assertEquals(20150L, value);
    }
}

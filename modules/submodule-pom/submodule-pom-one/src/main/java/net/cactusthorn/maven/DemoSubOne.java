package net.cactusthorn.maven;

public class DemoSubOne {

    private static final long INIT_VALUE = 100;

    private long value = INIT_VALUE;

    public DemoSubOne() {
    }

    public long plus(long val) {
        this.value += val;
        return this.value;
    }

    public long getValue() {
        return value;
    }
}

package net.cactusthorn.maven;

public class DemoOneGenerated {

    private long value = 20000L;

    public DemoOneGenerated() {
    }

    public long plus(long value) {
        this.value += value;
        return this.value;
    }

    public long getValue() {
        return value;
    }
}

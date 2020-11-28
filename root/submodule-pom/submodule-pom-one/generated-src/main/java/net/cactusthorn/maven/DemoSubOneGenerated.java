package net.cactusthorn.maven;

public class DemoSubOneGenerated {

    private long value = 20000L;

    public DemoSubOneGenerated() {
    }

    public long plus(long value) {
        this.value += value;
        return this.value;
    }

    public long getValue() {
        return value;
    }
}

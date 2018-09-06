package net.cactusthorn.maven;

import java.security.NoSuchAlgorithmException;
import net.cactusthorn.utils.security.SHA1;

public class DemoOne {

    public static void main(String... args) {
        DemoOne demoOne = new DemoOne();
        demoOne.plus(10L);
    }

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(DemoOne.class);

    private static final long INIT_VALUE = 100;

    private long value = INIT_VALUE;

    public DemoOne() {

        try {
            LOG.info("Test SHA1 = {}", SHA1.asHEXFrom("testStr"));
        } catch (NoSuchAlgorithmException e) {
            LOG.error("", e);
        }

        LOG.debug("Test Debug Message");
        LOG.debug("Test Debug Message 1");
        LOG.debug("Test Debug Message 2");
        LOG.debug("Test Debug Message 3");
        LOG.debug("Test Debug Message 4");
        LOG.debug("Test Debug Message 5");
        LOG.debug("Test Debug Message 6");
        LOG.debug("Test Debug Message 7");
        LOG.debug("Test Debug Message 8");
        LOG.debug("Test Debug Message 9");
        LOG.debug("Test Debug Message 10");

        LOG.error("Test Error Message");
        LOG.error("Test Error Message 1");
        LOG.error("Test Error Message 2");
        LOG.error("Test Error Message 3");
        LOG.error("Test Error Message 4");
        LOG.error("Test Error Message 5");
        LOG.error("Test Error Message 6");
        LOG.error("Test Error Message 7");
        LOG.error("Test Error Message 8");
        LOG.error("Test Error Message 9");
        LOG.error("Test Error Message 10");
    }

    public long plus(long val) {
        this.value += val;
        return this.value;
    }

    public long getValue() {
        return value;
    }
}

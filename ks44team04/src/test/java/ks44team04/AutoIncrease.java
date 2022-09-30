package ks44team04;

import ks44team04.util.CodeIndex;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AutoIncrease {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Test
    void autoInc() {
        CodeIndex codeIndex = new CodeIndex();
        String nextGoodsCode = codeIndex.codeIndex("WN895006", 5);
        log.info("{}", nextGoodsCode);
    }
}

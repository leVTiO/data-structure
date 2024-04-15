package com.levtio.array_list.test;

import com.levtio.array_list.ArrayList;
import com.levtio.array_list.List;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ Author：levtio
 * @ Date：2024-04-15-9:08
 * @ Description：数组测试类
 */
public class ArrayListTest {

    private final Logger logger = LoggerFactory.getLogger(ArrayListTest.class);

    @Test
    public void test_array_list() {
        List<String> list = new ArrayList<>();
        list.add("01");
        list.add("02");
        list.add("03");
        list.add("04");
        list.add("05");
        list.add("06");
        list.add("07");
        list.add("08");
        list.add("09");
        list.add("10");
        list.add("11");
        list.add("12");

        logger.info(list.toString());

        list.remove(9);

        logger.info(list.toString());
    }

}


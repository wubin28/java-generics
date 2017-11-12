package com.wubinben.katas;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {
    @Test
    public void list_of_strings_is_not_a_subclass_of_list_of_objects() {
        List<String> strings = new ArrayList<>();

        // incompatible types
        // List<Object> objects = strings;
        // objects = strings;
    }
}

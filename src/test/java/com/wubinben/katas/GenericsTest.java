package com.wubinben.katas;

import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsTest {
    @Test
    public void list_of_strings_is_not_a_subclass_of_list_of_objects() {
        List<String> strings = new ArrayList<>();

        // incompatible types
        // List<Object> objects = strings;
        // objects = strings;
    }

    @Test
    public void you_can_read_from_a_list_of_unbounded_type_but_not_write_to_it() {
        List<Integer> stuff = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
        stuff.size();
        stuff.forEach((Object o) -> System.out.println(o));

        stuff.add(4);

        stuff.forEach((Object o) -> System.out.println(o));

        List<?> anotherStuff = new ArrayList<>(Arrays.asList("Hello", LocalDate.now(), 3));
        anotherStuff.size();
        anotherStuff.forEach((Object o) -> System.out.println(o));

        // add(capture<?>) in List cannot be applied to (int)
        // anotherStuff.add(4);

        anotherStuff.forEach((Object o) -> System.out.println(o));
    }

}

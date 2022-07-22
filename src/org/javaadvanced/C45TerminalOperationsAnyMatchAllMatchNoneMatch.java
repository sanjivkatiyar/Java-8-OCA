package org.javaadvanced;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class C45TerminalOperationsAnyMatchAllMatchNoneMatch {

    //boolean anyMatch(Predicate)
    //boolean allMatch(Predicate)
    //Boolean noneMatch(Predicate)
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alan", "Brian", "Colin");
        Predicate<String> predicate = name -> name.startsWith("A");

        System.out.println(names.stream().anyMatch(predicate));
        System.out.println(names.stream().allMatch(predicate));
        System.out.println(names.stream().noneMatch(predicate));
    }
}

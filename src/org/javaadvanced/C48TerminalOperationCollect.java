package org.javaadvanced;

import java.util.stream.Stream;

public class C48TerminalOperationCollect {

    // StringBuilder collect(Supplier<StringBuilder> supplier,
    // BiConsumer<StringBuilder, String> accumulator,
    // BiConsumer<StringBuilder, StringBuilder> combiner)
    public static void main(String[] args) {

        StringBuilder word = Stream.of("a","b", "c", "d")
                .collect(() -> new StringBuilder(),
                        (sb,str)->sb.append(str),
                        (sb1,sb2)->sb1.append(sb2));
        System.out.println(word);
    }
}

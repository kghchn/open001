package com.hubery.common;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class TestLambada {
    @Test
    void TestLambada(){
        List<String> list = Arrays.asList(
                new String("zhangsan"),
                new String("liuqi"),
                new String("chenliu"),
                new String("wangwu"),
                new String("lisi")
        );

        list.forEach((s)->System.out.println(s));
        Consumer co = (b)->{System.out.println("hello world");};
        co.accept(null);

    }

    interface Function{
        void foo();
    }

}

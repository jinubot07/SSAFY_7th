package com.ssafy.day5.exception;

/**
 * @since 2021. 7. 8.
 */
public class ThrowsTest {
    public static void main(String[] args)   {
        methodCall1();
        System.out.println("done");
    }

    private static void methodCall1()   {
        methodCall2();
    }

    private static void methodCall2()   {
        checkedExceptionMethod();
        uncheckedExceptionMethod();
    }

    private static void checkedExceptionMethod()   {
        Class.forName("Hello");
    }

    private static void uncheckedExceptionMethod() {
        int i = 1 / 0;
    }

}

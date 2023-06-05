package retention;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        Annotation a[] = new ExampleASource().getClass().getAnnotations();
        Annotation b[] = new ExampleBClass().getClass().getAnnotations();
        Annotation c[] = new ExampleCRuntime().getClass().getAnnotations();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

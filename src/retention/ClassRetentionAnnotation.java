package retention;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS)
public @interface ClassRetentionAnnotation {
    String value() default "Discarded at Runtime";
}

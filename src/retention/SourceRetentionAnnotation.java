package retention;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface SourceRetentionAnnotation {
    String value() default "Discarded at Runtime";
}

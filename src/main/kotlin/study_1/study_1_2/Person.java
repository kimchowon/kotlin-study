package study_1.study_1_2;

import org.jetbrains.annotations.NotNull;

public class Person {

    private final String name;

    public Person(String name) {
        this.name = name;
    }

    @NotNull
    public String getName() {
        return name;
    }
}

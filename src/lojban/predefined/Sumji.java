package lojban.predefined;

import lojban.Predicate;

public class Sumji {
    public static final Predicate pred = new Predicate("sumji",3);
    public boolean execute(int a, int b, int c) {
        return a + b == c;
    }
}

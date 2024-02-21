package lojban;

import lojban.predefined.*;

import java.util.ArrayList;


public class Database {
    private static ArrayList<Predicate> predicates;
    private static ArrayList<Token> tokens;

    static {
        predicates = new ArrayList<>();
        tokens = new ArrayList<>();
        addPredefinedPredicates();
    }

    public static void addPredefinedPredicates() {
        addPredicate(Lo.pred);
        addPredicate(Se.pred);
        addPredicate(Facti.pred);
        addPredicate(Sumji.pred);
        addPredicate(Vujni.pred);
        addPredicate(Dunli.pred);
        addPredicate(Steni.pred);
        addPredicate(Steko.pred);
        addPredicate(Cmavo.pred);
    }

    public static void addPredicate(Predicate pred) {
        predicates.add(pred);
    }

    public static void addToken(Token token) {
        tokens.add(token);
    }

    public static void printTokens () {
        for (Token token : tokens) {
            System.out.println(token.toString());
        }
    }
}

package lojban;

public class Main {

    public static void main(String[] args) {
        String input = "i se 2 sumji lo .answer. 2";
        LexicalAnalyzer scanner = new LexicalAnalyzer();
        scanner.tokenizeInput(input);
        System.out.println("Input: " + input);
        Database.printTokens();
    }
}
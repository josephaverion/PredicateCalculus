package lojban;

public class LexicalAnalyzer {
    public void tokenizeInput(String input) {
        String[] splitString = input.split("\\s+");
        String consonants = "bcdfghjklmnpqrstvwxyz";
        String vowels = "aeiou";
        TokenType type;
        for (String tokenString: splitString ) {
            if (tokenString.equalsIgnoreCase("i")) {
                type = TokenType.STATEMENT_START;
            } else if (tokenString.matches("(?i)[" + consonants + "][" + vowels + "]|[" + vowels + "][" + consonants + "]")) {
                type = TokenType.SHORT_WORD;
            } else if (tokenString.matches("(?i)([" + consonants + "][" + vowels + "][" + consonants + "]{2}[" + vowels + "]|[" + consonants + "]{2}[" + vowels + "][" + consonants + "][" + vowels + "])")) {
                type = TokenType.PREDICATE_WORD;
            } else if (tokenString.matches("\\d")) {
                type = TokenType.NUMBER;
            } else if (tokenString.matches("\\.[a-zA-Z]+\\.")) {
                type = TokenType.NAME;
            } else {
                throw new IllegalArgumentException("invalid token");
            }
            Database.addToken(new Token(type, tokenString));
        }
    }
}

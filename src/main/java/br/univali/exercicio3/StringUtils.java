package br.univali.exercicio3;

public class StringUtils {
    public boolean isVazia(final String cs) {
        int strLen;
        if (cs == null) {
            return true;
        } else if ((strLen = cs.length()) == 0) {
            return true;
        } else {
            for (int i = 0; i < strLen; i++) {
                if (!Character.isWhitespace(cs.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }
}

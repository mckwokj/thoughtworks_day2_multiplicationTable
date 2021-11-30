package com.tw;

public class MultiplicationTable {
    public String create(int start, int end) {
        return isValid(start, end) ? generateTable(start, end) : null;
    }

    public Boolean isValid(int start, int end) {
        return isInRange(start) && isInRange(end) && isStartNotBiggerThanEnd(start, end);
    }

    public Boolean isInRange(int number) {
        return number >= 1 && number <= 1000;
    }

    public Boolean isStartNotBiggerThanEnd(int start, int end) {
        return start <= end;
    }

    public String generateTable(int start, int end) {
        String content = "";

        for (int i=1; i<=end; i++) {
            content += generateLine(start, i) + "\r\n";
        }

        return content.trim();
    }

    public String generateLine(int start, int row) {
        String content = "";
        for (int i=0; i<row-1; i++) {
            content += generateSingleExpression(start+i, row) + "  ";
        }
        return content.trim();
    }

    public String generateSingleExpression(int multiplicand, int multiplier) {
        return multiplicand + "*" + multiplier + "=" + multiplicand*multiplier;
    }
}

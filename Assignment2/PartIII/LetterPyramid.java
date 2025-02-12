public class LetterPyramid {
    public static String generatePyramid(int rows) {
        StringBuilder pyramid = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            int spaces = rows - i - 1;
            for (int s = 0; s < spaces; s++) {
                pyramid.append(" ");
            }
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                pyramid.append(ch);
            }
            for (char ch = (char) ('A' + i - 1); ch >= 'A'; ch--) {
                pyramid.append(ch);
            }
            if (i < rows - 1) {
                pyramid.append("\n");
            }
        }

        return pyramid.toString();
    }
    public static void main(String[] args) {
        int numRows = 10;
        String pyramid = generatePyramid(numRows);
        System.out.println(pyramid);
    }
}

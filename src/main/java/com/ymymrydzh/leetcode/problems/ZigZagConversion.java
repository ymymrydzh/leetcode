/**
 * 
 */
package leetcode;

/**
 * @author cc
 * @date 2016年1月14日 下午2:19:52
 * @description The string "PAYPALISHIRING" is written in a zigzag pattern on a
 *              given number of rows like this: (you may want to display this
 *              pattern in a fixed font for better legibility)
 * 
 *              P   A   H   N
 *              A P L S I I G
 *              Y   I   R
 *              
 *              And then read line by line:
 *              "PAHNAPLSIIGYIR" Write the code that will take a string and make
 *              this conversion given a number of rows:
 * 
 *              string convert(string text, int nRows);
 *              convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 */
public class ZigZagConversion {

    /**
     * @param args
     */
    public static void main(String[] args) {

    }

    public String convert(String s, int nRows) {
        if (s == null || s.length() == 0 || nRows <= 1) {
            return s;
        }
        s = " " + s;
        StringBuffer r = new StringBuffer();
        for (int row = 1; row <= nRows; row++) {
            int i = row;
            while (i < s.length()) {
                if (row == 1 || row == nRows) {
                    r.append(s.charAt(i));
                    i += nRows * 2 - 2;
                } else {
                    r.append(s.charAt(i));
                    i += nRows + nRows - row - row;
                    if (i < s.length()) {
                        r.append(s.charAt(i));
                        i += row + row - 2;
                    }
                }
            }
        }
        return r.toString();
    }
}

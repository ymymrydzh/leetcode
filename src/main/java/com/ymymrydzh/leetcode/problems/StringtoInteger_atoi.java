/**
 * 
 */
package leetcode;

/**
 * @author cc
 * @date 2016年1月14日 下午2:33:16
 * @description Implement atoi to convert a string to an integer.
 * 
 *              Hint: Carefully consider all possible input cases. If you want a
 *              challenge, please do not see below and ask yourself what are the
 *              possible input cases.
 * 
 *              Notes: It is intended for this problem to be specified vaguely
 *              (ie, no given input specs). You are responsible to gather all
 *              the input requirements up front.
 *
 *              Requirements for atoi: The function first discards as many
 *              whitespace characters as necessary until the first
 *              non-whitespace character is found. Then, starting from this
 *              character, takes an optional initial plus or minus sign followed
 *              by as many numerical digits as possible, and interprets them as
 *              a numerical value.
 * 
 *              The string can contain additional characters after those that
 *              form the integral number, which are ignored and have no effect
 *              on the behavior of this function.
 * 
 *              If the first sequence of non-whitespace characters in str is not
 *              a valid integral number, or if no such sequence exists because
 *              either str is empty or it contains only whitespace characters,
 *              no conversion is performed.
 * 
 *              If no valid conversion could be performed, a zero value is
 *              returned. If the correct value is out of the range of
 *              representable values, INT_MAX (2147483647) or INT_MIN
 *              (-2147483648) is returned.
 */
public class StringtoInteger_atoi {

    /**
     * @param args
     */
    public static void main(String[] args) {

    }

    public int atoi(String str) {
        str = str.trim();
        try {
            return Integer.valueOf(str);
        } catch (NumberFormatException e) {
            if (str.length() == 0)
                return 0;
            int i = 0;
            if (str.charAt(i) == '+' || str.charAt(i) == '-') {
                i++;
            }
            while (i < str.length() && str.charAt(i) > 47 && str.charAt(i) < 58)
                i++;
            try {
                return Integer.valueOf(str = str.substring(0, i));
            } catch (NumberFormatException ex) {
                try {
                    return Long.valueOf(str) > Integer.MAX_VALUE ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                } catch (Exception exe) {
                    return 0;
                }
            }
        }
    }
}

/**
 * 
 */
package leetcode;

/**
 * @author cc
 * @date 2016年1月14日 下午3:00:11
 * @description Divide two integers without using multiplication, division and
 *              mod operator.
 * 
 *              If it is overflow, return MAX_INT.
 */
public class DivideTwoIntegers {

    /**
     * @param args
     */
    public static void main(String[] args) {
        DivideTwoIntegers dti = new DivideTwoIntegers();
        int dend = -2147483648;
        int dsor = -1;
        int result = dti.divide(dend, dsor);
        System.out.println(result);
    }

    public int divide(int dividend, int divisor) {
        int result = 0;
        if (divisor == Integer.MIN_VALUE) {
            if (dividend == Integer.MIN_VALUE) {
                result = 1;
            }
        } else {
            boolean opposite = opposite(dividend, divisor);
            int dend = dividend;
            int dsor = opposite ? -divisor : divisor;
            if (divisor == 0) {
                result = Integer.MAX_VALUE;
            } else if (divisor == 1) {
                result = dividend;
            } else if (divisor == -1) {
                result = -dividend;
                if(dividend == Integer.MIN_VALUE){
                    result = Integer.MAX_VALUE;
                }
            } else {
                while (canDevide(dend, dsor)) {
                    int count = 1;
                    int ndsor = dsor;
                    boolean overflow = false;
                    while (canDevide(dend, ndsor)) {
                        count = count << 1;
                        ndsor = ndsor << 1;
                        if (opposite(dend, ndsor)) {
                            overflow = true;
                            break;
                        }
                    }
                    count = count >>> 1;
                    if (overflow) {
                        ndsor = ndsor >>> 1;
                        if (dend < 0) {
                            ndsor = ndsor ^ Integer.MIN_VALUE;
                        }
                    } else {
                        ndsor = ndsor >> 1;
                    }
                    result += count;
                    dend -= ndsor;
                }
                if (opposite) {
                    result = -result;
                }
            }
        }
        return result;
    }

    private boolean canDevide(int dividend, int divisor) {
        if (dividend < 0) {
            return dividend <= divisor;
        } else if (dividend > 0) {
            return dividend >= divisor;
        } else {
            return false;
        }
    }

    private boolean opposite(int dividend, int divisor) {
        return (dividend ^ divisor) < 0;
    }
}

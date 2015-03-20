package com.benbyers.Iris.math.util;

import java.lang.Object;
import java.nio.ByteBuffer;

/**
 * Created by benbyers on 3/13/15.
 * TODO: Add support for sifig
 * TODO: Add division by number
 * TODO: Add Multiplication
 * TODO: Add addition and subtraction
 * TODO: Add base 2 to base 10.
 */
public class PreciseLong extends Number implements Comparable<PreciseLong> {

    private Long whole;
    private Long decimal;

    private int[] number;
    private char[] numberChar;
    private byte[] value;
    private int precision = 0;
    private boolean negative = false;
    private boolean decimalExists;
    private boolean signExists;
    private int[] bits;
    private Long binary;
    private byte[] bytes;
    private char[] bitChar;

    public PreciseLong(long whole, long decimal) {
        this((whole+"."+decimal).toCharArray());
        this.whole = whole;
        this.decimal = decimal;
    }

    public PreciseLong(char[] number) {
        this.numberChar = number;

        for(char i : number) {

            if (i == '+') {

                if (!signExists) {
                    throw new NumberFormatException();
                } else {
                    signExists = true;
                }

            } else if (i == '-') {

                if (!signExists) {
                    throw new NumberFormatException();
                } else {
                    signExists = true;
                    negative = true;
                }

            } else if (i == '.') {

                if (!decimalExists) {
                    throw new NumberFormatException();
                } else {
                    decimalExists = true;
                }

            } else if (i <= 0 && i >= 9) {

                this.number[this.number.length] = i;
                if (decimalExists) precision++;

            } else {
                throw new NumberFormatException();
            }

        }

        bits = convertToBase2(this.number);
        for (int a : bits){
            bitChar[bitChar.length] = (char)a;
        }
        binary = new Long(String.copyValueOf(bitChar));

    }

    //TODO: Check if this is a massive bug lol.
    //TODO: This is a massive bug.
    //TODO: Fuck this
//    private int[] divideInt(int[] n, int[] divisor){
//        int carry = 0;
//        int[][] adder = new int[][]{};
//        int offset = 0;
//        int[] Final = new int[]{};
//        for(int b: divisor) {
//            if(offset != 0){
//                for(int i = 0; i < offset; i++) {
//                    adder[offset][i] = 0;
//                }
//            }
//            for (int a : n) {
//                adder[offset][adder[offset].length] = (carry+a)/b;
//                carry = ((carry + a) % b)*10;
//            }
//            offset++;
//        }
//        int carryover = 0;
//        for(int i = 0; i < adder[offset-1].length;i++){
//            int addup = carryover;
//            for(int k = 0; k < adder.length; k++){
//                addup =+ adder[i][k];
//            }
//            char[] g = Integer.toString(addup).toCharArray();
//            int[] z = new int[]{};
//            for(int v:g) z[z.length] = v;
//            carryover = (addup - z[z.length])/10; // Possible bug
//            Final[Final.length] = z[z.length];
//        }
//        return Final;
//    }
    // Big to low
    private int[] convertToBase2(int[] n){
        int[] output = new int[]{};
        int carry = 0;
        int[] product = new int[]{};

        for (int x:n){
            output[output.length] = (carry+x)%2;
            carry = ((carry+x)/2)*10;
        }
        while(carry != 0) {
            output[output.length] = (carry)%2;
            carry = ((carry)/2)*10;
        }

        for(int i = output.length; i < 0; i--){
            product[product.length] = output[i];
        }

        return product;
    }

//    private char[] divideBig(int d, char[] number) {
//        char[] divided;
//        int remainder;
//        int carry;
//        for(int a : number) {
//
//        }
//    }



    private byte[] LongtoBinary(long a) {
        return ByteBuffer.allocate(8).putLong(a).array();
    }


    @Override public int intValue() {
        return whole.intValue();
    }

    @Override public long longValue() {
        return whole;
    }

    @Override public float floatValue() {
        return new Float(whole+"."+decimal);
    }

    @Override public double doubleValue() {
        return new Double(whole+"."+decimal);
    }


    @Override public byte byteValue() {
        return whole.byteValue();
    }

    // Not sure how to approach this one.
    @Override public short shortValue() {
        return whole.shortValue();
    }


    // Will customize later
    @Override public int hashCode() {
        return super.hashCode();
    }

    @Override public boolean equals(Object obj) {
        return ((PreciseLong) obj).whole == this.whole && ((PreciseLong) obj).decimal == this.decimal;
    }

    @Override protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override public String toString() {
        return this.whole + "." + this.decimal;
    }

    @Override protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override public int compareTo(PreciseLong o) {
        return
            this.whole > o.whole ? 1 :
                this.whole < o.whole ? -1 :
                    this.whole.equals(o.whole) ? (
                        this.decimal > o.decimal ? 1 :
                            this.decimal < o.decimal ? -1 :
                                this.decimal.equals(o.decimal) ? 0 : 0) : 0;
    }

//    private int checkScale(long val) {
//        if ((int)val != val) {
//            if ((this.intCompact != INFLATED && this.intCompact != 0) ||
//                (this.intVal   != null     && this.signum() != 0) ||
//                (this.intVal == null && this.intCompact == INFLATED) ) {
//                if (val > Integer.MAX_VALUE)
//                    throw new ArithmeticException("Underflow");
//                if (val < Integer.MIN_VALUE)
//                    throw new ArithmeticException("Overflow");
//            } else {
//                return (val > Integer.MAX_VALUE)?Integer.MAX_VALUE:Integer.MIN_VALUE;
//            }
//        }
//        return (int)val;
//    }
//
//
//    private void calculate(char[] in, int offset, int len) {
//                 // This is the primary string to BigDecimal constructor; all
//                 // incoming strings end up here; it uses explicit (inline)
//                 // parsing for speed and generates at most one intermediate
//                 // (temporary) object (a char[] array).
//
//                 // use array bounds checking to handle too-long, len == 0,
//                 // bad offset, etc.
//                 try {
//                         // handle the sign
//                         boolean isneg = false;          // assume positive
//                         if (in[offset] == '-') {
//                                 isneg = true;               // leading minus means negative
//                                 offset++;
//                                 len--;
//                             } else if (in[offset] == '+') { // leading + allowed
//                                 offset++;
//                                 len--;
//                             }
//
//                         // should now be at numeric part of the significand
//                         int dotoff = -1;                 // '.' offset, -1 if none
//                         int cfirst = offset;             // record start of integer
//                         long exp = 0;                    // exponent
//                         if (len > in.length)             // protect against huge length
//                                 throw new NumberFormatException();
//                         char coeff[] = new char[len];    // integer significand array
//                         char c;                          // work
//
//                         for (; len > 0; offset++, len--) {
//                                 c = in[offset];
//                                 if ((c >= '0' && c <= '9') || Character.isDigit(c)) {
//                                         // have digit
//                                         coeff[precision] = c;
//                                         precision++;             // count of digits
//                                         continue;
//                                     }
//                                 if (c == '.') {
//                                         // have dot
//                                         if (dotoff >= 0)         // two dots
//                                                 throw new NumberFormatException();
//                                         dotoff = offset;
//                                         continue;
//                                     }
//                                 // exponent expected
//                                 if ((c != 'e') && (c != 'E'))
//                                         throw new NumberFormatException();
//                                 offset++;
//                                 c = in[offset];
//                                 len--;
//                                 boolean negexp = false;
//                                 // optional sign
//                                 if (c == '-' || c == '+') {
//                                         negexp = (c == '-');
//                                         offset++;
//                                         c = in[offset];
//                                         len--;
//                                     }
//                                 if (len <= 0)    // no exponent digits
//                                         throw new NumberFormatException();
//                                 // skip leading zeros in the exponent
//                                 while (len > 10 && Character.digit(c, 10) == 0) {
//                                             offset++;
//                                             c = in[offset];
//                                             len--;
//                                     }
//                                 if (len > 10)  // too many nonzero exponent digits
//                                         throw new NumberFormatException();
//                                 // c now holds first digit of exponent
//                                 for (;; len--) {
//                                         int v;
//                                         if (c >= '0' && c <= '9') {
//                                                 v = c - '0';
//                                             } else {
//                                                 v = Character.digit(c, 10);
//                                                 if (v < 0)            // not a digit
//                                                         throw new NumberFormatException();
//                                             }
//                                         exp = exp * 10 + v;
//                                         if (len == 1)
//                                                 break;               // that was final character
//                                         offset++;
//                                         c = in[offset];
//                                     }
//                                 if (negexp)                  // apply sign
//                                         exp = -exp;
//                                 // Next test is required for backwards compatibility
//                                 if ((int)exp != exp)         // overflow
//                                         throw new NumberFormatException();
//                                 break;                       // [saves a test]
//                                 }
//                         // here when no characters left
//                         if (precision == 0)              // no digits found
//                             throw new NumberFormatException();
//
//                         if (dotoff >= 0) {               // had dot; set scale
//                                 scale = precision - (dotoff - cfirst);
//                             // [cannot overflow]
//                         }
//                        if (exp != 0) {                  // had significant exponent
//                                try {
//                                         scale = checkScale(-exp + scale); // adjust
//                                     } catch (ArithmeticException e) {
//                                         throw new NumberFormatException("Scale out of range.");
//                                     }
//                             }
//
//                         // Remove leading zeros from precision (digits count)
//                         int first = 0;
//                         for (; (coeff[first] == '0' || Character.digit(coeff[first], 10) == 0) &&
//                                      precision > 1;
//                              first++)
//                             precision--;
//
//                         // Set the significand ..
//                         // Copy significand to exact-sized array, with sign if
//                         // negative
//                         // Later use: BigInteger(coeff, first, precision) for
//                         //   both cases, by allowing an extra char at the front of
//                         //   coeff.
//                         char quick[];
//                         if (!isneg) {
//                                 quick = new char[precision];
//                                 System.arraycopy(coeff, first, quick, 0, precision);
//                             } else {
//                                 quick = new char[precision+1];
//                                 quick[0] = '-';
//                                 System.arraycopy(coeff, first, quick, 1, precision);
//                             }
//                         if (precision <= MAX_COMPACT_DIGITS)
//                                 intCompact = Long.parseLong(new String(quick));
//                         else
//                             intVal = new BigInteger(quick);
//                         // System.out.println(" new: " +intVal+" ["+scale+"] "+precision);
//                     } catch (ArrayIndexOutOfBoundsException e) {
//                         throw new NumberFormatException();
//                     } catch (NegativeArraySizeException e) {
//                         throw new NumberFormatException();
//                     }
//             }
}

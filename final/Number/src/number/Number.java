package number;

import java.math.BigInteger;
import java.util.stream.IntStream;

public interface Number {
  static BigInteger getSum(int number) {
    return BigInteger.valueOf(IntStream.range(1, number).filter(x -> number % x == 0).sum());
  }

  static boolean isPerfectNumber(int number) {
    return getSum(number).equals(BigInteger.valueOf(number));
  }

  static boolean isAbundantNumber(int number) {
    return getSum(number).compareTo(BigInteger.valueOf(number)) > 0;
  }

  static boolean isDeficientNumber(int number) {
    return getSum(number).compareTo(BigInteger.valueOf(number)) < 0;
  }
}
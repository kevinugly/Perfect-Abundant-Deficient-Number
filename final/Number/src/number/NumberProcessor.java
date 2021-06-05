package number;

public interface NumberProcessor {
  static String numberType(int number) {
    if(Number.isPerfectNumber(number)) {
      return "perfect.";
    }
    else if(Number.isAbundantNumber(number)) {
      return "abundant.";
    }
    else if(Number.isDeficientNumber(number)) {
      return "deficient.";
    }

    return "";
  }
}

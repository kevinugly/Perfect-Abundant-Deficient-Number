package number;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.provider.*;
import java.util.stream.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PerfectNumberTest implements BaseNumberTest{
  @Override
  public boolean numberFunction(int number) {
    return Number.isPerfectNumber(number);
  }

  @Override
  public Stream<Arguments> caseArguments() {
    return Stream.of(
      Arguments.of(6, true),
      Arguments.of(15, false),
      Arguments.of(28, true),
      Arguments.of(255, false),
      Arguments.of(496, true)
    );
  }
}
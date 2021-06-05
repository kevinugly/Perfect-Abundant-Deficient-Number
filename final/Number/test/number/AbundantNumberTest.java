package number;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.provider.*;
import java.util.stream.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class AbundantNumberTest implements BaseNumberTest {
  @Override
  public boolean numberFunction(int number) {
    return Number.isAbundantNumber(number);
  }

  @Override
  public Stream<Arguments> caseArguments() {
    return Stream.of(
      Arguments.of(12, true),
      Arguments.of(28, false),
      Arguments.of(40, true),
      Arguments.of(55, false),
      Arguments.of(66, true)
    );
  }
}
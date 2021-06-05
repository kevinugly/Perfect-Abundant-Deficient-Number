package number;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.provider.*;
import java.util.stream.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class DeficientNumberTest implements BaseNumberTest {
  @Override
  public boolean numberFunction(int number) {
    return Number.isDeficientNumber(number);
  }

  @Override
  public Stream<Arguments> caseArguments() {
    return Stream.of(
      Arguments.of(1, true),
      Arguments.of(6, false),
      Arguments.of(11, true),
      Arguments.of(18, false),
      Arguments.of(19, true)
    );
  }
}
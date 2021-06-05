package number;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;
import java.util.stream.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public interface BaseNumberTest {
  boolean numberFunction(int number);
  Stream<Arguments> caseArguments();

  @ParameterizedTest
  @MethodSource({"caseArguments"})
  default void testNumber(int character, boolean expected) {
    assertEquals(expected, numberFunction(character));
  }
}

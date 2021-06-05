package number;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import java.math.BigInteger;

public class GetSumTest {
  @Test
  void canary() {
    assert(true);
  }

  @Test
  void testSums() {
    assertAll(() -> assertEquals(BigInteger.ZERO, Number.getSum(1)),
      () -> assertEquals(BigInteger.ONE, Number.getSum(5)),
      () -> assertEquals(BigInteger.valueOf(43), Number.getSum(50)),
      () -> assertEquals(BigInteger.valueOf(592), Number.getSum(500)),
      () -> assertEquals(BigInteger.valueOf(6715), Number.getSum(5000))
    );
  }
}

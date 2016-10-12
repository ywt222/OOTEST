import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CircleTest {
    @Test
    public void shouldAlwaysReturnTrue() {
        assertEquals(1, 1);
    }

    @Test
    public void shouldReturnCorrectAreaForRadius2() {
        assertEquals(12.56, new Circle(2).area(), 2);
    }

    @Test
    public void shouldReturnCorrectAreaForRadius3() {
        assertEquals(28.26, new Circle(3).area(), 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenInputInvalid() {
        new Circle(0).area();
    }

    @Test
    public void perimeterOfCircleWithRadius2ShouldBeTwelvePointFiveSix() {
        assertEquals(12.56, new Circle(2).perimeter(), 2);
    }
}

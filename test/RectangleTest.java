import org.junit.*;

import static org.junit.Assert.assertEquals;

public class RectangleTest {
    @Test
    public void shouldAlwaysReturnCorrectly() throws Exception {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void areaOfRectangleWithLength6AndWidth5ShouldBe30() {
        assertEquals(30, new Rectangle(6, 5).area(), 2);
    }

    @Test
    public void areaOfRectangleWithLength6AndWidth4ShouldBe30() {
        assertEquals(24, new Rectangle(6, 4).area(), 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void rectangleWithNegativeLengthShouldThrowException() {
        new Rectangle(0, 4);
    }

    @Test
    public void perimeterOfRectangleWithLength6AndWidth5ShouldBe22() {
        assertEquals(22, new Rectangle(6, 5).perimeter(), 2);

    }

    @Test
    public void areaShouldReturnFourWhenSideIsTwo() {
        assertEquals(4, Rectangle.setSquare(2).area(), 2);
    }

    @Test
    public void perimeterShouldReturnEightWhenSideIsTwo() {
        assertEquals(8, Rectangle.setSquare(2).perimeter(), 2);
    }

    @Test
    public void perimeterShouldReturnTwelvePointFourWhenSideIsThreePointOne() {
        assertEquals(12.4, Rectangle.setSquare(3.1).perimeter(), 2);
    }
}

package geometry;

import org.assertj.core.data.Percentage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.testng.Assert.*;

public class CircleTest {
    @Test(dataProvider = "pointInsideProvider")
    public void testInsideParameterized(double x1, double y1, double r, double x2, double y2,  boolean expectedInside) {
        Circle c = new Circle(x1, y1, r);
        Point p = new Point(x2, y2);
        assertEquals(c.Inside(p), expectedInside);
    }

    @DataProvider(name = "pointInsideProvider")
    public Object[][] pointInsideProvider() {
        return new Object[][] {
                {0, 0, 2, 0, 0, true},
                {0, 0, 1, 0, 2, false},
                {4, 4, 2, 3, 3, true},
                {4, 4, 2, 0, 0, false},
        };
    }
}

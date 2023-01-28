package geometry;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Circle {
    private double x;
    private double y;
    private double r;

    public boolean Inside(Point point) {
//        (x - center_x)² + (y - center_y)² < radius²

        double dX = Math.pow((point.getX() - x), 2);
        double dY = Math.pow((point.getY() - y), 2);
        double dR = Math.pow(r, 2);

        return dX + dY < dR;
    }
}

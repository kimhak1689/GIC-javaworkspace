package exercise01;

public class Point {
    int x, y;
    
    public Point() {

    }

    public Point(int $x) {
        $x = x;
        y = 0;
    }

    public Point(int $x, int $y) {
        $x = x;
        $y = y;
    }

    public Double distance(Point $p) {
        Double distance;
        distance = Math.sqrt(Math.pow(($p.x - x), 2) + Math.pow(($p.y - y), 2));
        return distance;
    }
}

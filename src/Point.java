public class Point {
    private int x;
    private int y;
    private String label;

    public Point(String label, int x, int y)
    {
        this.label = label;
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString()
    {
        return "Point " + label + " is at x = " + x + ", y = " + y;
    }

    @Override
    public boolean equals(Object i)
    {
        if (i == null || !(i instanceof Point))
        {
            return false;
        }
        Point j = (Point) i;

        return (this.x == j.x) && (this.y == j.y);
    }
}

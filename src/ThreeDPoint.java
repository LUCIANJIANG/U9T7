public class ThreeDPoint extends Point{
    private int z;
    public ThreeDPoint(String label, int x, int y, int z)
    {
        super(label, x, y);
        this.z = z;
    }

    @Override
    public String toString()
    {
        return super.toString() + ", z = " + z;
    }

    @Override
    public boolean equals(Object i)
    {
        if (i == null || !(i instanceof ThreeDPoint))
        {
            return false;
        }

        ThreeDPoint j = (ThreeDPoint) i;
        return (super.equals(i)) && (this.z == j.z);
    }
}

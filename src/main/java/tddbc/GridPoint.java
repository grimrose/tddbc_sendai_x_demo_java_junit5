package tddbc;

public class GridPoint {

    private final int x;
    private final int y;

    public GridPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String notation() {
        return String.format("(%d,%d)", this.x, this.y);
    }

    public boolean hasSameCoordinatesWith(GridPoint another) {
        return this.x == another.x && this.y == another.y;
    }

    public boolean isNeighborOn(GridPoint another) {
        return (this.x - 1) == another.x && this.y == another.y
               || (this.x + 1) == another.x && this.y == another.y
               || this.x == another.x && (this.y + 1) == another.y
               || this.x == another.x && (this.y + 1) == another.y;
    }
}

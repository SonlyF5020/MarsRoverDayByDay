package com.zhanhonglai.position;

public class RoverPosition {
    private Integer xPosition;
    private Integer yPosition;

    public RoverPosition(int xPosition, int yPosition) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public void moveAt(String direction) {
        if (direction.equals("E")) {
            xPosition++;
        }
        if (direction.equals("W")) {
            xPosition--;
        }
        if (direction.equals("N")) {
            yPosition++;
        }
        if (direction.equals("S")) {
            yPosition--;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RoverPosition that = (RoverPosition) o;

        return !(xPosition != null ? !xPosition.equals(that.xPosition) : that.xPosition != null) && !(yPosition != null ? !yPosition.equals(that.yPosition) : that.yPosition != null);

    }

    @Override
    public int hashCode() {
        int result = xPosition != null ? xPosition.hashCode() : 0;
        result = 31 * result + (yPosition != null ? yPosition.hashCode() : 0);
        return result;
    }
}

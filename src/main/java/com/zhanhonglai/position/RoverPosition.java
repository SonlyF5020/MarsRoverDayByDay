package com.zhanhonglai.position;

public class RoverPosition {
    private Integer xPosition;
    private Integer yPosition;

    public RoverPosition(int xPosition, int yPosition) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public Integer getYPosition() {
        return yPosition;
    }

    public Integer getXPosition() {
        return xPosition;
    }

    public void moveAt(String direction) {
        if (direction.equals("E")){
            xPosition++;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RoverPosition that = (RoverPosition) o;

        return !(xPosition != null ? !xPosition.equals(that.xPosition) : that.xPosition != null);

    }

    @Override
    public int hashCode() {
        int result = xPosition != null ? xPosition.hashCode() : 0;
        result = 31 * result + (yPosition != null ? yPosition.hashCode() : 0);
        return result;
    }
}

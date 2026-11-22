public class Expedition {

    private char[][] map;
    private String status;
    private int row;
    private int column;
    private int energy;
    private int maxEnergy;
    private int requiredRelics;
    private int collectedRelics;
    private int moves;

    public Expedition() {
        status = "NOT_STARTED";
        map = new char[0][0];
        row = -1;
        column = -1;
        energy = 0;
        maxEnergy = 0;
        requiredRelics = 0;
        collectedRelics = 0;
        moves = 0;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public int getEnergy() {
        return energy;
    }

    public int getMaxEnergy() {
        return maxEnergy;
    }

    public int getCollectedRelics() {
        return collectedRelics;
    }

    public int getRequiredRelics() {
        return requiredRelics;
    }

    public int getMoves() {
        return moves;
    }

    public String getStatus() {
        return status;
    }

    public int getScore() {
        return 100 * collectedRelics + 5 * energy;
    }


}

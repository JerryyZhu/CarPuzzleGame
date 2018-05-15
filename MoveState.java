import java.util.Map;

public class MoveState {
    private int[][] gameBoard;
    private Map<Integer, Vehicle> vehicleMap;

    public MoveState(int[][] gameBoard, Map<Integer, Vehicle> vehicleMap) {
        this.gameBoard = gameBoard;
        this.vehicleMap = vehicleMap;
    }

    public int[][] getGameBoard() {
        return gameBoard;
    }

    public Map<Integer, Vehicle> getVehicleMap() {
        return vehicleMap;
    }
}

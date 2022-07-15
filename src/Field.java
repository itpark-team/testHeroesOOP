import java.util.ArrayList;

public class Field {
    private int countRows, countCols;
    private char[][] field;

    private char emptySign = '*';

    public Field(int countRows, int countCols) {
        this.countRows = countRows;
        this.countCols = countCols;
        field = new char[countRows][countCols];
        clearField();
    }

    private void clearField() {
        for (int i = 0; i < countRows; i++) {
            for (int j = 0; j < countCols; j++) {
                field[i][j] = emptySign;
            }
        }
    }

    private char getUnitSignByCoords(int i, int j, ArrayList<Unit> units) {
        for (int k = 0; k < units.size(); k++) {
            if (units.get(k).getI() == i && units.get(k).getJ() == j) {
                return units.get(k).getSign();
            }
        }
        return '~';
    }

    public void printFieldWithUnits(ArrayList<Unit> units) {
        for (int i = 0; i < countRows; i++) {
            for (int j = 0; j < countCols; j++) {

                char currentSign = getUnitSignByCoords(i, j, units);

                if (currentSign == '~') {
                    System.out.print(field[i][j]);
                } else {
                    System.out.print(currentSign);
                }
            }
            System.out.println();
        }
    }
}

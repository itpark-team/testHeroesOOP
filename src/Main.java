import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Unit> units = new ArrayList<Unit>();
        units.add(new Unit(1, 1, 'A'));
        units.add(new Unit(1, 2, 'B'));
        units.add(new Unit(3, 4, 'C'));
        units.add(new Unit(4, 8, 'A'));

        Field field = new Field(10, 10);
        field.printFieldWithUnits(units);

        System.out.println();

        Unit unit = units.get(0);

        unit.setI(unit.getI() - 1);
        unit.setJ(unit.getJ() - 1);

        field.printFieldWithUnits(units);
    }
}

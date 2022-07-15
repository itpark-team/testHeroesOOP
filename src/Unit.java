public class Unit {
    private int i, j;
    private char sign;

    public Unit(int i, int j, char sign) {
        this.i = i;
        this.j = j;
        this.sign = sign;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

    public char getSign() {
        return sign;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void setJ(int j) {
        this.j = j;
    }
}

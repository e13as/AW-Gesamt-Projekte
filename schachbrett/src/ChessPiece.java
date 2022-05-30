public abstract class ChessPiece {
    private int x;
    private int y;
    private boolean white;
    public ChessPiece(boolean white, int x, int y, String name) {
        this.white = white;
        this.x = x;
        this.y = y;
    }
    public boolean canMove(int x, int y) {
// TODO
        if ( (x>7) || (y>7)){
            return false;
        }else if(this.x==x && this.y==y){
            return false;
        }else if (x<0 || y<0){
            return false;
        }
        return true;
    }
    public void move(int x, int y) {
        if (canMove(x, y)) {
            this.x = x;
            this.y = y;
        }else System.out.println("Bewegung nicht möglich, weil " +
                "du dich auf denselben Positionen wie folgt befindest: ");
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public abstract String getName();

}

public class Rook {

    public Rook(boolean white, int x, int y) {
        super(white, x, y);
    }

    @Override
    public boolean canMove(int x, int y) {
        if(super.canMove(x, y)){

            return true;
        }
        return false;
    }

    @Override
    public String getName(){
        return name;
    }
}

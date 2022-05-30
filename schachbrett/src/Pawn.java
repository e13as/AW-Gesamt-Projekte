public class Pawn extends ChessPiece {

    private static final String CHESS_PIECE_PAWN = "Pawn";

    public Pawn(boolean white, int x, int y) {
        super(white, x, y);
    }

    @Override
    public boolean canMove(int x, int y) {//1.Fall White (3,5) 2.Fall Black (3,1)
        if (super.canMove(x,y))
        {
            if(isWhite()){
                if(getY()-1==y){    //6-1==5
                    return true;
                }
            }else {
                if (getY()+1==y){ //1+1==2
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String gerName(){
        return CHESS_PIECE_PAWN;
        //return this.getClass().getName();
    }
}

public class Main {

    public static void main(String[] args) {

        ChessPiece cp = new Pawn(true, 0,0);
        cp.move(4,5);
        System.out.println("X: "+cp.getX());
        System.out.println("Y: "+cp.getY());

        cp.move(4,5);
        System.out.println("X: "+cp.getX());
        System.out.println("Y: "+cp.getY());
    }
}

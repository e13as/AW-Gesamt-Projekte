import org.junit.Test;

import static org.junit.Assert.*;

public class ChessPieceTest {

    @Test
    public void canMoveTest() {

        ChessPiece cp = new ChessPiece(true, 0, 0, name);
        assertEquals(false, cp.canMove(8, 5));
        assertEquals(false, cp.canMove(-1, 5));
        assertEquals(false, cp.canMove(0, 0));
        assertEquals(true, cp.canMove(0, 4));
    }

    @Test
    public void moveTest() {
        ChessPiece cp = new ChessPiece(true, 0, 0, name);
        cp.move(4, 5);
        assertEquals(4, cp.getX());
        assertEquals(5, cp.getY());
        cp.canMove(4, 5);
        assertEquals(false, cp.canMove(4, 5));
        assertEquals(4, cp.getX());
        assertEquals(5, cp.getY());

    }
}

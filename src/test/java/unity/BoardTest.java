package unity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    @Test
    void getSize() {
        Board board = new Board();
        int size = board.getSize();
        assertEquals(size,0);
    }

    @Test
    void setSize() {
        Board board = new Board();
        int size = 6;
        board.setSize(size);
        assertEquals(board.size,size);
    }
}
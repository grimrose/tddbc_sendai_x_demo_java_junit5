package tddbc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class GridPointTest {

    @Test
    public void x座標が4でy座標が7である格子点の文字列表記を取得する() throws Exception {
        GridPoint sut = new GridPoint(4, 7);
        assertEquals("(4,7)", sut.notation());
    }

    @Test
    public void x座標が3でy座標が8である格子点の文字列表記を取得する() throws Exception {
        GridPoint sut = new GridPoint(3, 8);
        assertEquals("(3,8)", sut.notation());
    }

    @Test
    public void 格子点_4_7_と格子点_4_7_は同じ座標を持つ() throws Exception {
        GridPoint sut = new GridPoint(4, 7);
        assertTrue(sut.hasSameCoordinatesWith(new GridPoint(4, 7)));
    }

    @Test
    public void 格子点_4_7_と格子点_3_8_は同じ座標を持たない() throws Exception {
        GridPoint sut = new GridPoint(4, 7);
        assertFalse(sut.hasSameCoordinatesWith(new GridPoint(3, 8)));
    }

    @Test
    public void 格子点_4_7_と左隣の格子点_3_7_は隣り合っている() {
        GridPoint sut = new GridPoint(4, 7);
        assertTrue(sut.isNeighborOn(new GridPoint(3, 7)));
    }

    @Test
    public void 格子点_4_7_と同じ位置の格子点_4_7_は隣り合っていない() {
        GridPoint sut = new GridPoint(4, 7);
        assertFalse(sut.isNeighborOn(new GridPoint(4, 7)));
    }

    @Test
    public void 格子点_4_7_と右隣の格子点_5_7_は隣り合っている() {
        GridPoint sut = new GridPoint(4, 7);
        assertTrue(sut.isNeighborOn(new GridPoint(5, 7)));
    }

    @Test
    public void 格子点_4_7_と上隣の格子点_4_8_は隣り合っている() {
        GridPoint sut = new GridPoint(4, 7);
        assertTrue(sut.isNeighborOn(new GridPoint(4, 8)));
    }

    @Test
    public void 格子点_4_7_と下隣の格子点_4_6_は隣り合っている() {
        GridPoint sut = new GridPoint(4, 7);
        assertTrue(sut.isNeighborOn(new GridPoint(4, 6)));
    }

}

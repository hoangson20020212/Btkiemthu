import org.junit.Assert;
import org.junit.Test;
public class HoboTest{

     public void testCalculateBMI1() {
        assertEquals(Hobo.Check(0, 0), ("Không được học bổng"));
    }
    
    public void testCalculateBMI2() {
        assertEquals(Hobo.Check(0, 1), ("Không được học bổng"));
    }
    public void testCalculateBMI3() {
        assertEquals(Hobo.Check(0, 56), ("Không được học bổng"));
    }
    public void testCalculateBMI4() {
        assertEquals(Hobo.Check(0, 99), ("Không được học bổng"));
    }

    public void testCalculateBMI5() {
        assertEquals(Hobo.Check(0, 100), ("Không được học bổng"));
    }public void testCalculateBMI6() {
        assertEquals(Hobo.Check(0.1, 0), ("Không được học bổng"));
    }public void testCalculateBMI7() {
        assertEquals(Hobo.Check(0.1, 1), ("Không được học bổng"));
    }
    public void testCalculateBMI8() {
        assertEquals(Hobo.Check(0.1, 56), ("Không được học bổng"));
    }
    public void testCalculateBMI9() {
        assertEquals(Hobo.Check(0.1, 99), ("Không được học bổng"));
    }
    public void testCalculateBMI10() {
        assertEquals(Hobo.Check(0.1, 100), ("Không được học bổng"));
    }public void testCalculateBMI11() {
        assertEquals(Hobo.Check(2.1, 0), ("Không được học bổng"));
    }public void testCalculateBMI12() {
        assertEquals(Hobo.Check(2.1, 1), ("Không được học bổng"));
    }public void testCalculateBMI13() {
        assertEquals(Hobo.Check(2.1, 56), ("Không được học bổng"));
    }public void testCalculateBMI14() {
        assertEquals(Hobo.Check(2.1, 99), ("Không được học bổng"));
    }public void testCalculateBMI15() {
        assertEquals(Hobo.Check(2.1, 100), ("Không được học bổng"));
    }
    public void testCalculateBMI16() {
        assertEquals(Hobo.Check(3.9, 0), ("Không được học bổng"));
    }
    public void testCalculateBMI17() {
        assertEquals(Hobo.Check(3.9, 1), ("Không được học bổng"));
    }
    public void testCalculateBMI18() {
        assertEquals(Hobo.Check(3.9, 56), ("Không được học bổng"));
    }
    public void testCalculateBMI19() {
        assertEquals(Hobo.Check(3.9, 99), ("Được học bổng"));
    }
    public void testCalculateBMI20() {
        assertEquals(Hobo.Check(3.9, 100), ("Được học bổng"));
    }
    public void testCalculateBMI21() {
        assertEquals(Hobo.Check(4.0, 0), ("Không được học bổng"));
    }
    public void testCalculateBMI22() {
        assertEquals(Hobo.Check(4.0, 1), ("Không được học bổng"));
    }
    public void testCalculateBMI23() {
        assertEquals(Hobo.Check(4.0, 56), ("Không được học bổng"));
    }
    public void testCalculateBMI24() {
        assertEquals(Hobo.Check(4.0, 99), ("Được học bổng"));
    }
    public void testCalculateBMI25() {
        assertEquals(Hobo.Check(4.0, 100), ("Được học bổng"));
    }
}
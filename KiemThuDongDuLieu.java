import org.junit.Assert;
import org.junit.Test;
public class testdongdieukhien{

     public void testCalculateBMI1() {
        assertEquals(Hobo.Check(-3, -6), ("Đầu vào không hợp lệ"));
    }
    
    public void testCalculateBMI2() {
        assertEquals(Hobo.Check(3.9, 90), ("Được học bổng"));
    }
    public void testCalculateBMI3() {
        assertEquals(Hobo.Check(3, 70), ("Không được học bổng"));
    }
}
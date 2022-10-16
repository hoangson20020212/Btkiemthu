import org.junit.Assert;
import org.junit.Test;
public class testdongdieukhien{

     public void testCalculateBMI1() {
        assertEquals(Hobo.Check(-2, -4), ("Không được học bổng"));
    }
    
    public void testCalculateBMI2() {
        assertEquals(Hobo.Check(3.7, 85), ("Không được học bổng"));
    }
    public void testCalculateBMI3() {
        assertEquals(Hobo.Check(3.2, 85), ("Không được học bổng"));
    }
}
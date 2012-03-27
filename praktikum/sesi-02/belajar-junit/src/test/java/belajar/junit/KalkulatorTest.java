package belajar.junit;

import org.junit.*;

public class KalkulatorTest{
    @Test
    public void testTambah(){
        Kalkulator k = new Kalkulator();
        Assert.assertEquals(new Integer(4), k.tambah(3,1));
    }
}

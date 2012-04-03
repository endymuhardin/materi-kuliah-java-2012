package belajar.collection;

import org.junit.*;

public class ListTest {
    @Test
    public void testAddEmail(){
        Mahasiswa m = new Mahasiswa();

        // sebelum diisi, harusnya daftar email kosong
        Assert.assertTrue(m.daftarEmail.isEmpty());

        // isi satu data
        m.daftarEmail.add("endy.muhardin@gmail.com");

        // setelah diisi, harusnya tidak kosong lagi
        Assert.assertFalse(m.daftarEmail.isEmpty());

        // jumlah data dalam list harusnya 1
        Assert.assertEquals(new Integer(1), new Integer(m.daftarEmail.size()));

        // isi data kedua
        m.daftarEmail.add("endymuhardin@yahoo.com");

        // jumlah data dalam list harusnya 2
        Assert.assertEquals(new Integer(2), new Integer(m.daftarEmail.size()));

        // ambil data pertama
        String dataPertama = m.daftarEmail.get(0);

        // data pertama harusnya email Gmail
        Assert.assertEquals("endy.muhardin@gmail.com", dataPertama);
    }
}

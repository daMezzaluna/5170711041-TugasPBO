
/**
 *
 * @author damez
 */
//Class anak dari Budi
public class Nina extends Budi {

    //Override nama menjadi Nina
    @Override
    void nama() {
        System.out.println("Nama: Nina");
    }

    //Override rambut menjadi lurus
    @Override
    protected void rambut() {
        System.out.println("Jenis rambut: Lurus");
    }

    //Override kulit menjadi Putih
    @Override
    protected void kulit() {
        System.out.println("Warna kulit: Putih");
    }

    //Override tinggi menjadi 140 cm
    @Override
    void tinggi() {
        System.out.println("Tinggi badan: 140 cm");
    }

    //Override kelamin menjadi Perempuan
    @Override
    void kelamin() {
        System.out.println("Jenis kelamin: Perempuan");
    }
}

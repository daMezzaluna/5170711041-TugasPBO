
/**
 *
 * @author damez
 */
public class Sari extends Sabar {

    //Override nama menjadi Sari
    @Override
    void nama() {
        System.out.println("Nama: Sari");
    }

    //Override rambut menjadi Ikal
    @Override
    void rambut() {
        System.out.println("Jenis rambut: Ikal");
    }

    //Override kulit menjadi Kuning langsat
    @Override
    void kulit() {
        System.out.println("Warna kulit: Kuning langsat");
    }

    //Override kelamin menjadi Perempuan
    @Override
    void kelamin() {
        System.out.println("Jenis kelamin: Perempuan");
    }
}

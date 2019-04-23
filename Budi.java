
/**
 *
 * @author damez
 */
//Class anak dari Sabar
public class Budi extends Sabar {

    //Override nama menjadi Budi
    @Override
    void nama() {
        System.out.println("Nama: Budi");
    }

    //Override rambut menjadi Ikal
    @Override
    protected void rambut() {
        System.out.println("Jenis rambut: Ikal");
    }
}

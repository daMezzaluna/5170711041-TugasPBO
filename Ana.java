
/**
 *
 * @author damez
 */
//Class anak dari Sabar
public class Ana extends Sabar {

    //Override nama menjadi Ana
    @Override
    void nama() {
        System.out.println("Nama: Ana");
    }

    //Override kelamin menjadi Perempuan
    @Override
    void kelamin() {
        System.out.println("Jenis kelamin: Perempuan");
    }
    
    //Override tinggi menjadi 160 cm
    @Override
    void tinggi(){
        System.out.println("Tinggi: 160 cm");
    }
}

package app;

public class AntrianService {

    private int nomorTerakhir = 0;
    private int nomorSekarang = 0;

    public int ambilAntrian() {
        nomorTerakhir++;
        return nomorTerakhir;
    }

    public int panggilAntrian() {
        if (nomorSekarang < nomorTerakhir) {
            nomorSekarang++;
        }
        return nomorSekarang;
    }

    public void reset() {
        nomorTerakhir = 0;
        nomorSekarang = 0;
    }
}

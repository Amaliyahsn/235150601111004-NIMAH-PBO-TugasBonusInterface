public abstract class Civitas {
    private String nama;
    private int umur;
    private boolean jenisKelamin;

    public Civitas(String nama, int umur, boolean jenis) {
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = jenis;
    }
    public abstract void naikLift();

    public void makanDiKantin(String kantin) {
        System.out.println(nama + " Makan di kantin " + kantin);
    }

    public void mainGameCorner() {
        System.out.println(nama + "Main game di game corner");
    }
}
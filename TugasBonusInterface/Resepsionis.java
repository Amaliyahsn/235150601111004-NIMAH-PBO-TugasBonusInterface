public class Resepsionis {
    private int idResepsionis;
    private String jabatan;
    private double gaji;

    public Resepsionis(int idResepsionis, String jabatan, double gaji) {
        this.idResepsionis = idResepsionis;
        this.jabatan = jabatan;
        this.gaji = gaji;
    }

    public void melayani() {
        System.out.println("Resepsionis " + jabatan + " melayani");
    }

    public void melapor() {
        System.out.println("Resepsionis " + jabatan + " melapor");
    }

    // Getters for idResepsionis, jabatan, and gaji
    public int getIdResepsionis() {
        return idResepsionis;
    }

    public String getJabatan() {
        return jabatan;
    }

    public double getGaji() {
        return gaji;
    }
}
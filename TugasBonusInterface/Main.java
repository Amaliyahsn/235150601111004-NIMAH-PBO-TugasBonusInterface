public class Main {
    public static void main(String[] args) {
        // Instansiasi kelas konkret
        Dosen dosen = new Dosen("Pak Aswin", 40, true, "12345", 10000000);
        Mahasiswa mahasiswa = new Mahasiswa("Amaliyah", 20, false, "2102001", 3.75, 1);
        Asprak asprak = new Asprak("Aldo", 22, true, "2102002", 3.85, 1);
        Resepsionis resepsionis = new Resepsionis(1, "Admin", 5000000);
        Pengajar pengajar = new Pengajar();

        // Instansiasi menerapkan konsep upcasting 
        Civitas dosenUpc = new Dosen("Pak Aryo", 50, true, "54321", 12000000);
        Civitas mahasiswaUpc = new Mahasiswa("Eko", 21, true, "09876", 3.6, 3);
        Mahasiswa asprakUpc = new Asprak("Yoga", 23, true, "33445", 3.9, 2);
        System.out.println("Output dari Instansiasi menerapkan konsep upcasting  ");
        System.out.println("---------------------");
        mahasiswaUpc.makanDiKantin(" KANTIN FILKOM");
        mahasiswaUpc.mainGameCorner();
        asprakUpc.mengikutiOrganisasi("BEM");
        System.out.println("---------------------");

        // Memanggil method 
        System.out.println("Output dari memanggil method ");
        System.out.println("---------------------");
        dosen.ikutPenelitian();
        mahasiswa.ngerjainTugas();
        asprak.ngasihKomenDiGCR();
        resepsionis.melayani();
        pengajar.mengajar("PBO");
        pengajar.mengasihTugas();
        pengajar.menilaiTugas();
        System.out.println("----------------------");
        

        // Upcasting 
        System.out.println("Output dari Upcasting  ");
        System.out.println("---------------------");
        PesertaKelas pesertaDosen = dosen;
        PesertaKelas pesertaMahasiswa = mahasiswa;
        pesertaDosen.masukKelas();
        pesertaMahasiswa.masukKelas();

    
        
    }
}
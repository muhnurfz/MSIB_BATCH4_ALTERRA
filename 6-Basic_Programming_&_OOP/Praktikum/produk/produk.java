public class produk {
    private String nama;
    private String deskripsi;
    private double harga;
    private int stok;

    // Setter methods
    public void setName(String name) {
        this.nama = name;
    }

    public void setdeskripsi(String deskripsi, String setdeskripsi1) {
        setdeskripsi1 = deskripsi;
    }

    public void setPrice(double harga) {
        this.harga = harga;
    }

    public void setStock(int stok) {
        this.stok = stok;
    }

    // Getter methods
    public String getName() {
        return nama;
    }

    public String () {
        return deskripsi;
    }

    public double getharga() {
        return harga;
    }

    public int getstok() {
        return stok;
    }

    // Method to get product information
    public void getInfo() {
        System.out.println("Nama produk : " + getName());
        System.out.println("Deskripsi   : " + getdeskripsi());
        System.out.println("Harga       : " + getharga());
        System.out.println("stok        : " + getstok());
    }
}

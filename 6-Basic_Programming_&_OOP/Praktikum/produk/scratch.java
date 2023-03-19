public class produk {
    public static void main(String[] args) {
        // Create new product object
        produk product = new produk();

        // Set product information
        product.setnama("Coffe");
        product.setdeskripsi("This is high quality coffe");
        product.setharga(15000);
        product.getstok(20);

        // Get product information
        product.getInfo();
    }
}

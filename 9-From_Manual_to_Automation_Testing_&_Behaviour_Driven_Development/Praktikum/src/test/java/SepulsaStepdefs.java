package starter;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SepulsaStepdefs {

    @Given("user ada pada login page")
    public void userAdaPadaLoginPage() {

        System.out.println("ini adalah login page");
    }
    @When("user memasukan username dan password dengan benar")
    public void userMemasukanUsernameDanPasswordDenganBenar() {

        System.out.println("ini adalah login page");
    }

    @And("user masukan username benar")
    public void userMasukanUsernameBenar() {

        System.out.println("ini adalah login page");
    }

    @And("user masukan password benar")
    public void userMasukanPasswordBenar() {

        System.out.println("ini adalah login page");
    }

    @And("user memilih login")
    public void userMemilihLogin() {
        throw new PendingException();
    }

    @Then("user terotentikasi")
    public void userTerotentikasi() {
        throw new PendingException();
    }

    @And("user masuk")
    public void userMasuk() {
        throw new PendingException();
    }

    @Then("user ada didalam homepage")
    public void userAdaDidalamHomepage() {
        throw new PendingException();
    }

    @And("user masukan username")
    public void userMasukanUsername() {
        throw new PendingException("Implementasikan aku");
    }

    @And("user masukan password")
    public void userMasukanPassword() {
        throw new PendingException("Implementasikan aku");
    }

    @Then("user tidak masuk ke homepage")
    public void userTidakMasukKeHomepage() {
        throw new PendingException("Implementasikan aku");
    }

    @And("user tidak memasukan username")
    public void userTidakMemasukanUsername() {
        throw new PendingException("Implementasikan aku");
    }

    @And("user tidak memasukan password")
    public void userTidakMemasukanPassword() {
        throw new PendingException("Implementasikan aku");
    }

    @Given("user ada di homepage")
    public void userAdaDiHomepage() {
        throw new PendingException("Implementasikan aku");
    }

    @And("user memilih account -> pulsa")
    public void userMemilihAccountPulsa() {
        throw new PendingException("Implementasikan aku");
    }

    @Then("user masuk pada halaman pulsa")
    public void userMasukPadaHalamanPulsa() {
        throw new PendingException("Implementasikan aku");
    }

    @Given("user ada dihome page")
    public void userAdaDihomePage() {
        throw new PendingException("Implementasikan aku");
    }

    @And("user mengisi nomor telepon")
    public void userMengisiNomorTelepon() {
        throw new PendingException("Implementasikan aku");
    }

    @When("user memilih user nomor telepon")
    public void userMemilihUserNomorTelepon() {
        throw new PendingException("Implementasikan aku");
    }

    @Then("sepulsa mendeteksi nomor telepon target")
    public void sepulsaMendeteksiNomorTeleponTarget() {
        throw new PendingException("Implementasikan aku");
    }

    @And("user memasukan nominal pulsa")
    public void userMemasukanNominalPulsa() {
        throw new PendingException("Implementasikan aku");
    }

    @Then("user dapat memilih nominal pulsa")
    public void userDapatMemilihNominalPulsa() {
        throw new PendingException("Implementasikan aku");
    }

    @Given("user ada pada homepage")
    public void userAdaPadaHomepage() {
        throw new PendingException("Implementasikan aku");
    }

    @And("user memilih menu voucher game")
    public void userMemilihMenuVoucherGame() {
        throw new PendingException("Implementasikan aku");
    }

    @Then("user masuk pada halaman voucher game")
    public void userMasukPadaHalamanVoucherGame() {
        throw new PendingException("Implementasikan aku");
    }

    @Given("user ada pada voucher game")
    public void userAdaPadaVoucherGame() {
        throw new PendingException("Implementasikan aku");
    }

    @And("user memilih voucher game steam wallet")
    public void userMemilihVoucherGameSteamWallet() {
        throw new PendingException("Implementasikan aku");
    }

    @Then("user mendapat pesan {string}")
    public void userMendapatPesan(String arg0) {
        throw new PendingException("Implementasikan aku");
    }

    @Given("user ada pada home page kemudian memilih menu uang elektronik")
    public void userAdaPadaHomePageKemudianMemilihMenuUangElektronik() {
        throw new PendingException("Implementasikan aku");
    }

    @And("user masuk kedalam halaman uang elektronik")
    public void userMasukKedalamHalamanUangElektronik() {
        throw new PendingException("Implementasikan aku");
    }

    @Then("user ada pada halaman yang elektronik")
    public void userAdaPadaHalamanYangElektronik() {
        throw new PendingException("Implementasikan aku");
    }

    @And("user memilih menu metode uang elektronik \\(gopay contohnya)")
    public void userMemilihMenuMetodeUangElektronikGopayContohnya() {
        throw new PendingException("Implementasikan aku");
    }

    @Then("user masuk kedalam halaman permintaan uang elektronik gopay")
    public void userMasukKedalamHalamanPermintaanUangElektronikGopay() {
        throw new PendingException("Implementasikan aku");
    }

    @Given("user telah masuk dari halaman uang elektronik - gopay")
    public void userTelahMasukDariHalamanUangElektronikGopay() {
        throw new PendingException("Implementasikan aku");
    }

    @And("user telah memasukan nominal uang gopay")
    public void userTelahMemasukanNominalUangGopay() {
        throw new PendingException("Implementasikan aku");
    }

    @Then("Sepulsa memberikan rincian transaksi")
    public void sepulsaMemberikanRincianTransaksi() {
        throw new PendingException("Implementasikan aku");
    }

    @And("Sepulsa meminta {string}")
    public void sepulsaMeminta(String arg0) {
        throw new PendingException("Implementasikan aku");
    }

    @Then("user memasukan jika punya")
    public void userMemasukanJikaPunya() {
        throw new PendingException("Implementasikan aku");
    }

    @And("user tidak punya")
    public void userTidakPunya() {
        throw new PendingException("Implementasikan aku");
    }

    @Then("user memilih metode pembayaran")
    public void userMemilihMetodePembayaran() {
        throw new PendingException("Implementasikan aku");
    }

    @Given("user diminta membayar nominal tagihan sepulsa")
    public void userDimintaMembayarNominalTagihanSepulsa() {
        throw new PendingException("Implementasikan aku");
    }

    @And("user memasukan nominal pembayaran")
    public void userMemasukanNominalPembayaran() {
        throw new PendingException("Implementasikan aku");
    }

    @Then("gopay terkirim")
    public void gopayTerkirim() {
        throw new PendingException("Implementasikan aku");
    }

    @Given("user diminta memabayar nominal tagihan sepulsa")
    public void userDimintaMemabayarNominalTagihanSepulsa() {
        throw new PendingException("Implementasikan aku");
    }

    @And("user tidak memasukan nominal pembayaran")
    public void userTidakMemasukanNominalPembayaran() {
        throw new PendingException("Implementasikan aku");
    }

    @Then("gopay gagal terkirim")
    public void gopayGagalTerkirim() {
        throw new PendingException("Implementasikan aku");

    }

}

<html>
          <title>Pesanan sukses</title>
          <link rel="icon" type="image/x-icon" href="pic/logowebuts.png">
    <style>
        html {
            font-family: sans-serif;
        }

        body {
            background:  #e8e8e8 no-repeat fixed center;
        }

        .delivery {
            font-family: sans-serif;
            text-decoration: none;
            background-color: white;
            margin: 30px 400px 300px 400px;
            padding: 20px;
        }
    </style>
    
    <body>    
    <h3 style="text-align: center;">Pesanan sukses</h3>
    <div class="delivey">
        <table>
        <?php
            echo "<tr><td>Nama penerima<td>".$_POST["nama"];
            echo "<tr><td>No HP<td>".$_POST["telp"];
            echo "<tr><td>Alamat penerima<td>".$_POST["alt"];
            echo "<tr><td>Jasa ekpedisi<td>".$_POST["eks"];
            echo "<tr><td>Metode pembayaran<td>".$_POST["bayar"];
            echo "<tr><td>Produk yang dibeli<td>".$_POST["stuff"];
        ?>
        </table>
    </div>
    </body>
</html>


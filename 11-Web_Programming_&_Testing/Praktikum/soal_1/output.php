<html>
        <title>Data berhasil diUpload</title>
        <link rel="icon" type="image/x-icon" href="pic/logowebuts.png">
   
   <body>    
   <h2  style="text-align: center; margin-top: 20px;">Data siswa berhasil diupload</h2>

   <div class="form1">
     <h3>Form Data siswa</h3>
      <table style="height: 75%; width: 30%;">
      <?php
      
         echo "<tr><td>Nama calon siswa<td>".$_POST["FLname"];
         echo "<tr><td>Tempat lahir siswa<td>".$_POST["tempat-sis"];
         echo "<tr><td>Tanggal lahir siswa<td>".$_POST["TTL"];
         echo "<tr><td>Alamat siswa<td>".$_POST["alamat-sis"];
         echo "<tr><td>Kode pos <td>".$_POST["kode-sis"];
         echo "<tr><td>Kontak siswa<td>".$_POST["kontak-sis"];
       if (isset($_POST['jenis_kelamin'])) 
    $jenis_kelamin=$_POST['jenis_kelamin'];
    echo "<tr><td>Jenis kelamin siswa".$jenis_kelamin;
         echo "<tr><td>Email siswa<td>".$_POST["email-sis"];
         echo "<tr><td>Anak ke - <td>".$_POST["anak-ke"];
         echo "<tr><td>Jumlah saudara <td>".$_POST["jum-sdr"];
         echo "<tr><td>Mendaftar di kelas<td>".$_POST["kelas-sis"];

          if(isset($_POST['kirim.php'])){
        $file    =$_FILES['ijazah'];
                
        $ekstensi_file    =array('doc', 'docx', 'pdf','png');
        $ekstensi        =strtolower(end(explode('.', $_FILES['name'])));
        $ekstensi_ok    =in_array($ekstensi, $ekstensi_file);
                
            // validasi input type file
            if(!($ekstensi_ok)){
                echo "Format file salah...<br>";
            }
            
            // jika validasi type file terpenuhi
            else {
                //Tulis query database disini
                echo "File berhasil diupload...<br>";
            }    
    }    

      ?>

      </table>
   </div>

   <div class="form2">
  <h3 style="margin-top: 50px; text-align: center;">Form data orang tua siswa</h3>
     <table style="height: 50%; width: 30%;">
         <?php
         echo "<tr><td>Nama ayah kandung<td>".$_POST["dad-sis"];
         echo "<tr><td>Pendidikan Ayah kandung<td>".$_POST["pendidikan-dad"];
         echo "<tr><td>Nama Ibu kandung<td>".$_POST["ibu-sis"];
         echo "<tr><td>Pendidikan Ibukandung<td>".$_POST["pendidikan-ibu"];
         echo "<tr><td>Alamat orang tua<td>".$_POST["alamat-ortu"];
         echo "<tr><td>NO telepon orang tua<td>".$_POST["kontak-ortu"];
        
         ?>

      </table>
   </div>
   </div>
   </body>
</html>


<!DOCTYPE html>
<html>
<head>
	<title>Website PPDB Tahun 2021 Kota XYZ</title>
	<link rel="icon" type="image/x-icon" href="asset/ico1.ico">
	<link href="https://fonts.googleapis.com/css?family=Poppins:300,400,500,700" rel="stylesheet">
  
</head>
<style>

		body {
		background: url(asset/back-g.png) no-repeat fixed center;
		font-family: Poppins;
		height: 100%;
		}

		
		.header {
			background-color: black;
			color: white;
			font-size: 20px;
			margin-top: 20px;
			padding: 10px;
			box-shadow: 20px;
			text-align: center; 
			float: center;
		}

		.form1 {
			text-decoration: none;
			background-color: white;
			margin-left: 400px;
			margin-right: 400px;
			margin-top: 20px;
			padding: 20px 20px 20px 20px;
			font-weight: bold;
			border-radius: 5px;
		}
		.form2 {
			text-decoration: none;
			background-color: white;
			margin-left: 400px;
			margin-right: 400px;
			margin-top: 20px;
			padding: 20px 20px 100px 20px;	
			font-weight: bold;
			border-radius: 5px;
		}

		.title {
			padding: 10px 0px 10px 0px;
			font-family: Poppins;
		}
		.radio1 {
			text-decoration: none;
			font-weight: bold;
			margin-top: 10px;
		}

		button {
			float: right;
			font-family: Poppins;
   			font-size: 14px;
    		background: #22a4cf;
    		color: white;
   	 		border: white ;
   			border-radius: 5px;
   			padding: 10px 10px 10px 10px;
    		text-decoration: none;
    		margin-top: 10px;
		}
		
		label {
			font-family: Poppins;
			font-size: 14px;
			padding: 10px 0px 10px 0px ;
		}

		input {
			font-family: Poppins;
		}
		a:hover, button:hover, input[type=submit]:hover, input[type=reset]:hover {
		    opacity:0.8;
		}
	
		.time {
			float: right;
		}

		.kotak{
			float: left;
			width: 66px;
			height: 40px;
			text-align: center;
			background-color:  #808080;
			color: black;
		}

		.time p {
			color: #fff;
			font-size: 12px;
			text-align: center;
			font-family: Poppins;
			color: black;
		}

		.footer {
	    	background-color: black;
	    	color: #ffffff;
		    text-align: center;
		   	font-size: 12px;
		   	padding: 10px;
		   	margin-top: 330px;
		   	display: block;
	    	font-family: Poppins;
		}

		/* For mobile phones: */
	[class*="col-"] {
	    width: 100%;
	}
	@media only screen and (min-width: 600px) {
	    /* For tablets: */
	    .col-m-1 {width: 8.33%;}
	    .col-m-2 {width: 16.66%;}
	    .col-m-3 {width: 25%;}
	    .col-m-4 {width: 33.33%;}
	    .col-m-5 {width: 41.66%;}
	    .col-m-6 {width: 50%;}
	    .col-m-7 {width: 58.33%;}
	    .col-m-8 {width: 66.66%;}
	    .col-m-9 {width: 75%;}
	    .col-m-10 {width: 83.33%;}
	    .col-m-11 {width: 91.66%;}
	    .col-m-12 {width: 100%;}
	}
	@media only screen and (min-width: 768px) {
	    /* For desktop: */
	    .col-1 {width: 8.33%;}
	    .col-2 {width: 16.66%;}
	    .col-3 {width: 25%;}
	    .col-4 {width: 33.33%;}
	    .col-5 {width: 41.66%;}
	    .col-6 {width: 50%;}
	    .col-7 {width: 58.33%;}
	    .col-8 {width: 66.66%;}
	    .col-9 {width: 75%;}
	    .col-10 {width: 83.33%;}
	    .col-11 {width: 91.66%;}
	    .col-12 {width: 100%;}
	}

	
</style>
	
	<div class="header">
		<h2>Website PPDB Tahun 2021 Kota XYZ</h2>
	</div>

	<div class="form1"> 
		<form action="output.php" method="post">
			
			<h3 style="text-align: center;">PENDAFTARAN SISWA BARU SMAN XYZ</h3>
			<div class="title"><p>Form siswa</p></div>
			
			<label for="fLname" >Nama Calon siswa </label><br>
			<input type="text" id="FLname" name="FLname" size="55" style="margin-bottom: 10px"><br>

			<label for="tempat-sis" >Tempat lahir siswa</label><br>
			<input type="text" id="tempat-sis" size="55" placeholder="contoh Jakarta" name="tempat-sis" style="margin-bottom: 10px"><br>

			<label for="TTL">Tanggal lahir</label><br>
			<input type="date" id="TTL" title="Tanggal lahir siswa" name="TTL" max="2004-12-31" style="margin-bottom: 10px;" ><br>
			
			<label for="alamat-sis">Alamat</label><br>
			<textarea id="alamat-sis" name="alamat-sis" placeholder="JL.Perintis kemerdekaan 1"  rows="4" cols="50"  style="resize: none;"></textarea> <br>

			<label for="kode-sis" >Kode pos </label><br>
			<input type="text" id="kode-sis" size="55"  placeholder="contoh 40132" maxlength="5" name="kode-sis" style="margin-bottom: 10px"><br>

			<label for="kontak-sis" >Kontak siswa </label><br>
			<input type="text" name="kontak-sis" size="55"  placeholder="+62" maxlength="13" name="kontak-sis" style="margin-bottom: 10px"><br>

			<label for="email-sis" >E-mail siswa</label><br>
			<input type="E-mail" name="email-sis" size="55"  placeholder="contoh abc@gmail.com" style="margin-bottom: 10px"><br>

	  	<div class="radio1">
	<label class="radio">	Jenis kelamin siswa</label><br>
		<input required type="radio" name="jenis_kelamin" value="Laki-laki">Laki Laki
	<label class="radio">
		<input required type="radio" name="jenis_kelamin" value="Perempuan">Perempuan
			</div>
	  		<label for="fname">Anak ke </label><br>
			<input type="text" id="anak-ke" size="55"  placeholder="contoh Anak pertama" maxlength="2" name="anak-ke" style="margin-bottom: 10px"><br>
			<label for="fname">Dari berapa saudara</label><br>
			<input type="text"  id="jum-sdr" size="55"  placeholder="contoh Dari 2 saudara"  maxlength="2" name="jum-sdr" style="margin-bottom: 10px"><br>

			<label for="kelas-sis" style="padding-bottom: 10px;">Mendaftar di Kelas</label><br>
			<div style="font-family: century gothic;">
			<select id="getname" name="kelas-sis">
		    <option>10</option>
		    <option>11</option>
		    <option>12</option>
		    </select>
		 	<br>

		 	<label for="asal-sis" >Asal Sekolah </label><br>
			<input type="text" id="asal-sis" size="55"  name="asal-sis" placeholder="contoh SMPN ABC" style="margin-bottom: 10px"><br>
		 
		   <label style="">Upload file Ijazah SMP</label><br>
			<input type="file" name="ijazah" id="ijazah" accept="image/png, image/jpeg, image/png, application/pdf" title="file diterima (pdf,png,bmp,jpg)"style="padding: 10px 0px 10px 10px;"><br>
			<label for="skhun">Upload file SKHUN SMP </label><br>
			<input type="file"  id="skhun" name="skhun" accept="image/png, image/jpeg, image/png, application/pdf" title="file diterima (pdf,png,bmp,jpg)" style="padding: 10px 0px 10px 10px;"><br>
			<label for="rapot">Upload file Raport sekolah</label><br>
			<input type="file"  id="rapot" name="rapot" accept="image/png, image/jpeg, image/png, application/pdf" title="file diterima (pdf,png,bmp,jpg)" style="padding: 10px 0px 10px 10px;"><br>
			<label for="foto">Upload file pas foto</label><br>
			<input type="file"  id="foto" name="foto" accept="image/png, image/jpeg, image/png, application/pdf" title="file diterima (pdf,png,bmp,jpg)" style="padding: 10px 0px 10px 10px;"><br>
			<label for="KK">Upload file Kartu Keluarga</label><br>
			<input type="file"  id="KK" name="KK" accept="image/png, image/jpeg, image/png, application/pdf" title="file diterima (pdf,png,bmp,jpg)" style="padding: 10px 0px 10px 10px;"><br>
			<label style="opacity:0.5;">file yang diterima berformat .jpg .pdf .png</label>
			
</div>
</div>

	<div class="form2"> 
		<form action="output.php" method="post">
			<p style="padding: 0px 0px 10px 0px;">Form data orang tua</p>
			
			<label for="dad-sis" >Nama Bapak kandung</label><br>
			<input type="text" id="dad-sis" size="55"  name="dad-sis" style="margin-bottom: 10px"><br>

			<label for="pendidikan-dad">Pendidikan terakhir Bapak Kandung</label><br>		
			<div style="font-family: century gothic;">
			<select id="getname"  name="pendidikan-dad">
		  <option>Tidak bersekolah</option>
		  <option>Taman Kanak-kanak (TK)</option>
		  <option>Sekolah Dasar (SD)</option>
		  <option>Sekolah Menengah Pertama (SMP)</option>
		  <option>Sekolah Menengah Atas/Kejuruan/Sederajat (SMA)</option>
		  <option>Diploma 1 (D1)</option>
			<option>Diploma 2 (D2)</option>
			<option>Diploma 3 (D3)</option>
			<option>Diploma 4/Strata 1/Sederajat (D4/S1)</option>
			<option>Strata 2 (S2)</option>
			<option>Strata 3 (S3)</option>
			</select> <br>
	
			<label for="ibu_sis" >Nama Ibu kandung</label><br>
			<input type="text" id="ibu-sis"  name="ibu-sis" style="margin-bottom: 10px"><br>

			<label for="ibu-sis">Pendidikan terakhir Ibu Kandung</label><br>		
			<div style="font-family: century gothic;">
			<select id="getname" name="pendidikan-ibu">
		  <option>Tidak bersekolah</option>
		  <option>Taman Kanak-kanak (TK)</option>
		  <option>Sekolah Dasar (SD)</option>
	  	<option>Sekolah Menengah Pertama (SMP)</option>
		 	<option>Sekolah Menengah Atas/Kejuruan/Sederajat (SMA)</option>
		  <option>Diploma 1 (D1)</option>
			<option>Diploma 2 (D2)</option>
			<option>Diploma 3 (D3)</option>
			<option>Diploma 4/Strata 1/Sederajat (D4/S1)</option>
			<option>Strata 2 (S2)</option>
			<option>Strata 3 (S3)</option>
			</select> <br>	

			<label for="alamat-ortu">Alamat Orang tua / wali</label><br>
		<textarea id="alamat-ortu" name="alamat-ortu" placeholder="JL.Perintis kemerdekaan 1"  rows="4" cols="50"  style="resize: none;"></textarea> <br>

			<label for="kode-ortu" >Kode pos alamat orang tua </label><br>
			<input type="text" id="kode-ortu" size="55"  placeholder="contoh 40132" maxlength="5" name="kode-ortu" style="margin-bottom: 10px"><br>
			
			<label for="kontak-ortu" >NO telepon orang tua</label><br>
			<input type="text" id="kontak-ortu" size="55"  placeholder="+62" name="kontak-ortu" maxlength="13" style="margin-bottom: 10px"><br>


			<br><a href="kirim.php"><button style="padding: 10px 10px 10px 10px;">kirim data </button></a>
			<input type="reset" value="Reset form" onClick="alert('Tekan OK untuk mereset form')" style="float: right;font-family: Poppins;font-size: 14px;background: #22a4cf;color: white;border: white ;border-radius: 5px;padding: 10px 10px 10px 10px;text-decoration: none;margin-top: 10px; margin-right: 10px ;">
		</form>

		
	</div>
</div>
</div>

<div class="time" style="background: #f2f2f2;">
	<p>Jam terkini</p>
	<div class="kotak">
		<p id="j"></p>
	</div>
	<div class="kotak">
		<p id="m"></p>
	</div>
	<div class="kotak">
		<p id="d"></p>
	</div>

<script>
	window.setTimeout("timer()", 1000);
 
	function timer() {
		var timer = new Date();
		setTimeout("timer()", 1000);
		document.getElementById("j").innerHTML = timer.getHours();
		document.getElementById("m").innerHTML = timer.getMinutes();
		document.getElementById("d").innerHTML = timer.getSeconds();
	}
</script>	
</div>
</div>
<script>
      window.addEventListener("beforeunload", function (e) {
        e.preventDefault(); 
        e.returnValue = "";
      });
    </script>

	<footer class="footer">&copy;Copyright belongs to Muhamad Nur Fajjri Zenitandrio - Information System 3 - 10519089 web builder</footer>
</div>



</body>
</html>
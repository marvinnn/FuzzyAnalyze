/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuzzyanalyze;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 *
 * @author Marvin Zeson
 */
public class FuzzyAnalyze {

    /**
     * @param args the command line arguments
     */
    static double idfPantai = 0.6672677325721246;
    static double idfJawa = 0.8554458214787922;
    static double idfTimur = 1.0874389880699844;
    public static void main(String[] args) throws URISyntaxException, FileNotFoundException, IOException {
        BufferedReader br = null;
        List<String> daftarKata = new ArrayList<>();
        String tmp;
        URL path = fuzzyanalyze.FuzzyAnalyze.class.getResource("stopword_list_tala.txt");
        File f = new File(path.toURI());
        
        br = new BufferedReader(new FileReader(f));
        
        while((tmp = br.readLine()) != null){
                daftarKata.add(tmp);
        }
        
        List<Double> idfValue = new ArrayList<Double>();
        idfValue.add(idfPantai);
        idfValue.add(idfJawa);
        idfValue.add(idfTimur);
        
        String inputUser = "Pantai Jawa Timur";
        StringTokenizer inputTokenizer = new StringTokenizer(
                            inputUser, " !@#$%^&*()-_=+|;:',./<>?");
        List<String> inputToken = new ArrayList<String>();
        while (inputTokenizer.hasMoreTokens()) {
                        String tmp3 = inputTokenizer.nextToken();
                        if(daftarKata.contains(tmp3.toLowerCase())){
                            continue;
                        }
                        inputToken.add(tmp3.toLowerCase());
                    }
        
        String artikel = "Jawa Timur, provinsi ini seolah memiliki magnet bagi para wisatawan domestik maupun mancanegara. Mulai dari Gunung Bromo yang keindahannya sudah mendunia, Ranu Kumbolo , Jatim Park, Museum Angkut , dan masih banyak sekali tempat wisata yang bisa Anda temukan di sini. Selain gunung-gunung yang indah, Jawa Timur ternyata juga memiliki pantai-pantai eksotis yang menyegarkan mata. Pantai-pantai ini tersebar di kota Malang , Jember , Banyuwangi , dan kota-kota lain. Bagi Anda pecinta wisata pantai , di sini kami akan mengulas 10 pantai terindah di Jawa Timur yang sayang untuk dilewatkan . 1. Pantai Papuma, Jember Pantai Papuma, Jember Pantai Papuma terletak di Desa Lojejer, Kecamatan Wuluhan, Kabupaten Jember. Perjalanan dari kota Jember ke Pantai Papuma bisa memakan waktu yang cukup lama, sehingga disarankan bagi Anda untuk menginap semalam di sini. Pihak pengelola telah menyediakan beberapa penginapan dan cottage dengan harga yang cukup terjangkau, sekitar 150.000 – 450.000 Rupiah per malam. Harga tiket masuk ke pantai ini sendiri 5.000 sampai 7.000 Rupiah. Pantai Papuma memiliki pemandangan yang sangat indah. Perpaduan antara pasir putih serta batu karang yang menyebar di tepi pantai. Salah satu ciri khas dari Pantai Papuma adalah tujuh karang besar yang menjulang di pantai. Ukurannya yang besar membuat karang-karang ini menyerupai sebuah pulau. Ketujuh karang ini juga memiliki nama masing-masing. Di sini Anda bisa merasakan sensasi terpaan ombak dari atas karang. Pantai ini juga sering dijadikan sebagai lokasi foto prewedding ataupun landscape oleh para fotografer dari berbagai kota. 2. Pantai Pulau Merah, Banyuwangi Pantai Pulau Merah, Banyuwangi Pantai Pulau Merah terletak di di Desa Sumberagung, Kecamatan Pesanggaran, Banyuwangi. Anda membutuhkan waktu sekitar tiga jam untuk menuju pantai ini dari pusat kota Banyuwangi. Yang spesial dari pantai ini adalah pemandangan saat matahari mulai terbenam dan langit berubah menjadi jingga. Banyak yang berkomentar kalau Pantai Pulau Merah memiliki ciri seperti kebanyakan pantai di Brazil dan mendapat julukan sebagai Kuta-nya Jawa Timur. Selain duduk bersantai menikmati pemandangan pantai, kegiatan lain yang dapat Anda lakukan di sini adalah berselancar karena pantai ini telah menjadi tujuan selancar berkelas dunia di Pulau Jawa . Anda hanya perlu membayar 25.000 – 50.000 Rupiah untuk menyewa papan selancar yang sudah disediakan pihak pengelola. Kondisi ombak di sini yang mencapai ketinggian 4 sampai 5 meter sangat cocok bagi para peselancar dari berbagai tingkatan. 3. Pulau Sempu, Malang Pulau Sempu, Malang Pulau Sempu merupakan sebuah Pulau kecil yang masih berada dalam satu lokasi dengan Pantai Sendang Biru, tepatnya di Desa Tambakrejo, Kecamatan Sumbermanjing Wetan, Malang. Pulau ini berada di bawah lindungan Balai Konservasi Sumber Daya Alam (BBKSDA). Mulanya secara resmi sejak tahun 1928, Pulau Sempu merupakan cagar alam yang memiliki beragam ekosistem seperti hutan pantai, hutan bakau, dan hutan tropis dataran rendah. Namun semakin lama, banyak para pecinta alam yang mengunjungi Pantai Sendang Biru melakukan kamping di Pulau Sempu dengan menyeberang menggunakan perahu para nelayan. Yang membuat Pulau Sempu ini istimewa adalah laguna Segara Anakan yang terdapat di dalam pulau. Untuk mencapai Segara Anakan ini Anda harus melakukan tracking selama dua jam melalui hutan dan jalan yang curam. Perjalanan ini akan terbayar begitu Anda melihat pasir putih berbalut birunya air laut super jernih dan juga pemandangan karang yang melindungi Segara Anakan. Air laut di sini sangat tenang sehingga aman untuk digunakan berenang. Untuk menjaga keindahan pulau ini diharapkan Anda tidak membuang sampang dan merusak ekosistem yang ada. 4. Pantai Klayar, Pacitan Pantai Klayar, Pacitan Pantai Klayar berlokasi di Kecamatan Donorojo, kurang lebih sekitar 35 km perjalanan ke arah barat kota Pacitan. Lama waktu yang Anda perlukan untuk tiba di pantai ini adalah sekitar satu jam perjalanan. Pantai ini terbilang masih alami, sehingga jalanan menuju pantai ini cukup sulit. Pantai Klayar adalah salah satu objek wisata unggulan di Pacitan. Kesitimewaan pantai ini selain pasirnya yang seputih susu, di sini terdapat batu karang yang bentuknya menyerupai Spinx dan air mancur alami dengan tinggi mencapai 10 meter. Gradasi warna air laut dari biru hingga hijau toska dipadu dengan putihnya pasir pantai pasti akan membuat Anda jatuh cinta. Batu karang yang kokoh dan menjorok membuat pantai ini hampir sama dengan Tanah Lot Bali . 5. Teluk Ijo (Green Bay), Banyuwangi Teluk Ijo (Green Bay), Banyuwangi Pantai yang lebih dikenal sebagai Green Bay-nya Banyuwangi ini berlokasi di Kecamatan Pesanggaran, Desa Sarongan, Banyuwangi. Dari pusat kota Banyuwangi Anda bisa mengambil jalur ke arah selatan sejauh kurang lebih 90 km. Keistimewaan pantai ini adalah pasir putihnya nan lembut, air laut jernih berwarna toska dan juga air terjun setinggi 8 meter.";
        StringTokenizer contentTokenizer = new StringTokenizer(
                            artikel, " !@#$%^&*()-_=+|;:',./<>?");
        List<String> documentToken = new ArrayList<String>();
        while (contentTokenizer.hasMoreTokens()) {
                        String tmp2 = contentTokenizer.nextToken();
                        if(daftarKata.contains(tmp2.toLowerCase())){
                            continue;
                        }
                        documentToken.add(tmp2.toLowerCase());
                    }
        TfIdfCalculator calculator = new TfIdfCalculator();
        int j = 0;
        while(j< inputToken.size())
        {
            System.out.println("Perhitungan " + (j+1));
            System.out.println("TF Document = " + calculator.tf(documentToken, inputToken.get(j)));
            System.out.println("IDF Document = " + idfValue.get(j));
            System.out.println("N Document = " + calculator.norm(documentToken));
            System.out.println("TF Querry = " + 0.333);
            System.out.println("IDF Querry = " + idfValue.get(j));
            System.out.println("N Querry = " + calculator.norm(inputToken));
            j++;
        }
        System.out.println(documentToken.size());
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uas_Database;


import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Lintang Dwi
 */
public class UpdatePerpustakaan {

    KoneksiPerpustakaan konek = new KoneksiPerpustakaan();

    public void update(int absen,int nomerid, String namaid, String kelas , String tanggal) {

        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();

// data akan diambil lewat nama textField.getText
            String sql_nomerid = "update daftaranggota set nomerid ='" + nomerid + "' where absen= '" + absen + "'";
            String sql_namaid = "update daftaranggota set namaid ='" + namaid + "' where absen= '" + absen + "'";

            String sql_kelas = "update daftaranggota set kelas ='" + kelas + "' where absen= '" + absen + "'";
            
            statement.executeUpdate(sql_nomerid);
            statement.executeUpdate(sql_namaid);
            statement.executeUpdate(sql_kelas);
            statement.close();

//// kemudian data yang disisipkan akan saya tampilkan lewat textArea 
//                menampilkan.setText(mah_nim.getText() + "\n" + mah_nama.getText() + "\n" + mah_alamat.getText() + "\n" + mah_fak_id.getText() + "\n" + jenis);
            JOptionPane.showMessageDialog(null, "Berhasil Diubah");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}

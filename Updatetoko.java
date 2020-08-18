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
public class Updatetoko {

    Koneksitoko konek = new Koneksitoko();

    public void update(String bahan, int jumlah, int tersedia, int terjual) {

        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();

// data akan diambil lewat nama textField.getText
            String sql_jumlah = "update daftaranggota set jumlah ='" + jumlah + "' where bahan= '" + bahan + "'";
            String sql_tersedia = "update daftaranggota set tersedia ='" + tersedia + "' where bahan= '" + bahan + "'";

            String sql_terjual = "update daftaranggota set terjual ='" + terjual + "' where bahan= '" + bahan + "'";
            
            statement.executeUpdate(sql_jumlah);
            statement.executeUpdate(sql_tersedia);
            statement.executeUpdate(sql_tersedia);
            statement.close();

//// kemudian data yang disisipkan akan saya tampilkan lewat textArea 
//                menampilkan.setText(mah_nim.getText() + "\n" + mah_nama.getText() + "\n" + mah_alamat.getText() + "\n" + mah_fak_id.getText() + "\n" + jenis);
            JOptionPane.showMessageDialog(null, "Berhasil Diubah");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}

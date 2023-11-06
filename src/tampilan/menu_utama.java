/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tampilan;

import java.sql.Connection;
import koneksi.koneksi;

/**
 *
 * @author ASUS
 */
public class menu_utama extends javax.swing.JFrame {

public final Connection conn = new koneksi().koneksi();
private data_kategori data_kategori;
private data_barang data_barang;
private data_gudang data_gudang;
private data_transaksi_keluar data_transaksi_keluar;
private laporan_BK laporan_BK;
private data_pelanggan data_pelanggan;

private void initForm() {

    data_kategori = new data_kategori();
    data_barang = new data_barang();
    data_gudang = new data_gudang();
    data_transaksi_keluar = new data_transaksi_keluar();
    laporan_BK = new laporan_BK();
    data_pelanggan = new data_pelanggan();
}
    public menu_utama() {
        initComponents();
        initForm();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuPelanggan = new javax.swing.JMenu();
        menuDataPelanggan = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuKategori = new javax.swing.JMenuItem();
        menuBarang = new javax.swing.JMenuItem();
        menuGudang = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuBK = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        menulaporan = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("menu utama");

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Selamat Datang di Sistem Manajemen Inventaris Alpha's Elektronik");

        jLabel4.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Hello Staff Alpha's");

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addComponent(jLabel1))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(527, 527, 527)
                        .addComponent(jLabel4)))
                .addContainerGap(311, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(281, Short.MAX_VALUE))
        );

        menuPelanggan.setText("Pelanggan");
        menuPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPelangganActionPerformed(evt);
            }
        });

        menuDataPelanggan.setText("Data Pelanggan");
        menuDataPelanggan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuDataPelangganMouseClicked(evt);
            }
        });
        menuDataPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDataPelangganActionPerformed(evt);
            }
        });
        menuPelanggan.add(menuDataPelanggan);

        jMenuBar1.add(menuPelanggan);

        jMenu2.setText("Master Data");

        menuKategori.setText("Data Kategori");
        menuKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuKategoriActionPerformed(evt);
            }
        });
        jMenu2.add(menuKategori);

        menuBarang.setText("Data Barang");
        menuBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBarangActionPerformed(evt);
            }
        });
        jMenu2.add(menuBarang);

        menuGudang.setText("Data Gudang");
        menuGudang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGudangActionPerformed(evt);
            }
        });
        jMenu2.add(menuGudang);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Transaksi");

        menuBK.setText("Transaksi Barang Keluar");
        menuBK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuBKMouseClicked(evt);
            }
        });
        menuBK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBKActionPerformed(evt);
            }
        });
        jMenu3.add(menuBK);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Laporan");

        menulaporan.setText("Laporan Barang Keluar");
        menulaporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menulaporanActionPerformed(evt);
            }
        });
        jMenu4.add(menulaporan);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuKategoriActionPerformed
       if (!data_kategori.isVisible()) {
        jDesktopPane1.add(data_kategori);
        data_kategori.show();
    }
    }//GEN-LAST:event_menuKategoriActionPerformed

    private void menuBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBarangActionPerformed
        if (!data_barang.isVisible()) {
        jDesktopPane1.add(data_barang);
        data_barang.show();
    }
    }//GEN-LAST:event_menuBarangActionPerformed

    private void menuGudangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGudangActionPerformed
        if (!data_gudang.isVisible()) {
        jDesktopPane1.add(data_gudang);
        data_gudang.show();
    }
    }//GEN-LAST:event_menuGudangActionPerformed

    private void menuBKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuBKMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_menuBKMouseClicked

    private void menuBKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBKActionPerformed
        if (!data_kategori.isVisible()) {
        jDesktopPane1.add(data_transaksi_keluar);
        data_transaksi_keluar.show();
    }
    }//GEN-LAST:event_menuBKActionPerformed

    private void menuPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPelangganActionPerformed
        if (!data_pelanggan.isVisible()) {
                jDesktopPane1.add(data_pelanggan);
                data_pelanggan.show();
                }
    }//GEN-LAST:event_menuPelangganActionPerformed

    private void menulaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menulaporanActionPerformed
        if (!laporan_BK.isVisible()) {
        jDesktopPane1.add(laporan_BK);
        laporan_BK.show();
        }
    }//GEN-LAST:event_menulaporanActionPerformed

    private void menuDataPelangganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuDataPelangganMouseClicked
        if (!data_pelanggan.isVisible()) {
                jDesktopPane1.add(data_pelanggan);
                data_pelanggan.show();
                }
    }//GEN-LAST:event_menuDataPelangganMouseClicked

    private void menuDataPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDataPelangganActionPerformed
       if (!data_pelanggan.isVisible()) {
                jDesktopPane1.add(data_pelanggan);
                data_pelanggan.show();
                }
    }//GEN-LAST:event_menuDataPelangganActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(menu_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_utama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuBK;
    private javax.swing.JMenuItem menuBarang;
    private javax.swing.JMenuItem menuDataPelanggan;
    private javax.swing.JMenuItem menuGudang;
    private javax.swing.JMenuItem menuKategori;
    private javax.swing.JMenu menuPelanggan;
    private javax.swing.JMenuItem menulaporan;
    // End of variables declaration//GEN-END:variables
}

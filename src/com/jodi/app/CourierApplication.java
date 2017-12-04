/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jodi.app;

import com.jodi.model.Paket;
import com.jodi.model.DataPenerima;
import com.jodi.model.DataPengirim;
import com.jodi.model.DataPengirimanPaket;
import com.jodi.model.Tarif;
import com.jodi.model.TarifFileDAO;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class CourierApplication extends javax.swing.JFrame {

    List<Tarif> kotaTujuan;
    Tarif[] kota;
    NumberFormat numberFormat = NumberFormat.getInstance();
    DataPengirimanPaket pp = new DataPengirimanPaket();

    /**
     * Creates new form CourierApplication
     */
    public CourierApplication() {
        setTitle("CourierApp");
        initPaket();
        getKota();
        initComponents();
        VisibleOutputFalse();
    }

    public void initPaket() {

        try {
            kotaTujuan = TarifFileDAO.getTarif();
        } catch (Exception e) {
        }

    }

    public Tarif[] getKota() {
        int size = kotaTujuan.size();
        kota = new Tarif[size];
        for (int i = 0; i < size; i++) {
            Tarif tarif = kotaTujuan.get(i);
            kota[i] = tarif;
            //System.out.println("");
        }

        return kota;
    }

    public void VisibleOutputFalse() {
        labelAsuransi.setVisible(false);
        labelHargaBarang.setVisible(false);
        labelIsAsuransi.setVisible(false);
        labelTarifLayanan.setVisible(false);
        labelTotalBiaya.setVisible(false);
        labelTotalHarga.setVisible(false);
        labelberat.setVisible(false);
        labelJenisLayanan.setVisible(false);
        labelBiayaAsuransi.setVisible(false);
        outputBerat.setVisible(false);
        outputHargaBarang.setVisible(false);
        outputTarifLayanan.setVisible(false);
        outputTotalHarga.setVisible(false);
        outputTotalBiayaYgHarusDiBayar.setVisible(false);
        outputBiayaAsuransi.setVisible(false);
        outputJenisLayanan.setVisible(false);
        outputKotaTujuan.setVisible(false);
        labelStrip.setVisible(false);
        labelGitHub.setVisible(false);
    }

    public void VisibleOutputTrue() {
        labelAsuransi.setVisible(true);
        labelHargaBarang.setVisible(true);
        labelIsAsuransi.setVisible(true);
        labelTarifLayanan.setVisible(true);
        labelTotalBiaya.setVisible(true);
        labelTotalHarga.setVisible(true);
        labelberat.setVisible(true);
        labelJenisLayanan.setVisible(true);
        labelBiayaAsuransi.setVisible(true);
        outputBerat.setVisible(true);
        outputHargaBarang.setVisible(true);
        outputTarifLayanan.setVisible(true);
        outputTotalHarga.setVisible(true);
        outputTotalBiayaYgHarusDiBayar.setVisible(true);
        outputBiayaAsuransi.setVisible(true);
        outputJenisLayanan.setVisible(true);
        outputKotaTujuan.setVisible(true);
        labelStrip.setVisible(true);
        labelGitHub.setVisible(true);
    }

    public void VisiblePengirimTrue() {
        textNamaPengirim.setEnabled(true);
        textAlamatPengirim.setEnabled(true);
        comboPengirim.setEnabled(true);
        textKodePosPengirim.setEnabled(true);
        textProvinsiPengirim.setEnabled(true);
        textTeleponPengirim.setEnabled(true);
        buttonSubmitPengirim.setEnabled(true);
    }

    public void VisiblePengirimFalse() {
        textNamaPengirim.setEnabled(false);
        textAlamatPengirim.setEnabled(false);
        comboPengirim.setEnabled(false);
        textKodePosPengirim.setEnabled(false);
        textProvinsiPengirim.setEnabled(false);
        textTeleponPengirim.setEnabled(false);
        buttonSubmitPengirim.setEnabled(false);
    }

    public void VisiblePenerimaTrue() {
        textNamaPenerima.setEnabled(true);
        textAlamatPenerima.setEnabled(true);
        comboPenerima.setEnabled(true);
        textKodePosPenerima.setEnabled(true);
        textProvinsiPenerima.setEnabled(true);
        textTeleponPenerima.setEnabled(true);
        buttonSubmitPenerima.setEnabled(true);
    }

    public void VisiblePenerimaFalse() {
        textNamaPenerima.setEnabled(false);
        textAlamatPenerima.setEnabled(false);
        comboPenerima.setEnabled(false);
        textKodePosPenerima.setEnabled(false);
        textProvinsiPenerima.setEnabled(false);
        textTeleponPenerima.setEnabled(false);
        buttonSubmitPenerima.setEnabled(false);
    }

    public void resetPengirim() {
        textNamaPengirim.setText("");
        textAlamatPengirim.setText("");
        textKodePosPengirim.setText("");
        textProvinsiPengirim.setText("");
        textTeleponPengirim.setText("");

    }

    public void resetPenerima() {
        textNamaPenerima.setText("");
        textAlamatPenerima.setText("");
        textKodePosPenerima.setText("");
        textProvinsiPenerima.setText("");
        textTeleponPenerima.setText("");
    }

    public void EnableDataPengirimanBarangTrue() {
        textNomorPaket.setEnabled(true);
        comboJenisBarang.setEnabled(true);
        textBerat.setEnabled(true);
        dateTanggalKirim.setEnabled(true);
        textPanjang.setEnabled(true);
        textTinggi.setEnabled(true);
        textLebar.setEnabled(true);
        comboJenisLayanan.setEnabled(true);
        comboAsuransi.setEnabled(true);
        comboJenisPembayaran.setEnabled(true);
        buttonNew.setEnabled(true);
        buttonSubmitDataPengirimanPaket.setEnabled(true);

    }

    public void EnableDataPengirimanBarangFalse() {
        textNomorPaket.setEnabled(false);
        comboJenisBarang.setEnabled(false);
        textBerat.setEnabled(false);
        dateTanggalKirim.setEnabled(false);
        textPanjang.setEnabled(false);
        textTinggi.setEnabled(false);
        textLebar.setEnabled(false);
        textHargaBarang.setEnabled(false);
        comboJenisLayanan.setEnabled(false);
        comboAsuransi.setEnabled(false);
        comboJenisPembayaran.setEnabled(false);
        buttonNew.setEnabled(false);
        buttonSubmitDataPengirimanPaket.setEnabled(false);

    }

    public void resetDataPengirimanBarang() {
        textNomorPaket.setText("");
        textBerat.setText("1");
        dateTanggalKirim.setDate(null);
        textHargaBarang.setText("");
        textPanjang.setText("1.0");
        textTinggi.setText("1.0");
        textLebar.setText("1.0 ");
    }

    public void resetComboBox() {
        comboJenisBarang.setSelectedIndex(0);
        comboJenisPembayaran.setSelectedIndex(0);
        comboAsuransi.setSelectedIndex(0);
        comboJenisLayanan.setSelectedIndex(0);
        comboPenerima.setSelectedIndex(0);
        comboPengirim.setSelectedIndex(0);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textNamaPengirim = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAlamatPengirim = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        comboPengirim = new javax.swing.JComboBox<>(kota);
        jLabel4 = new javax.swing.JLabel();
        textKodePosPengirim = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textProvinsiPengirim = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textTeleponPengirim = new javax.swing.JTextField();
        buttonSubmitPengirim = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        textNamaPenerima = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        textAlamatPenerima = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        comboPenerima = new javax.swing.JComboBox<>(kota);
        jLabel10 = new javax.swing.JLabel();
        textKodePosPenerima = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        textProvinsiPenerima = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        textTeleponPenerima = new javax.swing.JTextField();
        buttonSubmitPenerima = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        textNomorPaket = new javax.swing.JTextField();
        textKotaTujuan = new javax.swing.JTextField();
        comboJenisBarang = new javax.swing.JComboBox<>();
        textBerat = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        dateTanggalKirim = new com.toedter.calendar.JDateChooser();
        jLabel19 = new javax.swing.JLabel();
        textPanjang = new javax.swing.JTextField();
        textLebar = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        textTinggi = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        comboAsuransi = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        textHargaBarang = new javax.swing.JFormattedTextField(numberFormat);
        jLabel29 = new javax.swing.JLabel();
        comboJenisPembayaran = new javax.swing.JComboBox<>();
        buttonSubmitDataPengirimanPaket = new javax.swing.JButton();
        comboJenisLayanan = new javax.swing.JComboBox();
        buttonNew = new javax.swing.JButton();
        panel = new javax.swing.JPanel();
        labelTarifLayanan = new javax.swing.JLabel();
        outputTarifLayanan = new javax.swing.JLabel();
        labelTotalHarga = new javax.swing.JLabel();
        outputTotalHarga = new javax.swing.JLabel();
        labelberat = new javax.swing.JLabel();
        outputBerat = new javax.swing.JLabel();
        labelAsuransi = new javax.swing.JLabel();
        labelIsAsuransi = new javax.swing.JLabel();
        labelHargaBarang = new javax.swing.JLabel();
        outputHargaBarang = new javax.swing.JLabel();
        labelTotalBiaya = new javax.swing.JLabel();
        outputTotalBiayaYgHarusDiBayar = new javax.swing.JLabel();
        labelJenisLayanan = new javax.swing.JLabel();
        outputJenisLayanan = new javax.swing.JLabel();
        labelBiayaAsuransi = new javax.swing.JLabel();
        outputBiayaAsuransi = new javax.swing.JLabel();
        labelStrip = new javax.swing.JLabel();
        outputKotaTujuan = new javax.swing.JLabel();
        labelGitHub = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Pengirim"));

        jLabel1.setText("Nama :");

        jLabel2.setText("Alamat :");

        textAlamatPengirim.setColumns(20);
        textAlamatPengirim.setRows(5);
        jScrollPane1.setViewportView(textAlamatPengirim);

        jLabel3.setText("Kota :");

        comboPengirim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPengirimActionPerformed(evt);
            }
        });

        jLabel4.setText("Kode Pos:");

        jLabel5.setText("Provinsi :");

        jLabel6.setText("Telepon :");

        buttonSubmitPengirim.setText("Submit");
        buttonSubmitPengirim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSubmitPengirimActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(comboPengirim, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textKodePosPengirim, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(textNamaPengirim)
                            .addComponent(jScrollPane1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(textProvinsiPengirim, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(textTeleponPengirim, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(buttonSubmitPengirim, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textNamaPengirim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboPengirim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(textKodePosPengirim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textProvinsiPengirim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTeleponPengirim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonSubmitPengirim)
                .addGap(8, 8, 8))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Penerima"));
        jPanel5.setToolTipText("");

        jLabel7.setText("Nama :");

        jLabel8.setText("Alamat :");

        textNamaPenerima.setEnabled(false);
        textNamaPenerima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNamaPenerimaActionPerformed(evt);
            }
        });

        textAlamatPenerima.setColumns(20);
        textAlamatPenerima.setRows(5);
        textAlamatPenerima.setEnabled(false);
        jScrollPane2.setViewportView(textAlamatPenerima);

        jLabel9.setText("Kota :");

        comboPenerima.setEnabled(false);
        comboPenerima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPenerimaActionPerformed(evt);
            }
        });

        jLabel10.setText("Kode Pos: ");

        textKodePosPenerima.setEnabled(false);

        jLabel11.setText("Provinsi :");

        textProvinsiPenerima.setEnabled(false);

        jLabel12.setText("Telepon :");

        textTeleponPenerima.setEnabled(false);

        buttonSubmitPenerima.setText("Submit");
        buttonSubmitPenerima.setEnabled(false);
        buttonSubmitPenerima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSubmitPenerimaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(comboPenerima, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textKodePosPenerima, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textNamaPenerima, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(17, 17, 17)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textTeleponPenerima, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                            .addComponent(textProvinsiPenerima)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonSubmitPenerima)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(textNamaPenerima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboPenerima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(textKodePosPenerima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(textProvinsiPenerima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(textTeleponPenerima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonSubmitPenerima)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Pengiriman Paket"));

        jLabel13.setText("Nomor Paket :");

        jLabel14.setText("Kota Tujuan");

        jLabel15.setText("Jenis Barang");

        jLabel16.setText("Berat Barang");

        textNomorPaket.setEnabled(false);

        textKotaTujuan.setEnabled(false);

        comboJenisBarang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dokumen", "Elektronik", "Makanan" }));
        comboJenisBarang.setEnabled(false);
        comboJenisBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboJenisBarangActionPerformed(evt);
            }
        });

        textBerat.setText("1");
        textBerat.setEnabled(false);

        jLabel17.setText("kg");

        jLabel18.setText("Tanggal Kirim :");

        dateTanggalKirim.setEnabled(false);

        jLabel19.setText("Dimensi Barang:");

        textPanjang.setText("1.0");
        textPanjang.setEnabled(false);

        textLebar.setText("1.0");
        textLebar.setEnabled(false);

        jLabel20.setText("Panjang :");

        jLabel21.setText("cm");

        textTinggi.setText("1.0");
        textTinggi.setEnabled(false);

        jLabel22.setText("Tinggi :");

        jLabel23.setText("cm");

        jLabel24.setText("lebar :");

        jLabel25.setText("cm");

        jLabel26.setText("Jenis Layanan");

        jLabel27.setText("Asuransi :");

        comboAsuransi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tidak", "Ya" }));
        comboAsuransi.setEnabled(false);
        comboAsuransi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAsuransiActionPerformed(evt);
            }
        });

        jLabel28.setText("Harga Barang");

        textHargaBarang.setEnabled(false);

        jLabel29.setText("Pembayaran");

        comboJenisPembayaran.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Debit" }));
        comboJenisPembayaran.setEnabled(false);
        comboJenisPembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboJenisPembayaranActionPerformed(evt);
            }
        });

        buttonSubmitDataPengirimanPaket.setText("Submit");
        buttonSubmitDataPengirimanPaket.setEnabled(false);
        buttonSubmitDataPengirimanPaket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSubmitDataPengirimanPaketActionPerformed(evt);
            }
        });

        comboJenisLayanan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Reguler", "Kilat", "SDS", "ONS", "HDS" }));
        comboJenisLayanan.setEnabled(false);
        comboJenisLayanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboJenisLayananActionPerformed(evt);
            }
        });

        buttonNew.setText("New");
        buttonNew.setEnabled(false);
        buttonNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(59, 59, 59)
                                        .addComponent(jLabel22)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textTinggi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dateTanggalKirim, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textPanjang, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel21)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textLebar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel25)
                        .addGap(0, 31, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textNomorPaket)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(textBerat, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel17))
                                    .addComponent(comboJenisBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(textKotaTujuan)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27)
                            .addComponent(jLabel28)
                            .addComponent(jLabel29))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textHargaBarang)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(comboJenisPembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonNew)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonSubmitDataPengirimanPaket))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(comboAsuransi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboJenisLayanan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jLabel19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(textNomorPaket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(textKotaTujuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(comboJenisBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(textBerat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(dateTanggalKirim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(textPanjang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(textTinggi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(textLebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(comboJenisLayanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(comboAsuransi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(textHargaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(comboJenisPembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(31, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonSubmitDataPengirimanPaket)
                            .addComponent(buttonNew))
                        .addContainerGap())))
        );

        panel.setBorder(javax.swing.BorderFactory.createTitledBorder("Rincian Harga"));

        labelTarifLayanan.setText("Tarif Layanan  :");

        outputTarifLayanan.setText("0");

        labelTotalHarga.setText("Total Harga     :");

        outputTotalHarga.setText("0");

        labelberat.setText("Berat               :");

        outputBerat.setText("0");

        labelAsuransi.setText("Asuransi                   :");

        labelIsAsuransi.setText("Tidak");

        labelHargaBarang.setText("Harga barang           :");

        outputHargaBarang.setText("0");

        labelTotalBiaya.setText("Total Biaya yang harus di bayar :");

        outputTotalBiayaYgHarusDiBayar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        outputTotalBiayaYgHarusDiBayar.setText("0");

        labelJenisLayanan.setText("Jenis Layanan ");

        outputJenisLayanan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        outputJenisLayanan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        outputJenisLayanan.setText("0");

        labelBiayaAsuransi.setText("Biaya Asuransi 3%   :");

        outputBiayaAsuransi.setText("0");

        labelStrip.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelStrip.setText("-");

        outputKotaTujuan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        outputKotaTujuan.setText("Kota Tujuan");

        labelGitHub.setText("https://github.com/JodiNoordiansyah/CourierApp.git");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(outputJenisLayanan)
                        .addGap(18, 18, 18)
                        .addComponent(labelStrip)
                        .addGap(18, 18, 18)
                        .addComponent(outputKotaTujuan))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(labelJenisLayanan)
                        .addGap(18, 18, 18)
                        .addComponent(labelGitHub))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(labelTarifLayanan)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(outputTarifLayanan))
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelTotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labelberat))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(outputBerat)
                                            .addComponent(outputTotalHarga))))
                                .addGap(19, 19, 19)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelHargaBarang)
                                    .addComponent(labelBiayaAsuransi)
                                    .addComponent(labelAsuransi)))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(labelTotalBiaya)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(outputTotalBiayaYgHarusDiBayar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelIsAsuransi)
                            .addComponent(outputBiayaAsuransi)
                            .addComponent(outputHargaBarang))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelJenisLayanan)
                    .addComponent(labelGitHub))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(outputJenisLayanan)
                    .addComponent(labelStrip)
                    .addComponent(outputKotaTujuan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTarifLayanan)
                    .addComponent(outputTarifLayanan)
                    .addComponent(labelAsuransi)
                    .addComponent(labelIsAsuransi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelberat)
                    .addComponent(outputBerat)
                    .addComponent(labelHargaBarang)
                    .addComponent(outputHargaBarang))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTotalHarga)
                    .addComponent(outputTotalHarga)
                    .addComponent(labelBiayaAsuransi)
                    .addComponent(outputBiayaAsuransi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTotalBiaya)
                    .addComponent(outputTotalBiayaYgHarusDiBayar))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboPenerimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPenerimaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboPenerimaActionPerformed

    private void comboPengirimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPengirimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboPengirimActionPerformed

    private void textNamaPenerimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNamaPenerimaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNamaPenerimaActionPerformed

    private void comboJenisLayananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboJenisLayananActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboJenisLayananActionPerformed

    private void buttonSubmitDataPengirimanPaketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSubmitDataPengirimanPaketActionPerformed
        // TODO add your handling code here:

        Tarif tarif = (Tarif) comboPenerima.getSelectedItem();
        Paket cal = new Paket();

        pp.setTanggal(dateTanggalKirim.getDate());
        pp.setNomorPaket(textNomorPaket.getText());
        pp.setKotaTujuan(tarif.getKotaTujuan());
        pp.setTinggi(Double.parseDouble(textTinggi.getText()));
        pp.setPanjang(Double.parseDouble(textPanjang.getText()));
        pp.setLebar(Double.parseDouble(textLebar.getText()));

        try {
            DecimalFormat df = new DecimalFormat("###,###.00");
            cal.setTarif(tarif);
            cal.setBerat(Integer.parseInt(textBerat.getText()));
            pp.setBerat(cal.getBerat());
            outputBerat.setText(textBerat.getText() + " kg");
            outputKotaTujuan.setText(tarif.getKotaTujuan());
            if (comboJenisLayanan.getSelectedItem() == "Reguler") {
                pp.setJenisLayanan("Reguler");
                if (comboAsuransi.getSelectedItem() == "Tidak") {
                    outputJenisLayanan.setText("Reguler");
                    outputTarifLayanan.setText("Rp. " + df.format(tarif.getReguler()));
                    outputTotalHarga.setText("Rp. " + df.format(cal.hitungBiayaReguler()));
                    outputTotalBiayaYgHarusDiBayar.setText("Rp. " + df.format(cal.hitungBiayaReguler()));
                } else {
                    tarif.setHargaBarang(Double.parseDouble(textHargaBarang.getText().replaceAll(",", "")));
                    outputJenisLayanan.setText("Reguler");
                    outputTarifLayanan.setText("Rp. " + df.format(tarif.getReguler()));
                    outputTotalHarga.setText("Rp. " + df.format(cal.hitungBiayaReguler()));
                    labelIsAsuransi.setText("Ya");
                    outputHargaBarang.setText("Rp. " + df.format(tarif.getHargaBarang()));
                    outputBiayaAsuransi.setText("Rp. " + df.format(cal.hitungAsuransi()));
                    outputTotalBiayaYgHarusDiBayar.setText("Rp. " + df.format(cal.hitungBiayaRegulerWithAsuransi()));
                }
            } else if (comboJenisLayanan.getSelectedItem() == "Kilat") {
                pp.setJenisLayanan("Kilat");
                if (comboAsuransi.getSelectedItem() == "Tidak") {
                    outputJenisLayanan.setText("Kilat");
                    outputTarifLayanan.setText("Rp. " + df.format(tarif.getKilat()));
                    outputTotalHarga.setText("Rp. " + df.format(cal.hitungBiayaKilat()));
                    outputTotalBiayaYgHarusDiBayar.setText("Rp. " + df.format(cal.hitungBiayaKilat()));
                } else {
                    tarif.setHargaBarang(Double.parseDouble(textHargaBarang.getText().replaceAll(",", "")));
                    outputJenisLayanan.setText("Kilat");
                    outputTarifLayanan.setText("Rp. " + df.format(tarif.getKilat()));
                    outputTotalHarga.setText("Rp. " + df.format(cal.hitungBiayaKilat()));
                    labelIsAsuransi.setText("Ya");
                    outputHargaBarang.setText("Rp. " + df.format(tarif.getHargaBarang()));
                    outputBiayaAsuransi.setText("Rp. " + df.format(cal.hitungAsuransi()));
                    outputTotalBiayaYgHarusDiBayar.setText("Rp. " + df.format(cal.hitungBiayaKilatWithAsuransi()));
                }
            } else if (comboJenisLayanan.getSelectedItem() == "SDS") {
                pp.setJenisLayanan("SDS");
                if (comboAsuransi.getSelectedItem() == "Tidak") {
                    outputJenisLayanan.setText("SDS");
                    outputTarifLayanan.setText("Rp. " + df.format(tarif.getSds()));
                    outputTotalHarga.setText("Rp. " + df.format(cal.hitungBiayaSDS()));
                    outputTotalBiayaYgHarusDiBayar.setText("Rp. " + df.format(cal.hitungBiayaSDS()));
                } else {
                    tarif.setHargaBarang(Double.parseDouble(textHargaBarang.getText().replaceAll(",", "")));
                    outputJenisLayanan.setText("SDS");
                    outputTarifLayanan.setText("Rp. " + df.format(tarif.getSds()));
                    outputTotalHarga.setText("Rp. " + df.format(cal.hitungBiayaSDS()));
                    labelIsAsuransi.setText("Ya");
                    outputHargaBarang.setText("Rp. " + df.format(tarif.getHargaBarang()));
                    outputBiayaAsuransi.setText("Rp. " + df.format(cal.hitungAsuransi()));
                    outputTotalBiayaYgHarusDiBayar.setText("Rp. " + df.format(cal.hitungBiayaSDSWithAsuransi()));
                }
            } else if (comboJenisLayanan.getSelectedItem() == "ONS") {
                pp.setJenisLayanan("ONS");
                if (comboAsuransi.getSelectedItem() == "Tidak") {
                    outputJenisLayanan.setText("ONS");
                    outputTarifLayanan.setText("Rp. " + df.format(tarif.getOns()));
                    outputTotalHarga.setText("Rp. " + df.format(cal.hitungBiayaONS()));
                    outputTotalBiayaYgHarusDiBayar.setText("Rp. " + df.format(cal.hitungBiayaONS()));
                } else {
                    tarif.setHargaBarang(Double.parseDouble(textHargaBarang.getText().replaceAll(",", "")));
                    outputJenisLayanan.setText("ONS");
                    outputTarifLayanan.setText("Rp. " + df.format(tarif.getOns()));
                    outputTotalHarga.setText("Rp. " + df.format(cal.hitungBiayaONS()));
                    labelIsAsuransi.setText("Ya");
                    outputHargaBarang.setText("Rp. " + df.format(tarif.getHargaBarang()));
                    outputBiayaAsuransi.setText("Rp. " + df.format(cal.hitungAsuransi()));
                    outputTotalBiayaYgHarusDiBayar.setText("Rp. " + df.format(cal.hitungBiayaONSWithAsuransi()));
                }
            } else if (comboJenisLayanan.getSelectedItem() == "HDS") {
                pp.setJenisLayanan("HDS");
                if (comboAsuransi.getSelectedItem() == "Tidak") {
                    outputJenisLayanan.setText("HDS");
                    outputTarifLayanan.setText("Rp. " + df.format(tarif.getHds()));
                    outputTotalHarga.setText("Rp. " + df.format(cal.hitungBiayaHDS()));
                    outputTotalBiayaYgHarusDiBayar.setText("Rp. " + df.format(cal.hitungBiayaHDS()));
                } else {
                    tarif.setHargaBarang(Double.parseDouble(textHargaBarang.getText().replaceAll(",", "")));
                    outputJenisLayanan.setText("HDS");
                    outputTarifLayanan.setText("Rp. " + df.format(tarif.getHds()));
                    outputTotalHarga.setText("Rp. " + df.format(cal.hitungBiayaHDS()));
                    labelIsAsuransi.setText("Ya");
                    outputHargaBarang.setText("Rp. " + df.format(tarif.getHargaBarang()));
                    outputBiayaAsuransi.setText("Rp. " + df.format(cal.hitungAsuransi()));
                    outputTotalBiayaYgHarusDiBayar.setText("Rp. " + df.format(cal.hitungBiayaHDSWithAsuransi()));
                }
            }
            pp.setHargaBarang(tarif.getHargaBarang());
            VisibleOutputTrue();
            EnableDataPengirimanBarangFalse();
            buttonNew.setEnabled(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Field Harga Barang Tidak Boleh Kosong");
        }


    }//GEN-LAST:event_buttonSubmitDataPengirimanPaketActionPerformed

    private void comboAsuransiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAsuransiActionPerformed
        // TODO add your handling code here:
        if (comboAsuransi.getSelectedItem() == "Ya") {
            textHargaBarang.setEnabled(true);
            pp.setAsuransi("Ya");
        } else {
            textHargaBarang.setEnabled(false);
            pp.setAsuransi("Tidak");
        }
    }//GEN-LAST:event_comboAsuransiActionPerformed

    private void buttonSubmitPengirimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSubmitPengirimActionPerformed
        // TODO add your handling code here:
        Tarif tarif = (Tarif) comboPengirim.getSelectedItem();
        DataPengirim dataPengirim = new DataPengirim();
        dataPengirim.setNama(textNamaPengirim.getText());
        dataPengirim.setAlamat(textAlamatPengirim.getText());
        dataPengirim.setKota(tarif.getKotaTujuan());
        dataPengirim.setKodePos(textKodePosPengirim.getText());
        dataPengirim.setProvinsi(textProvinsiPengirim.getText());
        dataPengirim.setTelepon(textTeleponPengirim.getText());
        if (textNamaPengirim.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(rootPane, "Field Nama Tidak Boleh Kosong");
        } else if (textAlamatPengirim.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(rootPane, "Field Alamat Tidak Boleh Kosong");
        } else if (tarif.getKotaTujuan().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(rootPane, "Field Kota Tidak Boleh Kosong");
        } else if (textKodePosPengirim.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(rootPane, "Field Kode Pos Tidak Boleh Kosong");
        } else if (textProvinsiPengirim.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(rootPane, "Field Provinsi Tidak Boleh Kosong");
        } else if (textTeleponPengirim.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(rootPane, "Field Telepon Tidak Boleh Kosong");
        } else {
            VisiblePenerimaTrue();
            VisiblePengirimFalse();
        }
    }//GEN-LAST:event_buttonSubmitPengirimActionPerformed

    private void buttonSubmitPenerimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSubmitPenerimaActionPerformed
        // TODO add your handling code here:
        Tarif tarif = (Tarif) comboPenerima.getSelectedItem();
        DataPenerima dataPenerima = new DataPenerima();
        dataPenerima.setNama(textNamaPenerima.getText());
        dataPenerima.setAlamat(textAlamatPenerima.getText());
        dataPenerima.setKota(tarif.getKotaTujuan());
        dataPenerima.setKodePos(textKodePosPenerima.getText());
        dataPenerima.setProvinsi(textProvinsiPenerima.getText());
        dataPenerima.setTelepon(textTeleponPenerima.getText());
        if (textNamaPenerima.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(rootPane, "Field Nama Tidak Boleh Kosong");
        } else if (textAlamatPenerima.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(rootPane, "Field Alamat Tidak Boleh Kosong");
        } else if (tarif.getKotaTujuan().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(rootPane, "Field Kota Tidak Boleh Kosong");
        } else if (textKodePosPenerima.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(rootPane, "Field Kode Pos Tidak Boleh Kosong");
        } else if (textProvinsiPenerima.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(rootPane, "Field Provinsi Tidak Boleh Kosong");
        } else if (textTeleponPenerima.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(rootPane, "Field Telepon Tidak Boleh Kosong");
        } else {
            VisiblePenerimaFalse();
            textKotaTujuan.setText(tarif.getKotaTujuan());
            EnableDataPengirimanBarangTrue();
        }
    }//GEN-LAST:event_buttonSubmitPenerimaActionPerformed

    private void buttonNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNewActionPerformed
        // TODO add your handling code here:
        resetPenerima();
        resetPengirim();
        resetDataPengirimanBarang();
        EnableDataPengirimanBarangFalse();
        resetComboBox();
        VisiblePengirimTrue();
        VisibleOutputFalse();
    }//GEN-LAST:event_buttonNewActionPerformed

    private void comboJenisBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboJenisBarangActionPerformed
        // TODO add your handling code here:
        if (comboJenisBarang.getSelectedItem() == "Dokumen") {
            pp.setJenisBarang("Dokumen");
        } else if (comboJenisBarang.getSelectedItem() == "Elektronik") {
            pp.setJenisBarang("Elektronik");
        } else {
            pp.setJenisBarang("Makanan");
        }
    }//GEN-LAST:event_comboJenisBarangActionPerformed

    private void comboJenisPembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboJenisPembayaranActionPerformed
        // TODO add your handling code here:
        if (comboJenisPembayaran.getSelectedItem() == "Cash") {
            pp.setPembayaran("Cash");
        } else if (comboJenisPembayaran.getSelectedItem() == "Debit") {
            pp.setPembayaran("Debit");
        }
    }//GEN-LAST:event_comboJenisPembayaranActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CourierApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CourierApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CourierApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CourierApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CourierApplication().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonNew;
    private javax.swing.JButton buttonSubmitDataPengirimanPaket;
    private javax.swing.JButton buttonSubmitPenerima;
    private javax.swing.JButton buttonSubmitPengirim;
    private javax.swing.JComboBox<String> comboAsuransi;
    private javax.swing.JComboBox<String> comboJenisBarang;
    private javax.swing.JComboBox comboJenisLayanan;
    private javax.swing.JComboBox<String> comboJenisPembayaran;
    private javax.swing.JComboBox<Tarif> comboPenerima;
    private javax.swing.JComboBox<Tarif> comboPengirim;
    private com.toedter.calendar.JDateChooser dateTanggalKirim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelAsuransi;
    private javax.swing.JLabel labelBiayaAsuransi;
    private javax.swing.JLabel labelGitHub;
    private javax.swing.JLabel labelHargaBarang;
    private javax.swing.JLabel labelIsAsuransi;
    private javax.swing.JLabel labelJenisLayanan;
    private javax.swing.JLabel labelStrip;
    private javax.swing.JLabel labelTarifLayanan;
    private javax.swing.JLabel labelTotalBiaya;
    private javax.swing.JLabel labelTotalHarga;
    private javax.swing.JLabel labelberat;
    private javax.swing.JLabel outputBerat;
    private javax.swing.JLabel outputBiayaAsuransi;
    private javax.swing.JLabel outputHargaBarang;
    private javax.swing.JLabel outputJenisLayanan;
    private javax.swing.JLabel outputKotaTujuan;
    private javax.swing.JLabel outputTarifLayanan;
    private javax.swing.JLabel outputTotalBiayaYgHarusDiBayar;
    private javax.swing.JLabel outputTotalHarga;
    private javax.swing.JPanel panel;
    private javax.swing.JTextArea textAlamatPenerima;
    private javax.swing.JTextArea textAlamatPengirim;
    private javax.swing.JTextField textBerat;
    private javax.swing.JFormattedTextField textHargaBarang;
    private javax.swing.JTextField textKodePosPenerima;
    private javax.swing.JTextField textKodePosPengirim;
    private javax.swing.JTextField textKotaTujuan;
    private javax.swing.JTextField textLebar;
    private javax.swing.JTextField textNamaPenerima;
    private javax.swing.JTextField textNamaPengirim;
    private javax.swing.JTextField textNomorPaket;
    private javax.swing.JTextField textPanjang;
    private javax.swing.JTextField textProvinsiPenerima;
    private javax.swing.JTextField textProvinsiPengirim;
    private javax.swing.JTextField textTeleponPenerima;
    private javax.swing.JTextField textTeleponPengirim;
    private javax.swing.JTextField textTinggi;
    // End of variables declaration//GEN-END:variables
}

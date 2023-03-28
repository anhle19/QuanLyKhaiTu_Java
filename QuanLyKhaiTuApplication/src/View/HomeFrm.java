package View;

import Model.DataConection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pavilion 15
 */
public class HomeFrm extends javax.swing.JFrame implements ActionListener {
    
    private String phuong;
    private String quan;
    Connection conn;
    private DefaultTableModel tableModel;
    
    public HomeFrm() {
        initComponents();
        setLocationRelativeTo(null);
        addButton();
    }
    
    public HomeFrm(String phuong, String quan) throws SQLException {
        initComponents();
        setLocationRelativeTo(null);
        addButton();
        tableModel = (DefaultTableModel) tableQuanLyKhaiTu.getModel();
        this.phuong = phuong;
        this.quan = quan;
        lbPhuong.setText("Phường: "+phuong);
        lbQuan.setText("Quận: "+quan);
        String qry = "Select ID, Tên_người_mất, Lý_do_mất, Tổ, Khu_phố\n"
                + "From DanhSachKhaiTu \n"
                + "Where Quận = '" + this.quan + "' and Phường = '" + this.phuong + "'";
        loadData(qry);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        labelHome = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        radioTimDiaChi = new javax.swing.JRadioButton();
        radioTimLyDo = new javax.swing.JRadioButton();
        radioTimTenNguoiMat = new javax.swing.JRadioButton();
        comboTo = new javax.swing.JComboBox<>();
        comboKhuPho = new javax.swing.JComboBox<>();
        comboLyDo = new javax.swing.JComboBox<>();
        txtTenNguoiMat = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        radioSapXepA_Z = new javax.swing.JRadioButton();
        radioSapXepZ_A = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableQuanLyKhaiTu = new javax.swing.JTable();
        btnLamMoi = new javax.swing.JButton();
        btnKhaiBao = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnChiTiet = new javax.swing.JButton();
        lbPhuong = new javax.swing.JLabel();
        lbQuan = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelHome.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelHome.setText("QUẢN LÝ KHAI TỬ");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tìm kiếm"));
        jPanel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        radioTimDiaChi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        radioTimDiaChi.setText("Theo địa chỉ");

        radioTimLyDo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        radioTimLyDo.setText("Theo lý do mất");

        radioTimTenNguoiMat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        radioTimTenNguoiMat.setText("Theo tên người mất");

        comboTo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboTo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8" }));

        comboKhuPho.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboKhuPho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", " " }));

        comboLyDo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboLyDo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Già", "Bệnh", "Khác" }));

        txtTenNguoiMat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnTimKiem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnTimKiem.setText("Tìm kiếm");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Tổ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Khu phố");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(radioTimLyDo)
                            .addGap(84, 84, 84))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(radioTimDiaChi)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1)
                            .addGap(3, 3, 3)))
                    .addComponent(radioTimTenNguoiMat))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtTenNguoiMat, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(comboTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(comboKhuPho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(196, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(comboLyDo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTimKiem)
                        .addGap(69, 69, 69))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioTimDiaChi)
                    .addComponent(comboTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboKhuPho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioTimLyDo)
                    .addComponent(comboLyDo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiem))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioTimTenNguoiMat)
                    .addComponent(txtTenNguoiMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Sắp xếp"));
        jPanel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        radioSapXepA_Z.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        radioSapXepA_Z.setText("Theo tên A-Z");

        radioSapXepZ_A.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        radioSapXepZ_A.setText("Theo tên Z-A");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioSapXepZ_A)
                    .addComponent(radioSapXepA_Z))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(radioSapXepA_Z)
                .addGap(18, 18, 18)
                .addComponent(radioSapXepZ_A)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tableQuanLyKhaiTu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tableQuanLyKhaiTu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tableQuanLyKhaiTu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tên người mất", "Lý do mất", "Tổ", "Khu phố"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableQuanLyKhaiTu.setColumnSelectionAllowed(true);
        tableQuanLyKhaiTu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableQuanLyKhaiTu.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tableQuanLyKhaiTu);
        tableQuanLyKhaiTu.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        btnLamMoi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLamMoi.setText("Làm mới");

        btnKhaiBao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnKhaiBao.setText("Khai báo");

        btnCapNhat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCapNhat.setText("Cập nhật");

        btnXoa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnXoa.setText("Xóa bỏ");

        btnChiTiet.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnChiTiet.setText("Chi tiết");

        lbPhuong.setText("Phường: ");

        lbQuan.setText("Quận: ");

        jMenu1.setText("File");

        jMenuItem1.setText("Đăng xuất");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 160, Short.MAX_VALUE)
                .addComponent(btnLamMoi)
                .addGap(66, 66, 66)
                .addComponent(btnChiTiet, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(btnKhaiBao)
                .addGap(73, 73, 73)
                .addComponent(btnCapNhat)
                .addGap(72, 72, 72)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(151, 151, 151))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbPhuong)
                        .addGap(43, 43, 43)
                        .addComponent(lbQuan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelHome)
                        .addGap(395, 395, 395))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(labelHome))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbPhuong)
                        .addComponent(lbQuan)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLamMoi)
                    .addComponent(btnCapNhat)
                    .addComponent(btnXoa)
                    .addComponent(btnKhaiBao)
                    .addComponent(btnChiTiet))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        DangNhapFrm dangNhapFrm = new DangNhapFrm();
        dangNhapFrm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    
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
            java.util.logging.Logger.getLogger(HomeFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnChiTiet;
    private javax.swing.JButton btnKhaiBao;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> comboKhuPho;
    private javax.swing.JComboBox<String> comboLyDo;
    private javax.swing.JComboBox<String> comboTo;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelHome;
    private javax.swing.JLabel lbPhuong;
    private javax.swing.JLabel lbQuan;
    private javax.swing.JRadioButton radioSapXepA_Z;
    private javax.swing.JRadioButton radioSapXepZ_A;
    private javax.swing.JRadioButton radioTimDiaChi;
    private javax.swing.JRadioButton radioTimLyDo;
    private javax.swing.JRadioButton radioTimTenNguoiMat;
    private javax.swing.JTable tableQuanLyKhaiTu;
    private javax.swing.JTextField txtTenNguoiMat;
    // End of variables declaration//GEN-END:variables

    private void addButton() {
        btnCapNhat.addActionListener(this);
        btnKhaiBao.addActionListener(this);
        btnTimKiem.addActionListener(this);
        btnXoa.addActionListener(this);
        btnTimKiem.addActionListener(this);
        btnChiTiet.addActionListener(this);
        btnLamMoi.addActionListener(this);
        
        buttonGroup1.add(radioSapXepA_Z);
        buttonGroup1.add(radioSapXepZ_A);
        
        buttonGroup2.add(radioTimDiaChi);
        buttonGroup2.add(radioTimLyDo);
        buttonGroup2.add(radioTimTenNguoiMat);
        
        radioSapXepA_Z.addActionListener(this);
        radioSapXepZ_A.addActionListener(this);
        
        radioTimDiaChi.addActionListener(this);
        radioTimLyDo.addActionListener(this);
        radioTimTenNguoiMat.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj.equals(btnLamMoi)) {
            tableModel.setRowCount(0);
            ResetButton();
            String qry = "Select ID, Tên_người_mất, Lý_do_mất, Tổ, Khu_phố\n"
                    + "From DanhSachKhaiTu \n"
                    + "Where Quận = '" + this.quan + "' and Phường = '" + this.phuong + "'";
            try {
                loadData(qry);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, "Lỗi!!!!");
            }
        } else if (obj.equals(btnKhaiBao)) {
            KhaiBao();
        } else if (obj.equals(btnXoa)) {
            Xoa();
        } else if (obj.equals(btnCapNhat)) {
            CapNhat();
        } else if (obj.equals(btnChiTiet)) {
            ChiTiet();
        }else if(obj.equals(radioSapXepA_Z) || obj.equals(radioSapXepZ_A)){
            try {
                SapXep();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, "Lỗi dữ liệu!!!");
            }
        }else if(obj.equals(btnTimKiem)){
            try {
                TimKiem();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, "Lỗi dữ liệu!!");
            }
                
        }
    }
    
    private void loadData(String qry) throws SQLException {
        
        try {
            conn = DriverManager.getConnection(DataConection.connectionUrl);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(qry);
            while (rs.next()) {
                Object rowData[] = new Object[5];
                rowData[0] = rs.getObject("ID");
                rowData[1] = rs.getObject("Tên_người_mất");
                rowData[2] = rs.getObject("Lý_do_mất");
                rowData[3] = rs.getObject("Tổ");
                rowData[4] = rs.getObject("Khu_phố");
                tableModel.addRow(rowData);
            }
            tableModel.fireTableDataChanged();
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Lỗi!!!!!");
        }
    }
    
    private void ResetButton() {
        buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();
        txtTenNguoiMat.setText("");
//        comboTo.setSelectedIndex(0);
//        comboKhuPho.setSelectedIndex(0);
//        comboLyDo.setSelectedIndex(0);
    }

    private void XoaKhaiTu(int id) {
        try {
                String qry = "Delete from DanhSachKhaiTu Where ID = '"+id+"'";
                Connection conn = DriverManager.getConnection(DataConection.connectionUrl);
                PreparedStatement stmt = conn.prepareStatement(qry);
                int rowAffect = stmt.executeUpdate();
                if (rowAffect != 0) {
                    JOptionPane.showMessageDialog(rootPane, "Xóa thành công!!");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Xóa thất bại!!!");
                }
                conn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, "Lỗi!!!");
            }
    }

    private void KhaiBao() {
        KhaiBaoDialog khaiBaoDialog = new KhaiBaoDialog(this, rootPaneCheckingEnabled, phuong, quan);
        khaiBaoDialog.setVisible(true);
    }

    private void CapNhat() {
        int indexRow = tableQuanLyKhaiTu.getSelectedRow();
        int id = (int) tableQuanLyKhaiTu.getValueAt(indexRow, 0);
        if (id != -1) {
            CapNhatDialog capNhatDialog = new CapNhatDialog(this, rootPaneCheckingEnabled, id);
            capNhatDialog.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn một dòng!!!!");
        }
    }

    private void ChiTiet() {
        int indexRow = tableQuanLyKhaiTu.getSelectedRow();
        int id = (int) tableQuanLyKhaiTu.getValueAt(indexRow, 0);
        if (id != -1) {
            ThongTinChiTietDialog thongTinChiTietDialog = new ThongTinChiTietDialog(this, rootPaneCheckingEnabled, id);
            thongTinChiTietDialog.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn một dòng!!!!");
        }
    }

    private void Xoa() {
        int indexRow = tableQuanLyKhaiTu.getSelectedRow();
        int id = (int) tableQuanLyKhaiTu.getValueAt(indexRow, 0);
        if (id != -1) {
            XoaKhaiTu(id);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn một dòng!!!!");
        }
    }

    private void SapXep() throws SQLException {
        String qry = "";
        if (radioSapXepA_Z.isSelected()) {
            tableModel.setRowCount(0);
            qry = "Select ID, Tên_người_mất, Lý_do_mất, Tổ, Khu_phố "
                    + "From DanhSachKhaiTu Where Quận = '" + this.quan + "' and Phường = '" + this.phuong + "'"
                    + "Order by FirstName ASC";
            loadData(qry);
        } else if (radioSapXepZ_A.isSelected()) {
            tableModel.setRowCount(0);
            qry = "Select ID, Tên_người_mất, Lý_do_mất, Tổ, Khu_phố "
                    + "From DanhSachKhaiTu Where Quận = '" + this.quan + "' and Phường = '" + this.phuong + "'"
                    + "Order by FirstName DESC";
            loadData(qry);
        }
    }

    private void TimKiem() throws SQLException {
        if (radioTimDiaChi.isSelected() || radioTimLyDo.isSelected() || radioTimTenNguoiMat.isSelected()) {
            if (radioTimDiaChi.isSelected()) {
                TimTheoDiaChi();
            } else if (radioTimLyDo.isSelected()) {
                TimTheoLyDo();
            } else if (radioTimTenNguoiMat.isSelected()) {
                TimTheoTen();
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn một mục để tìm kiếm!!!");
        }
    }

    private void TimTheoDiaChi() throws SQLException {
        String to = comboTo.getSelectedItem().toString();
        String khuPho = comboKhuPho.getSelectedItem().toString();
        String qry = "Select ID, Tên_người_mất, Lý_do_mất, Tổ, Khu_phố\n"
                + "From DanhSachKhaiTu \n"
                + "Where Quận = '" + this.quan + "' and Phường = '" + this.phuong + "' and Tổ = '" + to + "' and Khu_phố = '" + khuPho + "'";
        tableModel.setRowCount(0);
        loadData(qry);
    }

    private void TimTheoLyDo() throws SQLException {
        String lyDo = comboLyDo.getSelectedItem().toString();
        String qry = "Select ID, Tên_người_mất, Lý_do_mất, Tổ, Khu_phố\n"
                + "From DanhSachKhaiTu \n"
                + "Where Quận = '" + this.quan + "' and Phường = '" + this.phuong + "' and Lý_do_mất Like '%"+lyDo+"%'";
        tableModel.setRowCount(0);
        loadData(qry);
        if(tableModel.getRowCount()==0){
            JOptionPane.showMessageDialog(rootPane, "Không tìm thấy!!!");
        }
    }

    private void TimTheoTen() throws SQLException {
        String ten = txtTenNguoiMat.getText();
        if(!"".equals(ten)){
            String qry = "Select ID, Tên_người_mất, Lý_do_mất, Tổ, Khu_phố\n"
                + "From DanhSachKhaiTu \n"
                + "Where Quận = '" + this.quan + "' and Phường = '" + this.phuong + "' and Tên_người_mất Like '%"+ten+"%'";
        tableModel.setRowCount(0);
        loadData(qry);
        }else{
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập tên!");
        }
    }
}

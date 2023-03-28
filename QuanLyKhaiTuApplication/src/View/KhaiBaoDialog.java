package View;

import Model.DataConection;
import Model.FirstName;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class KhaiBaoDialog extends javax.swing.JDialog implements ActionListener {

    private String phuong, quan;
    DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");

    public KhaiBaoDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public KhaiBaoDialog(java.awt.Frame parent, boolean modal, String phuong, String quan) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        this.phuong = phuong;
        this.quan = quan;
        addButton();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTenNguoiMat = new javax.swing.JTextField();
        txtTenNguoiDangKy = new javax.swing.JTextField();
        txtGioiTinh = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtQuanHe = new javax.swing.JTextField();
        TxtCCCD = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnKhaiBao = new javax.swing.JButton();
        txtNgayMat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNgaySinh = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnThoat = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        comboTo = new javax.swing.JComboBox<>();
        comboKhuPho = new javax.swing.JComboBox<>();
        comboLyDoMat = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtTenNguoiMat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtTenNguoiDangKy.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtGioiTinh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Tên người đăng ký:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Giới tính:");

        txtQuanHe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        TxtCCCD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Quan hệ với người đăng ký:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Căn cước công dân:");

        btnKhaiBao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnKhaiBao.setText("Khai báo");

        txtNgayMat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Ngày mất:");

        txtNgaySinh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Ngày sinh:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("PHIẾU KHAI TỬ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Tên đầy đủ người mất:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Lý do mất:");

        btnThoat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnThoat.setText("Thoát");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Tổ:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Khu phố:");

        comboTo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboTo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", " " }));

        comboKhuPho.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboKhuPho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", " " }));

        comboLyDoMat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboLyDoMat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Già", "Bệnh", "Khác" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(218, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(212, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel12)
                                .addComponent(jLabel11)
                                .addComponent(jLabel9)
                                .addComponent(jLabel7)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(jLabel8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)))
                            .addGap(32, 32, 32)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TxtCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTenNguoiDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtQuanHe, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(comboTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(comboKhuPho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNgayMat, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboLyDoMat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(155, 155, 155)
                            .addComponent(btnKhaiBao)
                            .addGap(46, 46, 46)
                            .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(32, 32, 32)
                        .addComponent(txtTenNguoiMat, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenNguoiMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNgayMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(comboLyDoMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenNguoiDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuanHe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(comboTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(comboKhuPho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKhaiBao)
                    .addComponent(btnThoat))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                KhaiBaoDialog dialog = new KhaiBaoDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtCCCD;
    private javax.swing.JButton btnKhaiBao;
    private javax.swing.JButton btnThoat;
    private javax.swing.JComboBox<String> comboKhuPho;
    private javax.swing.JComboBox<String> comboLyDoMat;
    private javax.swing.JComboBox<String> comboTo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtGioiTinh;
    private javax.swing.JTextField txtNgayMat;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtQuanHe;
    private javax.swing.JTextField txtTenNguoiDangKy;
    private javax.swing.JTextField txtTenNguoiMat;
    // End of variables declaration//GEN-END:variables

    private void addButton() {
        btnKhaiBao.addActionListener(this);
        btnThoat.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj.equals(btnKhaiBao)) {
            try {
                KhaiBao();
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(rootPane, "Lỗi ngày sinh hoặc ngày mất!!");
            }
        } else if (obj.equals(btnThoat)) {
            this.dispose();
        }
    }

    private void KhaiBao() throws ParseException {
        String tenNguoiMat = txtTenNguoiMat.getText();
        String firstname = FirstName.CheckFirstName(tenNguoiMat);
        String gioiTinh = txtGioiTinh.getText();
        String cccd = TxtCCCD.getText();
        String lyDoMat = comboLyDoMat.getSelectedItem().toString();
        String tenNguoiDangKy = txtTenNguoiDangKy.getText();
        String quanHe = txtQuanHe.getText();
        String to = comboTo.getSelectedItem().toString();
        String khuPho = comboKhuPho.getSelectedItem().toString();
        //Chuyển từ String sang date
        java.util.Date ngayMat = dateformat.parse(txtNgayMat.getText());
        java.util.Date ngaySinh = dateformat.parse(txtNgaySinh.getText());
        //Chuyển từ util sang sql
        Date sqlNgayMat = new Date(ngayMat.getTime());
        Date sqlNgaySinh = new Date(ngaySinh.getTime());
        if (tenNguoiMat != "" && gioiTinh != "" && cccd != ""
                && lyDoMat != "" && tenNguoiDangKy != "" && quanHe != "" && to != "" && khuPho != "") {
            try {
                String qry = "Insert Into DanhSachKhaiTu Values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
                Connection conn = DriverManager.getConnection(DataConection.connectionUrl);
                PreparedStatement stmt = conn.prepareStatement(qry);
                stmt.setString(1, tenNguoiMat);
                stmt.setString(2, gioiTinh);
                stmt.setString(3, cccd);
                stmt.setDate(4, sqlNgayMat);
                stmt.setDate(5, sqlNgaySinh);
                stmt.setString(6, lyDoMat);
                stmt.setString(7, quanHe);
                stmt.setString(8, tenNguoiDangKy);
                stmt.setString(9, to);
                stmt.setString(10, khuPho);
                stmt.setString(11, this.phuong);
                stmt.setString(12, this.quan);
                stmt.setString(13, firstname);
                int rowAffect = stmt.executeUpdate();
                if (rowAffect != 0) {
                    JOptionPane.showMessageDialog(rootPane, "Khai báo thành công!!");
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Khai báo thất bại!!!");
                }
                conn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, "Lỗi!!!");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Các mục không được bỏ trống!");
        }

    }

}

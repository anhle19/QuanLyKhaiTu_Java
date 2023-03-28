
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


public class CapNhatDialog extends javax.swing.JDialog implements ActionListener{

    private int selectedId;
    DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
    public CapNhatDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public CapNhatDialog(java.awt.Frame parent, boolean modal,int id) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        this.selectedId = id;
        addButton();
        loadData();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        txtNgaySinh = new javax.swing.JTextField();
        comboLyDoMat = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtQuanHe = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        TxtCCCD = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnCapNhat = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        txtNgayMat = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtTenNguoiMat = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtTenNguoiDangKy = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        comboTo = new javax.swing.JComboBox<>();
        txtGioiTinh = new javax.swing.JTextField();
        comboKhuPho = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Tên người đăng ký:");

        txtNgaySinh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        comboLyDoMat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboLyDoMat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Già", "Bệnh", "Khác", " " }));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Giới tính:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Ngày sinh:");

        txtQuanHe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("CẬP NHẬT THÔNG TIN");

        TxtCCCD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Quan hệ với người đăng ký:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Tên người mất:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Căn cước công dân:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Lý do mất:");

        btnCapNhat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCapNhat.setText("Cập nhật");

        btnThoat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnThoat.setText("Thoát");

        txtNgayMat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Tổ:");

        txtTenNguoiMat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Khu phố:");

        txtTenNguoiDangKy.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Ngày mất:");

        comboTo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboTo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", " " }));

        txtGioiTinh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        comboKhuPho.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboKhuPho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", " " }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addComponent(jLabel5)))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTenNguoiMat, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenNguoiDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuanHe, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtNgaySinh, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtNgayMat, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(comboLyDoMat, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(comboKhuPho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCapNhat)
                .addGap(33, 33, 33)
                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172))
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
                    .addComponent(comboTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboKhuPho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCapNhat)
                    .addComponent(btnThoat))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CapNhatDialog dialog = new CapNhatDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnCapNhat;
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
        btnCapNhat.addActionListener(this);
        btnThoat.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj.equals(btnThoat)){
            this.dispose();
        }else if(obj.equals(btnCapNhat)){
            try {
                CapNhat();
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(rootPane, "Lỗi ngày sinh hoặc ngày mất!!");
            }
        }
    }

    private void loadData() {
        String qry = "Select *\n"
                + "From DanhSachKhaiTu\n"
                + "Where ID = "+selectedId+"";
        try {
            Connection  conn = DriverManager.getConnection(DataConection.connectionUrl);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(qry);
            while(rs.next()){
                txtTenNguoiMat.setText(rs.getString("Tên_người_mất"));
                txtGioiTinh.setText(rs.getString("Giới_tính"));
                TxtCCCD.setText(rs.getString("CCCD"));
                txtNgayMat.setText(rs.getString("Ngày_mất"));
                txtNgaySinh.setText(rs.getString("Ngày_sinh"));
                setLyDoMat(rs.getString("Lý_do_mất"));
                txtTenNguoiDangKy.setText(rs.getString("Tên_người_đăng_ký"));
                txtQuanHe.setText(rs.getString("Quan_hệ_với_người_đăng_ký"));
                setTo(rs.getString("Tổ"));
                setKhuPho(rs.getString("Khu_phố"));
            }conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Không tìm thấy!!!!");
        }
    }
    
    private void setLyDoMat(String rs) {
        for (int i = 0; i < comboLyDoMat.getItemCount(); i++) {
            if (rs.equals(comboLyDoMat.getItemAt(i).toString())) {
                comboLyDoMat.setSelectedIndex(i);
            }
        }
    }

    private void setTo(String rs) {
        for (int i = 0; i < comboTo.getItemCount(); i++) {
            if (rs.equals(comboTo.getItemAt(i).toString())) {
                comboTo.setSelectedIndex(i);
            }
        }
    }

    private void setKhuPho(String rs) {
        for (int i = 0; i < comboKhuPho.getItemCount(); i++) {
            if (rs.equals(comboKhuPho.getItemAt(i).toString())) {
                comboKhuPho.setSelectedIndex(i);
            }
        }
    }

    private void CapNhat() throws ParseException {
        String tenNguoiMat = txtTenNguoiMat.getText();
        String firsName = FirstName.CheckFirstName(tenNguoiMat);
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
                String qry = "Update DanhSachKhaiTu Set Tên_người_mất = ?,"
                        + "Giới_tính = ?, CCCD = ?, Ngày_mất = ?, Ngày_sinh = ?, Lý_do_mất = ?, "
                        + "Quan_hệ_với_người_đăng_ký = ?, Tên_người_đăng_ký = ?, Tổ = ?, Khu_phố = ?, Firstname = ?"
                        + " Where ID = '"+this.selectedId+"'";
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
                stmt.setString(11, firsName);
                int rowAffect = stmt.executeUpdate();
                if (rowAffect != 0) {
                    JOptionPane.showMessageDialog(rootPane, "Cập nhật thành công!!");
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Cập nhật thất bại!!!");
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

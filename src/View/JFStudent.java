package View;

import java.awt.Color;
import java.util.List;
import java.util.ArrayList;
import Utils.LopQL;
import Utils.QueQuan;
import java.text.Collator;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;
import javax.swing.table.DefaultTableModel;
import Model.Student;

public class JFStudent extends javax.swing.JPanel {
    List<Student> list = new ArrayList<Student>();
    Student sv;
    private static int pos = 0;
    public JFStudent() {
        initComponents();
        this.jLabel1.setBackground(Color.LIGHT_GRAY);
        list.add(new Student(0201366, "Nguyễn Anh Tú", "66PM5", "Hà Nội", "10/09/2003", "Nam"));
        list.add(new Student(0201366, "An Đăng Vinh", "66PM5", "Hải Dương", "10/09/2003", "Nam"));
        list.add(new Student(0201366, "Nguyễn Thành Trung", "66PM6", "Hà Nội", "10/09/2003", "Nam"));
        
        //View();
        ViewTable();
        showComboLopQL();
        showComboQueQuan();
    }
    
    public void View()
    {
        sv = list.get(pos);
        this.txt_MaSV.setText(""+sv.getMaSV());
        this.txt_TenSV.setText(sv.getTenSV());
        this.cbb_LopQL.setSelectedItem(sv.getLopQL());
        this.cbb_QueQuan.setSelectedItem(sv.getQueQuan());
        this.txt_NgaySinh.setText(sv.getNgaySinh());
        if (sv.getGioiTinh().equals("Nam")) {
            this.rbtn_Nam.setSelected(true);
            this.rbtn_Nu.setSelected(false);
        } else {
            this.rbtn_Nam.setSelected(false);
            this.rbtn_Nu.setSelected(true);
        }
    }
    
    public void ViewTable()
    {
        DefaultTableModel model = (DefaultTableModel) this.tblSinhVien.getModel();
        model.setNumRows(0);
        int n = 1;
        for(Student sv:list)
        {
            model.addRow(new Object[]{sv.getMaSV(), sv.getTenSV(), sv.getLopQL(), sv.getQueQuan(), sv.getNgaySinh(), sv.getGioiTinh()});
            n++;
        }
    }
    
    private void showComboLopQL()
    {
        List<String> lopql = LopQL.getLopQL();
        for(String string : lopql)
        {
            cbb_LopQL.addItem(string);
        }
    }
    
    private void showComboQueQuan() {
    List<String> quequan = QueQuan.getQueQuan();
    
    Collections.sort(quequan, new Comparator<String>() {
        Collator collator = Collator.getInstance(new Locale("vi", "VN"));

        @Override
        public int compare(String o1, String o2) {
            return collator.compare(o1, o2);
        }
    });
    
    for(String string : quequan) {
        cbb_QueQuan.addItem(string);
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSinhVien = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_TenSV = new javax.swing.JTextField();
        cbb_LopQL = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbb_QueQuan = new javax.swing.JComboBox<>();
        txt_NgaySinh = new javax.swing.JTextField();
        rbtn_Nu = new javax.swing.JRadioButton();
        btn_Sua = new javax.swing.JButton();
        btn_Them1 = new javax.swing.JButton();
        btn_Xoa = new javax.swing.JButton();
        btn_Huy = new javax.swing.JButton();
        txt_MaSV = new javax.swing.JTextField();
        rbtn_Nam = new javax.swing.JRadioButton();

        setToolTipText("Quản lý sinh viên");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("QUẢN LÝ SINH VIÊN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(345, 345, 345))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        tblSinhVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "MSSV", "Tên Sinh Viên", "Lớp Quản Lý", "Quê Quán", "Ngày Sinh", "Giới Tính"
            }
        ));
        tblSinhVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSinhVienMouseClicked(evt);
            }
        });
        tblSinhVien.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblSinhVienKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblSinhVien);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(202, 202, 202))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Mã Sinh Viên: ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Tên Sinh Viên:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Lớp Quản Lý:");

        txt_TenSV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        cbb_LopQL.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Ngày Sinh:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Quê Quán: ");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Giới Tính:");

        cbb_QueQuan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txt_NgaySinh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        rbtn_Nu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbtn_Nu.setText("Nữ");

        btn_Sua.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_Sua.setText("Sửa");
        btn_Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SuaActionPerformed(evt);
            }
        });

        btn_Them1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_Them1.setText("Thêm");
        btn_Them1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Them1ActionPerformed(evt);
            }
        });

        btn_Xoa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_Xoa.setText("Xoá");
        btn_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XoaActionPerformed(evt);
            }
        });

        btn_Huy.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_Huy.setText("Huỷ");

        txt_MaSV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        rbtn_Nam.setText("Nam");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_TenSV)
                            .addComponent(cbb_LopQL, 0, 136, Short.MAX_VALUE)
                            .addComponent(txt_MaSV))
                        .addGap(306, 306, 306)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btn_Them1)
                        .addGap(75, 75, 75)
                        .addComponent(btn_Sua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Xoa)
                        .addGap(89, 89, 89)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Huy)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(cbb_QueQuan, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addComponent(rbtn_Nam)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rbtn_Nu))
                        .addComponent(txt_NgaySinh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(cbb_QueQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_MaSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_TenSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txt_NgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbb_LopQL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(rbtn_Nu)
                    .addComponent(rbtn_Nam))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Sua)
                    .addComponent(btn_Them1)
                    .addComponent(btn_Xoa)
                    .addComponent(btn_Huy))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblSinhVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSinhVienMouseClicked
        pos = this.tblSinhVien.getSelectedRow();
        View();
    }//GEN-LAST:event_tblSinhVienMouseClicked

    private void tblSinhVienKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblSinhVienKeyReleased
        pos = this.tblSinhVien.getSelectedRow();
        View();
    }//GEN-LAST:event_tblSinhVienKeyReleased

    private void btn_Them1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Them1ActionPerformed
        int maSV = Integer.parseInt(this.txt_MaSV.getText());
        String tenSV = this.txt_TenSV.getText();
        String lopQL = this.cbb_LopQL.getSelectedItem().toString();
        String queQuan = this.cbb_QueQuan.getSelectedItem().toString();
        String ngaySinh = this.txt_NgaySinh.getText();
        String gioiTinh = this.rbtn_Nam.isSelected() ? "Nam" : "Nữ";
        
        list.add(new Student(maSV, tenSV, lopQL, queQuan, ngaySinh, gioiTinh));
        View();
        ViewTable();
    }//GEN-LAST:event_btn_Them1ActionPerformed

    private void btn_SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SuaActionPerformed
        // Lấy thông tin từ các trường nhập liệu
        int maSV = Integer.parseInt(this.txt_MaSV.getText());
        String tenSV = this.txt_TenSV.getText();
        String lopQL = this.cbb_LopQL.getSelectedItem().toString();
        String queQuan = this.cbb_QueQuan.getSelectedItem().toString();
        String ngaySinh = this.txt_NgaySinh.getText();
        String gioiTinh = this.rbtn_Nam.isSelected() ? "Nam" : "Nữ";

        // Lấy chỉ số hàng được chọn trong bảng
        int selectedRow = tblSinhVien.getSelectedRow();

        // Kiểm tra nếu không có hàng nào được chọn thì không thực hiện sửa
        if (selectedRow == -1) {
            return;
        }

        // Cập nhật thông tin của sinh viên trong danh sách
        list.set(selectedRow, new Student(maSV, tenSV, lopQL, queQuan, ngaySinh, gioiTinh));

        // Cập nhật lại bảng
        ViewTable();
    }//GEN-LAST:event_btn_SuaActionPerformed

    private void btn_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XoaActionPerformed
        list.remove(pos);
        View();
        ViewTable();
    }//GEN-LAST:event_btn_XoaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Huy;
    private javax.swing.JButton btn_Sua;
    private javax.swing.JButton btn_Them1;
    private javax.swing.JButton btn_Xoa;
    private javax.swing.JComboBox<String> cbb_LopQL;
    private javax.swing.JComboBox<String> cbb_QueQuan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbtn_Nam;
    private javax.swing.JRadioButton rbtn_Nu;
    private javax.swing.JTable tblSinhVien;
    private javax.swing.JTextField txt_MaSV;
    private javax.swing.JTextField txt_NgaySinh;
    private javax.swing.JTextField txt_TenSV;
    // End of variables declaration//GEN-END:variables
}

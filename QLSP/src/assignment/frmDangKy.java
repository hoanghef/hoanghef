
package assignment;

import java.sql.ResultSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;

/**
 *
 * @author TuanTuti
 */
public class frmDangKy extends javax.swing.JFrame {


    public frmDangKy() {
        initComponents();
        getRootPane().setDefaultButton(btnDangKy);
    }


    @SuppressWarnings("unchecked")
  
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblTenDangNhap = new javax.swing.JLabel();
        txtTenDangNhap = new javax.swing.JTextField();
        lblMatKhau = new javax.swing.JLabel();
        lblReMatKhau = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JPasswordField();
        txtReMatKhau = new javax.swing.JPasswordField();
        btnThoat = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTenNguoiDung = new javax.swing.JTextField();
        btnDangKy = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(java.awt.SystemColor.activeCaption);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/image/users-mixed-gender-icon.png"))); // NOI18N
        jLabel1.setText("ĐĂNG KÝ");

        lblTenDangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/image/Users-icon.png"))); // NOI18N
        lblTenDangNhap.setText("Tên Đăng Nhập");

        lblMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/image/Apps-preferences-desktop-user-password-icon.png"))); // NOI18N
        lblMatKhau.setText("Mật Khẩu");

        lblReMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/image/Apps-preferences-desktop-user-password-icon.png"))); // NOI18N
        lblReMatKhau.setText("Nhập lại mật khẩu");

        btnThoat.setBackground(new java.awt.Color(255, 153, 0));
        btnThoat.setForeground(new java.awt.Color(255, 255, 255));
        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/image/exit.png"))); // NOI18N
        btnThoat.setText("Hủy");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/image/Ironman-icon.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/image/user-male-edit-icon.png"))); // NOI18N
        jLabel3.setText("Tên Người Dùng");

        btnDangKy.setBackground(new java.awt.Color(255, 153, 0));
        btnDangKy.setForeground(new java.awt.Color(255, 255, 255));
        btnDangKy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/image/pencil-red-icon.png"))); // NOI18N
        btnDangKy.setText("Đăng Ký");
        btnDangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangKyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMatKhau)
                            .addComponent(lblTenDangNhap)
                            .addComponent(lblReMatKhau)
                            .addComponent(jLabel3))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                            .addComponent(txtTenDangNhap, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                            .addComponent(txtReMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                            .addComponent(txtTenNguoiDung))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTenDangNhap)
                    .addComponent(txtTenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMatKhau)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblReMatKhau)
                    .addComponent(txtReMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTenNguoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        
        confirm();       
    }
    public void confirm(){
        Main.playSound("soundbutton.wav");
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        int kQ = JOptionPane.showConfirmDialog(null,
                "Bạn có muốn hủy đăng ký không ?","Confirm",JOptionPane.YES_NO_OPTION);
        if(kQ == 0){
            Main.playSound("soundbutton.wav");
            frmDangNhap frmdn = new frmDangNhap();
            frmdn.show();
            this.dispose();
        }
        else{
            Main.playSound("soundbutton.wav");
        }
    }
    private void btnDangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangKyActionPerformed
      
        Main.playSound("soundbutton.wav");
        String tenDangNhap,matKhau,nhapLaiMatKhau,tenNguoiDung;
        tenDangNhap = txtTenDangNhap.getText();
        matKhau = String.valueOf(txtMatKhau.getPassword()).trim();
        nhapLaiMatKhau = String.valueOf(txtReMatKhau.getPassword()).trim();
        tenNguoiDung = txtTenNguoiDung.getText().trim();
        //-----------------------------------------------------------
        String password,rePassword;
        password = txtMatKhau.getText().trim();
        rePassword = txtReMatKhau.getText().trim();
        if("".equals(tenDangNhap)){
            Main.thongBao("Tên đăng nhập không được bỏ trống","Thông Báo", 1);
            txtTenDangNhap.requestFocus();
        }
        else if(KiemTra(tenDangNhap)){
            Main.thongBao("Tên đăng nhập đã tồn tại", "Thông Báo", 1);
            txtTenDangNhap.requestFocus();
        }
        else if(tenDangNhap.length() < 6){
            Main.thongBao("Tên đăng nhập phải từ 6 ký tự trở lên","Thông Báo", 1);
            txtTenDangNhap.requestFocus();
        }
        else if(KiemTra(tenDangNhap)){
            Main.thongBao("Tên đăng nhập đã tồn tại", "Thông Báo", 1);
            txtTenDangNhap.requestFocus();
        }
        else if(!kiemTraChuVaSo(tenDangNhap)){
            Main.thongBao("Tên đăng nhập phải chứa chữ và số","Thông Báo", 1);
            txtTenDangNhap.requestFocus();
        }
        else if("".equals(password)){
            Main.thongBao("Mật khẩu không được bỏ trống","Thông Báo", 1);
            txtMatKhau.requestFocus();
        }
        else if("".equals(rePassword)){
            Main.thongBao("Nhập lại mật khẩu không được bỏ trống","Thông Báo", 1);
            txtReMatKhau.requestFocus();
        }
        else if(!rePassword.equals(password)){
            Main.thongBao("Nhập lại mật khẩu không đúng","Thông Báo", 1);
            txtReMatKhau.requestFocus();
        }
        else if("".equals(tenNguoiDung)){
            Main.thongBao("Tên người dùng không được bỏ trống","Thông Báo", 1);
            txtTenNguoiDung.requestFocus();
        }
        else{
            String SQL = "insert into Users(Username,Password,Fullname)"
                    + " values ('"+tenDangNhap+"','"+matKhau+"',N'"+tenNguoiDung+"')";
            Main.connection.ExcuteQueryUpdateDB(SQL);
            try{
                Thread.sleep(2000);
            }
            catch (InterruptedException ex) {
                System.out.println(ex.toString());
            }
            Main.thongBao("Đăng ký tài khoản thành công!!!","Thông Báo", 1);
            frmDangNhap frmdn = new frmDangNhap();
            frmdn.show();
            this.dispose();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println(ex.toString());
            }
            frmTTDangKy frmtt = new frmTTDangKy();
            frmtt.show();
            this.dispose();
            ///////////////////////////////////////////////
            Main.hienThiTaiKhoan = txtTenDangNhap.getText();
            Main.hienThiMatKhauNguoiDung = txtMatKhau.getText();
            Main.hienThiTenNguoiDung = txtTenNguoiDung.getText();
        }
    }

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
        Main.playSound("soundbutton.wav");
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        int kQ = JOptionPane.showConfirmDialog(null,
                "Bạn có muốn thoát chương trình không ?","Confirm",JOptionPane.YES_NO_OPTION);
        if(kQ == 0){
            Main.playSound("soundbutton.wav");
            System.exit(0);
        }
        else{
            Main.playSound("soundbutton.wav");
        }
    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
    }
    
    private boolean kiemTraChuVaSo(String chuoiCanKiemTra){
        boolean ketQua = false;
        Pattern p = Pattern.compile("[a-zA-Z][0-9]|[0-9][a-zA-Z]");
        Matcher m = p.matcher(chuoiCanKiemTra);
        ketQua = m.find();
        return ketQua;
    }
    private boolean KiemTra(String tenDangNhap){
        boolean ketQua = false;
        String SQL = "select * from Users where Username = '"+tenDangNhap+"'";
        ResultSet rs = Main.connection.ExcuteQueryGetTable(SQL);
        try{
            if(rs.next()){
                ketQua = true;
            }
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }
        return ketQua;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmDangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmDangKy().setVisible(true);
            }
        });
    }

    private javax.swing.JButton btnDangKy;
    private javax.swing.JButton btnThoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMatKhau;
    private javax.swing.JLabel lblReMatKhau;
    private javax.swing.JLabel lblTenDangNhap;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JPasswordField txtReMatKhau;
    private javax.swing.JTextField txtTenDangNhap;
    private javax.swing.JTextField txtTenNguoiDung;
}

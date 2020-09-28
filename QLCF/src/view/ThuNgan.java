package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.*;

public class ThuNgan extends javax.swing.JFrame {

    public void load() {
        Color color1 = new Color(255, 255, 0);
        Color color2 = new Color(255, 0, 255);
        Color color3 = new Color(192, 192, 192);
        Color color4 = new Color(128, 128, 128);
        Color[] colors = {color1, color2, color3, color4, color1, color2, color3, color4};

        int pnDefault_Left = -100;
        int pnDefault_Top = 10;
        for (int i = 0; i < 4; i++) {
            pnDefault_Left += 115;
            JPanel pn = new JPanel();
            pn.setPreferredSize(new Dimension(95, 95));
            pn.setLayout(null);
            pn.setBackground(colors[i]);
            pn.setBounds(pnDefault_Left, pnDefault_Top, 95, 95);
            JLabel lbName = new JLabel();
            lbName.setText("Bàn " + String.valueOf(i));
            lbName.setBounds(25, 0, 100, 50);
            pn.add(lbName);
            pnBan.add(pn);
            pn.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                    LocalDateTime now = LocalDateTime.now();
                    pnBanPhong.removeAll();
                    Banphong bp = new Banphong(lbName.getText(),dtf.format(now));
                    bp.setVisible(true);
                    pnBanPhong.setLayout(new BorderLayout());
                    pnBanPhong.add(bp);
                    pnBanPhong.validate();
                }
            });
        }

    }

    public ThuNgan() {
        initComponents();
        load();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnBan = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        pnBanPhong = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        pnBan.setBackground(new java.awt.Color(204, 255, 204));
        pnBan.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 204, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        pnBan.add(jPanel3);
        jPanel3.setBounds(20, 600, 50, 10);

        jPanel5.setBackground(new java.awt.Color(255, 51, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        pnBan.add(jPanel5);
        jPanel5.setBounds(20, 620, 50, 10);

        jLabel1.setText("Bàn trống");
        pnBan.add(jLabel1);
        jLabel1.setBounds(80, 600, 60, 10);

        jLabel2.setText("Bàn đang sử dụng");
        pnBan.add(jLabel2);
        jLabel2.setBounds(80, 620, 110, 10);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/coffee-drink-cafe-or-cafeteria-isolated-clip-art-vector_csp71823567-removebg-preview-removebg-preview.png"))); // NOI18N
        pnBan.add(jLabel20);
        jLabel20.setBounds(260, 540, 150, 90);

        jPanel1.add(pnBan);
        pnBan.setBounds(0, 10, 480, 660);

        pnBanPhong.setMaximumSize(new java.awt.Dimension(300, 607));
        pnBanPhong.setMinimumSize(new java.awt.Dimension(300, 607));
        pnBanPhong.setPreferredSize(new java.awt.Dimension(300, 607));
        pnBanPhong.setLayout(null);
        jPanel1.add(pnBanPhong);
        pnBanPhong.setBounds(500, 10, 320, 660);

        jMenu1.setText("Hệ thống");

        jMenuItem1.setText("Thông tin");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Đăng xuất");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Quản lý đặt hàng");

        jMenuItem3.setText("Chọn thực đơn");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Cập nhật thông tin hóa đơn");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Bán hàng");

        jMenuItem5.setText("Thêm khách hàng");
        jMenu3.add(jMenuItem5);

        jMenuItem6.setText("Quản lý bàn phòng");
        jMenu3.add(jMenuItem6);

        jMenuItem7.setText("Thanh toán và In phiếu");
        jMenu3.add(jMenuItem7);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Thống kê");

        jMenuItem8.setText("Báo cáo doanh thu");
        jMenu4.add(jMenuItem8);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1393, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThuNgan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel pnBan;
    private javax.swing.JPanel pnBanPhong;
    // End of variables declaration//GEN-END:variables
}

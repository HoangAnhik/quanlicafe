/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Admin
 */
public class ThanhToanVaInPhieu extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public ThanhToanVaInPhieu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jPanel1.setMaximumSize(new java.awt.Dimension(597, 685));
        jPanel1.setMinimumSize(new java.awt.Dimension(597, 685));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Thanh Toán Và In Phiếu");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(190, 60, 290, 29);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Hóa Đơn Bàn :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(220, 150, 130, 30);

        jLabel10.setText("................");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(370, 150, 150, 30);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/coffee-cafe-icon-png-favpng-swkmkqTCNXwCiNnyM5mNN7PiE-removebg-preview-removebg-preview.png"))); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(60, 20, 100, 150);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton1.setText("Xuất hóa đơn");
        jPanel1.add(jButton1);
        jButton1.setBounds(390, 580, 140, 40);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Đồ uống", "Số lượng", "Giá", "Thành tiền"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(60, 240, 480, 280);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Ngày giờ :");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(100, 200, 120, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Tổng Tiền :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 540, 110, 40);

        jLabel3.setText("..........");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(180, 540, 90, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
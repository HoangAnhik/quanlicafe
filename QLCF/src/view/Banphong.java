package view;

public class Banphong extends javax.swing.JPanel {
    String tenBan;
    public Banphong() {
        initComponents();
    }
    public Banphong(String tenBan,String time) {
        initComponents();
        this.tenBan = tenBan;
        txtTenBan.setText(tenBan);
        tgian.setText(time);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtTenBan = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tgian = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jButton1 = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(300, 607));
        setMinimumSize(new java.awt.Dimension(300, 607));

        jPanel4.setBackground(new java.awt.Color(255, 255, 204));
        jPanel4.setMaximumSize(new java.awt.Dimension(300, 607));
        jPanel4.setMinimumSize(new java.awt.Dimension(300, 607));
        jPanel4.setPreferredSize(new java.awt.Dimension(300, 607));
        jPanel4.setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/takeaway-coffee-cup-isolated-icon-cafe-or-vector-25490975-removebg-preview.png"))); // NOI18N
        jPanel4.add(jLabel3);
        jLabel3.setBounds(0, 0, 180, 110);

        txtTenBan.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtTenBan.setText("Bàn 0");
        jPanel4.add(txtTenBan);
        txtTenBan.setBounds(191, 6, 100, 60);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Giờ vào :");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(10, 140, 60, 30);

        tgian.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tgian.setText("10:10");
        jPanel4.add(tgian);
        tgian.setBounds(90, 140, 210, 30);
        jPanel4.add(jScrollPane1);
        jScrollPane1.setBounds(10, 180, 280, 100);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Gọi món");
        jPanel4.add(jButton1);
        jButton1.setBounds(100, 290, 100, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel tgian;
    private javax.swing.JLabel txtTenBan;
    // End of variables declaration//GEN-END:variables
}

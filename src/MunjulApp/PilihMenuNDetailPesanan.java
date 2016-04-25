package MunjulApp;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;

public class PilihMenuNDetailPesanan extends javax.swing.JFrame {
    private Koneksi k=new Koneksi();
    public PilihMenuNDetailPesanan() {
        initComponents();
        k.koneksiDatabase();
        TampilMenu();
        TampilTable();
    }
    
   /* public ResultSet GenerateID()throws SQLException{
        try{
            Statement stmt=k.getKoneksi().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs=stmt.executeQuery("insert into detail('content','username') values(" +
            "'"+media.getPath()+"'"+"'" +account.getUsername()+"')",Statement.RETURN_GENERATED_KEYS);
            ResultSet rs=stmt.getGeneratedKeys();
            
            rs.next();
            String se
            idNota.setText();
        }catch(SQLException se){
            JOptionPane.showMessageDialog(null, "Not Found! \n" + se.getMessage());
        }
    } */
    
    public void TampilMenu(){
        try{
            Statement stmt=k.getKoneksi().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs=stmt.executeQuery("select nama_menu from menu");
            
            while(rs.next()){
                Menu.addElement(rs.getString("nama_menu"));
            }
            MenuList.setModel(Menu);
        }catch(SQLException se){
            JOptionPane.showMessageDialog(null, "Not Found! \n" + se.getMessage());
        }
    }
    
    public void TampilTable(){
        Cart.addColumn("Kode Menu");
        Cart.addColumn("Nama Menu");
        Cart.addColumn("Jumlah");
        Cart.addColumn("Harga");
        TabelBelanja.setModel(Cart);
    }
    
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        MenuList = new javax.swing.JList();
        Nomor = new javax.swing.JSpinner();
        PilihMenu = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelBelanja = new javax.swing.JTable();
        Harga = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        HapusMenu = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        idNota = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Pilih Menu");

        MenuList.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        MenuList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        MenuList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(MenuList);

        Nomor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Nomor.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                NomorStateChanged(evt);
            }
        });

        PilihMenu.setText("Pilih");
        PilihMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PilihMenuActionPerformed(evt);
            }
        });

        TabelBelanja.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(TabelBelanja);

        Harga.setEditable(false);

        jLabel2.setText("Rp.");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Total Harga");

        jTextField1.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jTextField1.setText("0");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        HapusMenu.setText("Hapus Pesanan");
        HapusMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusMenuActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Detail Pesanan");

        idNota.setText("jLabel5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(idNota, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(HapusMenu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Nomor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Harga, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(PilihMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Nomor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Harga)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PilihMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idNota))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(HapusMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(142, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuListMouseClicked
        MenuList.getSelectedValue();
    }//GEN-LAST:event_MenuListMouseClicked

    private void NomorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_NomorStateChanged
        int get=(int)Nomor.getValue();
        try{
            Statement stmt=k.getKoneksi().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs=stmt.executeQuery("select nama_menu, harga from menu where nama_menu like '%"+MenuList.getSelectedValue()+"%'");
            
            while(rs.next()){
            Object[] ob=new Object[2];
            ob[0]=rs.getInt("harga");
            
            int harga=get*(int)ob[0];
            Harga.setText(String.valueOf(harga));
            }
        }catch(SQLException se){
            JOptionPane.showMessageDialog(null, se.getMessage());
        }
    }//GEN-LAST:event_NomorStateChanged

    private void PilihMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PilihMenuActionPerformed
        try{
            Statement stmt=k.getKoneksi().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs=stmt.executeQuery("select kode_menu from menu where nama_menu like '%"+MenuList.getSelectedValue()+"%'");
            
            while(rs.next()){
                Object[] ob=new Object[1];
                ob[0]=rs.getString("kode_menu");
                String Kode;
                
                Cart.addRow(new Object[]{
                    Kode=String.valueOf(ob[0]),
                    MenuList.getSelectedValue(),
                    Nomor.getValue(),
                    Harga.getText()
                });
                TabelBelanja.setModel(Cart);
                Long total=Long.parseLong(Harga.getText())+Long.parseLong(jTextField1.getText());
                jTextField1.setText(String.valueOf(total));
            }
        }catch(SQLException se){
            JOptionPane.showMessageDialog(null, se.getMessage());
        }
        
    }//GEN-LAST:event_PilihMenuActionPerformed

    private void HapusMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusMenuActionPerformed
        try{
            int baris=TabelBelanja.getSelectedRow();
            String pilih=TabelBelanja.getValueAt(baris, 2).toString();
            Long hapus=Long.parseLong(jTextField1.getText())-Long.parseLong(pilih);
            jTextField1.setText(String.valueOf(hapus));
            Cart.removeRow(TabelBelanja.getSelectedRow());
        }catch(ArrayIndexOutOfBoundsException a){
            JOptionPane.showMessageDialog(null, "Tidak Ada Baris yang Dipilih!","Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_HapusMenuActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    /**
     * @param args the command line arguments
     */
    /**/
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
            java.util.logging.Logger.getLogger(PilihMenuNDetailPesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PilihMenuNDetailPesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PilihMenuNDetailPesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PilihMenuNDetailPesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PilihMenuNDetailPesanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HapusMenu;
    private javax.swing.JTextField Harga;
    private javax.swing.JList MenuList;
    private javax.swing.JSpinner Nomor;
    private javax.swing.JButton PilihMenu;
    private javax.swing.JTable TabelBelanja;
    private javax.swing.JLabel idNota;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
    DefaultListModel Menu=new DefaultListModel();
    DefaultTableModel Cart= new DefaultTableModel(){
        public boolean isCellEditable(int row, int column){
            return false;
        }
    };
}

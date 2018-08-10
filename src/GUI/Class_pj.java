/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAO.Class_pjDAO;
import DAO.alert_messager;
import DTO.Class_pjDTO;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Administrator
 */
public class Class_pj extends javax.swing.JInternalFrame {

    /**
     * Creates new form Class1
     */
    private DefaultTableModel model = null;
    private int selectedRow = -1;
    alert_messager alt = new alert_messager();//toan cuc
    Class_pjDAO classdao = new Class_pjDAO();//toan cuc
    
    public Class_pj() {
        initComponents();
        model = new DefaultTableModel(null, new Object[]{"Class ID", "Class Name"});
        tblclass.setModel(model);
        loadData();
        
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
        jLabel2 = new javax.swing.JLabel();
        txtidclass = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtnameclass = new javax.swing.JTextField();
        btnadd = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnrefresh = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtsearch = new javax.swing.JTextField();
        lberro = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblclass = new javax.swing.JTable();

        setMinimumSize(new java.awt.Dimension(1350, 685));
        setPreferredSize(new java.awt.Dimension(1350, 685));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(1150, 80));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Class ID");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Calss Name");

        btnadd.setForeground(new java.awt.Color(102, 102, 102));
        btnadd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1494188840_flat-style-circle-add.png"))); // NOI18N
        btnadd.setText("Add");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btnupdate.setForeground(new java.awt.Color(102, 102, 102));
        btnupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1494135526_compose.png"))); // NOI18N
        btnupdate.setText("Edit");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btndelete.setForeground(new java.awt.Color(102, 102, 102));
        btndelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1494188946_flat-style-circle-delete-trash.png"))); // NOI18N
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("(*)");

        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("(*)");

        btnrefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/refresh.png"))); // NOI18N
        btnrefresh.setText("Refresh");
        btnrefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrefreshActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Search"));
        jPanel3.setMinimumSize(new java.awt.Dimension(150, 50));
        jPanel3.setPreferredSize(new java.awt.Dimension(150, 80));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1494189020_icon-111-search.png"))); // NOI18N

        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("(*)");

        txtsearch.setForeground(new java.awt.Color(51, 51, 51));
        txtsearch.setMinimumSize(new java.awt.Dimension(80, 20));
        txtsearch.setPreferredSize(new java.awt.Dimension(80, 20));
        txtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtsearch, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addComponent(jLabel7))
                .addGap(11, 11, Short.MAX_VALUE))
        );

        lberro.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(10, 10, 10)
                .addComponent(txtidclass, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtnameclass, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnrefresh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnadd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnupdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btndelete)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lberro, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnadd, btndelete, btnrefresh, btnupdate});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(lberro, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(txtidclass)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addComponent(txtnameclass)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnadd)
                                    .addComponent(btnupdate)
                                    .addComponent(btndelete)
                                    .addComponent(btnrefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(24, 24, 24))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnadd, btndelete, btnrefresh, btnupdate});

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        tblclass.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Class ID", "Faculty ID"
            }
        ));
        tblclass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblclassMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblclass);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1327, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        
        String classID = this.txtidclass.getText();
        String className = this.txtnameclass.getText();
        Class_pjDTO classdto = new Class_pjDTO(classID, className);
        if (classID.isEmpty()) {
            alt.alter(" you haven't yet input Calss ID");
        } else {
            if (Class_pjDAO.CheckClassIDExists(classID)) {
                alt.alter("Class ID already Exsits");
            } else {
                if (className.isEmpty()) {
                    alt.alter(" you haven't yet input name class");
                } else {
                    boolean isAddClass =this.classdao.InsertClass_pj(classdto);
                    if (isAddClass) {
                        alt.alter("Add Success");
                        loadData();
                        refreshClass();
                    } else {
                        alt.alter("Add is not success");
                        
                    }
                }
            }
        }
    }//GEN-LAST:event_btnaddActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        try {
            if (txtidclass.getText().isEmpty() == false) {
                Class_pjDTO dto = new Class_pjDTO();
                dto.setIdclass_pj(txtidclass.getText());
                dto.setNameclass_pj(txtnameclass.getText());
                boolean isUpdate = this.classdao.UpdateClass_pj(dto);
                if (isUpdate) {
                    alt.alter("update Successed !");
                    loadData(); // sau khi update thanh cong se load du lieu len bang
                    refreshClass();
                } else {
                    alt.alter("Update is not success");
                }
            } else {
                alt.alter("No Class select to update");
            }
        } catch (Exception e) {
            
            alt.alter("Update not success");
            System.out.println("GUI.QuanLyTaiKhoan.Class_pj.btnupdateActionPerformed():" + e.getMessage());
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please selecte a row to delete");
        } else {
            if (JOptionPane.showConfirmDialog(this, "Are you sure to delete?", "Deelte Warming", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                Class_pjDTO dto = new Class_pjDTO();
                dto.setIdclass_pj(txtidclass.getText());
                boolean isDelete = this.classdao.DeleteClass_pj(dto);
                if (isDelete) {
                    alt.alter("Delete Success!!");
                    loadData();
                    refreshClass();
                } else {
                    alt.alter("Delete is Not Success");
                }
            } else {
                JOptionPane.showMessageDialog(this, " Not Data Delete");
            }
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void txtsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyReleased
        String query = txtsearch.getText().toLowerCase();
        search(query);
    }//GEN-LAST:event_txtsearchKeyReleased

    private void tblclassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblclassMouseClicked
        try {
            // get text tu bang 
            int row = tblclass.getSelectedRow();
            String idclass = (String) model.getValueAt(row, 0);
            String nameclass = (String) model.getValueAt(row, 1);
            // xet text len cac o text fild
            txtidclass.setText(idclass);
            txtnameclass.setText(nameclass);
        } catch (Exception e) {
            System.out.println("GUI.QuanLyTaiKhoan.Class_pj.tblclassMouseClicked(): "+e.getMessage());
        }
        selectedRow = this.tblclass.getSelectedRow();
    }//GEN-LAST:event_tblclassMouseClicked

    private void btnrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrefreshActionPerformed
        refreshClass();
    }//GEN-LAST:event_btnrefreshActionPerformed
    /*Tao filter*/
    public void search(String quuery) {
        TableRowSorter<TableModel> tr = new TableRowSorter<>(model);
        tblclass.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(quuery));
    }

    public void loadData() {
        model = new DefaultTableModel(null, new Object[]{"Class ID", "Class Name"});
        ResultSet rs = this.classdao.LoadataClass_pj();
        try {
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString("malophoc"), rs.getString("tenlop")});
            }
            tblclass.setModel(model);
            rs.close();
        } catch (Exception e) {
            System.out.println("GUI.QuanLyTaiKhoan.Class_pj.loadData(): "+e.getMessage());
        }
    }

    public void refreshClass() {
        txtidclass.setText("");
        txtnameclass.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnrefresh;
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lberro;
    private javax.swing.JTable tblclass;
    private javax.swing.JTextField txtidclass;
    private javax.swing.JTextField txtnameclass;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
}

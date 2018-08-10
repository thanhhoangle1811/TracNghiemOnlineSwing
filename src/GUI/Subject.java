/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author Administrator
 */
import DAO.SubjectDAO;
import DAO.ThamGiaDAO;
import DAO.UserInformation;
import DAO.alert_messager;
import DTO.SubjectDTO;
import DTO.ThamGiaDTO;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class Subject extends javax.swing.JInternalFrame {

    /**
     * Creates new form Subject1
     */
    private DefaultTableModel model = null;
    private DefaultTableModel model1 = null;
    private int selectedRow = -1;
    alert_messager alt = new alert_messager();// toan cuc
    SubjectDAO subjectdao = new SubjectDAO();//toan cuc
    ThamGiaDAO thamgiadao = new ThamGiaDAO();//toan cuc

    public Subject() {
        initComponents();
        model = new DefaultTableModel(null, new Object[]{"Subject ID", "Subject Name", "Credits"});
        model1 = new DefaultTableModel(null, new Object[]{"Student", "Monhoc"});
        loaddataSubject();
        loadDaTaThamGia();
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
        jPanel5 = new javax.swing.JPanel();
        txtidsubject = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtnamesubject = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtcredits = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtStudentID = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblsubject = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblThamgia = new javax.swing.JTable();

        setMinimumSize(new java.awt.Dimension(1350, 685));
        setPreferredSize(new java.awt.Dimension(1350, 685));

        jPanel1.setMinimumSize(new java.awt.Dimension(1150, 80));
        jPanel1.setPreferredSize(new java.awt.Dimension(1150, 80));

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setMaximumSize(new java.awt.Dimension(577, 73));
        jPanel5.setMinimumSize(new java.awt.Dimension(577, 73));

        jLabel9.setText("Credits");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1494189020_icon-111-search.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Subject Name");

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("(*)");

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("(*)");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Search");

        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("(*)");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Subject ID");

        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("(*)");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txtidsubject, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(8, 8, 8)
                        .addComponent(txtnamesubject, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcredits))
                    .addComponent(txtSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(9, 9, 9)
                        .addComponent(jLabel8))
                    .addComponent(jLabel5)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtidsubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(txtnamesubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9)
                    .addComponent(txtcredits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel6))
                    .addComponent(jLabel8))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel10.setText("Student ID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(299, 299, 299))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setMaximumSize(new java.awt.Dimension(1185, 471));
        jPanel2.setMinimumSize(new java.awt.Dimension(1185, 471));

        tblsubject.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tblsubject.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Subject ID", "Subject Name", "Credits"
            }
        ));
        tblsubject.setMaximumSize(new java.awt.Dimension(225, 64));
        tblsubject.setMinimumSize(new java.awt.Dimension(225, 64));
        tblsubject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblsubjectMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblsubject);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/chevron (1).png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/refresh.png"))); // NOI18N
        btnRefresh.setText("Refr");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnAdd.setForeground(new java.awt.Color(102, 102, 102));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1494188840_flat-style-circle-add.png"))); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setForeground(new java.awt.Color(102, 102, 102));
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1494135526_compose.png"))); // NOI18N
        btnUpdate.setText("Edit");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setForeground(new java.awt.Color(102, 102, 102));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1494188946_flat-style-circle-delete-trash.png"))); // NOI18N
        btnDelete.setText("Del");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate)
                .addGap(18, 18, 18)
                .addComponent(btnDelete)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAdd, btnDelete, btnRefresh, btnUpdate});

        tblThamgia.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tblThamgia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Student", "Subject"
            }
        ));
        jScrollPane2.setViewportView(tblThamgia);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        try {
            String mamon = txtidsubject.getText();
            String tenmon = txtnamesubject.getText();
            int credit = 0;
            try {
                credit = Integer.valueOf(txtcredits.getText());
            } catch (Exception e) {
                System.out.println(" Parse Int Cridit : " + e.getMessage());
            }

            SubjectDTO subjectdto = new SubjectDTO(mamon, tenmon, credit);
            if (mamon.isEmpty()) {
                alt.alter("You haven't yet input Subject ID");
            } else {
                if (SubjectDAO.CheckSubjectIDExists(mamon)) {
                    alt.alter("Subject ID already exsits");
                } else {
                    if (tenmon.isEmpty()) {
                        alt.alter("you haven't yet input Subject Name");
                    } else {
                        boolean isAddSubject = this.subjectdao.insertSubject(subjectdto);
                        if (isAddSubject) {
                            alt.alter("Add Success");
                            loaddataSubject();
                            refreshSubject();
                        } else {
                            alt.alter("Add not Success");
                        }
                    }
                }
            }

        } catch (Exception e) {
            System.out.println("GUI.QuanLyTaiKhoan.Subject.btnAddActionPerformed() : " + e.getMessage());
        }

    }//GEN-LAST:event_btnAddActionPerformed

    private void tblsubjectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblsubjectMouseClicked

        try {
            int row = tblsubject.getSelectedRow();
            String subjectID = (String) model.getValueAt(row, 0);
            String subjectName = (String) model.getValueAt(row, 1);
            int credits = (Integer) model.getValueAt(row, 2);

            txtidsubject.setText(subjectID);
            txtnamesubject.setText(subjectName);
            txtcredits.setText(String.valueOf(credits));

        } catch (Exception e) {
            System.out.println("GUI.QuanLyTaiKhoan.Subject.tblsubjectMouseClicked() : " + e.getMessage());
        }
        selectedRow = this.tblsubject.getSelectedRow();
    }//GEN-LAST:event_tblsubjectMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(this, "Please selecte a row want to Update");
            } else {
                String subjectID = txtidsubject.getText();
                if (subjectID.isEmpty() == false) {
                    String subjectName = txtnamesubject.getText();
                    int credits = 0;
                    try {
                        credits = Integer.parseInt(txtcredits.getText().trim());
                    } catch (Exception e) {
                        System.out.println("Credit ParseInt : " + e.getMessage());
                    }
                    SubjectDTO subjectdto = new SubjectDTO(subjectID, subjectName, credits);
                    boolean isUpdateSubject = this.subjectdao.UpdateSubject(subjectdto);
                    if (isUpdateSubject) {
                        alt.alter("Update Success");
                        loaddataSubject();
                        refreshSubject();
                    } else {
                        alt.alter("Update is not Success");
                    }

                }
            }
        } catch (Exception e) {
            System.out.println("GUI.QuanLyTaiKhoan.Subject.btnUpdateActionPerformed() : " + e.getMessage());
        }


    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please selecte a row to delete");
        } else {
            if (JOptionPane.showConfirmDialog(this, "Are you sure to delete?", "Deelte Warming", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                SubjectDTO dto = new SubjectDTO();
                dto.setSubjectID(txtidsubject.getText());
                boolean isDeleteSubject = this.subjectdao.DeleteSubject(dto);
                if (isDeleteSubject) {
                    alt.alter("Delete Success");
                    loaddataSubject();
                    refreshSubject();
                } else {
                    alt.alter("Delete is not Succsess");
                }

            } else {
                JOptionPane.showMessageDialog(this, "Deleted unsuccessfuly");
            }
        }


    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        refreshSubject();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased

        String query = txtSearch.getText().toLowerCase();
        search(query);
    }//GEN-LAST:event_txtSearchKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (txtStudentID.getText().isEmpty()) {
            alt.alter("please enter student ID.");
        } else {
            String mamon = txtidsubject.getText();
            int matk = Integer.valueOf(txtStudentID.getText());
            ThamGiaDAO thamgia = new ThamGiaDAO();
            boolean isAddClass = thamgia.insertThamGia(new ThamGiaDTO(matk, mamon));
            if (isAddClass) {
                alt.alter("Add Success");
                loadDaTaThamGia();
                refreshSubject();
            } else {
                alt.alter("Add is not success");

            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public void refreshSubject() {
        txtidsubject.setText("");
        txtnamesubject.setText("");
        txtcredits.setText("");
        txtStudentID.setText("");

    }

    public void loaddataSubject() {
        model = new DefaultTableModel(null, new Object[]{"Subject ID", "Subject Name", "Credits"});
        SubjectDAO dao = new SubjectDAO();
        ResultSet rs = dao.loadData();
        try {

            while (rs.next()) {
                model.addRow(new Object[]{rs.getString("mamonhoc"), rs.getString("tenmonhoc"), rs.getInt("sotinchi")});
            }
            tblsubject.setModel(model);
            rs.close();
        } catch (Exception e) {
            System.out.println("GUI.QuanLyTaiKhoan.Subject.loaddataSubject(): " + e.getMessage());
        }
    }

    public void loadDaTaThamGia() {
        model1 = new DefaultTableModel(null, new Object[]{"Student", "Monhoc"});
        ResultSet rs = this.thamgiadao.loadDataThamgia();
        try {
            while (rs.next()) {
                model1.addRow(new Object[]{rs.getString("hoten"), rs.getString("tenmonhoc")});
            }
            tblThamgia.setModel(model1);
            rs.close();

        } catch (Exception e) {
            System.out.println("GUI.QuanLyTaiKhoan.Subject.loadDaTaThamGia() : " + e.getMessage());
        }
    }

    public void search(String quuery) {
        TableRowSorter<TableModel> tr = new TableRowSorter<TableModel>(model);
        tblsubject.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(quuery));

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblThamgia;
    private javax.swing.JTable tblsubject;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtStudentID;
    private javax.swing.JTextField txtcredits;
    private javax.swing.JTextField txtidsubject;
    private javax.swing.JTextField txtnamesubject;
    // End of variables declaration//GEN-END:variables
}

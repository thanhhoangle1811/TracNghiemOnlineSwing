/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAO.QuizDAO;
import DAO.QuizListDao;
import DAO.SubjectDAO;
import DAO.alert_messager;
import DTO.QuizListDto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TMK_PLAN4
 */
public class QuizList extends javax.swing.JInternalFrame {

    /**
     * Creates new form QuizList
     */
    DefaultTableModel model = null;
    private int selectedRow = -1;
    alert_messager alt = new alert_messager();// toan cuc

    public QuizList() {
        initComponents();
        model = new DefaultTableModel(null, new Object[]{"QuizID", "Subject", "Exam Time", "NoOfLevel1Ques", "NoOfLevel2Ques", "NoOfLevel3Ques"});
        tbDSCHoi.setModel(model);
        loadQuiz();
        loadSubjectIDToCBO();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnQuizListTop = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jpsSoCauDe = new javax.swing.JSpinner();
        jpsSoCauKho = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jpsThoiGianLam = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jpsSoCauTB = new javax.swing.JSpinner();
        jcoMonHoc = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btndelete = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btnaddQuiz = new javax.swing.JButton();
        btnrefresh = new javax.swing.JButton();
        pnQuizListBottom = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDSCHoi = new javax.swing.JTable();

        setMinimumSize(new java.awt.Dimension(1350, 685));
        setPreferredSize(new java.awt.Dimension(1350, 685));
        setRequestFocusEnabled(false);

        pnQuizListTop.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnQuizListTop.setMaximumSize(new java.awt.Dimension(1150, 170));
        pnQuizListTop.setMinimumSize(new java.awt.Dimension(1150, 170));
        pnQuizListTop.setPreferredSize(new java.awt.Dimension(1150, 170));

        jLabel4.setText("NoOfLevel2Ques ");

        jLabel2.setText("Exam Time (minute)");

        jLabel6.setText("NoOfLevel3Ques ");

        jLabel3.setText("NoOfLevel1Ques ");

        jcoMonHoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--select--" }));

        jLabel1.setText("Subject ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcoMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpsThoiGianLam, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jpsSoCauTB))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jpsSoCauDe, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(67, 67, 67)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpsSoCauKho, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jcoMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jpsSoCauDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpsSoCauKho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel4)
                        .addComponent(jpsThoiGianLam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jpsSoCauTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btndelete.setText("Delete");

        btnupdate.setText("Update");

        btnaddQuiz.setText("add");
        btnaddQuiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddQuizActionPerformed(evt);
            }
        });

        btnrefresh.setText("ref");
        btnrefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnaddQuiz)
                .addGap(18, 18, 18)
                .addComponent(btnupdate)
                .addGap(18, 18, 18)
                .addComponent(btndelete)
                .addGap(18, 18, 18)
                .addComponent(btnrefresh)
                .addContainerGap(266, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnaddQuiz)
                    .addComponent(btnupdate)
                    .addComponent(btndelete)
                    .addComponent(btnrefresh))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnQuizListTopLayout = new javax.swing.GroupLayout(pnQuizListTop);
        pnQuizListTop.setLayout(pnQuizListTopLayout);
        pnQuizListTopLayout.setHorizontalGroup(
            pnQuizListTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnQuizListTopLayout.createSequentialGroup()
                .addGroup(pnQuizListTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnQuizListTopLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnQuizListTopLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(549, Short.MAX_VALUE))
        );
        pnQuizListTopLayout.setVerticalGroup(
            pnQuizListTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnQuizListTopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(pnQuizListTop, java.awt.BorderLayout.PAGE_START);

        pnQuizListBottom.setMinimumSize(new java.awt.Dimension(1150, 410));
        pnQuizListBottom.setPreferredSize(new java.awt.Dimension(1150, 410));

        tbDSCHoi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "QuizID", "Subject", "Leve", "Answer D", "Answer B", "Answer C", "Answer D"
            }
        ));
        tbDSCHoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDSCHoiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbDSCHoi);

        javax.swing.GroupLayout pnQuizListBottomLayout = new javax.swing.GroupLayout(pnQuizListBottom);
        pnQuizListBottom.setLayout(pnQuizListBottomLayout);
        pnQuizListBottomLayout.setHorizontalGroup(
            pnQuizListBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1150, Short.MAX_VALUE)
        );
        pnQuizListBottomLayout.setVerticalGroup(
            pnQuizListBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
        );

        getContentPane().add(pnQuizListBottom, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbDSCHoiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDSCHoiMouseClicked
        try {
            int row = tbDSCHoi.getSelectedRow();
            //int quizID = (Integer) model.getValueAt(row, 0);
            String subjectID = (String) model.getValueAt(row, 1);
            int examTime = (Integer) model.getValueAt(row, 2);
            int Nolevel1 = (Integer) model.getValueAt(row, 3);
            int Nolevel2 = (Integer) model.getValueAt(row, 4);
            int Nolevel3 = (Integer) model.getValueAt(row, 5);
            jcoMonHoc.setSelectedItem(subjectID);
            jpsThoiGianLam.setValue(examTime);
            jpsSoCauDe.setValue(Nolevel1);
            jpsSoCauTB.setValue(Nolevel2);
            jpsSoCauKho.setValue(Nolevel3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        selectedRow = this.tbDSCHoi.getSelectedRow();
    }//GEN-LAST:event_tbDSCHoiMouseClicked

    private void btnrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrefreshActionPerformed
        refresh();
    }//GEN-LAST:event_btnrefreshActionPerformed

    private void btnaddQuizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddQuizActionPerformed
        // TODO add your handling code here:
        int Noleve1 = 0;
        try {
            Noleve1 = (Integer) jpsSoCauDe.getValue();
        } catch (Exception e) {
            System.out.println("loi Nole1:" + e.getMessage());
        }
        int Noleve2 = 0;
        try {
            Noleve2 = (Integer) jpsSoCauTB.getValue();
        } catch (Exception e) {
            System.out.println("loi Nole2:" + e.getMessage());
        }

        int Noleve3 = 0;
        try {
            Noleve3 = (Integer) jpsSoCauKho.getValue();
        } catch (Exception e) {
            System.out.println("loi Nole3:" + e.getMessage());
        }
        String monhoc="";
        try {
            monhoc=jcoMonHoc.getSelectedItem().toString();
        } catch (Exception e) {
            System.out.println("loi monhoc:" + e.getMessage());
        }
        
        int thoiGianLamBai = 0;
        try {
            thoiGianLamBai=(Integer) jpsThoiGianLam.getValue();
        } catch (Exception e) {
        }
        
        QuizListDao dao = new QuizListDao();
        
        boolean isAddClass = dao.insertQuizList(new QuizListDto(monhoc, thoiGianLamBai, Noleve3, Noleve3, Noleve3));
            if (isAddClass) {
                alt.alter("Add Success");
                loadQuiz();
                refresh();
            } else {
                alt.alter("Add is not success");

            }

    }//GEN-LAST:event_btnaddQuizActionPerformed

    public void refresh() {
        jcoMonHoc.setSelectedIndex(0);
        jpsThoiGianLam.setValue(0);
        jpsSoCauDe.setValue(0);
        jpsSoCauTB.setValue(0);
        jpsSoCauKho.setValue(0);
    }

    public void loadSubjectIDToCBO() {
        SubjectDAO dao = new SubjectDAO();
        ResultSet rs = dao.loadData();
        try {
            while (rs.next()) {
                jcoMonHoc.addItem(rs.getString("tenmonhoc"));
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(QuizList.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void loadQuiz() {
        model = new DefaultTableModel(null, new Object[]{"QuizID", "Subject", "Exam Time", "NoOfLevel1Ques", "NoOfLevel2Ques", "NoOfLevel3Ques"});
        QuizDAO dao = new QuizDAO();
        ResultSet rs = dao.loadAllQuiz();
        try {
            while (rs.next()) {
                model.addRow(new Object[]{rs.getInt("madethi"), rs.getString("mamonhoc"), rs.getInt("thoigianthi"), rs.getInt("socaudokho1"), rs.getInt("socaudokho2"), rs.getInt("socaudokho3")});
            }
            tbDSCHoi.setModel(model);
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaddQuiz;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnrefresh;
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcoMonHoc;
    private javax.swing.JSpinner jpsSoCauDe;
    private javax.swing.JSpinner jpsSoCauKho;
    private javax.swing.JSpinner jpsSoCauTB;
    private javax.swing.JSpinner jpsThoiGianLam;
    private javax.swing.JPanel pnQuizListBottom;
    private javax.swing.JPanel pnQuizListTop;
    private javax.swing.JTable tbDSCHoi;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAO.UserInformation;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author TMK_PLAN4
 */
public class Teacher extends javax.swing.JPanel {

    /**
     * Creates new form Teacher
     */
    GridBagLayout layout = new GridBagLayout();
    Question question;
    CreateTestQuiz createtestquiz;
    QuizList quizlist;

    public Teacher() {
        initComponents();
        CurrentTime();// hien thi thoi gian dang nhap
        lbName.setText(UserInformation.name); // show user name login
        question = new Question();
        pnTeacherBottom.setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        pnTeacherBottom.add(question, c);
        question.setVisible(true);

        createtestquiz = new CreateTestQuiz();
        c.gridx = 0;
        c.gridy = 0;
        pnTeacherBottom.add(createtestquiz, c);
        createtestquiz.setVisible(false);
        quizlist = new QuizList();
        c.gridx = 0;
        c.gridy = 0;
        pnTeacherBottom.add(quizlist, c);
        quizlist.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnTeacherLeft = new javax.swing.JPanel();
        btncreatequestion = new javax.swing.JButton();
        btncreateexam = new javax.swing.JButton();
        btnQuiz = new javax.swing.JButton();
        lbName = new javax.swing.JLabel();
        lbDate = new javax.swing.JLabel();
        lbTime = new javax.swing.JLabel();
        pnTeacherBottom = new javax.swing.JPanel();

        setMinimumSize(new java.awt.Dimension(1350, 720));
        setPreferredSize(new java.awt.Dimension(1350, 720));
        setLayout(new java.awt.BorderLayout());

        pnTeacherLeft.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnTeacherLeft.setMinimumSize(new java.awt.Dimension(1350, 100));
        pnTeacherLeft.setPreferredSize(new java.awt.Dimension(1350, 100));

        btncreatequestion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/website.png"))); // NOI18N
        btncreatequestion.setText("Create Question");
        btncreatequestion.setToolTipText("");
        btncreatequestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncreatequestionActionPerformed(evt);
            }
        });

        btncreateexam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/question 32 (1).png"))); // NOI18N
        btncreateexam.setText("CreateQuizList");
        btncreateexam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncreateexamActionPerformed(evt);
            }
        });

        btnQuiz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/if_Twitter_UI-21_2310213.png"))); // NOI18N
        btnQuiz.setText("Create Quiz Num");
        btnQuiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuizActionPerformed(evt);
            }
        });

        lbName.setText("jLabel1");

        lbDate.setText("jLabel2");

        lbTime.setText("jLabel3");

        javax.swing.GroupLayout pnTeacherLeftLayout = new javax.swing.GroupLayout(pnTeacherLeft);
        pnTeacherLeft.setLayout(pnTeacherLeftLayout);
        pnTeacherLeftLayout.setHorizontalGroup(
            pnTeacherLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTeacherLeftLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btncreatequestion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btncreateexam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(719, 719, 719)
                .addGroup(pnTeacherLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbName)
                    .addComponent(lbDate)
                    .addComponent(lbTime))
                .addGap(116, 116, 116))
        );
        pnTeacherLeftLayout.setVerticalGroup(
            pnTeacherLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTeacherLeftLayout.createSequentialGroup()
                .addGroup(pnTeacherLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnTeacherLeftLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pnTeacherLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btncreatequestion, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btncreateexam, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnTeacherLeftLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbDate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbTime)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        add(pnTeacherLeft, java.awt.BorderLayout.PAGE_START);

        pnTeacherBottom.setMinimumSize(new java.awt.Dimension(1350, 685));
        pnTeacherBottom.setPreferredSize(new java.awt.Dimension(1350, 685));

        javax.swing.GroupLayout pnTeacherBottomLayout = new javax.swing.GroupLayout(pnTeacherBottom);
        pnTeacherBottom.setLayout(pnTeacherBottomLayout);
        pnTeacherBottomLayout.setHorizontalGroup(
            pnTeacherBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1350, Short.MAX_VALUE)
        );
        pnTeacherBottomLayout.setVerticalGroup(
            pnTeacherBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 685, Short.MAX_VALUE)
        );

        add(pnTeacherBottom, java.awt.BorderLayout.LINE_END);
    }// </editor-fold>//GEN-END:initComponents
    public void CurrentTime() {
        Thread clock = new Thread() {
            @Override
            public void run() {
                for (;;) {
                    Calendar cal = new GregorianCalendar();
                    int year = cal.get(Calendar.YEAR);
                    int month = cal.get(Calendar.MONTH) + 1;
                    int day = cal.get(Calendar.DAY_OF_MONTH);
                    int hour = cal.get(Calendar.HOUR);
                    int minute = cal.get(Calendar.MINUTE);
                    int second = cal.get(Calendar.SECOND);
                    lbDate.setText(month + "/" + day + "/" + year);
                    String pm = Calendar.PM == 1 ? "PM" : "AM";
                    String str_S = String.valueOf(second);
                    String str_M = String.valueOf(minute);
                    if (second <= 9) {
                        str_S = '0' + str_S;
                    }
                    if (minute <= 9) {
                        str_M = '0' + str_M;
                    }
                    lbTime.setText(hour + ":" + str_M + ":" + str_S + " " + pm);

                }
            }
        };
        clock.start();
    }

    private void btncreatequestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncreatequestionActionPerformed
        question.setVisible(true);
        createtestquiz.setVisible(false);
        quizlist.setVisible(false);
    }//GEN-LAST:event_btncreatequestionActionPerformed

    private void btncreateexamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncreateexamActionPerformed
        // TODO add your handling code here:
        question.setVisible(false);
        createtestquiz.setVisible(true);
        quizlist.setVisible(false);

    }//GEN-LAST:event_btncreateexamActionPerformed

    private void btnQuizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuizActionPerformed
        question.setVisible(false);
        createtestquiz.setVisible(false);
        quizlist.setVisible(true);
    }//GEN-LAST:event_btnQuizActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQuiz;
    private javax.swing.JButton btncreateexam;
    private javax.swing.JButton btncreatequestion;
    private javax.swing.JLabel lbDate;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbTime;
    private javax.swing.JPanel pnTeacherBottom;
    private javax.swing.JPanel pnTeacherLeft;
    // End of variables declaration//GEN-END:variables
}

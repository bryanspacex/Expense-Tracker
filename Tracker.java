// main window for running the entire program.
package expensetracker;

/**
 *
 * @author teamSWBois
 */
public class ExpenseTracker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        welcomeUser wu = new welcomeUser();
        wu.setVisible(true);

        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(20);
                wu.loadvalue.setText(Integer.toString(i) + "%");

                Signup1 su = new Signup1();

                if (i == 10)
                    wu.loading.setText("Reaching modules...");
                if (i == 20)
                    wu.loading.setText("Opening modules...");
                if (i == 50)
                    wu.loading.setText("Connecting Database...");
                if (i == 70)
                    wu.loading.setText("Database connected...");
                if (i == 80)
                    wu.loading.setText("Opening Application");
                if (i == 100) {
                    wu.dispose();
                    su.show();
                }

                wu.loader.setValue(i);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// WELCOME PAGE.
package expensetracker;

/**
 *
 * @author Lenovo
 */
public class welcomeUser extends javax.swing.JFrame {

    /**
     * Creates new form welcomeUser
     */
    public welcomeUser() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the
     * form. WARNING: Do NOT modify this code. The content of this method is
     * always * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        loader = new javax.swing.JProgressBar();
        loading = new javax.swing.JLabel();
        loadvalue = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        
        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("WELCOME USER");
        
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Desktop\\PIC FOR PROJECT\\images.jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("EXPENSE TRACKING SYSTEM");
        
        loader.setBackground(new java.awt.Color(255, 0, 0));
        loader.setForeground(new java.awt.Color(255, 255, 255));
        
        loading.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        loading.setForeground(new java.awt.Color(255, 255, 51));
        loading.setText("Loading...");
        
        loadvalue.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        loadvalue.setForeground(new java.awt.Color(255, 255, 0));
        loadvalue.setText("0%");
        
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(209, 209, 209))
                .addComponent(loader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()

                                    .addComponent(loading,
                                    javax.swing.GroupLayout.PREFERRED_SIZE, 208,
                                    javax.swing.GroupLayout.PREFERRED_SIZE)
                                    
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                    javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                     .addComponent(loadvalue,
                                    javax.swing.GroupLayout.PREFERRED_SIZE, 37,
                                    javax.swing.GroupLayout.PREFERRED_SIZE))
                                     .addGroup(jPanel1Layout.createSequentialGroup()
                                    
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignme
                                    nt.LEADING)
                                     .addGroup(jPanel1Layout.createSequentialGroup()
                                     .addGap(190, 190, 190)
                                    .addComponent(jLabel1,
                                    javax.swing.GroupLayout.PREFERRED_SIZE, 320,
                                    javax.swing.GroupLayout.PREFERRED_SIZE))
                                     .addGroup(jPanel1Layout.createSequentialGroup()
                                     .addGap(238, 238, 238)
                                    .addComponent(jLabel2,
                                    javax.swing.GroupLayout.PREFERRED_SIZE, 215,
                                    javax.swing.GroupLayout.PREFERRED_SIZE)))
                                     .addGap(0, 174, Short.MAX_VALUE)))
                                     .addContainerGap())
                                     );
                            
                                     jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(loading)
                                            .addComponent(loadvalue))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(loader, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    )
                            );

                            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                            getContentPane().setLayout(layout);
                            layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap())
                            );
                            layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                            );

                            pack();
                            setLocationRelativeTo(null);
                            }// </editor-fold>
                            
                            /**
                             * @param args the command line arguments
                             */
                            public static void main(String args[]) {
                                /* Set the Nimbus look and feel */
                                //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
                                /* If Nimbus (introduced in Java SE 6) is not available, stay with
                                the default look and feel.
                                * For details see
                                http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
                                */
                                try {
                                    for (javax.swing.UIManager.LookAndFeelInfo info :
                                            javax.swing.UIManager.getInstalledLookAndFeels()) {
                                        if ("Nimbus".equals(info.getName())) {
                                            javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                            break;
                                        }
                                    }
                                } catch (ClassNotFoundException ex) {
                                    java.util.logging.Logger.getLogger(YourClassName.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                                } catch (InstantiationException ex) {
                                    java.util.logging.Logger.getLogger(YourClassName.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                                } catch (IllegalAccessException ex) {
                                    java.util.logging.Logger.getLogger(YourClassName.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                                    java.util.logging.Logger.getLogger(YourClassName.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                                }
                                //</editor-fold>
                            
                                /* Create and display the form */
                                java.awt.EventQueue.invokeLater(() -> {
                                    new YourClassName().setVisible(true);
                                });
                            }

                            // Variables declaration - do not modify
                            private javax.swing.JLabel jLabel1;
                            private javax.swing.JLabel jLabel2;
                            private javax.swing.JLabel jLabel3;
                            public javax.swing.JPanel jPanel1;
                            public javax.swing.JProgressBar loader;
                            public javax.swing.JLabel loading;
                            public javax.swing.JLabel loadvalue;
                            // End of variables declaration
}

// SIGNUP PAGE.
package expensetracker;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class Signup1 extends javax.swing.JFrame {

    /**
     * Creates new form Signup
     */
    public Signup1() {
        initComponents();
        connection();
    }

    Connection con;

    void connection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            // Add the rest of your code here
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtpass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        check = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
    
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN PAGE");
        setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
    
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LOGIN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("USERNAME");
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PASSWORD");

        jButton1.setText("SIGNIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        
        jButton2.setText("CLEAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        
        check.setText("show password");
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(57, 57, 57)
                            .addComponent(jButton2))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtname)
                                .addComponent(txtpass, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(43, 43, 43)
                            .addComponent(check)))
                    .addContainerGap(34, Short.MAX_VALUE))
       );
        jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(check)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("NEW USER?");
        jButton3.setBackground(new java.awt.Color(255, 255, 0));
        jButton3.setText("SIGNUP");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Desktop\\HE.jpg")); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Desktop\\HE.jpg")); // NOI18N
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());

        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(106, 106, 106)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel3))))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
        );

        layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2,
                              javax.swing.GroupLayout.PREFERRED_SIZE,
                              javax.swing.GroupLayout.DEFAULT_SIZE,
                              javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1,
                                      javax.swing.GroupLayout.PREFERRED_SIZE,
                                      javax.swing.GroupLayout.DEFAULT_SIZE,
                                      javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                         javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3,
                                      javax.swing.GroupLayout.PREFERRED_SIZE, 29,
                                      javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4,
                                          javax.swing.GroupLayout.PREFERRED_SIZE, 307,
                                          javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5,
                                          javax.swing.GroupLayout.PREFERRED_SIZE, 307,
                                          javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pack();

        setLocationRelativeTo(null);
    }// </editor-fold>
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        txtname.setText("");
        txtpass.setText("");
        txtname.requestFocus();
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        newUser nu = new newUser();
        nu.setVisible(true);
        hide();
        //new page goes here.
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        String user = txtname.getText();
        String pass = txtpass.getText();
        try {
            PreparedStatement pstmt = con.prepareStatement(
                "select username, password from login where username='" + user + "' and password='" + pass + "'"
            );
            ResultSet rs = pstmt.executeQuery();
            if (rs.next() == true) {
                JOptionPane.showMessageDialog(null, "LOGIN SUCCESSFUL!!");
    
                interfacePage ip = new interfacePage();
                ip.setVisible(true);
                hide();
            }


            private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
            // TODO add your handling code here:
            String user = txtname.getText();
            String pass = txtpass.getText();
            
            try {
                PreparedStatement pstmt = con.prepareStatement("select username, password from login where username='" + user + "' and password='" + pass + "'");
                ResultSet rs = pstmt.executeQuery();
                
                if (rs.next() == true) {
                    JOptionPane.showMessageDialog(null, "LOGIN SUCCESSFUL!!");
                    interfacePage ip = new interfacePage();
                    ip.setVisible(true);
                    hide();
                }
                else
                JOptionPane.showMessageDialog(null, "INCORRECT USERNAME OR PASSWORD");
            }catch(Exception d){
                d.printStackTrace();
            }
            }
            
            private void checkActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:
            
                if(check.isSelected())
                    txtpass.setEchoChar((char)0);
                else
                    txtpass.setEchoChar('*');
            }


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
                java.util.logging.Logger.getLogger(Signup1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(Signup1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(Signup1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(Signup1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }

            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup1().setVisible(true);
            }
        });
        
        // Variables declaration - do not modify
        private javax.swing.JCheckBox check;
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton2;
        private javax.swing.JButton jButton3;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JTextField txtname;
        private javax.swing.JPasswordField txtpass;
        // End of variables declaration

        }


            } 
            // Catch block for handling SQL exceptions should be added here
        }

        // NEW USER PAGE
        package expensetracker;
        
        import java.sql.*;
        import java.util.logging.Level;
        import java.util.logging.Logger;
        import javax.swing.JOptionPane;
        
        /**
         * @author Lenovo
         */
        public class newUser extends javax.swing.JFrame {
        
            /**
             * Creates new form newUser
             */
            public newUser() {
                initComponents();
                connection();
            }

            Connection con;

            void connection() {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/expensetracker", "root", "Bettiah@2347");
                } catch (Exception d) {
                    d.printStackTrace();
                }
            }

            /**
             * This method is called from within the constructor to initialize the form.
             * WARNING: Do NOT modify this code. The content of this method is always
             * regenerated by the Form Editor.
             */
            @SuppressWarnings("unchecked")
            // <editor-fold defaultstate="collapsed" desc="Generated Code">
            private void initComponents() {
                jPanel2 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jPanel1 = new javax.swing.JPanel();
                jLabel3 = new javax.swing.JLabel();
                jPanel3 = new javax.swing.JPanel();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                txtname = new javax.swing.JTextField();
                txtuser = new javax.swing.JTextField();
                jButton1 = new javax.swing.JButton();
                jButton2 = new javax.swing.JButton();
                check = new javax.swing.JCheckBox();
                txtpass = new javax.swing.JPasswordField();

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                    jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGap(0, 100, Short.MAX_VALUE)
                );
                jPanel2Layout.setVerticalGroup(
                    jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGap(0, 100, Short.MAX_VALUE)
                );

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                jLabel1.setText("NEW USER REGISTRATION");
                
                jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Desktop\\SIGNUP1.png")); // NOI18N
                jLabel2.setText("jLabel2");
                
                jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel3.setText("NAME");

                jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel4.setText("USERNAME");
                
                jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel5.setText("PASSWORD");
                
                jButton1.setText("ADD USER");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton1ActionPerformed(evt);
                    }
                });



            }


        
        }


  


    }
    
    }






    }
}


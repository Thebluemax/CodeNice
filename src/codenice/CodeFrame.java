/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codenice;

import java.awt.Color;
import javax.swing.JScrollPane;

/**
 *
 * @author max
 */
public class CodeFrame extends javax.swing.JFrame
{

    /**
     * Creates new form codeFrame
     */
    public CodeFrame()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        javaPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        javaIn = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        javaOut = new javax.swing.JTextArea();
        doIt = new javax.swing.JButton();
        pasteIt = new javax.swing.JButton();
        statusLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuConfig = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Code.nice();");
        setResizable(false);

        javaPanel.setBackground(new java.awt.Color(192, 192, 192));
        javaPanel.setForeground(new java.awt.Color(42, 42, 42));

        javaIn.setColumns(20);
        javaIn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        javaIn.setRows(5);
        javaIn.setBorder(javax.swing.BorderFactory.createTitledBorder("Paste your code, here."));
        jScrollPane1.setViewportView(javaIn);

        javaOut.setEditable(false);
        javaOut.setBackground(new java.awt.Color(166, 166, 166));
        javaOut.setColumns(20);
        javaOut.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        javaOut.setRows(5);
        javaOut.setBorder(javax.swing.BorderFactory.createTitledBorder("Your code"));
        javaOut.setFocusTraversalPolicyProvider(true);
        jScrollPane2.setViewportView(javaOut);

        javax.swing.GroupLayout javaPanelLayout = new javax.swing.GroupLayout(javaPanel);
        javaPanel.setLayout(javaPanelLayout);
        javaPanelLayout.setHorizontalGroup(
            javaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javaPanelLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        javaPanelLayout.setVerticalGroup(
            javaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(javaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        doIt.setBackground(new java.awt.Color(27, 140, 161));
        doIt.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        doIt.setText("do.it();");
        doIt.setToolTipText("");

        pasteIt.setBackground(new java.awt.Color(27, 240, 61));
        pasteIt.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        pasteIt.setText("paste.it();");
        pasteIt.setToolTipText("");
        pasteIt.setActionCommand("");
        pasteIt.setBorderPainted(false);

        statusLabel.setOpaque(true);

        menuConfig.setBackground(new java.awt.Color(55, 60, 55));
        menuConfig.setText("Configuration");
        menuConfig.setName(""); // NOI18N
        jMenuBar1.add(menuConfig);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pasteIt, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(doIt, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(statusLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(javaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(javaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doIt)
                    .addComponent(pasteIt)
                    .addComponent(statusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        // inicio la aplicacion
        
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
            java.util.logging.Logger.getLogger(CodeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CodeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CodeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CodeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            
            public void run()
            {
                CodeFrame view = new CodeFrame();
               
               view.setVisible(true);
        CodeModel model = new CodeModel();
        CodeNice controller = new CodeNice(view, model);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton doIt;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea javaIn;
    private javax.swing.JTextArea javaOut;
    private javax.swing.JPanel javaPanel;
    private javax.swing.JMenu menuConfig;
    private javax.swing.JButton pasteIt;
    private javax.swing.JLabel statusLabel;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the doIt
     */
    public javax.swing.JButton getDoIt()
    {
        return doIt;
    }

    /**
     * @return the javaIn
     */
    public javax.swing.JTextArea getJavaIn()
    {
        return javaIn;
    }

    /**
     * @return the javaOut
     */
    public javax.swing.JTextArea getJavaOut()
    {
        return javaOut;
    }

    /**
     * @return the pasteIt
     */
    public javax.swing.JButton getPasteIt()
    {
        return pasteIt;
    }
public void setStatus (String t) 
{
    Color color =new Color(60,200,60);
    System.out.println(color.getRed());
    statusLabel.setBackground(color);
    statusLabel.setText(t);
}

    /**
     * @return the jMenuBar1
     */
    public javax.swing.JMenuBar getjMenuBar1()
    {
        return jMenuBar1;
    }

    /**
     * @param jMenuBar1 the jMenuBar1 to set
     */
    public void setjMenuBar1(javax.swing.JMenuBar jMenuBar1)
    {
        this.jMenuBar1 = jMenuBar1;
    }

    /**
     * @return the menuConfig
     */
    public javax.swing.JMenu getMenuConfig()
    {
        return menuConfig;
    }
 
}

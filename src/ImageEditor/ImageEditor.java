/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ImageEditor;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author MofawsAdmin
 */
public class ImageEditor extends javax.swing.JFrame {

    private final JFileChooser openFileChooser;
    private BufferedImage OriginalBI;
    Picture OrigPic = new Picture("D:\\Users\\MofawsAdmin\\Pictures\\111.jpg");

    /**
     * Creates new form ImageEditor
     */
    public ImageEditor() {
        initComponents();
        openFileChooser = new JFileChooser();
        openFileChooser.setCurrentDirectory(new File("C:\\"));
        openFileChooser.setFileFilter(new FileNameExtensionFilter("PNG image", "png"));
        openFileChooser.setFileFilter(new FileNameExtensionFilter("JPEG image", "jpg"));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        frmOriginalPic = new javax.swing.JFrame();
        jDialog1 = new javax.swing.JDialog();
        jButton1 = new javax.swing.JButton();
        rotFrame = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        btnRotLeft = new javax.swing.JButton();
        btnRot180 = new javax.swing.JButton();
        btnRotRight = new javax.swing.JButton();
        refFrame = new javax.swing.JFrame();
        btnVerRef = new javax.swing.JButton();
        btnHorRef = new javax.swing.JButton();
        btnD1Ref = new javax.swing.JButton();
        btnD2Ref = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        pnlOriginalImage = new javax.swing.JPanel();
        lblOriImage = new javax.swing.JLabel();
        btnOpenPicture = new javax.swing.JButton();
        lblPicturePath = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtBlueColor = new javax.swing.JTextField();
        txtGreenColor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnApplyColors = new javax.swing.JButton();
        txtRedColor = new javax.swing.JTextField();
        btnClearColors = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuOpenFile = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        menuExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        sMnuRotate = new javax.swing.JMenuItem();
        sMnuReflect = new javax.swing.JMenuItem();
        sMnuScal = new javax.swing.JMenuItem();

        fileChooser.setCurrentDirectory(new java.io.File("D:\\Users\\MofawsAdmin\\VirtualBox VMs"));
        fileChooser.setDialogTitle("Open Dialog");

        javax.swing.GroupLayout frmOriginalPicLayout = new javax.swing.GroupLayout(frmOriginalPic.getContentPane());
        frmOriginalPic.getContentPane().setLayout(frmOriginalPicLayout);
        frmOriginalPicLayout.setHorizontalGroup(
            frmOriginalPicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1400, Short.MAX_VALUE)
        );
        frmOriginalPicLayout.setVerticalGroup(
            frmOriginalPicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
        );

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(jButton1)
                .addContainerGap(147, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jButton1)
                .addContainerGap(146, Short.MAX_VALUE))
        );

        rotFrame.setBackground(new java.awt.Color(0, 150, 0));
        rotFrame.setMaximumSize(new java.awt.Dimension(1500, 1500));
        rotFrame.setMinimumSize(new java.awt.Dimension(450, 300));

        jPanel3.setMaximumSize(new java.awt.Dimension(1500, 1500));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        btnRotLeft.setText("Rotate to Left");
        btnRotLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRotLeftActionPerformed(evt);
            }
        });
        jPanel3.add(btnRotLeft);

        btnRot180.setText("Rotate 180");
        btnRot180.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRot180ActionPerformed(evt);
            }
        });
        jPanel3.add(btnRot180);

        btnRotRight.setText("Rotate to Right");
        btnRotRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRotRightActionPerformed(evt);
            }
        });
        jPanel3.add(btnRotRight);

        javax.swing.GroupLayout rotFrameLayout = new javax.swing.GroupLayout(rotFrame.getContentPane());
        rotFrame.getContentPane().setLayout(rotFrameLayout);
        rotFrameLayout.setHorizontalGroup(
            rotFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(rotFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rotFrameLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        rotFrameLayout.setVerticalGroup(
            rotFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(rotFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(rotFrameLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        refFrame.setMinimumSize(new java.awt.Dimension(650, 300));
        refFrame.getContentPane().setLayout(new java.awt.GridLayout());

        btnVerRef.setText("Vertical Reflection");
        btnVerRef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerRefActionPerformed(evt);
            }
        });
        refFrame.getContentPane().add(btnVerRef);

        btnHorRef.setText("Horizontal Reflection");
        btnHorRef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHorRefActionPerformed(evt);
            }
        });
        refFrame.getContentPane().add(btnHorRef);

        btnD1Ref.setText("Diagonal Refleciton D1");
        btnD1Ref.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnD1RefActionPerformed(evt);
            }
        });
        refFrame.getContentPane().add(btnD1Ref);

        btnD2Ref.setText("Diagonal Reflection D2");
        btnD2Ref.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnD2RefActionPerformed(evt);
            }
        });
        refFrame.getContentPane().add(btnD2Ref);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("ImageEditor V1.0"));
        jPanel1.setPreferredSize(new java.awt.Dimension(1400, 1400));

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        pnlOriginalImage.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout pnlOriginalImageLayout = new javax.swing.GroupLayout(pnlOriginalImage);
        pnlOriginalImage.setLayout(pnlOriginalImageLayout);
        pnlOriginalImageLayout.setHorizontalGroup(
            pnlOriginalImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOriginalImageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblOriImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlOriginalImageLayout.setVerticalGroup(
            pnlOriginalImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblOriImage, javax.swing.GroupLayout.DEFAULT_SIZE, 1148, Short.MAX_VALUE)
        );

        btnOpenPicture.setText("Open Picture...");
        btnOpenPicture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenPictureActionPerformed(evt);
            }
        });

        lblPicturePath.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txtBlueColor.setMinimumSize(new java.awt.Dimension(60, 20));
        txtBlueColor.setPreferredSize(new java.awt.Dimension(60, 20));

        txtGreenColor.setText(" ");
        txtGreenColor.setMinimumSize(new java.awt.Dimension(60, 20));
        txtGreenColor.setPreferredSize(new java.awt.Dimension(60, 20));

        jLabel2.setText("Blue Color");

        jLabel1.setText("Red Color");

        jLabel3.setText("Green Color");

        btnApplyColors.setText("Apply Colors");
        btnApplyColors.setFocusable(false);
        btnApplyColors.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnApplyColors.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnApplyColors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApplyColorsActionPerformed(evt);
            }
        });

        txtRedColor.setMinimumSize(new java.awt.Dimension(60, 20));
        txtRedColor.setPreferredSize(new java.awt.Dimension(60, 20));
        txtRedColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRedColorActionPerformed(evt);
            }
        });

        btnClearColors.setText("Clear Fields");
        btnClearColors.setFocusable(false);
        btnClearColors.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnClearColors.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnClearColors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearColorsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(txtGreenColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addGap(27, 27, 27)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtBlueColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtRedColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnApplyColors)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClearColors)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtRedColor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBlueColor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtGreenColor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnApplyColors)
                    .addComponent(btnClearColors))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(521, 521, 521)
                .addComponent(btnExit))
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnOpenPicture)
                .addGap(18, 18, 18)
                .addComponent(lblPicturePath, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pnlOriginalImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pnlOriginalImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPicturePath, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOpenPicture, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(btnExit))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jMenu1.setText("File");

        menuOpenFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        menuOpenFile.setText("Open Image");
        menuOpenFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOpenFileActionPerformed(evt);
            }
        });
        jMenu1.add(menuOpenFile);

        jMenuItem2.setText("Save");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Save Ass...");
        jMenu1.add(jMenuItem3);

        menuExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        menuExit.setText("Exit");
        menuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExitActionPerformed(evt);
            }
        });
        jMenu1.add(menuExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        sMnuRotate.setText("Rotation ...");
        sMnuRotate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sMnuRotateActionPerformed(evt);
            }
        });
        jMenu2.add(sMnuRotate);

        sMnuReflect.setText("Reflection ...");
        sMnuReflect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sMnuReflectActionPerformed(evt);
            }
        });
        jMenu2.add(sMnuReflect);

        sMnuScal.setText("Scaling ...");
        jMenu2.add(sMnuScal);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1480, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1457, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnApplyColorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApplyColorsActionPerformed
        // TODO add your handling code here:
        int red, blue, green;

    }//GEN-LAST:event_btnApplyColorsActionPerformed

    private void txtRedColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRedColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRedColorActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnClearColorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearColorsActionPerformed
        // TODO add your handling code here:
        txtRedColor.setText(null);
        txtBlueColor.setText(null);
        txtGreenColor.setText(null);
    }//GEN-LAST:event_btnClearColorsActionPerformed

    private void menuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_menuExitActionPerformed

    private void menuOpenFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOpenFileActionPerformed

        //btnOpenPictureActionPerformed(evt);
        //p = new Picture(new FileChooser().pickAFile());
        //p.show();
        String filename = FileChooser.pickAFile();
        OrigPic = new Picture(filename);
        Picture f = OrigPic;
//        f.show();
//        System.out.println(f.getHeight());
//        System.out.println(lblOriImage.getHeight());
        double ratio = (double) lblOriImage.getHeight() / (double) f.getHeight();
//        System.out.println(ratio);
        if (f.getHeight() > lblOriImage.getHeight()) {
            f = f.scale(ratio, ratio);
            if (f.getWidth() > lblOriImage.getWidth()) {
                ratio = (double) lblOriImage.getWidth() / (double) f.getWidth();
                f = f.scale(ratio, ratio);
            }
            //f.show();
        }
        Icon a = new ImageIcon(f.getImage());

        lblOriImage.setIcon(a);
        lblPicturePath.setText(f.getFileName());


    }//GEN-LAST:event_menuOpenFileActionPerformed

    private void btnOpenPictureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenPictureActionPerformed
        // TODO add your handling code here:

        int returnValue = openFileChooser.showOpenDialog(this);
        Image dimg;
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            try {
                OriginalBI = ImageIO.read(openFileChooser.getSelectedFile());
        //        p.getBufferedImage();

                if (OriginalBI.getWidth() > lblOriImage.getWidth() || OriginalBI.getHeight() > lblOriImage.getHeight()) {
                    dimg = OriginalBI.getScaledInstance(lblOriImage.getWidth(), lblOriImage.getHeight(), OriginalBI.SCALE_SMOOTH);
                } else {
                    dimg = OriginalBI;
                }
                // OriginalBI.getScaledInstance(lblOriImage.getWidth(), lblOriImage.getHeight(), OriginalBI.SCALE_SMOOTH);
                Icon b = new ImageIcon(dimg);
                lblOriImage.setIcon(b);
                lblPicturePath.setText("Image Path: " + openFileChooser.getSelectedFile().getPath());

            } catch (IOException ioe) {
                lblPicturePath.setText("something went wrong!!~");
            }
        } else {
            lblPicturePath.setText("no file chosen!!");
        }
    }//GEN-LAST:event_btnOpenPictureActionPerformed

    private void sMnuRotateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sMnuRotateActionPerformed
        // TODO add your handling code here:
        rotFrame.show();
//        rotFrame.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_sMnuRotateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnRotLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRotLeftActionPerformed
        Picture rot = new Picture(OrigPic.rotateLeft());
        double ratio = (double) lblOriImage.getHeight() / (double) rot.getHeight();
        if (rot.getHeight() > lblOriImage.getHeight()) {
            rot = rot.scale(ratio, ratio);
            if (rot.getWidth() > lblOriImage.getWidth()) {
                ratio = (double) lblOriImage.getWidth() / (double) rot.getWidth();
                rot = rot.scale(ratio, ratio);
            }
        }
        Icon a = new ImageIcon(rot.getImage());
        lblOriImage.setIcon(a);
        lblPicturePath.setText(rot.getFileName());
    }//GEN-LAST:event_btnRotLeftActionPerformed

    private void btnRotRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRotRightActionPerformed
        Picture rot = new Picture(OrigPic.rotateRight());
        double ratio = (double) lblOriImage.getHeight() / (double) rot.getHeight();
        if (rot.getHeight() > lblOriImage.getHeight()) {
            rot = rot.scale(ratio, ratio);
            if (rot.getWidth() > lblOriImage.getWidth()) {
                ratio = (double) lblOriImage.getWidth() / (double) rot.getWidth();
                rot = rot.scale(ratio, ratio);
            }
        }
        Icon a = new ImageIcon(rot.getImage());
        lblOriImage.setIcon(a);
        lblPicturePath.setText(rot.getFileName());
    }//GEN-LAST:event_btnRotRightActionPerformed

    private void btnRot180ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRot180ActionPerformed
        Picture rot = new Picture(OrigPic);
        rot.rotate180();
        double ratio = (double) lblOriImage.getHeight() / (double) rot.getHeight();
        if (rot.getHeight() > lblOriImage.getHeight()) {
            rot = rot.scale(ratio, ratio);
            if (rot.getWidth() > lblOriImage.getWidth()) {
                ratio = (double) lblOriImage.getWidth() / (double) rot.getWidth();
                rot = rot.scale(ratio, ratio);
            }
        }
        Icon a = new ImageIcon(rot.getImage());
        lblOriImage.setIcon(a);
        lblPicturePath.setText(rot.getFileName());
    }//GEN-LAST:event_btnRot180ActionPerformed

    private void sMnuReflectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sMnuReflectActionPerformed
        // TODO add your handling code here:
        refFrame.show();

    }//GEN-LAST:event_sMnuReflectActionPerformed

    private void btnVerRefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerRefActionPerformed
        Picture rot = new Picture(OrigPic);
        rot.mirrorVertical();
        double ratio = (double) lblOriImage.getHeight() / (double) rot.getHeight();
        if (rot.getHeight() > lblOriImage.getHeight()) {
            rot = rot.scale(ratio, ratio);
            if (rot.getWidth() > lblOriImage.getWidth()) {
                ratio = (double) lblOriImage.getWidth() / (double) rot.getWidth();
                rot = rot.scale(ratio, ratio);
            }
        }
        Icon a = new ImageIcon(rot.getImage());
        lblOriImage.setIcon(a);
        lblPicturePath.setText(rot.getFileName());
    }//GEN-LAST:event_btnVerRefActionPerformed

    private void btnHorRefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHorRefActionPerformed
        Picture rot = new Picture(OrigPic);
        rot.mirrorHorizontal();
        double ratio = (double) lblOriImage.getHeight() / (double) rot.getHeight();
        if (rot.getHeight() > lblOriImage.getHeight()) {
            rot = rot.scale(ratio, ratio);
            if (rot.getWidth() > lblOriImage.getWidth()) {
                ratio = (double) lblOriImage.getWidth() / (double) rot.getWidth();
                rot = rot.scale(ratio, ratio);
            }
        }
        Icon a = new ImageIcon(rot.getImage());
        lblOriImage.setIcon(a);
     }//GEN-LAST:event_btnHorRefActionPerformed

    private void btnD1RefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnD1RefActionPerformed
        Picture rot = new Picture(OrigPic);
        rot.mirrorDiagTopLeftBotRight();
        double ratio=(double)lblOriImage.getHeight()/(double)rot.getHeight();
        if (rot.getHeight()>lblOriImage.getHeight()){
            rot=rot.scale(ratio,ratio);
            if(rot.getWidth()>lblOriImage.getWidth()){
                ratio=(double)lblOriImage.getWidth()/(double)rot.getWidth();
                rot=rot.scale(ratio, ratio);
            }
        }
        Icon a = new ImageIcon(rot.getImage());
        lblOriImage.setIcon(a);
        
    }//GEN-LAST:event_btnD1RefActionPerformed

    private void btnD2RefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnD2RefActionPerformed
       Picture rot = new Picture(OrigPic);
        rot.mirrorDiagTopRightBotLeft();
        double ratio=(double)lblOriImage.getHeight()/(double)rot.getHeight();
        if (rot.getHeight()>lblOriImage.getHeight()){
            rot=rot.scale(ratio,ratio);
            if(rot.getWidth()>lblOriImage.getWidth()){
                ratio=(double)lblOriImage.getWidth()/(double)rot.getWidth();
                rot=rot.scale(ratio, ratio);
            }
        }
        Icon a = new ImageIcon(rot.getImage());
        lblOriImage.setIcon(a);
        
    }//GEN-LAST:event_btnD2RefActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ImageEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImageEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImageEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImageEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ImageEditor().setVisible(true);
                System.out.println("see these changes");
                System.out.println("  ");
               

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApplyColors;
    private javax.swing.JButton btnClearColors;
    private javax.swing.JButton btnD1Ref;
    private javax.swing.JButton btnD2Ref;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnHorRef;
    private javax.swing.JButton btnOpenPicture;
    private javax.swing.JButton btnRot180;
    private javax.swing.JButton btnRotLeft;
    private javax.swing.JButton btnRotRight;
    private javax.swing.JButton btnVerRef;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JFrame frmOriginalPic;
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblOriImage;
    private javax.swing.JLabel lblPicturePath;
    private javax.swing.JMenuItem menuExit;
    private javax.swing.JMenuItem menuOpenFile;
    private javax.swing.JPanel pnlOriginalImage;
    private javax.swing.JFrame refFrame;
    private javax.swing.JFrame rotFrame;
    private javax.swing.JMenuItem sMnuReflect;
    private javax.swing.JMenuItem sMnuRotate;
    private javax.swing.JMenuItem sMnuScal;
    private javax.swing.JTextField txtBlueColor;
    private javax.swing.JTextField txtGreenColor;
    private javax.swing.JTextField txtRedColor;
    // End of variables declaration//GEN-END:variables
}

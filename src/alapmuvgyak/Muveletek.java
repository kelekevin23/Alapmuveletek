package alapmuvgyak;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Muveletek extends javax.swing.JFrame {

    String mentettFajl;
    int szam1 = 0;
    int szam2 = 0;
    int vegeredmeny = 0;
    int osszKerdes = 0;
    int osszProba = 0;

    int osszeadasKerdes = 0;
    int osszeadasProba = 0;

    int kivonasKerdes = 0;
    int kivonasProba = 0;

    int osztasKerdes = 0;
    int osztasProba = 0;

    int szorzasKerdes = 0;
    int szorzasProba = 0;

    int muveletSzama = 0;
    int osszHelyes = 0;

    /**
     * Creates new form Muveletek
     */
    public Muveletek() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnlGyakorlas = new javax.swing.JPanel();
        lblFeladat = new javax.swing.JLabel();
        txtEredmeny = new javax.swing.JTextField();
        btnEllenorzes = new javax.swing.JButton();
        lblValasz = new javax.swing.JLabel();
        btnUj = new javax.swing.JButton();
        btnMegoldas = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblOsszKerdes = new javax.swing.JLabel();
        lblOsszProba = new javax.swing.JLabel();
        lblEredmeny = new javax.swing.JLabel();
        lblOsszeadKerdes = new javax.swing.JLabel();
        lblKivonasKerdes = new javax.swing.JLabel();
        lblOsztasKerdes = new javax.swing.JLabel();
        lblSzorzasKerdes = new javax.swing.JLabel();
        lblOsszeadProba = new javax.swing.JLabel();
        lblKivonasProba = new javax.swing.JLabel();
        lblOsztasProba = new javax.swing.JLabel();
        lblSzorzasProba = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuFajl = new javax.swing.JMenu();
        mnuFajlMegnyit = new javax.swing.JMenuItem();
        mnuFajlMent = new javax.swing.JMenuItem();
        mnuFajlMentMaskent = new javax.swing.JMenuItem();
        mnuFajlSep1 = new javax.swing.JPopupMenu.Separator();
        mnuFajlKilep = new javax.swing.JMenuItem();
        mnuMuvelet = new javax.swing.JMenu();
        mnuMuveletOsszeadas = new javax.swing.JRadioButtonMenuItem();
        mnuMuveletKivonas = new javax.swing.JRadioButtonMenuItem();
        mnuMuveletOsztas = new javax.swing.JRadioButtonMenuItem();
        mnuMuveletSzorzas = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alapműveletek gyakoroltatása");

        pnlGyakorlas.setBorder(javax.swing.BorderFactory.createTitledBorder("Gyakorlás"));

        lblFeladat.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        btnEllenorzes.setText("Ellenőrzés");
        btnEllenorzes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEllenorzesActionPerformed(evt);
            }
        });

        lblValasz.setText("visszajelzés");

        javax.swing.GroupLayout pnlGyakorlasLayout = new javax.swing.GroupLayout(pnlGyakorlas);
        pnlGyakorlas.setLayout(pnlGyakorlasLayout);
        pnlGyakorlasLayout.setHorizontalGroup(
            pnlGyakorlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGyakorlasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlGyakorlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlGyakorlasLayout.createSequentialGroup()
                        .addComponent(lblFeladat, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEredmeny, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEllenorzes)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlGyakorlasLayout.createSequentialGroup()
                        .addComponent(lblValasz, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );
        pnlGyakorlasLayout.setVerticalGroup(
            pnlGyakorlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGyakorlasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlGyakorlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFeladat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlGyakorlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEredmeny, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEllenorzes)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblValasz, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnUj.setText("Új feladat");
        btnUj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUjActionPerformed(evt);
            }
        });

        btnMegoldas.setText("Megoldás");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Statisztika"));

        lblOsszKerdes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOsszKerdes.setText("Össz kérdések száma: 0");

        lblOsszProba.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOsszProba.setText("Össz Probálkozások száma: 0");

        lblEredmeny.setText("Eredmény: 0 %");
        lblEredmeny.setPreferredSize(new java.awt.Dimension(100, 14));

        lblOsszeadKerdes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOsszeadKerdes.setText("Összeadás: 0");

        lblKivonasKerdes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblKivonasKerdes.setText("Kivonás: 0");

        lblOsztasKerdes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOsztasKerdes.setText("Osztás: 0");

        lblSzorzasKerdes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSzorzasKerdes.setText("Szorzás: 0");

        lblOsszeadProba.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOsszeadProba.setText("Összeadás: 0");

        lblKivonasProba.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblKivonasProba.setText("Kivonás: 0");

        lblOsztasProba.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOsztasProba.setText("Osztás: 0");

        lblSzorzasProba.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSzorzasProba.setText("Szorzás: 0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOsszeadKerdes, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblKivonasKerdes, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblOsztasKerdes, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSzorzasKerdes, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(lblOsszKerdes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblKivonasProba, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSzorzasProba, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblOsszeadProba, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblOsztasProba, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblOsszProba, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEredmeny, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblKivonasKerdes, lblOsszeadKerdes, lblOsztasKerdes, lblSzorzasKerdes});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOsszKerdes)
                    .addComponent(lblOsszProba))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblOsszeadKerdes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblKivonasKerdes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblOsztasKerdes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSzorzasKerdes))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblOsszeadProba)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblKivonasProba)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblOsztasProba)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSzorzasProba)))
                .addGap(18, 18, 18)
                .addComponent(lblEredmeny, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mnuFajl.setText("Fájl");

        mnuFajlMegnyit.setText("Megnyit");
        mnuFajlMegnyit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFajlMegnyitActionPerformed(evt);
            }
        });
        mnuFajl.add(mnuFajlMegnyit);

        mnuFajlMent.setText("Ment");
        mnuFajlMent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFajlMentActionPerformed(evt);
            }
        });
        mnuFajl.add(mnuFajlMent);

        mnuFajlMentMaskent.setText("Mentés másként...");
        mnuFajlMentMaskent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFajlMentMaskentActionPerformed(evt);
            }
        });
        mnuFajl.add(mnuFajlMentMaskent);
        mnuFajl.add(mnuFajlSep1);

        mnuFajlKilep.setText("Kilép");
        mnuFajl.add(mnuFajlKilep);

        jMenuBar1.add(mnuFajl);

        mnuMuvelet.setText("Műveletek");

        buttonGroup1.add(mnuMuveletOsszeadas);
        mnuMuveletOsszeadas.setText("Összeadás");
        mnuMuveletOsszeadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMuveletOsszeadasActionPerformed(evt);
            }
        });
        mnuMuvelet.add(mnuMuveletOsszeadas);

        buttonGroup1.add(mnuMuveletKivonas);
        mnuMuveletKivonas.setText("Kivonás");
        mnuMuveletKivonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMuveletKivonasActionPerformed(evt);
            }
        });
        mnuMuvelet.add(mnuMuveletKivonas);

        buttonGroup1.add(mnuMuveletOsztas);
        mnuMuveletOsztas.setText("Osztás");
        mnuMuveletOsztas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMuveletOsztasActionPerformed(evt);
            }
        });
        mnuMuvelet.add(mnuMuveletOsztas);

        buttonGroup1.add(mnuMuveletSzorzas);
        mnuMuveletSzorzas.setText("Szorzás");
        mnuMuveletSzorzas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMuveletSzorzasActionPerformed(evt);
            }
        });
        mnuMuvelet.add(mnuMuveletSzorzas);

        jMenuBar1.add(mnuMuvelet);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlGyakorlas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUj, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnMegoldas, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnUj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMegoldas))
                    .addComponent(pnlGyakorlas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnuFajlMentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFajlMentActionPerformed

//        JFileChooser fc = new JFileChooser();
//        fc.setDialogTitle("Mentés!");
//        fc.setCurrentDirectory(new File("."));
//        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
//
//        int kivalaszt = fc.showSaveDialog(this);
//
//        if (kivalaszt == JFileChooser.APPROVE_OPTION) {
//            File f = fc.getSelectedFile();
//            if (f.isDirectory()) {
//                lblEredmeny.setText("<html>Elérés: " + f.getPath() + "<br>Könyvtár: " + f.getName() + "</html>");
//                try {
//                    Files.write(Paths.get(f.getPath(), "stat.txt"), tartalomOsszeallitas().getBytes());
//                } catch (IOException ex) {
//                    Logger.getLogger(Muveletek.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        }
        if (mentettFajl == null) {
            /* az első mentés során a mentés másként metódus kell */
            mnuFajlMentMaskentActionPerformed(evt);

        } else {
            try {
                /* további mentések */
                Files.write(Paths.get(mentettFajl), tartalomOsszeallitas().getBytes());
            } catch (IOException ex) {
                Logger.getLogger(Muveletek.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }//GEN-LAST:event_mnuFajlMentActionPerformed

    private void mnuFajlMentMaskentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFajlMentMaskentActionPerformed
        JFileChooser fc = new JFileChooser(new File("."));
        fc.setDialogTitle("Mentés másként!");
        fc.setAcceptAllFileFilterUsed(false);

        FileNameExtensionFilter imgFilter = new FileNameExtensionFilter("PNG és GIF képek", "png", "gif");
        fc.addChoosableFileFilter(imgFilter);

        FileNameExtensionFilter txtFilter = new FileNameExtensionFilter("csak szöveg (*.txt)", "txt");
        fc.addChoosableFileFilter(txtFilter);

        FileNameExtensionFilter kkFilter = new FileNameExtensionFilter("speciális (*.kk)", "kk");
        fc.addChoosableFileFilter(kkFilter);

        fc.setFileFilter(txtFilter);
        int kivalaszt = fc.showSaveDialog(this);

        if (kivalaszt == JFileChooser.APPROVE_OPTION) {
            File f = fc.getSelectedFile();

            String[] kiterjesztes = ((FileNameExtensionFilter) fc.getFileFilter()).getExtensions();
            String fn = f.getName(); //+ "." +kiterjesztes[0];

            /* kiterjezstés van e*/
            if (!fn.endsWith("." + kiterjesztes[0])) {
                fn += "." + kiterjesztes[0];
            }
            /* kiterjezstés van e VÉGE*/

            mentettFajl = fn;
            Path path = Paths.get(fn);
            boolean mentes = true;
            /* létezik e*/
            if (Files.exists(path)) {
                kivalaszt = JOptionPane.showConfirmDialog(this, "Felülírjam", "A fájl létezik", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if (kivalaszt == JOptionPane.NO_OPTION) {
                    mentes = false;

                }
            }

            /* létezik e VÉGE*/
//            lblEredmeny.setText("<html>Elérés: " + f.getPath() + "<br>Fájl neve: " + fn + "</html>");
            try {
                /* tényleges kiiratás */
                if (mentes) {
                    Files.write(path, tartalomOsszeallitas().getBytes());
                }
                /* tényleges kiiratás VÉGE*/
            } catch (IOException ex) {
                Logger.getLogger(Muveletek.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Mentés megszakítva", "Nincs mentés", JOptionPane.INFORMATION_MESSAGE);
        }

//        File mentes = fileChooser.getSelectedFile();          
//        String eleresiUt = mentes.getAbsolutePath()+ ".txt"; 
//        Files.write(Paths.get(eleresiUt), kiirat.getBytes());

        /* tesztesetek

    - kiterjesztés megváltoztatása
    - olyan kiterjesztés írása, ami nincs a listában
    - üresen marad a fájl neve
    - másik mappa kiválasztása

    - kiterjesztéssel választom a meglevő fájlt, és szintén mögé rakja a kiterjesztést
    - ha létezik, kérdés nélkül felülírja
         */
    }//GEN-LAST:event_mnuFajlMentMaskentActionPerformed

    private void mnuFajlMegnyitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFajlMegnyitActionPerformed
        JFileChooser fc = new JFileChooser(new File("."));
        fc.setDialogTitle("Megnyitás!");

        FileNameExtensionFilter imgFilter = new FileNameExtensionFilter("PNG és GIF képek", "png", "gif");
        fc.addChoosableFileFilter(imgFilter);

        FileNameExtensionFilter txtFilter = new FileNameExtensionFilter("csak szöveg (*.txt)", "txt");
        fc.addChoosableFileFilter(txtFilter);

        FileNameExtensionFilter kkFilter = new FileNameExtensionFilter("speciális (*.kk)", "kk");
        fc.addChoosableFileFilter(kkFilter);

        fc.setFileFilter(txtFilter);

        int valasztas = fc.showOpenDialog(this);
        if (valasztas == JFileChooser.APPROVE_OPTION) {
            File f = fc.getSelectedFile();
            String fn = f.getPath();
//            lblEredmeny.setText("<html>Elérés: " + fn + "<br>Könyvtár: " + f.getName() + "</html>");
            /* tényleges megnyitás */
        } else {
            JOptionPane.showMessageDialog(this, "Megnyitás megszakítva", "Nincs megnyitás", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_mnuFajlMegnyitActionPerformed

    private void mnuMuveletOsszeadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMuveletOsszeadasActionPerformed
        osszeadas();
    }//GEN-LAST:event_mnuMuveletOsszeadasActionPerformed

    private void mnuMuveletKivonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMuveletKivonasActionPerformed
        kivonas();
    }//GEN-LAST:event_mnuMuveletKivonasActionPerformed

    private void mnuMuveletOsztasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMuveletOsztasActionPerformed
        osztas();
    }//GEN-LAST:event_mnuMuveletOsztasActionPerformed

    private void mnuMuveletSzorzasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMuveletSzorzasActionPerformed
        szorzas();
    }//GEN-LAST:event_mnuMuveletSzorzasActionPerformed

    private void btnUjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUjActionPerformed

        if (muveletSzama == 1) {
            osszeadas();
        } else if (muveletSzama == 2) {
            kivonas();
        } else if (muveletSzama == 3) {
            osztas();
        } else if (muveletSzama == 4) {
            szorzas();
        } else {
            lblValasz.setText("Nem választottál műveletet");
        }
    }//GEN-LAST:event_btnUjActionPerformed

    private void btnEllenorzesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEllenorzesActionPerformed

        if (lblFeladat.getText() == "") {
            lblValasz.setText("Nem választottál műveletet!");
        } else {

            if (muveletSzama == 1) {
                try {

                    vegeredmeny = Integer.valueOf(txtEredmeny.getText());
                    if (szam1 + szam2 == vegeredmeny) {
                        lblValasz.setText("A megoldásod helyes!");
                        btnEllenorzes.setEnabled(false);
                        osszProba++;
                        osszeadasProba++;
                        osszHelyes++;
                    } else {
                        lblValasz.setText("A megoldásod rossz!");
                        osszProba++;
                        osszeadasProba++;

                    }
                } catch (Exception e) {
                    lblValasz.setText("Számot adj meg!");
                }
            } else if (muveletSzama == 2) {
                try {
                    vegeredmeny = Integer.valueOf(txtEredmeny.getText());
                    if (szam1 - szam2 == vegeredmeny) {
                        lblValasz.setText("A megoldásod helyes!");
                        btnEllenorzes.setEnabled(false);
                        osszProba++;
                        kivonasProba++;
                        osszHelyes++;
                    } else {
                        lblValasz.setText("A megoldásod rossz!");
                        osszProba++;
                        kivonasProba++;

                    }
                } catch (Exception e) {
                    lblValasz.setText("Számot adj meg!");
                }
            } else if (muveletSzama == 3) {
                try {
                    vegeredmeny = Integer.valueOf(txtEredmeny.getText());
                    if (szam1 / szam2 == vegeredmeny) {
                        lblValasz.setText("A megoldásod helyes!");
                        btnEllenorzes.setEnabled(false);
                        osszProba++;
                        osztasProba++;
                        osszHelyes++;
                    } else {
                        lblValasz.setText("A megoldásod rossz!");
                        osszProba++;
                        osztasProba++;

                    }
                } catch (Exception e) {
                    lblValasz.setText("Számot adj meg!");

                }
            } else {
                try {
                    vegeredmeny = Integer.valueOf(txtEredmeny.getText());
                    if (szam1 * szam2 == vegeredmeny) {
                        lblValasz.setText("A megoldásod helyes!");
                        btnEllenorzes.setEnabled(false);
                        osszProba++;
                        szorzasProba++;
                        osszHelyes++;
                    } else {
                        lblValasz.setText("A megoldásod rossz!");
                        osszProba++;
                        szorzasProba++;

                    }
                } catch (Exception e) {
                    lblValasz.setText("Számot adj meg!");
                }
            }
        }
        kiiratasok();
        if (osszHelyes > 0) {
            float eredmenyed = (float) osszHelyes / osszKerdes * 100;
//        lblEredmeny.setText("Eredmény: " + eredmenyed + " %");
            lblEredmeny.setText(String.format("Eredmény: %.2f%s", eredmenyed, "%"));
        }
    }//GEN-LAST:event_btnEllenorzesActionPerformed

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
            java.util.logging.Logger.getLogger(Muveletek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Muveletek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Muveletek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Muveletek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Muveletek().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEllenorzes;
    private javax.swing.JButton btnMegoldas;
    private javax.swing.JButton btnUj;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblEredmeny;
    private javax.swing.JLabel lblFeladat;
    private javax.swing.JLabel lblKivonasKerdes;
    private javax.swing.JLabel lblKivonasProba;
    private javax.swing.JLabel lblOsszKerdes;
    private javax.swing.JLabel lblOsszProba;
    private javax.swing.JLabel lblOsszeadKerdes;
    private javax.swing.JLabel lblOsszeadProba;
    private javax.swing.JLabel lblOsztasKerdes;
    private javax.swing.JLabel lblOsztasProba;
    private javax.swing.JLabel lblSzorzasKerdes;
    private javax.swing.JLabel lblSzorzasProba;
    private javax.swing.JLabel lblValasz;
    private javax.swing.JMenu mnuFajl;
    private javax.swing.JMenuItem mnuFajlKilep;
    private javax.swing.JMenuItem mnuFajlMegnyit;
    private javax.swing.JMenuItem mnuFajlMent;
    private javax.swing.JMenuItem mnuFajlMentMaskent;
    private javax.swing.JPopupMenu.Separator mnuFajlSep1;
    private javax.swing.JMenu mnuMuvelet;
    private javax.swing.JRadioButtonMenuItem mnuMuveletKivonas;
    private javax.swing.JRadioButtonMenuItem mnuMuveletOsszeadas;
    private javax.swing.JRadioButtonMenuItem mnuMuveletOsztas;
    private javax.swing.JRadioButtonMenuItem mnuMuveletSzorzas;
    private javax.swing.JPanel pnlGyakorlas;
    private javax.swing.JTextField txtEredmeny;
    // End of variables declaration//GEN-END:variables

    private String tartalomOsszeallitas() {
        String statisztika = "Alampműveletek gyakoroltatása statisztika: \n";
        JLabel[] lblTomb = new JLabel[]{lblOsszKerdes, lblOsszProba, lblOsszeadKerdes, lblOsszeadProba, lblKivonasKerdes, lblKivonasProba, lblOsztasKerdes, lblOsztasProba, lblSzorzasKerdes, lblSzorzasProba};

        final int HE = 3;
        final int kerdesMaxHossz = lblOsszKerdes.getText().length();
        final int probaMaxHossz = lblOsszProba.getText().length();
        for (int i = 0; i < lblTomb.length - 1; i += 2) {
            JLabel labKerdes = lblTomb[i];
            JLabel labProba = lblTomb[i + 1];

            String formazo = "%" + (kerdesMaxHossz + HE) + "s%" + (probaMaxHossz + HE) + "s\n";
            statisztika += String.format(formazo, labKerdes.getText(), labProba.getText());
//            statisztika += labKerdes.getText() + "\t";
//            statisztika += labProba.getText() + "\n";
        }

        return statisztika;
    }

    public void szamGeneralas(int szorzo) {
        szam1 = (int) (Math.random() * szorzo) + 1;
        szam2 = (int) (Math.random() * szorzo) + 1;
    }

    private void osszeadas() {
        muveletSzama = 1;
        osszKerdes++;
        osszeadasKerdes++;
        btnEllenorzes.setEnabled(true);
        kiiratasok();

        szamGeneralas(100);
        while (szam1 + szam2 > 100) {
            szamGeneralas(100);
        }
        lblFeladat.setText(szam1 + "+" + szam2 + "=");
    }

    private void kivonas() {
        muveletSzama = 2;
        osszKerdes++;
        kivonasKerdes++;
        btnEllenorzes.setEnabled(true);
        kiiratasok();

        szamGeneralas(100);
        while (szam2 > szam1) {
            szamGeneralas(100);
        }
        lblFeladat.setText(szam1 + "-" + szam2 + "=");
    }

    private void osztas() {
        muveletSzama = 3;
        osszKerdes++;
        osztasKerdes++;
        btnEllenorzes.setEnabled(true);
        kiiratasok();

        szamGeneralas(100);
        while (szam1 % szam2 != 0) {
            szamGeneralas(100);
        }
        lblFeladat.setText(szam1 + "/" + szam2 + "=");
    }

    private void szorzas() {
        muveletSzama = 4;
        osszKerdes++;
        szorzasKerdes++;
        btnEllenorzes.setEnabled(true);
        kiiratasok();

        szamGeneralas(100);
        while (szam1 * szam2 > 100) {
            szamGeneralas(100);
        }
        lblFeladat.setText(szam1 + "*" + szam2 + "=");
    }

    private void kiiratasok() {
        lblOsszKerdes.setText("Kérdések száma: " + osszKerdes);
        lblOsszProba.setText("Probálkozások száma: " + osszProba);

        lblOsszeadKerdes.setText("Összeadás: " + osszeadasKerdes);
        lblOsszeadProba.setText("Összeadás: " + osszeadasProba);

        lblKivonasKerdes.setText("Kivonás: " + kivonasKerdes);
        lblKivonasProba.setText("Kivonás: " + kivonasProba);

        lblOsztasKerdes.setText("Osztás: " + osztasKerdes);
        lblOsztasProba.setText("Osztás: " + osztasProba);

        lblSzorzasKerdes.setText("Szorzás: " + szorzasKerdes);
        lblSzorzasProba.setText("Szorzás: " + szorzasProba);

        txtEredmeny.setText("");
        lblValasz.setText("visszajelzés");
    }
}

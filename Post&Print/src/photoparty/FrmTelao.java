package photoparty;

import classes.Photo;
import classes.Webservice;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.awt.image.ImagingOpException;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import org.imgscalr.Scalr;

public class FrmTelao extends javax.swing.JFrame {

    private final ArrayList<Photo> listaPhotos;
    private final Webservice ws;

    public String hashtag = "";
    public String dirFotosTelao = "";
    public String pathLogoEvento = "";
    public Timer timerPhotos;
    private final boolean iniciou = false;
    private int current_image = 0;

    public FrmTelao() {
        initComponents();
        ws = new Webservice();
        listaPhotos = new ArrayList<>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel = new javax.swing.JPanel();
        lblPhoto = new javax.swing.JLabel();
        lblFotoUsuario = new javax.swing.JLabel();
        lblNomeUser = new javax.swing.JLabel();
        lblDescription = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblLogoEvento = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        painel.setBackground(new java.awt.Color(0, 0, 0));

        lblPhoto.setBackground(new java.awt.Color(0, 0, 0));
        lblPhoto.setOpaque(true);

        lblFotoUsuario.setBackground(new java.awt.Color(0, 0, 0));
        lblFotoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblFotoUsuario.setOpaque(true);

        lblNomeUser.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblNomeUser.setForeground(new java.awt.Color(255, 255, 255));

        lblDescription.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblDescription.setForeground(new java.awt.Color(255, 255, 255));
        lblDescription.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblDescription.setMaximumSize(new java.awt.Dimension(0, 420));
        lblDescription.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/post_print.jpg"))); // NOI18N

        lblLogoEvento.setBackground(new java.awt.Color(0, 0, 0));
        lblLogoEvento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogoEvento.setOpaque(true);

        org.jdesktop.layout.GroupLayout painelLayout = new org.jdesktop.layout.GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(
            painelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(painelLayout.createSequentialGroup()
                .addContainerGap()
                .add(painelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(painelLayout.createSequentialGroup()
                        .add(lblFotoUsuario, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 150, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(lblNomeUser)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jLabel2))
                    .add(painelLayout.createSequentialGroup()
                        .add(painelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(painelLayout.createSequentialGroup()
                                .add(lblDescription, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, painelLayout.createSequentialGroup()
                                .add(0, 222, Short.MAX_VALUE)
                                .add(lblLogoEvento, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 315, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(220, 220, 220)))
                        .add(lblPhoto, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 612, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(39, 39, 39))
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(painelLayout.createSequentialGroup()
                .addContainerGap()
                .add(painelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(painelLayout.createSequentialGroup()
                        .add(jLabel2)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(lblPhoto, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 612, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(0, 0, Short.MAX_VALUE))
                    .add(painelLayout.createSequentialGroup()
                        .add(painelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(lblFotoUsuario, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 150, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, painelLayout.createSequentialGroup()
                                .add(lblNomeUser)
                                .add(58, 58, 58)))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(lblDescription, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 420, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(lblLogoEvento, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 150, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(painel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(painel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
      
    }//GEN-LAST:event_formWindowOpened

    class RemindTask extends TimerTask {

        @Override
        public void run() {
            File dir = new File(dirFotosTelao + hashtag + "/");
            if (dir.isDirectory()) {
                File arquivos[] = dir.listFiles();
                if (current_image >= arquivos.length) {
                    current_image = 0;
                }
                if (arquivos.length > 0) {
                    if (arquivos[current_image].getName().indexOf(".jpg") > 0 || arquivos[current_image].getName().indexOf(".JPG") > 0) {
                        ImageIcon image;
                        ImageIcon imageUser;
                        Photo photo = new Photo();
                        String[] info;
                        try {
                            info = arquivos[current_image].getName().split("-");
                            if (info[1].equals("") == false) {
                                photo = ws.getInfoPhoto(info[1].replace(".jpg", ""));
                                if (photo.foto_usuario.equals("") == false) {
                                    imageUser = new ImageIcon(new URL(photo.foto_usuario));
                                } else {
                                    imageUser = null;
                                }

                                image = new ImageIcon(arquivos[current_image].getAbsolutePath());

                                lblDescription.setText("<html>" + photo.description + "</html>");
                                lblNomeUser.setText(photo.nome_usuario);
                                lblFotoUsuario.setIcon(imageUser);
                                lblPhoto.setIcon(image);
                            }

                        } catch (MalformedURLException e) {
                            Logger.getLogger(FrmTelao.class.getName()).log(Level.SEVERE, null, e);
                        } catch (Exception ex) {
                            Logger.getLogger(FrmTelao.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    current_image++;
                }
            }
        }
    }

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed


    }//GEN-LAST:event_formWindowClosed

    public void initTimer() {
        if (timerPhotos == null) {
             lblDescription.setText("");
            lblNomeUser.setText("");
            lblFotoUsuario.setIcon(null);
            lblPhoto.setIcon(null);
            timerPhotos = new Timer();
            timerPhotos.schedule(new RemindTask(), 0, 10000);//10 segundos
            lblLogoEvento.setIcon(null);
            lblLogoEvento.setText("");
            try {
                int empresa_width = 315;
                int empresa_height = 150;

                //ImageIcon image = new ImageIcon(pathLogoEvento);
                BufferedImage empresa_logo = ImageIO.read(new File(pathLogoEvento));
                empresa_logo = Scalr.resize(empresa_logo, empresa_width, empresa_height, Scalr.OP_ANTIALIAS);
                lblLogoEvento.setPreferredSize(new Dimension(empresa_width, empresa_height));
                lblLogoEvento.setSize(empresa_width, empresa_height);
                lblLogoEvento.setIcon(new ImageIcon(empresa_logo));
                lblLogoEvento.setText(pathLogoEvento);
                
            } catch (ImagingOpException | IOException | IllegalArgumentException e) {
                Logger.getLogger(FrmTelao.class.getName()).log(Level.SEVERE, null, e); 
            }

        }
    }

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       
    }//GEN-LAST:event_formWindowActivated

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmTelao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FrmTelao().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblFotoUsuario;
    private javax.swing.JLabel lblLogoEvento;
    private javax.swing.JLabel lblNomeUser;
    private javax.swing.JLabel lblPhoto;
    public javax.swing.JPanel painel;
    // End of variables declaration//GEN-END:variables

    //public javax.swing.JPanel jPanel2;
}

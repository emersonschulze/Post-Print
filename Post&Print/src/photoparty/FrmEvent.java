package photoparty;

import classes.Event;
import classes.Photo;
import classes.Webservice;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.json.JSONArray;
import org.json.JSONException;

public class FrmEvent extends javax.swing.JDialog {

    public String id_event;
    private JSONArray listaTemplates;
    private Event evento;
    private Photo photo;
    private String id_template;
    private String logo_event;
    private boolean loaded = false;
    private boolean updateEvent = false;

    public FrmEvent(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        btnSalvar.setEnabled(false);
        btnAtualizar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtData = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        pnlImpressao = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cmbTemplate = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        btnImportMarca = new javax.swing.JButton();
        btnImportMarca1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtQtdeFotos = new javax.swing.JTextField();
        lbLogo = new javax.swing.JTextField();
        chkPrint = new javax.swing.JCheckBox();
        chkTelao = new javax.swing.JCheckBox();
        chkAutomatic = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        txtHashTag = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnDisponibilidade = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        lblTexto1 = new javax.swing.JLabel();
        lblTexto2 = new javax.swing.JLabel();
        lblNomeUsuario = new javax.swing.JLabel();
        lblImageFoto = new javax.swing.JLabel();
        lblFotoUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Evento");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Nome do Evento");

        txtNome.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtNomeCaretUpdate(evt);
            }
        });
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        txtNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNomeFocusLost(evt);
            }
        });

        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel2.setText("Data:");

        pnlImpressao.setBorder(javax.swing.BorderFactory.createTitledBorder("Configuração da Impressão"));

        jLabel4.setText("Template:");

        cmbTemplate.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbTemplateItemStateChanged(evt);
            }
        });
        cmbTemplate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTemplateActionPerformed(evt);
            }
        });

        jLabel6.setText("Logo do Evento:");

        btnImportMarca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/addLogo.png"))); // NOI18N
        btnImportMarca.setText("Importar Logo");
        btnImportMarca.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnImportMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportMarcaActionPerformed(evt);
            }
        });

        btnImportMarca1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/reImage.png"))); // NOI18N
        btnImportMarca1.setText("Remover Logo");
        btnImportMarca1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnImportMarca1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportMarca1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Qtde de Fotos:");

        lbLogo.setEnabled(false);

        chkPrint.setText("Impressão de Fotos");

        chkTelao.setText("Fotos no Telão");

        chkAutomatic.setText("Impressão automática");
        chkAutomatic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAutomaticActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout pnlImpressaoLayout = new org.jdesktop.layout.GroupLayout(pnlImpressao);
        pnlImpressao.setLayout(pnlImpressaoLayout);
        pnlImpressaoLayout.setHorizontalGroup(
            pnlImpressaoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlImpressaoLayout.createSequentialGroup()
                .add(pnlImpressaoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(pnlImpressaoLayout.createSequentialGroup()
                        .add(4, 4, 4)
                        .add(chkPrint)
                        .add(19, 19, 19)
                        .add(chkTelao)
                        .add(13, 13, 13)
                        .add(chkAutomatic))
                    .add(pnlImpressaoLayout.createSequentialGroup()
                        .add(12, 12, 12)
                        .add(jLabel4)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(cmbTemplate, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 336, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(pnlImpressaoLayout.createSequentialGroup()
                        .add(11, 11, 11)
                        .add(jLabel8)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(txtQtdeFotos, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(pnlImpressaoLayout.createSequentialGroup()
                        .addContainerGap()
                        .add(pnlImpressaoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(pnlImpressaoLayout.createSequentialGroup()
                                .add(btnImportMarca, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 152, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(btnImportMarca1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 148, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(pnlImpressaoLayout.createSequentialGroup()
                                .add(jLabel6)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(lbLogo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 307, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                .add(14, 14, 14))
        );
        pnlImpressaoLayout.setVerticalGroup(
            pnlImpressaoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlImpressaoLayout.createSequentialGroup()
                .add(24, 24, 24)
                .add(pnlImpressaoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(chkPrint)
                    .add(chkTelao)
                    .add(chkAutomatic))
                .add(27, 27, 27)
                .add(pnlImpressaoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(cmbTemplate, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel4))
                .add(10, 10, 10)
                .add(pnlImpressaoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lbLogo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel6))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(pnlImpressaoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btnImportMarca)
                    .add(btnImportMarca1))
                .add(11, 11, 11)
                .add(pnlImpressaoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(txtQtdeFotos, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel8)))
        );

        jLabel3.setText("HASHTAG:");

        txtHashTag.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        txtHashTag.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtHashTagFocusLost(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/cancel.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/ok.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel7.setText("#");

        btnDisponibilidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/search.png"))); // NOI18N
        btnDisponibilidade.setText("Disponibilidade");
        btnDisponibilidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisponibilidadeActionPerformed(evt);
            }
        });

        btnAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/update.png"))); // NOI18N
        btnAtualizar.setText("Atualizar Preview");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(pnlImpressao, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jLabel7)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(txtHashTag, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 275, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(jLabel1)
                                .add(txtNome, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 292, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(jLabel2)
                            .add(txtData)
                            .add(btnDisponibilidade, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jLabel3)
                        .add(0, 0, Short.MAX_VALUE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(btnAtualizar)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(btnCancelar, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(btnSalvar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 135, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(16, 16, 16)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jLabel1)
                        .add(1, 1, 1)
                        .add(txtNome, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jLabel2)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(txtData, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jLabel3)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(txtHashTag)
                            .add(jLabel7)))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(3, 3, 3)
                        .add(btnDisponibilidade, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(pnlImpressao, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btnSalvar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 58, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(btnCancelar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 58, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(btnAtualizar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 54, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(11, 11, 11))
        );

        jLabel5.setText("Preview");

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N

        jLayeredPane1.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane1.setOpaque(true);

        lblTexto1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTexto1.setText("POST&PRINT");
        lblTexto1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblTexto1.setMaximumSize(new java.awt.Dimension(78, 60));
        jLayeredPane1.add(lblTexto1);
        lblTexto1.setBounds(220, 10, 70, 14);

        lblTexto2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblTexto2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTexto2.setText("Nome do Evento");
        lblTexto2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblTexto2.setMaximumSize(new java.awt.Dimension(44, 80));
        lblTexto2.setMinimumSize(new java.awt.Dimension(123, 16));
        jLayeredPane1.add(lblTexto2);
        lblTexto2.setBounds(10, 20, 133, 50);

        lblNomeUsuario.setText("@nomedousuario");
        lblNomeUsuario.setMaximumSize(new java.awt.Dimension(109, 60));
        jLayeredPane1.add(lblNomeUsuario);
        lblNomeUsuario.setBounds(50, 370, 210, 14);

        //lblImageFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/exemplo.jpg"))); // NOI18N
        lblImageFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/example.jpg"))); // NOI18N
        jLayeredPane1.add(lblImageFoto);
        lblImageFoto.setBounds(15, 74, 279, 279);

        lblFotoUsuario.setBackground(new java.awt.Color(0, 0, 0));
        lblFotoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/avatar.png"))); // NOI18N
        lblFotoUsuario.setMaximumSize(new java.awt.Dimension(55, 55));
        lblFotoUsuario.setMinimumSize(new java.awt.Dimension(20, 20));
        lblFotoUsuario.setOpaque(true);
        jLayeredPane1.add(lblFotoUsuario);
        lblFotoUsuario.setBounds(15, 360, 30, 30);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel9)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jLabel5)
                        .add(139, 139, 139))
                    .add(layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLayeredPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 310, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel9)
                    .add(layout.createSequentialGroup()
                        .add(jLabel5)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLayeredPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 403, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        loaded = false;
        if (photo == null) {
            photo = new Photo();
            evento = new Event();

            listaTemplates = evento.listTemplate();
            if (listaTemplates != null) {
                int tot = listaTemplates.getJSONObject(0).getJSONArray("result").length();
                for (int i = 0; i < tot; i++) {
                    cmbTemplate.addItem(listaTemplates.getJSONObject(0).getJSONArray("result").getJSONObject(i).get("name"));
                }
            }

            if (id_event != null) {
                if (evento.loadEvent(id_event)) {

                    this.updateEvent = true;

                    txtNome.setText(evento.getName());
                    txtHashTag.setText(evento.getHashtag());
                    txtData.setText(evento.getDt_event());
                    if (evento.getHave_print().equals("S")) {
                        chkPrint.setSelected(true);
                    }
                    if (evento.getHave_screen().equals("S")) {
                        chkTelao.setSelected(true);
                    }
                    if (evento.getAutomatic().equals("S")) {
                        chkAutomatic.setSelected(true);
                    }
                    txtQtdeFotos.setText(evento.getQtde_fotos());

                    this.id_template = evento.getId_print_template();
                    this.logo_event = evento.getLogo_event();
                    this.lbLogo.setText(logo_event);

                    int tot = cmbTemplate.getItemCount();
                    for (int i = 0; i < tot; i++) {

                        if (this.id_template.equals(listaTemplates.getJSONObject(0).getJSONArray("result").getJSONObject(i).get("id_print_template"))) {
                            try {
                                cmbTemplate.setSelectedItem(listaTemplates.getJSONObject(0).getJSONArray("result").getJSONObject(i).get("name"));
                                updatePreview();
                                break;
                            } catch (JSONException ex) {
                                JOptionPane.showMessageDialog(null, "Problema ao abrir frame. Error: " + ex.getMessage());
                                Logger.getLogger(FrmEvent.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Não foi possível carregar o evento de código: " + id_event);
                    this.dispose();
                }
            }
        }
        loaded = true;
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        id_event = null;
        updateEvent = false;
    }//GEN-LAST:event_formWindowClosed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (chkAutomatic.isSelected()) {
            evento.setAutomatic("S");
        } else {
            evento.setAutomatic("N");
        }

        if (chkPrint.isSelected()) {
            evento.setHave_print("S");
        } else {
            evento.setHave_print("N");
        }

        if (chkTelao.isSelected()) {
            evento.setHave_screen("S");
        } else {
            evento.setHave_screen("N");
        }

        evento.setId_print_template(this.id_template);
        evento.setLogo_event(this.logo_event);
        evento.setDt_event(txtData.getText());
        evento.setHashtag(txtHashTag.getText());
        evento.setName(txtNome.getText());
        evento.setQtde_fotos(txtQtdeFotos.getText());

        String response;
        if (updateEvent) {
            response = evento.update();
        } else {
            response = evento.insert();
        }

        if (response.equals("OK")) {
            JOptionPane.showMessageDialog(null, "Evento salvo com sucesso!");
            this.dispose();
            return;
        }

        JOptionPane.showMessageDialog(null, "ERRO: " + response);
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtHashTagFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHashTagFocusLost


    }//GEN-LAST:event_txtHashTagFocusLost

    private void txtNomeCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtNomeCaretUpdate
      
    }//GEN-LAST:event_txtNomeCaretUpdate

    private void btnImportMarca1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportMarca1ActionPerformed
        this.logo_event = "";
        lbLogo.setText("");
        updatePreview();
    }//GEN-LAST:event_btnImportMarca1ActionPerformed

    private void btnImportMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportMarcaActionPerformed
        int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try {
                ImageIcon image = new ImageIcon(ImageIO.read(file));
                logo_event = file.getAbsolutePath();
                lbLogo.setText(logo_event);
                updatePreview();

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao importar "+ logo_event + ex );
            }
        } else {
           JOptionPane.showConfirmDialog(null, "Ação cancelada pelo usuário");
        }
    }//GEN-LAST:event_btnImportMarcaActionPerformed

    private void chkAutomaticActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAutomaticActionPerformed
      
    }//GEN-LAST:event_chkAutomaticActionPerformed

    private void cmbTemplateItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbTemplateItemStateChanged
      

    }//GEN-LAST:event_cmbTemplateItemStateChanged

    private void txtNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeFocusLost
       
        lblTexto2.setText(txtNome.getText());
        updatePreview();
    }//GEN-LAST:event_txtNomeFocusLost

    private void btnDisponibilidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisponibilidadeActionPerformed
        Webservice ws = new Webservice();
        if (ws.existHashTag(txtHashTag.getText())) {
            JOptionPane.showMessageDialog(null, "ATENÇÃO! Já existe fotos utilizando esta hashtag");
        } else {
            JOptionPane.showMessageDialog(null, "OK! hashtag disponível");
             btnAtualizar.setEnabled(true);
        }
    }//GEN-LAST:event_btnDisponibilidadeActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        if (loaded == true) {

            int tot = listaTemplates.getJSONObject(0).getJSONArray("result").length();
            for (int i = 0; i < tot; i++) {
                if (cmbTemplate.getSelectedItem().toString().equals(listaTemplates.getJSONObject(0).getJSONArray("result").getJSONObject(i).get("name"))) {
                    try {
                        this.id_template = listaTemplates.getJSONObject(0).getJSONArray("result").getJSONObject(i).get("id_print_template").toString();
                        updatePreview();
                        btnSalvar.setEnabled(true);
                        break;
                    } catch (JSONException ex) {
                        JOptionPane.showMessageDialog(null, "Problema ao atualizar preview. Error: " + ex.getMessage());
                        Logger.getLogger(FrmEvent.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }

    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        
    }//GEN-LAST:event_txtNomeActionPerformed

    private void cmbTemplateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTemplateActionPerformed
      
    }//GEN-LAST:event_cmbTemplateActionPerformed

    private void updatePreview() {
        photo.nome_evento = txtNome.getText();
        photo.image_evento = this.logo_event;
        photo.updatePreview(this.id_template, lblImageFoto, lblTexto1, lblTexto2, lblNomeUsuario, lblFotoUsuario);
    }

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
            java.util.logging.Logger.getLogger(FrmEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            FrmEvent dialog = new FrmEvent(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDisponibilidade;
    private javax.swing.JButton btnImportMarca;
    private javax.swing.JButton btnImportMarca1;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JCheckBox chkAutomatic;
    private javax.swing.JCheckBox chkPrint;
    private javax.swing.JCheckBox chkTelao;
    private javax.swing.JComboBox cmbTemplate;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lbLogo;
    private javax.swing.JLabel lblFotoUsuario;
    private javax.swing.JLabel lblImageFoto;
    private javax.swing.JLabel lblNomeUsuario;
    private javax.swing.JLabel lblTexto1;
    private javax.swing.JLabel lblTexto2;
    private javax.swing.JPanel pnlImpressao;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtHashTag;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtQtdeFotos;
    // End of variables declaration//GEN-END:variables
}

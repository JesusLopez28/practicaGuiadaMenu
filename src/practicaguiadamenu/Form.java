/*
López Rosales Jesús Alejandro
22110104       3°O        POE
*/

package practicaguiadamenu;

public class Form extends javax.swing.JFrame {

    public Usuario[] arrayUsuarios = new Usuario[15];

    ListaEnlazada datos = new ListaEnlazada();
    Pila datosP = new Pila();
    Cola datosC = new Cola();

    public Form() {
        initComponents();
        int i;
        for (i = 0; i < 15; i++) {
            arrayUsuarios[i] = new Usuario();
        }
        lbEstatus.setText("Usuario:" + arrayUsuarios[0].getUser());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbEstatus = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();
        btnMostrarLista = new javax.swing.JButton();
        btnMostrarPila = new javax.swing.JButton();
        btnMostrarCola = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        menuEstructura = new javax.swing.JMenu();
        itemPila = new javax.swing.JMenuItem();
        itemLista = new javax.swing.JMenuItem();
        itemCola = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        itemImprimir = new javax.swing.JMenuItem();
        menuEdicion = new javax.swing.JMenu();
        itemOpcion1 = new javax.swing.JCheckBoxMenuItem();
        itemOpcion2 = new javax.swing.JCheckBoxMenuItem();
        itemOpcion3 = new javax.swing.JCheckBoxMenuItem();
        menuFormato = new javax.swing.JMenu();
        itemOpcionA = new javax.swing.JRadioButtonMenuItem();
        itemOpcionB = new javax.swing.JRadioButtonMenuItem();
        itemOpcionC = new javax.swing.JRadioButtonMenuItem();
        menuLista = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbEstatus.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        lbEstatus.setText("Estatus: Inicio");

        txtResultado.setColumns(20);
        txtResultado.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        btnMostrarLista.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        btnMostrarLista.setText("Mostrar Lista");
        btnMostrarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarListaActionPerformed(evt);
            }
        });

        btnMostrarPila.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        btnMostrarPila.setText("Mostrar Pila");
        btnMostrarPila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarPilaActionPerformed(evt);
            }
        });

        btnMostrarCola.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        btnMostrarCola.setText("Mostrar Cola");
        btnMostrarCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarColaActionPerformed(evt);
            }
        });

        menuBar.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N

        menuEstructura.setText("Estructura");

        itemPila.setText("Pila");
        itemPila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPilaActionPerformed(evt);
            }
        });
        menuEstructura.add(itemPila);

        itemLista.setText("Lista");
        itemLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemListaActionPerformed(evt);
            }
        });
        menuEstructura.add(itemLista);

        itemCola.setText("Cola");
        itemCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemColaActionPerformed(evt);
            }
        });
        menuEstructura.add(itemCola);
        menuEstructura.add(jSeparator1);

        itemImprimir.setText("Imprimir");
        menuEstructura.add(itemImprimir);

        menuBar.add(menuEstructura);

        menuEdicion.setText("Edición");

        itemOpcion1.setSelected(true);
        itemOpcion1.setText("Opción1");
        menuEdicion.add(itemOpcion1);

        itemOpcion2.setSelected(true);
        itemOpcion2.setText("Opción2");
        menuEdicion.add(itemOpcion2);

        itemOpcion3.setSelected(true);
        itemOpcion3.setText("Opción3");
        menuEdicion.add(itemOpcion3);

        menuBar.add(menuEdicion);

        menuFormato.setText("Formato");

        itemOpcionA.setSelected(true);
        itemOpcionA.setText("Opción-A");
        menuFormato.add(itemOpcionA);

        itemOpcionB.setSelected(true);
        itemOpcionB.setText("Opción-B");
        menuFormato.add(itemOpcionB);

        itemOpcionC.setSelected(true);
        itemOpcionC.setText("Opción-C");
        menuFormato.add(itemOpcionC);

        menuBar.add(menuFormato);

        menuLista.setText("Lista");
        menuLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuListaMouseClicked(evt);
            }
        });
        menuBar.add(menuLista);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnMostrarLista)
                        .addGap(18, 18, 18)
                        .addComponent(btnMostrarPila, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnMostrarCola))
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbEstatus)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbEstatus)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMostrarCola)
                    .addComponent(btnMostrarLista)
                    .addComponent(btnMostrarPila))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarListaActionPerformed
        // TODO add your handling code here:
        Nodo aux = datos.lista;
        if (datos.lista == null) {
            txtResultado.setText("La lista está vacía");
        } else {
            txtResultado.setText("Números en la lista: \n");
            while (aux != null) {
                txtResultado.append("Valor: " + aux.getValor() + "\n");
                aux = aux.getNodoSiguiente();
            }
        }
    }//GEN-LAST:event_btnMostrarListaActionPerformed

    private void itemListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemListaActionPerformed
        // TODO add your handling code here:
        lbEstatus.setText("Estatus: Lista");
        FormLista lista = new FormLista(this, datos);
        this.setVisible(false);
        lista.setVisible(true);
        lista.setLocationRelativeTo(null);
    }//GEN-LAST:event_itemListaActionPerformed

    private void btnMostrarPilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarPilaActionPerformed
        // TODO add your handling code here:
        Nodo aux = datosP.pila;
        if (datosP.pila == null) {
            txtResultado.setText("La pila está vacía");
        } else {
            txtResultado.setText("Números en la Pila: \n");
            while (aux != null) {
                txtResultado.append("Valor: " + aux.getValor() + "\n");
                aux = aux.getNodoSiguiente();
            }
        }
    }//GEN-LAST:event_btnMostrarPilaActionPerformed

    private void itemPilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPilaActionPerformed
        // TODO add your handling code here:
        lbEstatus.setText("Estatus: Pila");
        FormPila pila = new FormPila(this, datosP);
        this.setVisible(false);
        pila.setVisible(true);
        pila.setLocationRelativeTo(null);
    }//GEN-LAST:event_itemPilaActionPerformed

    private void btnMostrarColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarColaActionPerformed
        // TODO add your handling code here:
        Nodo aux = datosC.cola;
        if (datosC.cola == null) {
            txtResultado.setText("La cola está vacía");
        } else {
            txtResultado.setText("Números en la cola: \n");
            while (aux != null) {
                txtResultado.append("Valor: " + aux.getValor() + "\n");
                aux = aux.getNodoSiguiente();
            }
        }
    }//GEN-LAST:event_btnMostrarColaActionPerformed

    private void itemColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemColaActionPerformed
        // TODO add your handling code here:
        lbEstatus.setText("Estatus: Cola");
        FormCola cola = new FormCola(this, datosC);
        this.setVisible(false);
        cola.setVisible(true);
        cola.setLocationRelativeTo(null);
    }//GEN-LAST:event_itemColaActionPerformed

    private void menuListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuListaMouseClicked
        // TODO add your handling code here:
        lbEstatus.setText("Estatus: Lista");
        FormLista lista = new FormLista(this, datos);
        this.setVisible(false);
        lista.setVisible(true);
        lista.setLocationRelativeTo(null);
    }//GEN-LAST:event_menuListaMouseClicked

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
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMostrarCola;
    private javax.swing.JButton btnMostrarLista;
    private javax.swing.JButton btnMostrarPila;
    private javax.swing.JMenuItem itemCola;
    private javax.swing.JMenuItem itemImprimir;
    private javax.swing.JMenuItem itemLista;
    private javax.swing.JCheckBoxMenuItem itemOpcion1;
    private javax.swing.JCheckBoxMenuItem itemOpcion2;
    private javax.swing.JCheckBoxMenuItem itemOpcion3;
    private javax.swing.JRadioButtonMenuItem itemOpcionA;
    private javax.swing.JRadioButtonMenuItem itemOpcionB;
    private javax.swing.JRadioButtonMenuItem itemOpcionC;
    private javax.swing.JMenuItem itemPila;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    public static javax.swing.JLabel lbEstatus;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuEdicion;
    private javax.swing.JMenu menuEstructura;
    private javax.swing.JMenu menuFormato;
    private javax.swing.JMenu menuLista;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}


import javax.swing.JOptionPane;


public class FrmMenu extends javax.swing.JFrame {
    
   private Pila pila = new Pila();
   private Cola cola = new Cola();
   
    public FrmMenu() {
        initComponents();
        setLocationRelativeTo(null);   
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        PILA = new javax.swing.JMenu();
        AGREGAR = new javax.swing.JMenuItem();
        IMPRIMIRPILA = new javax.swing.JMenuItem();
        ELIMINARPILA = new javax.swing.JMenuItem();
        COLA = new javax.swing.JMenu();
        AGREGARCOLA = new javax.swing.JMenuItem();
        IMPRIMIRCOLA = new javax.swing.JMenuItem();
        ELIMINARCOLA = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 389, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(153, 204, 255));

        PILA.setBackground(new java.awt.Color(255, 255, 204));
        PILA.setText("PILA");

        AGREGAR.setText("AGREGAR");
        AGREGAR.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AGREGARFocusGained(evt);
            }
        });
        AGREGAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AGREGARActionPerformed(evt);
            }
        });
        PILA.add(AGREGAR);

        IMPRIMIRPILA.setText("IMPRIMIR CONTENIDO");
        IMPRIMIRPILA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IMPRIMIRPILAActionPerformed(evt);
            }
        });
        PILA.add(IMPRIMIRPILA);

        ELIMINARPILA.setText("ELIMINAR");
        ELIMINARPILA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ELIMINARPILAActionPerformed(evt);
            }
        });
        PILA.add(ELIMINARPILA);

        jMenuBar1.add(PILA);

        COLA.setBackground(new java.awt.Color(204, 255, 204));
        COLA.setText("COLA");

        AGREGARCOLA.setText("AGREGAR");
        AGREGARCOLA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AGREGARCOLAActionPerformed(evt);
            }
        });
        COLA.add(AGREGARCOLA);

        IMPRIMIRCOLA.setText("IMPRIMIR CONTENIDO");
        IMPRIMIRCOLA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IMPRIMIRCOLAActionPerformed(evt);
            }
        });
        COLA.add(IMPRIMIRCOLA);

        ELIMINARCOLA.setText("ELIMINAR");
        ELIMINARCOLA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ELIMINARCOLAActionPerformed(evt);
            }
        });
        COLA.add(ELIMINARCOLA);

        jMenuBar1.add(COLA);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AGREGARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AGREGARActionPerformed
    String datos;
    int dato;
    datos = JOptionPane.showInputDialog("INGRESE UN NUMERO");
    dato = Integer.parseInt(datos);
    pila.push(dato);
    }//GEN-LAST:event_AGREGARActionPerformed

    private void IMPRIMIRPILAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IMPRIMIRPILAActionPerformed
    pila.recorrerPila();
    }//GEN-LAST:event_IMPRIMIRPILAActionPerformed

    private void ELIMINARPILAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ELIMINARPILAActionPerformed
    pila.pop();
    }//GEN-LAST:event_ELIMINARPILAActionPerformed

    private void AGREGARCOLAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AGREGARCOLAActionPerformed
    String datos;
    int dato;
    datos = JOptionPane.showInputDialog("INGRESE UN NUMERO");
    dato = Integer.parseInt(datos);
    cola.encolar(dato);
    }//GEN-LAST:event_AGREGARCOLAActionPerformed

    private void IMPRIMIRCOLAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IMPRIMIRCOLAActionPerformed
    cola.recorrerCola();
    }//GEN-LAST:event_IMPRIMIRCOLAActionPerformed

    private void ELIMINARCOLAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ELIMINARCOLAActionPerformed
    cola.desencolar();
    }//GEN-LAST:event_ELIMINARCOLAActionPerformed

    private void AGREGARFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AGREGARFocusGained
   
    }//GEN-LAST:event_AGREGARFocusGained
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AGREGAR;
    private javax.swing.JMenuItem AGREGARCOLA;
    private javax.swing.JMenu COLA;
    private javax.swing.JMenuItem ELIMINARCOLA;
    private javax.swing.JMenuItem ELIMINARPILA;
    private javax.swing.JMenuItem IMPRIMIRCOLA;
    private javax.swing.JMenuItem IMPRIMIRPILA;
    private javax.swing.JMenu PILA;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

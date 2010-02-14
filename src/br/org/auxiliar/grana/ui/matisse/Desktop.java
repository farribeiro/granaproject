/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Desktop.java
 *
 * Created on Feb 13, 2010, 11:26:56 PM
 */

package br.org.auxiliar.grana.ui.matisse;

/**
 *
 * @author fabio
 */
public class Desktop extends javax.swing.JFrame {

    /** Creates new form Desktop */
    public Desktop() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    barraFerramenta = new javax.swing.JToolBar();
    btnEventos = new javax.swing.JButton();
    jDesktopPane1 = new javax.swing.JDesktopPane();
    menu = new javax.swing.JMenuBar();
    mnuArquivo = new javax.swing.JMenu();
    iSair = new javax.swing.JMenuItem();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    barraFerramenta.setRollover(true);

    btnEventos.setMnemonic('e');
    btnEventos.setText("Eventos");
    btnEventos.setFocusable(false);
    btnEventos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    btnEventos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    btnEventos.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnEventosActionPerformed(evt);
      }
    });
    barraFerramenta.add(btnEventos);

    mnuArquivo.setMnemonic('a');
    mnuArquivo.setText("Arquivo");

    iSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
    iSair.setMnemonic('r');
    iSair.setText("Sair");
    iSair.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        onClose(evt);
      }
    });
    mnuArquivo.add(iSair);

    menu.add(mnuArquivo);

    setJMenuBar(menu);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(barraFerramenta, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
      .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(barraFerramenta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

    private void onClose(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onClose
      System.exit(0);
    }//GEN-LAST:event_onClose

    private void btnEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEventosActionPerformed
      evento = new AdicionarEventos();
      jDesktopPane1.add(evento);
      evento.setVisible(true);
    }//GEN-LAST:event_btnEventosActionPerformed
    private AdicionarEventos evento;
    /**
    * @param args the command line arguments
    */

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JToolBar barraFerramenta;
  private javax.swing.JButton btnEventos;
  private javax.swing.JMenuItem iSair;
  private javax.swing.JDesktopPane jDesktopPane1;
  private javax.swing.JMenuBar menu;
  private javax.swing.JMenu mnuArquivo;
  // End of variables declaration//GEN-END:variables

}

package motogp;

import entities.Clasificacion;
import entities.Pilotos;
import java.awt.Frame;
import java.text.NumberFormat;

/**
 *
 * @author usuario
 */
public class PanelPilotos extends javax.swing.JPanel {

    Pilotos piloto;
    Clasificacion clasificacion;

    public Pilotos getPiloto() {
        return piloto;
    }

    public void setPiloto(Pilotos piloto) {
        this.piloto = piloto;
    }

    public Clasificacion getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(Clasificacion clasificacion) {
        this.clasificacion = clasificacion;
    }
    //Muestra en pantalla los datos correspondientes a cada campo
    public void showData() {
        jTextFieldPiloto.setText(piloto.getNombre());
        jTextFieldDorsal.setText(String.valueOf(piloto.getNumeroPiloto()));
        jTextFieldEquipo.setText(piloto.getEquipo());
        jTextFieldMoto.setText(piloto.getMoto());
        jDateChooser1.setDate(piloto.getFechaNac());
        
        NumberFormat formateador = NumberFormat.getNumberInstance();
        jTextFieldSueldo.setText(formateador.format(piloto.getSueldo()));
        if (piloto.getPosicion() != null) {
            jTextFieldClasificacion.setText(String.valueOf(piloto.getPosicion().getPosicion()));
            jTextFieldPuntos.setText(String.valueOf(piloto.getPosicion().getPuntos()));
        } else {
            jTextFieldClasificacion.setText("No clasificado");
        jTextFieldPuntos.setText("0");
        }
    }
    //Limpia los campos de texto
    public void cleanData(){
        jTextFieldPiloto.setText("");
        jTextFieldDorsal.setText("");
        jTextFieldEquipo.setText("");
        jTextFieldMoto.setText("");
        jDateChooser1.setDate(null);
        jTextFieldSueldo.setText("");
        jTextFieldClasificacion.setText("");
        jTextFieldPuntos.setText("");
    }
    //Pone en los campos de texto los datos correspondientes
    public void setData(){
        //Rellenar sus datos
        piloto.setNombre(jTextFieldPiloto.getText());
        piloto.setNumeroPiloto(Integer.valueOf(jTextFieldDorsal.getText()));
        piloto.setEquipo(jTextFieldEquipo.getText());
        piloto.setMoto(jTextFieldMoto.getText());
        piloto.setFechaNac(jDateChooser1.getDate());
        piloto.setSueldo(Float.valueOf(jTextFieldSueldo.getText()));
        piloto.setPosicion(null);
        piloto.setVigenteCampeon(false);
        //clasificacion.setPuntos(Integer.valueOf(jTextFieldPuntos.getText()));
    }
    //Habilita los campos de texto
    public void setTrue(){
        jTextFieldPiloto.setEditable(true);
        jTextFieldDorsal.setEditable(true);
        jTextFieldEquipo.setEditable(true);
        jTextFieldMoto.setEditable(true);
        jDateChooser1.setEnabled(true);
        jTextFieldSueldo.setEditable(true);
        jTextFieldClasificacion.setEditable(true);
        jTextFieldPuntos.setEditable(true);
    }
    //Deshabilita los campos de texto
    public void setFalse(){
        jTextFieldPiloto.setEditable(false);
        jTextFieldDorsal.setEditable(false);
        jTextFieldEquipo.setEditable(false);
        jTextFieldMoto.setEditable(false);
        jDateChooser1.setEnabled(false);
        jTextFieldSueldo.setEditable(false);
        jTextFieldClasificacion.setEditable(false);
        jTextFieldPuntos.setEditable(false);
    }
    //Deshabilita los campos clasificación y puntos para que,...
    //...por defecto, no esté clasificado y tenga 0 puntos
    public void setNew(){
        jTextFieldClasificacion.setEditable(false);
        jTextFieldPuntos.setEditable(false);
    }
    
    /**
     * Creates new form PanelPilotos
     */
    public PanelPilotos() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldMoto = new javax.swing.JTextField();
        jTextFieldEquipo = new javax.swing.JTextField();
        jTextFieldDorsal = new javax.swing.JTextField();
        jTextFieldPiloto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldSueldo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldClasificacion = new javax.swing.JTextField();
        jTextFieldPuntos = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Piloto");

        jLabel2.setText("Dorsal");

        jLabel3.setText("Equipo");

        jLabel4.setText("Moto");

        jLabel6.setText("Fecha de Nacimiento");

        jLabel7.setText("Sueldo");

        jLabel8.setText("Clasificacion");

        jLabel9.setText("Puntos");

        jTextFieldClasificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldClasificacionActionPerformed(evt);
            }
        });

        jButton1.setText("Seleccionar...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Nacionalidad");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(71, 71, 71)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldDorsal, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldEquipo, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldMoto)
                                    .addComponent(jTextFieldPiloto)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldPuntos)
                                    .addComponent(jTextFieldClasificacion)
                                    .addComponent(jTextFieldSueldo, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldPiloto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldDorsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldMoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldClasificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldClasificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldClasificacionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Tomar una referencia al JFrame que contiene este panel
        Frame frameParent = Frame.getFrames()[0];
        DialogPilotos dialogPilotos = new DialogPilotos(frameParent, true);
        dialogPilotos.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextFieldClasificacion;
    private javax.swing.JTextField jTextFieldDorsal;
    private javax.swing.JTextField jTextFieldEquipo;
    private javax.swing.JTextField jTextFieldMoto;
    private javax.swing.JTextField jTextFieldPiloto;
    private javax.swing.JTextField jTextFieldPuntos;
    private javax.swing.JTextField jTextFieldSueldo;
    // End of variables declaration//GEN-END:variables
}

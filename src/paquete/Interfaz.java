package paquete;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 * @author Gonzalo Izuzquiza
 */
public class Interfaz extends javax.swing.JFrame {

    public Interfaz() {

        initComponents();
        this.getContentPane().setBackground(Color.green); // damos color al fondo del jFrame
        this.setLocationRelativeTo(null); // con esto hacemos que la pnatalla se abra en el centro de la pantalla
        this.setSize(700, 500);

        try {
            gc.conn1.setAutoCommit(false); 

            Statement sta = gc.conn1.createStatement();

            String query = "SELECT * FROM album ";

            ResultSet rs = sta.executeQuery(query);
            ResultSetMetaData metaDatos = rs.getMetaData();

            int numColumnas = metaDatos.getColumnCount();

            DefaultTableModel modelo = new DefaultTableModel();

            this.datos.setModel(modelo);

            for (int i = 1; i <= numColumnas; i++) {
                modelo.addColumn(metaDatos.getColumnLabel(i));
            }

            while (rs.next()) {
                Object[] fila = new Object[numColumnas];

                for (int i = 0; i < numColumnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modelo.addRow(fila);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        datos = new javax.swing.JTable();
        consulta_id = new javax.swing.JButton();
        texto_id = new javax.swing.JTextField();
        caratula_boton = new javax.swing.JButton();
        canciones_boton = new javax.swing.JButton();
        album_cancion = new javax.swing.JButton();
        id_texto = new javax.swing.JTextField();
        titulo_texto = new javax.swing.JTextField();
        publicacion_texto = new javax.swing.JTextField();
        id_3 = new javax.swing.JTextField();
        insertar_album = new javax.swing.JButton();
        tituloCancion_texto = new javax.swing.JTextField();
        duracion_texto = new javax.swing.JTextField();
        letra_texto = new javax.swing.JTextField();
        id_album = new javax.swing.JTextField();
        insertar_cancion = new javax.swing.JButton();
        error = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(datos);

        consulta_id.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        consulta_id.setText("Consultar id_cancion");

        texto_id.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        texto_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        texto_id.setText("1");

        caratula_boton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        caratula_boton.setText("Insertar Caratula");

        canciones_boton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        canciones_boton.setText("Consultar canciones");

        album_cancion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        album_cancion.setText("Consultar album");

        id_texto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id_texto.setText("id_album");

        titulo_texto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        titulo_texto.setText("Título");

        publicacion_texto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        publicacion_texto.setText("Año publicacion");

        id_3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id_3.setText("Artista");

        insertar_album.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        insertar_album.setText("Insertar album");

        tituloCancion_texto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tituloCancion_texto.setText("Título");

        duracion_texto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        duracion_texto.setText("Duración");

        letra_texto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        letra_texto.setText("Letra");

        id_album.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id_album.setText("id_album");

        insertar_cancion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        insertar_cancion.setText("Insertar cancion");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(id_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(titulo_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(publicacion_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(id_3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(insertar_album, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(texto_id, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(consulta_id)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(canciones_boton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(album_cancion)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(caratula_boton)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tituloCancion_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(duracion_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letra_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(id_album, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(insertar_cancion, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(consulta_id)
                    .addComponent(texto_id, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caratula_boton)
                    .addComponent(canciones_boton)
                    .addComponent(album_cancion))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titulo_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(publicacion_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id_3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insertar_album, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloCancion_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(duracion_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id_album, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insertar_cancion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(error, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    GestorConexion gc = new GestorConexion();
    //gc.cerrar_conexion();

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton album_cancion;
    private javax.swing.JButton canciones_boton;
    private javax.swing.JButton caratula_boton;
    private javax.swing.JButton consulta_id;
    private javax.swing.JTable datos;
    private javax.swing.JTextField duracion_texto;
    private javax.swing.JLabel error;
    private javax.swing.JTextField id_3;
    private javax.swing.JTextField id_album;
    private javax.swing.JTextField id_texto;
    private javax.swing.JButton insertar_album;
    private javax.swing.JButton insertar_cancion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField letra_texto;
    private javax.swing.JTextField publicacion_texto;
    private javax.swing.JTextField texto_id;
    private javax.swing.JTextField tituloCancion_texto;
    private javax.swing.JTextField titulo_texto;
    // End of variables declaration//GEN-END:variables
}

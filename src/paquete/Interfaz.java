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

    DefaultTableModel tabla_mostrar;
    String errores = "";

    public Interfaz() {

        initComponents();
        this.getContentPane().setBackground(Color.green); // damos color al fondo del jFrame
        this.setLocationRelativeTo(null); // con esto hacemos que la pnatalla se abra en el centro de la pantalla
        this.setSize(730, 500);

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
        canciones_consulta = new javax.swing.JButton();
        album_consulta = new javax.swing.JButton();
        id_texto = new javax.swing.JTextField();
        titulo_texto = new javax.swing.JTextField();
        publicacion_texto = new javax.swing.JTextField();
        artista_texto = new javax.swing.JTextField();
        insertar_album = new javax.swing.JButton();
        tituloCancion_texto = new javax.swing.JTextField();
        duracion_texto = new javax.swing.JTextField();
        letra_texto = new javax.swing.JTextField();
        id_album = new javax.swing.JTextField();
        insertar_cancion = new javax.swing.JButton();
        error = new javax.swing.JLabel();
        caratula_texto = new javax.swing.JTextField();
        id_song = new javax.swing.JTextField();
        consulta_idAlbum = new javax.swing.JButton();
        texto_idAlbum = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(datos);

        consulta_id.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        consulta_id.setText("Consultar id_cancion");
        consulta_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consulta_idActionPerformed(evt);
            }
        });

        texto_id.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        texto_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        texto_id.setText("1");
        texto_id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                texto_idMouseClicked(evt);
            }
        });

        caratula_boton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        caratula_boton.setText("Insertar Caratula");
        caratula_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caratula_botonActionPerformed(evt);
            }
        });

        canciones_consulta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        canciones_consulta.setText("Consultar canciones");
        canciones_consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canciones_consultaActionPerformed(evt);
            }
        });

        album_consulta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        album_consulta.setText("Consultar albumes");
        album_consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                album_consultaActionPerformed(evt);
            }
        });

        id_texto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id_texto.setText("id_album");
        id_texto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                id_textoMouseClicked(evt);
            }
        });

        titulo_texto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        titulo_texto.setText("Título");
        titulo_texto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                titulo_textoMouseClicked(evt);
            }
        });

        publicacion_texto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        publicacion_texto.setText("Año publicacion");
        publicacion_texto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                publicacion_textoMouseClicked(evt);
            }
        });

        artista_texto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        artista_texto.setText("Artista");
        artista_texto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                artista_textoMouseClicked(evt);
            }
        });

        insertar_album.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        insertar_album.setText("Insertar album");
        insertar_album.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertar_albumActionPerformed(evt);
            }
        });

        tituloCancion_texto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tituloCancion_texto.setText("Título");
        tituloCancion_texto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tituloCancion_textoMouseClicked(evt);
            }
        });

        duracion_texto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        duracion_texto.setText("Duración");
        duracion_texto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                duracion_textoMouseClicked(evt);
            }
        });

        letra_texto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        letra_texto.setText("Letra");
        letra_texto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                letra_textoMouseClicked(evt);
            }
        });

        id_album.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id_album.setText("id_album");
        id_album.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                id_albumMouseClicked(evt);
            }
        });

        insertar_cancion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        insertar_cancion.setText("Insertar cancion");
        insertar_cancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertar_cancionActionPerformed(evt);
            }
        });

        caratula_texto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        caratula_texto.setText("Imagen caratula_nombre");
        caratula_texto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                caratula_textoMouseClicked(evt);
            }
        });

        id_song.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id_song.setText("id_cancion");
        id_song.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                id_songMouseClicked(evt);
            }
        });

        consulta_idAlbum.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        consulta_idAlbum.setText("Consultar id_album");
        consulta_idAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consulta_idAlbumActionPerformed(evt);
            }
        });

        texto_idAlbum.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        texto_idAlbum.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        texto_idAlbum.setText("1");
        texto_idAlbum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                texto_idAlbumMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("id_cancion");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Duración");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Título");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Letra");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("id_album");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Título");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("id_album");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Año de publicación");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Artista");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(texto_idAlbum)
                                    .addComponent(texto_id, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(consulta_id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(consulta_idAlbum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(canciones_consulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(caratula_texto))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(album_consulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(caratula_boton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(id_song, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(tituloCancion_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(duracion_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(letra_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(id_album, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(insertar_cancion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(id_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(titulo_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(publicacion_texto)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(artista_texto, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(insertar_album, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(22, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(consulta_id)
                    .addComponent(texto_id, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(canciones_consulta)
                    .addComponent(album_consulta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caratula_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consulta_idAlbum)
                    .addComponent(texto_idAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caratula_boton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titulo_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(publicacion_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(artista_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insertar_album, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloCancion_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(duracion_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id_album, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insertar_cancion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id_song, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void album_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_album_consultaActionPerformed
        try {
            gc.conn1.setAutoCommit(false);

            String query = "SELECT * FROM album ";

            Statement sta = gc.conn1.createStatement();

            ResultSet rs = sta.executeQuery(query);
            ResultSetMetaData metaDatos = rs.getMetaData();

            int numColumnas = metaDatos.getColumnCount();

            tabla_mostrar = new DefaultTableModel();

            this.datos.setModel(tabla_mostrar);

            for (int i = 1; i <= numColumnas; i++) {
                tabla_mostrar.addColumn(metaDatos.getColumnLabel(i));
            }

            while (rs.next()) {
                Object[] fila = new Object[numColumnas];

                for (int i = 0; i < numColumnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                tabla_mostrar.addRow(fila);
            }

            rs.close();

            sta.close();

        } catch (Exception e) {
            e.printStackTrace();
            errores = e.toString();
            error.setText(errores);
        }
    }//GEN-LAST:event_album_consultaActionPerformed

    private void canciones_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canciones_consultaActionPerformed
        try {
            gc.conn1.setAutoCommit(false);

            String query = "SELECT * FROM cancion ";

            Statement sta = gc.conn1.createStatement();

            ResultSet rs = sta.executeQuery(query);
            ResultSetMetaData metaDatos = rs.getMetaData();

            int numColumnas = metaDatos.getColumnCount();

            tabla_mostrar = new DefaultTableModel();

            this.datos.setModel(tabla_mostrar);

            for (int i = 1; i <= numColumnas; i++) {
                tabla_mostrar.addColumn(metaDatos.getColumnLabel(i));
            }

            while (rs.next()) {
                Object[] fila = new Object[numColumnas];

                for (int i = 0; i < numColumnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                tabla_mostrar.addRow(fila);
            }

            rs.close();

            sta.close();

        } catch (Exception e) {
            e.printStackTrace();
            errores = e.toString();
            error.setText(errores);
        }
    }//GEN-LAST:event_canciones_consultaActionPerformed

    private void consulta_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consulta_idActionPerformed
        try {
            gc.conn1.setAutoCommit(false);

            String ID = texto_id.getText();

            String query = "SELECT * FROM cancion WHERE id_cancion like " + ID;
            Statement sta = gc.conn1.createStatement();

            ResultSet rs = sta.executeQuery(query);

            ResultSetMetaData metaDatos = rs.getMetaData();

            int numColumnas = metaDatos.getColumnCount();

            tabla_mostrar = new DefaultTableModel();

            this.datos.setModel(tabla_mostrar);

            for (int i = 1; i <= numColumnas; i++) {
                tabla_mostrar.addColumn(metaDatos.getColumnLabel(i));
            }

            while (rs.next()) {
                Object[] fila = new Object[numColumnas];

                for (int i = 0; i < numColumnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                tabla_mostrar.addRow(fila);
            }

            rs.close();

            sta.close();

            System.out.println("Consultado correctamente");

        } catch (Exception e) {
            e.printStackTrace();
            errores = e.toString();
            error.setText(errores);
        }
    }//GEN-LAST:event_consulta_idActionPerformed

    private void caratula_botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caratula_botonActionPerformed
        gc.annadirColumna(caratula_texto.getText());
        album_consultaActionPerformed(evt);
        error.setText(gc.cadena_resultado);
    }//GEN-LAST:event_caratula_botonActionPerformed

    private void insertar_albumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertar_albumActionPerformed
        gc.insertarAlbumNuevo(id_texto.getText(), titulo_texto.getText(), publicacion_texto.getText(), artista_texto.getText());
        album_consultaActionPerformed(evt);
        error.setText(gc.cadena_resultado);
    }//GEN-LAST:event_insertar_albumActionPerformed

    private void insertar_cancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertar_cancionActionPerformed
        gc.cancionNueva(id_song.getText(), tituloCancion_texto.getText(), duracion_texto.getText(), letra_texto.getText(), id_album.getText());
        canciones_consultaActionPerformed(evt);
        error.setText(gc.cadena_resultado);
    }//GEN-LAST:event_insertar_cancionActionPerformed

    private void consulta_idAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consulta_idAlbumActionPerformed
        try {
            gc.conn1.setAutoCommit(false);

            String IDD = texto_idAlbum.getText();

            String query = "SELECT * FROM album WHERE id_album like " + IDD;
            Statement sta = gc.conn1.createStatement();

            ResultSet rs = sta.executeQuery(query);

            ResultSetMetaData metaDatos = rs.getMetaData();

            int numColumnas = metaDatos.getColumnCount();

            tabla_mostrar = new DefaultTableModel();

            this.datos.setModel(tabla_mostrar);

            for (int i = 1; i <= numColumnas; i++) {
                tabla_mostrar.addColumn(metaDatos.getColumnLabel(i));
            }

            while (rs.next()) {
                Object[] fila = new Object[numColumnas];

                for (int i = 0; i < numColumnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                tabla_mostrar.addRow(fila);
            }

            rs.close();

            sta.close();

            System.out.println("Consultado correctamente");

        } catch (Exception e) {
            e.printStackTrace();
            errores = e.toString();
            error.setText(errores);
        }
    }//GEN-LAST:event_consulta_idAlbumActionPerformed

    private void texto_idMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_texto_idMouseClicked
        texto_id.setText("");
    }//GEN-LAST:event_texto_idMouseClicked

    private void texto_idAlbumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_texto_idAlbumMouseClicked
        texto_idAlbum.setText("");
    }//GEN-LAST:event_texto_idAlbumMouseClicked

    private void caratula_textoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caratula_textoMouseClicked
        caratula_texto.setText("");
    }//GEN-LAST:event_caratula_textoMouseClicked

    private void id_textoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id_textoMouseClicked
        id_texto.setText("");
    }//GEN-LAST:event_id_textoMouseClicked

    private void titulo_textoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titulo_textoMouseClicked
       titulo_texto.setText("");
    }//GEN-LAST:event_titulo_textoMouseClicked

    private void publicacion_textoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_publicacion_textoMouseClicked
        publicacion_texto.setText("");
    }//GEN-LAST:event_publicacion_textoMouseClicked

    private void artista_textoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_artista_textoMouseClicked
        artista_texto.setText("");
    }//GEN-LAST:event_artista_textoMouseClicked

    private void id_songMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id_songMouseClicked
        id_song.setText("");
    }//GEN-LAST:event_id_songMouseClicked

    private void tituloCancion_textoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tituloCancion_textoMouseClicked
       tituloCancion_texto.setText("");
    }//GEN-LAST:event_tituloCancion_textoMouseClicked

    private void duracion_textoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_duracion_textoMouseClicked
        duracion_texto.setText("");
    }//GEN-LAST:event_duracion_textoMouseClicked

    private void letra_textoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_letra_textoMouseClicked
        letra_texto.setText("");
    }//GEN-LAST:event_letra_textoMouseClicked

    private void id_albumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id_albumMouseClicked
        id_album.setText("");
    }//GEN-LAST:event_id_albumMouseClicked

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
    private javax.swing.JButton album_consulta;
    private javax.swing.JTextField artista_texto;
    private javax.swing.JButton canciones_consulta;
    private javax.swing.JButton caratula_boton;
    private javax.swing.JTextField caratula_texto;
    private javax.swing.JButton consulta_id;
    private javax.swing.JButton consulta_idAlbum;
    private javax.swing.JTable datos;
    private javax.swing.JTextField duracion_texto;
    private javax.swing.JLabel error;
    private javax.swing.JTextField id_album;
    private javax.swing.JTextField id_song;
    private javax.swing.JTextField id_texto;
    private javax.swing.JButton insertar_album;
    private javax.swing.JButton insertar_cancion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField letra_texto;
    private javax.swing.JTextField publicacion_texto;
    private javax.swing.JTextField texto_id;
    private javax.swing.JTextField texto_idAlbum;
    private javax.swing.JTextField tituloCancion_texto;
    private javax.swing.JTextField titulo_texto;
    // End of variables declaration//GEN-END:variables
}

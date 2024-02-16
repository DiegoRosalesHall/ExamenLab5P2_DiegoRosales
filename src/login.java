
import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import javax.swing.JOptionPane;


// Fila 1 asiento 4

public class login extends javax.swing.JFrame {
// Usuarios
    Date d1 = new Date(2005,7,23); // fecha de josue
    Date d2 = new Date(2005,6,23); // fecha de diego
    Date d3 = new Date(2006,8,25); // fecha de luis
    Date d4 = new Date(2006,2,22); //fecha de Belen
    static Random rand = new Random();
    Usuario u2 = new Empleados ("Josue Roberto","Rivera","josue1234","Masculino","Francisco Morazan"," ",d1);
    Usuario u3 = new Civiles("Luis Fernando","Castro Soto","luis1234","Masculino","Francisco Morazan"," ",d3);
    Usuario u4 = new Empleados ("Maria Belen","Padilla Canelo","belen1234","Femenino","Comayagua"," ",d4);
    Usuario u1 = new Civiles ("Diego Gerardo","Rosales Hall","diego1234","Masculino","Cortes"," ",d2);
    ArrayList<Usuario> usuarios = new ArrayList<>();
    public static int posUss=0;
    
    public login() {
        
        usuarios.add(u1);
        usuarios.add(u2);
        usuarios.add(u3);
        usuarios.add(u4);
        for (int i = 0; i < usuarios.size(); i++) {
            usuarios.get(i).setIdentidad(identidad(usuarios.get(i)));
            
        }
        
        JOptionPane.showMessageDialog(rootPane, usuarios.get(0).getIdentidad());
        JOptionPane.showMessageDialog(rootPane, usuarios.get(3).getIdentidad());
        JOptionPane.showMessageDialog(rootPane, usuarios.get(2).getIdentidad());
        
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        empleadosDialog = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        labelshownameempleado = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        comboBoxIdentidad = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField4 = new javax.swing.JTextField();
        civilesDialog = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        exitButton = new javax.swing.JPanel();
        labelX = new javax.swing.JLabel();
        passwordFieldcontrasena = new javax.swing.JPasswordField();
        textfieldNombre = new javax.swing.JTextField();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Empleados");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Bienvenido: ");

        labelshownameempleado.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelshownameempleado.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 365, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Informacion Civiles", jPanel4);

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setForeground(new java.awt.Color(0, 0, 0));

        comboBoxIdentidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxIdentidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxIdentidadActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Nombre ");

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Contaseña");

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Sexo");

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Departamento");

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Apellidos ");

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Fecha de Nacimiento");

        jButton1.setText("Modificar");

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        jTextField3.setText("jTextField3");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTextField4.setText("jTextField4");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBoxIdentidad, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(126, 126, 126))
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTextField2))
                                            .addGap(45, 45, 45)))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(45, 45, 45)))
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)
                                    .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4)))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jButton1)))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(comboBoxIdentidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel11))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(29, 29, 29))
        );

        jTabbedPane1.addTab("Modificacion Civiles", jPanel5);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(301, 301, 301)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelshownameempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 117, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelshownameempleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(3, 3, 3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout empleadosDialogLayout = new javax.swing.GroupLayout(empleadosDialog.getContentPane());
        empleadosDialog.getContentPane().setLayout(empleadosDialogLayout);
        empleadosDialogLayout.setHorizontalGroup(
            empleadosDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        empleadosDialogLayout.setVerticalGroup(
            empleadosDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout civilesDialogLayout = new javax.swing.GroupLayout(civilesDialog.getContentPane());
        civilesDialog.getContentPane().setLayout(civilesDialogLayout);
        civilesDialogLayout.setHorizontalGroup(
            civilesDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        civilesDialogLayout.setVerticalGroup(
            civilesDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Registro Nacional de las Personas\n");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre Completo:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Contraseña:");

        loginButton.setBackground(new java.awt.Color(0, 204, 204));
        loginButton.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Iniciar Sesion");
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginButtonMouseExited(evt);
            }
        });
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        exitButton.setBackground(new java.awt.Color(255, 255, 255));
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitButtonMouseExited(evt);
            }
        });

        labelX.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelX.setForeground(new java.awt.Color(0, 0, 0));
        labelX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelX.setText("X");

        javax.swing.GroupLayout exitButtonLayout = new javax.swing.GroupLayout(exitButton);
        exitButton.setLayout(exitButtonLayout);
        exitButtonLayout.setHorizontalGroup(
            exitButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelX, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
        );
        exitButtonLayout.setVerticalGroup(
            exitButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitButtonLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(labelX)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        passwordFieldcontrasena.setBackground(new java.awt.Color(204, 204, 204));
        passwordFieldcontrasena.setText("********");

        textfieldNombre.setBackground(new java.awt.Color(204, 204, 204));
        textfieldNombre.setText("Ingrese un usuario");
        textfieldNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                textfieldNombreMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(passwordFieldcontrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textfieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(loginButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1))
                    .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textfieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(passwordFieldcontrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(106, 106, 106)
                .addComponent(loginButton)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        int contvalidez = 0;
        

        for (int i = 0; i < usuarios.size(); i++) {
            String prueba = usuarios.get(i).getNombre() + " " + usuarios.get(i).getApellido();
            JOptionPane.showMessageDialog(rootPane, prueba);
            if (textfieldNombre.getText().equals(prueba)) {
                contvalidez++;
                if (passwordFieldcontrasena.getText().equals(usuarios.get(i).getContra())) {
                    JOptionPane.showMessageDialog(rootPane, usuarios.get(i).getContra());
                    contvalidez++;
                    posUss=i;
                }

            }
            
            if (contvalidez == 2) {
                break;
            } else {
                contvalidez = 0;
            }
            
            

        }      
         
         if(contvalidez==2){
             
             JOptionPane.showMessageDialog(rootPane, "Has iniciado sesion con exito");
             passwordFieldcontrasena.setText("");
             textfieldNombre.setText("");
             
             if(usuarios.get(posUss) instanceof Empleados){
                 this.setVisible(false);
                 empleadosDialog.setVisible(true);
                 empleadosDialog.pack();
                labelshownameempleado.setText(usuarios.get(posUss).getNombre());
             }
             else {
             this.setVisible(false);
             civilesDialog.setVisible(true);
             civilesDialog.pack();
         }
             
         }
         else{
             JOptionPane.showMessageDialog(rootPane, "Usuario Invalido");
         }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void textfieldNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textfieldNombreMousePressed
       
       
    }//GEN-LAST:event_textfieldNombreMousePressed

    private void exitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseClicked
       System.exit(0);
    }//GEN-LAST:event_exitButtonMouseClicked

    private void exitButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseEntered
        exitButton.setBackground(Color.red);
        labelX.setForeground(Color.white);
    }//GEN-LAST:event_exitButtonMouseEntered

    private void exitButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseExited
        exitButton.setBackground(Color.white);
        labelX.setForeground(Color.black);
    }//GEN-LAST:event_exitButtonMouseExited

    private void loginButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseEntered
       loginButton.setBackground(Color.white);
       loginButton.setForeground(new Color(0,204,204));
    }//GEN-LAST:event_loginButtonMouseEntered

    private void loginButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseExited
        loginButton.setBackground(new Color(0,204,204));
        loginButton.setForeground(Color.white);
    }//GEN-LAST:event_loginButtonMouseExited

    private void comboBoxIdentidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxIdentidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxIdentidadActionPerformed

   
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }
    
    public static String identidad(Usuario uss){
        String identidad="";
        
       if(uss.getDepartamento().equals("Francisco Morazan")){
           identidad+="01";
           int municipionum = rand.nextInt(1,28);
           String caso1="";
           String municipio ="";
           if(municipionum<10){
               caso1+="0";
               caso1+= municipionum+"";
               municipio += caso1;
               municipio+="-";
           }
           else{
               municipio+=municipionum+"";
               municipio+="-";
           }
           identidad+=municipio;
           String ano = uss.getFechaNacimiento().getYear()+"";
           identidad+=ano+"-";
           for (int i = 0; i < 5; i++) {
               identidad+= rand.nextInt(0,10);
           }
           
           return identidad;
           
       }
       
       else if( uss.getDepartamento().equals("Cortes")){
           identidad+="02";
           int municipionum = rand.nextInt(1,12);
           String caso1="";
           String municipio ="";
           if(municipionum<10){
               caso1+="0";
               caso1+= municipionum+"";
               municipio += caso1;
               municipio+="-";
           }
           else{
               municipio+=municipionum+"";
               municipio+="-";
           }
           identidad+=municipio;
           String ano = uss.getFechaNacimiento().getYear()+"";
           identidad+=ano+"-";
           for (int i = 0; i < 5; i++) {
               identidad+= rand.nextInt(0,10);
           }
           
           return identidad;
           
       }
       
       else if( uss.getDepartamento().equals("Comayagua")){
           identidad+="03";
           int municipionum = rand.nextInt(1,21);
           String caso1="";
           String municipio ="";
           if(municipionum<10){
               caso1+="0";
               caso1+= municipionum+"";
               municipio += caso1;
               municipio+="-";
           }
           else{
               municipio+=municipionum+"";
               municipio+="-";
           }
           identidad+=municipio;
           String ano = uss.getFechaNacimiento().getYear()+"";
           identidad+=ano+"-";
           for (int i = 0; i < 5; i++) {
               identidad+= rand.nextInt(0,10);
           }
           
           return identidad;
           
       }
       return null;
       }

        
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog civilesDialog;
    private javax.swing.JComboBox<String> comboBoxIdentidad;
    private javax.swing.JDialog empleadosDialog;
    private javax.swing.JPanel exitButton;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel labelX;
    private javax.swing.JLabel labelshownameempleado;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordFieldcontrasena;
    private javax.swing.JTextField textfieldNombre;
    // End of variables declaration//GEN-END:variables
}

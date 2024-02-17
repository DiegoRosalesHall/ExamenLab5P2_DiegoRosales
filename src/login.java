
import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


// Fila 1 asiento 4

public class login extends javax.swing.JFrame {
// Usuarios
    
    Date d1 = new Date(2005-1900,6,23); // fecha de Diego
    Date d2 = new Date(2005-1900,7,23); // fecha de josue
    Date d3 = new Date(2006-1900,8,25); // fecha de luis
    Date d4 = new Date(2006-1900,2,22); //fecha de Belen
    static Random rand = new Random();
    Usuario u2 = new Empleados ("Josue Roberto","Rivera","josue1234","Masculino","Francisco Morazan"," ",d2);
    Usuario u3 = new Civiles("Luis Fernando","Castro Soto","luis1234","Masculino","Cortes"," ",d3);
    Usuario u4 = new Empleados ("Maria Belen","Padilla Canelo","belen1234","Femenino","Comayagua"," ",d4);
    Usuario u1 = new Civiles ("Diego Gerardo","Rosales Hall","diego1234","Masculino","Cortes"," ",d1);
    ArrayList<Usuario> usuarios = new ArrayList<>();
    public static int posUss=0;
    
    
    public void LlenarTablaciviles(){
        DefaultTableModel tablemodel = (DefaultTableModel) tablainfociviles.getModel();
        
        for (int i = 0; i < usuarios.size(); i++) {
            if(usuarios.get(i)instanceof Civiles){
            Object [] modelotabla = {usuarios.get(i).getNombre()+" "+usuarios.get(i).getApellido(), usuarios.get(i).getIdentidad()};
            tablemodel.addRow(modelotabla);
        }
            
        }
        
         tablainfociviles.setModel(tablemodel);
    }
    
    public void VaciarTablaciviles(){
        DefaultTableModel tablemodel = (DefaultTableModel) tablainfociviles.getModel();
        tablemodel.setRowCount(0);
         tablainfociviles.setModel(tablemodel);
    }
    
    public void LlenarTablatramites(){
        DefaultTableModel tablemodel = (DefaultTableModel) tablatramites.getModel();

        for (int i = 0; i < usuarios.size(); i++) {
            if(usuarios.get(i)instanceof Civiles){
                
                for (int j = 0; j <((Civiles)usuarios.get(i)).getTramites().size() ; j++) {
                   Object [] modelotabla = {((Civiles)usuarios.get(i)).getTramites().get(i).getNombre(),((Civiles)usuarios.get(i)).getTramites().get(i).getDescripcion(),((Civiles)usuarios.get(i)).getTramites().get(i).getFechaSolicitud(),((Civiles)usuarios.get(i)).getTramites().get(i).getIdentidad()};
                tablemodel.addRow(modelotabla); 
                }
            
            }
            else{
                
            }
        
        }
        tablatramites.setModel(tablemodel);
    }
    
    public void LlenarTablaPersonal(){
        DefaultTableModel tablemodel = (DefaultTableModel) tablainformacionpersonal.getModel();
        Object [] modelotabla ={ usuarios.get(posUss).getNombre()+" "+usuarios.get(posUss).getApellido(), usuarios.get(posUss).getIdentidad(),usuarios.get(posUss).getFechaNacimiento()};
        tablemodel.addRow(modelotabla);
        
        tablainformacionpersonal.setModel(tablemodel);
    }
    
     public void VaciarTablaPersonal(){
        DefaultTableModel tablemodel = (DefaultTableModel) tablainformacionpersonal.getModel();
        tablemodel.setRowCount(0);
    }
     
    public void LlenarTablatramitesciviles(){
        DefaultTableModel tablemodel = (DefaultTableModel) tablatramitesciviles.getModel();
        for (int i = 0; i <usuarios.size() ; i++) {
            if(usuarios.get(i) instanceof Civiles){
                for (int j = 0; j <((Civiles)usuarios.get(i)).getTramites().size() ; j++) {
                    Object [] modelotabla ={((Civiles)usuarios.get(posUss)).getTramites().get(j).getNombre(), ((Civiles)usuarios.get(posUss)).getTramites().get(j).getDescripcion(),((Civiles)usuarios.get(posUss)).getTramites().get(j).getFechaSolicitud(),((Civiles)usuarios.get(posUss)).getTramites().get(j).getIdentidad()};
                     tablemodel.addRow(modelotabla);   
                }
             
            }
        }
        
        
        tablatramitesciviles.setModel(tablemodel);
    }
    public void VaciarTablatramitesciviles(){
        DefaultTableModel tablemodel = (DefaultTableModel) tablatramitesciviles.getModel();
        tablemodel.setRowCount(0);
        tablatramitesciviles.setModel(tablemodel);
    }
    
    public login() {
      
        usuarios.add(u1);
        usuarios.add(u2);
        usuarios.add(u3);
        usuarios.add(u4);
        for (int i = 0; i < usuarios.size(); i++) {
            usuarios.get(i).setIdentidad(identidad(usuarios.get(i)));
            
        }
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tablainfociviles = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablatramites = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        comboBoxidentidad = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        buttonModificar = new javax.swing.JButton();
        textfieldNombremod = new javax.swing.JTextField();
        textfieldcontramod = new javax.swing.JTextField();
        comboboxDepartamento = new javax.swing.JComboBox<>();
        textfieldapellidosmod = new javax.swing.JTextField();
        comboboxSexo = new javax.swing.JComboBox<>();
        calendarmod = new com.toedter.calendar.JCalendar();
        signoutbutton = new javax.swing.JButton();
        civilesDialog = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        labelshownameempleado1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablatramitesciviles = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablainformacionpersonal = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        textfieldnombretramite = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        textareadescripciontramite = new javax.swing.JTextArea();
        buttontramite = new javax.swing.JButton();
        signoutbuttonciviles = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
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

        tablainfociviles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "No. Identidad", "Fecha de nacimiento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablainfociviles);

        tablatramites.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre Tramite", "Descripcion", "Fecha", "No. Identidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablatramites);

        jLabel12.setText("Informacion de Civiles");

        jLabel13.setText("Tramites");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jTabbedPane1.addTab("Informacion Civiles", jPanel4);

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setForeground(new java.awt.Color(0, 0, 0));

        comboBoxidentidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxidentidadActionPerformed(evt);
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

        buttonModificar.setText("Modificar");
        buttonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonModificarActionPerformed(evt);
            }
        });

        textfieldNombremod.setText("Nombre");

        textfieldcontramod.setText("********");
        textfieldcontramod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfieldcontramodActionPerformed(evt);
            }
        });

        textfieldapellidosmod.setText("Apellidos");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(comboBoxidentidad, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(113, 113, 113))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(comboboxDepartamento, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(textfieldcontramod))
                                    .addGap(32, 32, 32)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textfieldNombremod, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboboxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(102, 102, 102)
                                        .addComponent(buttonModificar)))
                                .addGap(21, 21, 21)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)
                                    .addComponent(textfieldapellidosmod, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, Short.MAX_VALUE)
                                .addComponent(calendarmod, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(comboBoxidentidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textfieldNombremod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfieldapellidosmod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel11))
                .addGap(4, 4, 4)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(textfieldcontramod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addGap(5, 5, 5)
                        .addComponent(comboboxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboboxDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonModificar)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(calendarmod, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(14, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("Modificacion Civiles", jPanel5);

        signoutbutton.setBackground(new java.awt.Color(0, 204, 204));
        signoutbutton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        signoutbutton.setForeground(new java.awt.Color(255, 255, 255));
        signoutbutton.setText("Cerrar Sesion");
        signoutbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signoutbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signoutbuttonMouseExited(evt);
            }
        });
        signoutbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signoutbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelshownameempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 117, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(301, 301, 301)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(signoutbutton)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(signoutbutton))
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

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Civiles");

        labelshownameempleado1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelshownameempleado1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Bienvenido: ");

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Informacion Personal");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Tramites");

        tablatramitesciviles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre Tramite", "Descripcion", "Fecha", "No. Identidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tablatramitesciviles);

        tablainformacionpersonal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre Completo", "No. Identidad", "Fecha de Nacimiento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tablainformacionpersonal);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Informacion Personal", jPanel6);

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Nombre");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Descripcion");

        textareadescripciontramite.setColumns(20);
        textareadescripciontramite.setRows(5);
        jScrollPane3.setViewportView(textareadescripciontramite);

        buttontramite.setText("Enviar Tramite");
        buttontramite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttontramiteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(207, 207, 207))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(216, 216, 216))))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(textfieldnombretramite, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(114, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addComponent(buttontramite)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textfieldnombretramite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttontramite)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Gestion de Tramites", jPanel7);

        signoutbuttonciviles.setBackground(new java.awt.Color(0, 204, 204));
        signoutbuttonciviles.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        signoutbuttonciviles.setForeground(new java.awt.Color(255, 255, 255));
        signoutbuttonciviles.setText("Cerrar Sesion");
        signoutbuttonciviles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signoutbuttoncivilesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signoutbuttoncivilesMouseExited(evt);
            }
        });
        signoutbuttonciviles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signoutbuttoncivilesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelshownameempleado1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(110, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(signoutbuttonciviles)
                .addGap(15, 15, 15))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(signoutbuttonciviles))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel15)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(labelshownameempleado1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addGap(26, 26, 26)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
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

        jButton2.setText("jButton2");

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
            
            if (textfieldNombre.getText().equals(prueba)) {
                contvalidez++;
                if (passwordFieldcontrasena.getText().equals(usuarios.get(i).getContra())) {
                    
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
                 comboBoxidentidad.addItem(usuarios.get(0).getIdentidad());
                comboBoxidentidad.addItem(usuarios.get(2).getIdentidad());
                comboboxSexo.addItem("Masculino");
                comboboxSexo.addItem("Femenino");
                 empleadosDialog.pack();
                 comboboxDepartamento.addItem("Cortes");
                 comboboxDepartamento.addItem("Francisco Morazan");
                 comboboxDepartamento.addItem("Comayagua");
                  LlenarTablaciviles();
                  LlenarTablatramites();
                labelshownameempleado.setText(usuarios.get(posUss).getNombre());
                
                
             }
             else {
                 VaciarTablaPersonal();
                 VaciarTablatramitesciviles();
             LlenarTablaPersonal();
             
            
             LlenarTablatramitesciviles();
             
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

    private void comboBoxidentidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxidentidadActionPerformed
        String ident = comboBoxidentidad.getSelectedItem()+"";
        if(ident.equals(usuarios.get(0).getIdentidad())){
            textfieldNombremod.setText(usuarios.get(0).getNombre());
            textfieldcontramod.setText(usuarios.get(0).getContra());
            textfieldapellidosmod.setText(usuarios.get(0).getApellido());
            calendarmod.setDate(d1);
            
        }
        else if(ident.equals(usuarios.get(2).getIdentidad())){
            textfieldNombremod.setText(usuarios.get(2).getNombre());
            textfieldcontramod.setText(usuarios.get(2).getContra());
            textfieldapellidosmod.setText(usuarios.get(2).getApellido());
            calendarmod.setDate(d3);
        }
        
    }//GEN-LAST:event_comboBoxidentidadActionPerformed

    private void signoutbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signoutbuttonMouseEntered
       signoutbutton.setBackground(Color.white);
       signoutbutton.setForeground(new Color(0,204,204));
    }//GEN-LAST:event_signoutbuttonMouseEntered

    private void signoutbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signoutbuttonMouseExited
        signoutbutton.setBackground(new Color(0,204,204));
       signoutbutton.setForeground(Color.white);
    }//GEN-LAST:event_signoutbuttonMouseExited

    private void signoutbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signoutbuttonActionPerformed
        empleadosDialog.setVisible(false);
        this.setVisible(true);
         comboBoxidentidad.addItem(usuarios.get(2).getIdentidad());
                comboboxSexo.removeAllItems();
                 comboboxDepartamento.removeAllItems();
                 comboBoxidentidad.removeAll();
                 comboBoxidentidad.addItem(usuarios.get(0).getIdentidad());
                comboBoxidentidad.addItem(usuarios.get(2).getIdentidad());
        
    }//GEN-LAST:event_signoutbuttonActionPerformed

    private void textfieldcontramodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfieldcontramodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfieldcontramodActionPerformed

    private void buttonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonModificarActionPerformed
        String ident = comboBoxidentidad.getSelectedItem()+"";
        if(ident.equals(usuarios.get(0).getIdentidad())){
            usuarios.get(0).setNombre(textfieldNombremod.getText());
            usuarios.get(0).setContra(textfieldcontramod.getText());
            usuarios.get(0).setApellido(textfieldapellidosmod.getText());
            usuarios.get(0).setFechaNacimiento(calendarmod.getDate());
            
            String identt = comboboxDepartamento.getSelectedItem().toString();
            if(usuarios.get(0).getDepartamento().equals(identt)){
                usuarios.get(0).setDepartamento(comboboxDepartamento.getSelectedItem().toString());
            usuarios.get(0).setSexo(comboboxSexo.getSelectedItem().toString());
            }
            else if(!usuarios.get(0).getDepartamento().equals(identt)){
                 usuarios.get(0).setDepartamento(identt);
            identidad(usuarios.get(0));
            usuarios.get(0).setDepartamento(comboboxDepartamento.getSelectedItem().toString());
            usuarios.get(0).setSexo(comboboxSexo.getSelectedItem().toString());
           
            }
           
            
            
            
            
            
        }
        else if(ident.equals(usuarios.get(2).getIdentidad())){
         usuarios.get(2).setNombre(textfieldNombremod.getText());
            usuarios.get(2).setContra(textfieldcontramod.getText());
            usuarios.get(2).setApellido(textfieldapellidosmod.getText());
            usuarios.get(2).setFechaNacimiento(calendarmod.getDate());
            usuarios.get(2).setDepartamento(comboboxDepartamento.getSelectedItem().toString());
            usuarios.get(2).setSexo(comboboxSexo.getSelectedItem().toString());
           
            
        }
        JOptionPane.showMessageDialog(rootPane, "Has modificado el usuario con exito!");
    }//GEN-LAST:event_buttonModificarActionPerformed

    private void buttontramiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttontramiteActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Has hecho el tramite con exito!");
        Date da = new Date();
        Tramite tramite = new Tramite(textfieldnombretramite.getText(),textareadescripciontramite.getText(),usuarios.get(posUss).getIdentidad(),da);
        ((Civiles)usuarios.get(posUss)).getTramites().add(tramite);
        textfieldnombretramite.setText("");
        textareadescripciontramite.setText("");
        VaciarTablatramitesciviles();
        VaciarTablaPersonal();
        LlenarTablaPersonal();
        LlenarTablatramitesciviles();
    }//GEN-LAST:event_buttontramiteActionPerformed

    private void signoutbuttoncivilesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signoutbuttoncivilesMouseEntered
        signoutbuttonciviles.setBackground(Color.white);
        signoutbuttonciviles.setForeground(new Color(0,204,204));
    }//GEN-LAST:event_signoutbuttoncivilesMouseEntered

    private void signoutbuttoncivilesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signoutbuttoncivilesMouseExited
       signoutbuttonciviles.setBackground(new Color(0,204,204));
       signoutbuttonciviles.setForeground(Color.white);
    }//GEN-LAST:event_signoutbuttoncivilesMouseExited

    private void signoutbuttoncivilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signoutbuttoncivilesActionPerformed
        civilesDialog.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_signoutbuttoncivilesActionPerformed

   
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
           String ano = uss.getFechaNacimiento().getYear()+1900+"";
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
           String ano = uss.getFechaNacimiento().getYear()+1900+"";
           identidad+=ano+"-";
           for (int i = 0; i < 5; i++) {
               identidad+= rand.nextInt(0,10);
           }
           
           return identidad;
           
       }
       
       else {
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
           String ano = uss.getFechaNacimiento().getYear()+1900+"";
           identidad+=ano+"-";
           for (int i = 0; i < 5; i++) {
               identidad+= rand.nextInt(0,10);
           }
           
           return identidad;
           
       }
       
       }

        
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonModificar;
    private javax.swing.JButton buttontramite;
    private com.toedter.calendar.JCalendar calendarmod;
    private javax.swing.JDialog civilesDialog;
    private javax.swing.JComboBox<String> comboBoxidentidad;
    private javax.swing.JComboBox<String> comboboxDepartamento;
    private javax.swing.JComboBox<String> comboboxSexo;
    private javax.swing.JDialog empleadosDialog;
    private javax.swing.JPanel exitButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
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
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel labelX;
    private javax.swing.JLabel labelshownameempleado;
    private javax.swing.JLabel labelshownameempleado1;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordFieldcontrasena;
    private javax.swing.JButton signoutbutton;
    private javax.swing.JButton signoutbuttonciviles;
    private javax.swing.JTable tablainfociviles;
    private javax.swing.JTable tablainformacionpersonal;
    private javax.swing.JTable tablatramites;
    private javax.swing.JTable tablatramitesciviles;
    private javax.swing.JTextArea textareadescripciontramite;
    private javax.swing.JTextField textfieldNombre;
    private javax.swing.JTextField textfieldNombremod;
    private javax.swing.JTextField textfieldapellidosmod;
    private javax.swing.JTextField textfieldcontramod;
    private javax.swing.JTextField textfieldnombretramite;
    // End of variables declaration//GEN-END:variables
}

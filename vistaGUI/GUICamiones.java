/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistaGUI;

import controlador.ConexionBD;
import controlador.ControladorCamiones;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.accessibility.AccessibleContext;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import modelo.Automovil;

import modelo.Camiones;

/**
 *
 * @author 57314
 */
public class GUICamiones extends javax.swing.JFrame {

    /**
     * Creates new form GUIBuses
     */
    ControladorCamiones contcamion;
    Object[]datos;
    DefaultTableModel model;
    ConexionBD conn;
    Connection con;
    int filas;
    public String seleccionado="";
    public String marca="";
    public GUICamiones() {
        initComponents();
        contcamion = new ControladorCamiones();
        conn = new ConexionBD(); // separo memoria
        con = conn.conexionDB(); // invoco el metod
        datos=new Object[17];
        model = (DefaultTableModel)jTable1.getModel();
        insertarDatosDefecto();
        llenarComboColores();
        llenarComboMarca();
    }
      private void llenarComboColores()
        {
         jCcolor.addItem("Amarillo");
         jCcolor.addItem("Azul");
         jCcolor.addItem("Negro");
         jCcolor.addItem("Blanco");
         jCcolor.addItem("Plata");
         jCcolor.addItem("Naranja");
        } 
      private void llenarComboMarca()
      {
       jCmarca.addItem("Mazda"); 
       jCmarca.addItem("Toyota");
       jCmarca.addItem("Renault");  
       jCmarca.addItem("Subaru");
       jCmarca.addItem("Audi"); 
      }
    private void insertarDatosDefecto(){
   
//        Camiones camion = new Camiones(3, "Metalico","WSD456", 6, 6, "Suzuki", 50000000, "Gris", 4, 5, 2, 8, "Automatica", 6, 5, "Corriente");
//        contcamion.insertar(camion);
//        camion= new Camiones (2, "Metalico","HUD456", 6, 6, "Chevrolet", 36000000, "Gris", 4, 9, 2, 8, "Automatica", 7, 5, "Diesel");
//        contcamion.insertar(camion);
//         camion = new Camiones (1, "Madera","UYT456", 6, 6, "Renault", 23000000, "Gris", 4, 7, 2, 6, "Automatica", 6, 4, "Corriente");
//        contcamion.insertar(camion);
        String query = "SELECT * FROM camiones ORDER BY Placa";
         Statement st;
         Camiones camion;
         try {
            st = con.createStatement();
            ResultSet rs= st.executeQuery(query);
            while(rs.next()){
                camion = new Camiones();
                camion.setPlaca(rs.getString("placa"));
                camion.setPrecio(rs.getFloat("precio"));
                camion.setNumerodecilindros(rs.getInt("NumCilindros"));
                camion.setColor(rs.getString("color"));
                camion.setMarca(rs.getString("marca"));
                camion.setCilindraje(rs.getFloat("cilindraje"));
                camion.setNumchasis(rs.getInt("NumChasis"));
                camion.setNummotor(rs.getInt("NumMotor"));
                camion.setNumpuertas(rs.getInt("Numpuertas"));
                camion.setTamllanta(rs.getInt("TamanoLlanta"));
                camion.setTransmisión(rs.getString("Transmision"));
                camion.setNumcambios(rs.getInt("Numcambios"));
                camion.setGaloneskilometro(rs.getFloat("GalonesKilometro"));
                camion.setTipogasolina(rs.getString("TipoGasolina"));
                camion.setCapcarga(rs.getFloat("CapacidadCarga"));
                camion.setTipocarro(rs.getString("TipoCarroceria"));
                
               
            
               contcamion.insertar(camion);
         }
        } catch (SQLException ex) {
            Logger.getLogger(GUICamiones.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    for(Camiones camion1:contcamion.arreglocamion)
      {
            datos[0]=camion1.getPlaca();
            datos[1]=camion1.getColor();
            datos[2]=camion1.getPrecio();
            datos[3]=camion1.getMarca();
            datos[4]=camion1.getTransmisión();
            datos[5]=camion1.getTipogasolina();
            datos[6]=camion1.getCilindraje();
            datos[7]=camion1.getNumchasis();
            datos[8]=camion1.getNummotor();
            datos[9]=camion1.getNumpuertas();
            datos[10]=camion1.getTamllanta();
            datos[11]=camion1.getTransmisión();
            datos[12]=camion1.getNumcambios();
            datos[13]=camion1.getGaloneskilometro();
            datos[14]=camion1.getCapcarga();
            datos[15]=camion1.getTipocarro();
            datos[16]=camion1.getNumerodecilindros();
            model.addRow(datos);
      }     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTmarca9 = new javax.swing.JTextField();
        jTmarca12 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLplaca = new javax.swing.JLabel();
        jLmarca = new javax.swing.JLabel();
        jLcolor = new javax.swing.JLabel();
        jLnumerodecilindros = new javax.swing.JLabel();
        jLprecio = new javax.swing.JLabel();
        jTtamllanta = new javax.swing.JTextField();
        jBInsertar = new javax.swing.JButton();
        jBBorrar = new javax.swing.JButton();
        jBOrdenarPlaca = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLcilindraje = new javax.swing.JLabel();
        jLnumchasis = new javax.swing.JLabel();
        jLnumpuertas = new javax.swing.JLabel();
        jLnummotor = new javax.swing.JLabel();
        jLtamllanta = new javax.swing.JLabel();
        jLtransmision = new javax.swing.JLabel();
        jLnumcambios = new javax.swing.JLabel();
        jLgalosneskilometro = new javax.swing.JLabel();
        jLtipogasolina = new javax.swing.JLabel();
        jTnumpuertas = new javax.swing.JTextField();
        jTtransmision = new javax.swing.JTextField();
        jTnumcambios = new javax.swing.JTextField();
        jTplaca = new javax.swing.JTextField();
        jTnumerodecilindros = new javax.swing.JTextField();
        jTprecio = new javax.swing.JTextField();
        jTnumchasis = new javax.swing.JTextField();
        jTnummotor = new javax.swing.JTextField();
        jTgaloneskilometro = new javax.swing.JTextField();
        jTtipogasolina = new javax.swing.JTextField();
        jLnumpasajeros = new javax.swing.JLabel();
        jLpesoequipaje = new javax.swing.JLabel();
        jTcapcarga = new javax.swing.JTextField();
        jCcolor = new javax.swing.JComboBox<>();
        jCmarca = new javax.swing.JComboBox<>();
        jTtipocarro = new javax.swing.JTextField();
        jTcilindraje = new javax.swing.JTextField();
        jBOrdenarMotor = new javax.swing.JButton();
        jBmodificar = new javax.swing.JButton();

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Controlador de Camiones");

        jLplaca.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLplaca.setText("Placa");

        jLmarca.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLmarca.setText("Marca");

        jLcolor.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLcolor.setText("Color");

        jLnumerodecilindros.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLnumerodecilindros.setText("Numero Cilindros");

        jLprecio.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLprecio.setText("Precio");

        jBInsertar.setText("Insertar");
        jBInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInsertarActionPerformed(evt);
            }
        });

        jBBorrar.setText("Borrar");
        jBBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBorrarActionPerformed(evt);
            }
        });

        jBOrdenarPlaca.setText("Ordenar por placa");
        jBOrdenarPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBOrdenarPlacaActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Placa", "Color", "Precio", "Marca", "Transmis", "Tip Gasolina", "Cilindraje", "NumChasis", "NumMotor", "NumPuerta", "TamLlantas", "Transmision", "Num Cambios", "Gal Kilometro", "Cap carga", "Tip carroceria"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLcilindraje.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLcilindraje.setText("Cilindraje");

        jLnumchasis.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLnumchasis.setText("Numero de Chasis");

        jLnumpuertas.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLnumpuertas.setText("Numero de Puertas");

        jLnummotor.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLnummotor.setText("Numero de Motor");

        jLtamllanta.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLtamllanta.setText("Tamaño de las Llantas");

        jLtransmision.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLtransmision.setText("Transmision");

        jLnumcambios.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLnumcambios.setText("Numero de Cambios");

        jLgalosneskilometro.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLgalosneskilometro.setText("Galones por Kilometro");

        jLtipogasolina.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLtipogasolina.setText("Tipo de Gasolina");

        jLnumpasajeros.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLnumpasajeros.setText("Capacidad de carga");

        jLpesoequipaje.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLpesoequipaje.setText("Tipo de carroceria");

        jCcolor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCcolorActionPerformed(evt);
            }
        });

        jCmarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCmarcaActionPerformed(evt);
            }
        });

        jBOrdenarMotor.setText("Ordenar por Numero de Motor");
        jBOrdenarMotor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBOrdenarMotorActionPerformed(evt);
            }
        });

        jBmodificar.setText("Modificar");
        jBmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmodificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(383, 383, 383))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBOrdenarPlaca))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLtamllanta)
                                    .addComponent(jLnummotor)
                                    .addComponent(jLnumpuertas)
                                    .addComponent(jLtransmision)
                                    .addComponent(jLnumcambios)
                                    .addComponent(jLprecio)
                                    .addComponent(jLplaca)
                                    .addComponent(jLcolor)
                                    .addComponent(jLnumerodecilindros))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jCmarca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTnumcambios, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                    .addComponent(jTnumpuertas, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                    .addComponent(jTnummotor, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                    .addComponent(jTtransmision, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                    .addComponent(jTtamllanta, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                    .addComponent(jTnumchasis, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                    .addComponent(jCcolor, 0, 148, Short.MAX_VALUE)
                                    .addComponent(jTnumerodecilindros, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                    .addComponent(jTprecio, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                    .addComponent(jTplaca, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)))
                            .addComponent(jLmarca)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLcilindraje)
                                .addGap(90, 90, 90)
                                .addComponent(jTcilindraje, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLnumchasis)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLgalosneskilometro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTgaloneskilometro, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLnumpasajeros)
                                    .addComponent(jLpesoequipaje)
                                    .addComponent(jLtipogasolina))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jTtipocarro, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTcapcarga, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTtipogasolina, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 972, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBOrdenarMotor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBmodificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(983, 983, 983))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jTplaca, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTnumerodecilindros, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCcolor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(100, 100, 100)
                                        .addComponent(jLnumerodecilindros, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLcolor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(48, 48, 48)
                                        .addComponent(jLplaca, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(7, 7, 7)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLmarca, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCmarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLcilindraje, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTcilindraje, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLnumchasis, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTnumchasis, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLnummotor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTnummotor, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLnumpuertas, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTnumpuertas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLtamllanta, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTtamllanta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLtransmision, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTtransmision, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLnumcambios, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTnumcambios, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLgalosneskilometro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTgaloneskilometro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLtipogasolina, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTtipogasolina, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLnumpasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTcapcarga, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLpesoequipaje, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTtipocarro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBBorrar)
                            .addComponent(jBOrdenarPlaca)
                            .addComponent(jBInsertar)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBOrdenarMotor)
                    .addComponent(jBmodificar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInsertarActionPerformed
        // TODO add your handling code here:
        Camiones camion = new Camiones();
        camion.setPlaca(jTplaca.getText());
        camion.setNumerodecilindros(Integer.parseInt(jTnumerodecilindros.getText()));
        camion.setCilindraje(Float.parseFloat(jTcilindraje.getText()));
        camion.setMarca((String)jCmarca.getSelectedItem());
        camion.setPrecio(Float.parseFloat(jTprecio.getText()));
        camion.setColor((String)jCcolor.getSelectedItem());
        camion.setNumchasis(Integer.parseInt(jTnumchasis.getText()));
        camion.setNummotor(Integer.parseInt(jTnummotor.getText()));
        camion.setNumpuertas(Integer.parseInt(jTnumpuertas.getText()));
        camion.setTamllanta(Integer.parseInt(jTtamllanta.getText()));
        camion.setTransmisión(jTtransmision.getText());
        camion.setNumcambios(Integer.parseInt(jTnumcambios.getText()));
        camion.setGaloneskilometro(Float.parseFloat(jTgaloneskilometro.getText()));
        camion.setTipogasolina(jTtipogasolina.getText());
        camion.setCapcarga(Float.parseFloat(jTcapcarga.getText()));
        camion.setTipocarro(jTtipocarro.getText());         
  
        if(contcamion.insertar(camion))
        {
            insertarBD(camion);
            datos[0]=camion.getPlaca();
            datos[1]=camion.getColor();
            datos[2]=camion.getPrecio();
            datos[3]=camion.getMarca();
            datos[4]=camion.getTransmisión();
            datos[5]=camion.getTipogasolina();
            datos[6]=camion.getCilindraje();
            datos[7]=camion.getNumchasis();
            datos[8]=camion.getNummotor();
            datos[9]=camion.getNumpuertas();
            datos[10]=camion.getTamllanta();
            datos[11]=camion.getTransmisión();
            datos[12]=camion.getNumcambios();
            datos[13]=camion.getGaloneskilometro();
            datos[14]=camion.getCapcarga();
            datos[15]=camion.getTipocarro();
            datos[16]=camion.getNumerodecilindros();
            model.addRow(datos);
            JOptionPane.showMessageDialog(this, "Camion insertado");
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Error al insertar ");
        }
    }//GEN-LAST:event_jBInsertarActionPerformed

    private void jBBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBorrarActionPerformed
        // TODO add your handling code here:
        int pos = jTable1.getSelectedRow();
        
        Camiones camion = new Camiones();
        camion= contcamion.arreglocamion.get(pos);
        JOptionPane.showMessageDialog(null, "Entre a borrar el objeto "+ pos +" "+camion.getPlaca());
                
        if(contcamion.borrar(camion)){
            model.removeRow(pos);
            borrarBD(camion);
            JOptionPane.showMessageDialog(null, "Objeto Borrado");
        }
        else
            JOptionPane.showMessageDialog(null, "No se pudo borrar el objeto");
        
    }//GEN-LAST:event_jBBorrarActionPerformed

    private void jCcolorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCcolorActionPerformed
        // TODO add your handling code here:
        llenarComboColores();
    }//GEN-LAST:event_jCcolorActionPerformed

    private void jCmarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCmarcaActionPerformed
        // TODO add your handling code here:
        llenarComboMarca();
    }//GEN-LAST:event_jCmarcaActionPerformed

    private void jBOrdenarPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBOrdenarPlacaActionPerformed
         // TODO add your handling code here:
       contcamion.ordenar();
       int n=model.getRowCount();
       for(int i=0; i<n;i++){
           model.removeRow(0);
       }
       for(Camiones camion1:contcamion.arreglocamion){
            datos[0]=camion1.getPlaca();
            datos[1]=camion1.getColor();
            datos[2]=camion1.getPrecio();
            datos[3]=camion1.getMarca();
            datos[4]=camion1.getTransmisión();
            datos[5]=camion1.getTipogasolina();
            datos[6]=camion1.getCilindraje();
            datos[7]=camion1.getNumchasis();
            datos[8]=camion1.getNummotor();
            datos[9]=camion1.getNumpuertas();
            datos[10]=camion1.getTamllanta();
            datos[11]=camion1.getTransmisión();
            datos[12]=camion1.getNumcambios();
            datos[13]=camion1.getGaloneskilometro();
            datos[14]=camion1.getCapcarga();
            datos[15]=camion1.getTipocarro();
            datos[16]=camion1.getNumerodecilindros();
            model.addRow(datos);
       } 
    }//GEN-LAST:event_jBOrdenarPlacaActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        Camiones camion =new Camiones();
        int pos=jTable1.getSelectedRow();
        camion=contcamion.arreglocamion.get(pos);
        //jTextColor.setText(bus.getColor());
        //jTextMarca.(bus.getMarca());
        jTplaca.setText(camion.getPlaca());
        jTprecio.setText(camion.getPrecio()+"");
        jTnumerodecilindros.setText(camion.getNumerodecilindros()+"");
        jCcolor.setSelectedItem(camion.getColor()+"");
        jCmarca.setSelectedItem(camion.getMarca()+"");
        jTcilindraje.setText(camion.getCilindraje()+"");
        jTnummotor.setText(camion.getNummotor()+"");
        jTnumpuertas.setText(camion.getNumpuertas()+"");
        jTtamllanta.setText(camion.getTamllanta()+"");
        jTtransmision.setText(camion.getTransmisión()+"");
        jTnumcambios.setText(camion.getNumcambios()+"");
        jTnumchasis.setText(camion.getNumchasis()+"");
        jTgaloneskilometro.setText(camion.getGaloneskilometro()+"");
        jTtipogasolina.setText(camion.getTipogasolina()+"");
        jTcapcarga.setText(camion.getCapcarga()+"");
        jTtipocarro.setText(camion.getTipocarro()+"");
    }//GEN-LAST:event_jTable1MouseClicked

    private void jBOrdenarMotorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBOrdenarMotorActionPerformed
        // TODO add your handling code here:
        contcamion.ordenar(0,ControladorCamiones.arreglocamion.size()-1);
        int n=model.getRowCount();
        for(int i=0; i<n;i++){
            model.removeRow(0);
        }
        for(Camiones camion1:contcamion.arreglocamion){
            datos[0]=camion1.getPlaca();
            datos[1]=camion1.getColor();
            datos[2]=camion1.getPrecio();
            datos[3]=camion1.getMarca();
            datos[4]=camion1.getTransmisión();
            datos[5]=camion1.getTipogasolina();
            datos[6]=camion1.getCilindraje();
            datos[7]=camion1.getNumchasis();
            datos[8]=camion1.getNummotor();
            datos[9]=camion1.getNumpuertas();
            datos[10]=camion1.getTamllanta();
            datos[11]=camion1.getTransmisión();
            datos[12]=camion1.getNumcambios();
            datos[13]=camion1.getGaloneskilometro();
            datos[14]=camion1.getCapcarga();
            datos[15]=camion1.getTipocarro();
            datos[16]=camion1.getNumerodecilindros();
            model.addRow(datos);
       } 
    }//GEN-LAST:event_jBOrdenarMotorActionPerformed

    private void jBmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmodificarActionPerformed
        // TODO add your handling code here:
        int pos=jTable1.getSelectedRow();
        Camiones camion = new Camiones();
        camion=contcamion.arreglocamion.get(pos);
        camion.setPlaca(jTplaca.getText());
        camion.setNumerodecilindros(Integer.parseInt(jTnumerodecilindros.getText()));
        camion.setCilindraje(Float.parseFloat(jTcilindraje.getText()));
        camion.setMarca((String)jCmarca.getSelectedItem());
        camion.setPrecio(Float.parseFloat(jTprecio.getText()));
        camion.setColor((String)jCcolor.getSelectedItem());
        camion.setNumchasis(Integer.parseInt(jTnumchasis.getText()));
        camion.setNummotor(Integer.parseInt(jTnummotor.getText()));
        camion.setNumpuertas(Integer.parseInt(jTnumpuertas.getText()));
        camion.setTamllanta(Integer.parseInt(jTtamllanta.getText()));
        camion.setTransmisión(jTtransmision.getText());
        camion.setNumcambios(Integer.parseInt(jTnumcambios.getText()));
        camion.setGaloneskilometro(Float.parseFloat(jTgaloneskilometro.getText()));
        camion.setTipogasolina(jTtipogasolina.getText());
        camion.setCapcarga(Float.parseFloat(jTcapcarga.getText()));
        camion.setTipocarro(jTtipocarro.getText());         
  
        
        camion=(Camiones)contcamion.modificar(camion);
        
        int n= model.getRowCount();
        for(int i=0;i<n;i++){
            model.removeRow(0);
        }
         for(Camiones camion1:contcamion.arreglocamion){
            datos[0]=camion1.getPlaca();
            datos[1]=camion1.getColor();
            datos[2]=camion1.getPrecio();
            datos[3]=camion1.getMarca();
            datos[4]=camion1.getTransmisión();
            datos[5]=camion1.getTipogasolina();
            datos[6]=camion1.getCilindraje();
            datos[7]=camion1.getNumchasis();
            datos[8]=camion1.getNummotor();
            datos[9]=camion1.getNumpuertas();
            datos[10]=camion1.getTamllanta();
            datos[11]=camion1.getTransmisión();
            datos[12]=camion1.getNumcambios();
            datos[13]=camion1.getGaloneskilometro();
            datos[14]=camion1.getCapcarga();
            datos[15]=camion1.getTipocarro();
            datos[16]=camion1.getNumerodecilindros();
            model.addRow(datos);
 
       } 
      JOptionPane.showMessageDialog(this, "Camion Modificado");
    }//GEN-LAST:event_jBmodificarActionPerformed
    private void insertarBD(Camiones camion)
    {
     String query = "INSERT INTO concesionario.camiones VALUES('"+
       camion.getPlaca()+ "',"+camion.getPrecio()+",'"+ camion.getNumerodecilindros()+"','"+
       camion.getColor()+"','"+ camion.getMarca()+"',"+
       camion.getCilindraje()+",'"+ camion.getNumchasis()+"',"+
       camion.getNummotor()+",'"+camion.getNumpuertas()+",'"+camion.getNumpuertas()+",'"+camion.getTamllanta()+",'"+camion.getTransmisión()+"',"+
       camion.getNumcambios()+",'"+camion.getGaloneskilometro()+",'"+camion.getTipogasolina()+",'"+camion.getCapcarga()+",'"+camion.getTipocarro()+
       ")";
        System.out.println(query);      
        
        try {
            Statement st = con.createStatement();
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(this, "Insertado BD");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "NO Insertado BD");
            ex.printStackTrace();
        }
              
    }
    private void borrarBD(Camiones camion)
    {
     String query= "DELETE FROM concesionario.camiones where camion.placa='"+ camion.getPlaca()+"'";
        System.out.println(query);
        try {
            Statement st = con.createStatement();
            st.executeUpdate(query);
             JOptionPane.showMessageDialog(this, "Camion eliminado BD");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Camion NO eliminado BD");
            Logger.getLogger(GUIAutomovil.class.getName()).log(Level.SEVERE, null, ex);
        }
     
                
    }
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(GUIBuses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(GUIBuses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(GUIBuses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(GUIBuses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new GUIBuses().setVisible(true);
//            }
//        }
//        );
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBorrar;
    private javax.swing.JButton jBInsertar;
    private javax.swing.JButton jBOrdenarMotor;
    private javax.swing.JButton jBOrdenarPlaca;
    private javax.swing.JButton jBmodificar;
    private javax.swing.JComboBox<String> jCcolor;
    private javax.swing.JComboBox<String> jCmarca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLcilindraje;
    private javax.swing.JLabel jLcolor;
    private javax.swing.JLabel jLgalosneskilometro;
    private javax.swing.JLabel jLmarca;
    private javax.swing.JLabel jLnumcambios;
    private javax.swing.JLabel jLnumchasis;
    private javax.swing.JLabel jLnumerodecilindros;
    private javax.swing.JLabel jLnummotor;
    private javax.swing.JLabel jLnumpasajeros;
    private javax.swing.JLabel jLnumpuertas;
    private javax.swing.JLabel jLpesoequipaje;
    private javax.swing.JLabel jLplaca;
    private javax.swing.JLabel jLprecio;
    private javax.swing.JLabel jLtamllanta;
    private javax.swing.JLabel jLtipogasolina;
    private javax.swing.JLabel jLtransmision;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTcapcarga;
    private javax.swing.JTextField jTcilindraje;
    private javax.swing.JTextField jTgaloneskilometro;
    private javax.swing.JTextField jTmarca12;
    private javax.swing.JTextField jTmarca9;
    private javax.swing.JTextField jTnumcambios;
    private javax.swing.JTextField jTnumchasis;
    private javax.swing.JTextField jTnumerodecilindros;
    private javax.swing.JTextField jTnummotor;
    private javax.swing.JTextField jTnumpuertas;
    private javax.swing.JTextField jTplaca;
    private javax.swing.JTextField jTprecio;
    private javax.swing.JTextField jTtamllanta;
    private javax.swing.JTextField jTtipocarro;
    private javax.swing.JTextField jTtipogasolina;
    private javax.swing.JTextField jTtransmision;
    // End of variables declaration//GEN-END:variables

    public ControladorCamiones getContcamion() {
        return contcamion;
    }

    public void setContcamion(ControladorCamiones contcamion) {
        this.contcamion = contcamion;
    }

    public Object[] getDatos() {
        return datos;
    }

    public void setDatos(Object[] datos) {
        this.datos = datos;
    }

    public DefaultTableModel getModel() {
        return model;
    }

    public void setModel(DefaultTableModel model) {
        this.model = model;
    }

    public JButton getjBBorrar() {
        return jBBorrar;
    }

    public void setjBBorrar(JButton jBBorrar) {
        this.jBBorrar = jBBorrar;
    }

    public JButton getjBInsertar() {
        return jBInsertar;
    }

    public void setjBInsertar(JButton jBInsertar) {
        this.jBInsertar = jBInsertar;
    }

    public JButton getjBOrdenarPlaca() {
        return jBOrdenarPlaca;
    }

    public void setjBOrdenarPlaca(JButton jBOrdenarPlaca) {
        this.jBOrdenarPlaca = jBOrdenarPlaca;
    }

    public JComboBox<String> getjCcolor() {
        return jCcolor;
    }

    public void setjCcolor(JComboBox<String> jCcolor) {
        this.jCcolor = jCcolor;
    }

    public JComboBox<String> getjCmarca() {
        return jCmarca;
    }

    public void setjCmarca(JComboBox<String> jCmarca) {
        this.jCmarca = jCmarca;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLcilindraje() {
        return jLcilindraje;
    }

    public void setjLcilindraje(JLabel jLcilindraje) {
        this.jLcilindraje = jLcilindraje;
    }

    public JLabel getjLcolor() {
        return jLcolor;
    }

    public void setjLcolor(JLabel jLcolor) {
        this.jLcolor = jLcolor;
    }

    public JLabel getjLgalosneskilometro() {
        return jLgalosneskilometro;
    }

    public void setjLgalosneskilometro(JLabel jLgalosneskilometro) {
        this.jLgalosneskilometro = jLgalosneskilometro;
    }

    public JLabel getjLmarca() {
        return jLmarca;
    }

    public void setjLmarca(JLabel jLmarca) {
        this.jLmarca = jLmarca;
    }

    public JLabel getjLnumcambios() {
        return jLnumcambios;
    }

    public void setjLnumcambios(JLabel jLnumcambios) {
        this.jLnumcambios = jLnumcambios;
    }

    public JLabel getjLnumchasis() {
        return jLnumchasis;
    }

    public void setjLnumchasis(JLabel jLnumchasis) {
        this.jLnumchasis = jLnumchasis;
    }

    public JLabel getjLnumerodecilindros() {
        return jLnumerodecilindros;
    }

    public void setjLnumerodecilindros(JLabel jLnumerodecilindros) {
        this.jLnumerodecilindros = jLnumerodecilindros;
    }

    public JLabel getjLnummotor() {
        return jLnummotor;
    }

    public void setjLnummotor(JLabel jLnummotor) {
        this.jLnummotor = jLnummotor;
    }

    public JLabel getjLnumpasajeros() {
        return jLnumpasajeros;
    }

    public void setjLnumpasajeros(JLabel jLnumpasajeros) {
        this.jLnumpasajeros = jLnumpasajeros;
    }

    public JLabel getjLnumpuertas() {
        return jLnumpuertas;
    }

    public void setjLnumpuertas(JLabel jLnumpuertas) {
        this.jLnumpuertas = jLnumpuertas;
    }

    public JLabel getjLpesoequipaje() {
        return jLpesoequipaje;
    }

    public void setjLpesoequipaje(JLabel jLpesoequipaje) {
        this.jLpesoequipaje = jLpesoequipaje;
    }

    public JLabel getjLplaca() {
        return jLplaca;
    }

    public void setjLplaca(JLabel jLplaca) {
        this.jLplaca = jLplaca;
    }

    public JLabel getjLprecio() {
        return jLprecio;
    }

    public void setjLprecio(JLabel jLprecio) {
        this.jLprecio = jLprecio;
    }

    public JLabel getjLtamllanta() {
        return jLtamllanta;
    }

    public void setjLtamllanta(JLabel jLtamllanta) {
        this.jLtamllanta = jLtamllanta;
    }

    public JLabel getjLtipogasolina() {
        return jLtipogasolina;
    }

    public void setjLtipogasolina(JLabel jLtipogasolina) {
        this.jLtipogasolina = jLtipogasolina;
    }

    public JLabel getjLtransmision() {
        return jLtransmision;
    }

    public void setjLtransmision(JLabel jLtransmision) {
        this.jLtransmision = jLtransmision;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JTable getjTable1() {
        return jTable1;
    }

    public void setjTable1(JTable jTable1) {
        this.jTable1 = jTable1;
    }

    public JTextField getjTcapcarga() {
        return jTcapcarga;
    }

    public void setjTcapcarga(JTextField jTcapcarga) {
        this.jTcapcarga = jTcapcarga;
    }

    public JTextField getjTcilindraje() {
        return jTcilindraje;
    }

    public void setjTcilindraje(JTextField jTcilindraje) {
        this.jTcilindraje = jTcilindraje;
    }

    public JTextField getjTgaloneskilometro() {
        return jTgaloneskilometro;
    }

    public void setjTgaloneskilometro(JTextField jTgaloneskilometro) {
        this.jTgaloneskilometro = jTgaloneskilometro;
    }

    public JTextField getjTmarca12() {
        return jTmarca12;
    }

    public void setjTmarca12(JTextField jTmarca12) {
        this.jTmarca12 = jTmarca12;
    }

    public JTextField getjTmarca9() {
        return jTmarca9;
    }

    public void setjTmarca9(JTextField jTmarca9) {
        this.jTmarca9 = jTmarca9;
    }

    public JTextField getjTnumcambios() {
        return jTnumcambios;
    }

    public void setjTnumcambios(JTextField jTnumcambios) {
        this.jTnumcambios = jTnumcambios;
    }

    public JTextField getjTnumchasis() {
        return jTnumchasis;
    }

    public void setjTnumchasis(JTextField jTnumchasis) {
        this.jTnumchasis = jTnumchasis;
    }

    public JTextField getjTnumerodecilindros() {
        return jTnumerodecilindros;
    }

    public void setjTnumerodecilindros(JTextField jTnumerodecilindros) {
        this.jTnumerodecilindros = jTnumerodecilindros;
    }

    public JTextField getjTnummotor() {
        return jTnummotor;
    }

    public void setjTnummotor(JTextField jTnummotor) {
        this.jTnummotor = jTnummotor;
    }

    public JTextField getjTnumpuertas() {
        return jTnumpuertas;
    }

    public void setjTnumpuertas(JTextField jTnumpuertas) {
        this.jTnumpuertas = jTnumpuertas;
    }

    public JTextField getjTplaca() {
        return jTplaca;
    }

    public void setjTplaca(JTextField jTplaca) {
        this.jTplaca = jTplaca;
    }

    public JTextField getjTprecio() {
        return jTprecio;
    }

    public void setjTprecio(JTextField jTprecio) {
        this.jTprecio = jTprecio;
    }

    public JTextField getjTtamllanta() {
        return jTtamllanta;
    }

    public void setjTtamllanta(JTextField jTtamllanta) {
        this.jTtamllanta = jTtamllanta;
    }

    public JTextField getjTtipocarro() {
        return jTtipocarro;
    }

    public void setjTtipocarro(JTextField jTtipocarro) {
        this.jTtipocarro = jTtipocarro;
    }

    public JTextField getjTtipogasolina() {
        return jTtipogasolina;
    }

    public void setjTtipogasolina(JTextField jTtipogasolina) {
        this.jTtipogasolina = jTtipogasolina;
    }

    public JTextField getjTtransmision() {
        return jTtransmision;
    }

    public void setjTtransmision(JTextField jTtransmision) {
        this.jTtransmision = jTtransmision;
    }

    public JButton getjBmodificar() {
        return jBmodificar;
    }

    public void setjBmodificar(JButton jBmodificar) {
        this.jBmodificar = jBmodificar;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import com.sun.glass.events.KeyEvent;
import java.awt.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import org.jvnet.substance.SubstanceLookAndFeel;

/**
 *
 * @author Usuario
 */
public class Main extends javax.swing.JFrame {

    ArrayList<Clase> clases = new ArrayList();
    ArrayList<Tabla> tablas = new ArrayList();
    ArrayList<Interface> interfaces = new ArrayList();
    Clase clase = null;
    Método método = null;
    Interface Interface = null;
    DefaultMutableTreeNode nodo_seleccionado;

    /**
     * Creates new form Main
     */
    public Main() {
        Main.setDefaultLookAndFeelDecorated(false);
        SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.RavenGraphiteGlassSkin");
        SubstanceLookAndFeel.setCurrentWatermark("org.jvnet.substance.watermark.SubstanceMetalWallWatermark");
        initComponents();
        this.setDefaultCloseOperation(3);
        this.setResizable(false);
        this.setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        crear_clase = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        clase_nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        clase_atributos = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        clase_interfaces = new javax.swing.JList<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        clase_metodos = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        clase_scope = new javax.swing.JComboBox<>();
        clase_herencia = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        crear_atributo = new javax.swing.JDialog();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        atr_nombre = new javax.swing.JTextField();
        atr_scope = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        atr_tipo = new javax.swing.JComboBox<>();
        atr_valor = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        crear_método = new javax.swing.JDialog();
        jLabel12 = new javax.swing.JLabel();
        mtd_nombre = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        mtd_tipo = new javax.swing.JComboBox<>();
        mtd_scope = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mtd_parametros = new javax.swing.JList<>();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        mtd_cuerpo = new javax.swing.JTextArea();
        jButton6 = new javax.swing.JButton();
        crear_interface = new javax.swing.JDialog();
        jLabel17 = new javax.swing.JLabel();
        intf_nombre = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        intf_atributos = new javax.swing.JList<>();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        intf_métodos = new javax.swing.JList<>();
        jButton7 = new javax.swing.JButton();
        menuClass_Kit = new javax.swing.JPopupMenu();
        menu_añadirTodo = new javax.swing.JMenu();
        añadir_atributo = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        añadir_método = new javax.swing.JMenuItem();
        eliminar_todo = new javax.swing.JMenuItem();
        menuMtd = new javax.swing.JPopupMenu();
        añadir_atributo1 = new javax.swing.JMenuItem();
        eliminar_todo2 = new javax.swing.JMenuItem();
        menuIntf = new javax.swing.JPopupMenu();
        menu_añadirTodo1 = new javax.swing.JMenu();
        añadir_atributo2 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        añadir_método1 = new javax.swing.JMenuItem();
        eliminar_todo1 = new javax.swing.JMenuItem();
        main_Clase = new javax.swing.JPopupMenu();
        añadir_clase = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        modificar_clase = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        eliminar_clase = new javax.swing.JMenuItem();
        sql_actions = new javax.swing.JPopupMenu();
        create = new javax.swing.JMenuItem();
        drop = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        add_column = new javax.swing.JMenuItem();
        drop_column = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        add_pk = new javax.swing.JMenuItem();
        add_foreg = new javax.swing.JMenuItem();
        sql_console_create = new javax.swing.JDialog();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        create_editor = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        sql_console_addcolumn = new javax.swing.JDialog();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        editor_addcolumn = new javax.swing.JTextArea();
        jButton8 = new javax.swing.JButton();
        sql_console_dropcolumn = new javax.swing.JDialog();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        editor_dropcolumn = new javax.swing.JTextArea();
        jButton9 = new javax.swing.JButton();
        sql_console_drop = new javax.swing.JDialog();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        editor_drop = new javax.swing.JTextArea();
        jButton10 = new javax.swing.JButton();
        sql_console_pk = new javax.swing.JDialog();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        editor_pk = new javax.swing.JTextArea();
        jButton11 = new javax.swing.JButton();
        sql_console_fk = new javax.swing.JDialog();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        editor_fk = new javax.swing.JTextArea();
        jButton12 = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel11 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        er = new javax.swing.JTree();
        jScrollPane3 = new javax.swing.JScrollPane();
        uml = new javax.swing.JTree();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        exportar = new javax.swing.JMenuItem();
        importar = new javax.swing.JMenuItem();
        informacion = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        salir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        reiniciar = new javax.swing.JMenuItem();

        crear_clase.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        crear_clase.setTitle("Clases");
        crear_clase.setBackground(new java.awt.Color(102, 102, 102));
        crear_clase.setName("Panel de Clase"); // NOI18N
        crear_clase.setType(java.awt.Window.Type.UTILITY);
        crear_clase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crear_claseMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel2.setText("Visibilidad");

        clase_nombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        clase_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clase_nombreActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel3.setText("Atributos");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel4.setText("Métodos");

        clase_atributos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        clase_atributos.setModel(new DefaultListModel());
        clase_atributos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane4.setViewportView(clase_atributos);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel5.setText("Interfaces");

        clase_interfaces.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        clase_interfaces.setModel(new DefaultListModel());
        jScrollPane6.setViewportView(clase_interfaces);

        clase_metodos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        clase_metodos.setModel(new DefaultListModel());
        clase_metodos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane7.setViewportView(clase_metodos);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel6.setText("Nombre");

        clase_scope.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        clase_scope.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "public", "private", "package", "protected" }));

        clase_herencia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel8.setText("Herencia");

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setText("Aceptar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout crear_claseLayout = new javax.swing.GroupLayout(crear_clase.getContentPane());
        crear_clase.getContentPane().setLayout(crear_claseLayout);
        crear_claseLayout.setHorizontalGroup(
            crear_claseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crear_claseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(crear_claseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(crear_claseLayout.createSequentialGroup()
                        .addGroup(crear_claseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(crear_claseLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 187, Short.MAX_VALUE))
                            .addComponent(jScrollPane4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(crear_claseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(crear_claseLayout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(clase_herencia, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(crear_claseLayout.createSequentialGroup()
                                .addGroup(crear_claseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(crear_claseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)))))
                    .addGroup(crear_claseLayout.createSequentialGroup()
                        .addGroup(crear_claseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(crear_claseLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(clase_scope, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(crear_claseLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(clase_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(crear_claseLayout.createSequentialGroup()
                .addGap(380, 380, 380)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        crear_claseLayout.setVerticalGroup(
            crear_claseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crear_claseLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(crear_claseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(crear_claseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(clase_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(crear_claseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(clase_herencia, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addGroup(crear_claseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(crear_claseLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, crear_claseLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(crear_claseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(crear_claseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(crear_claseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addGroup(crear_claseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(clase_scope, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        crear_atributo.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        crear_atributo.setTitle("Atributos");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Valor");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Nombre");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Tipo");

        atr_nombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        atr_scope.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        atr_scope.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "public", "private", "package", "protected" }));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Encapsulamiento");

        atr_tipo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        atr_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "byte", "short", "int", "long", "float", "double", "char", "boolean", "String", "ArrayList" }));

        atr_valor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("Aceptar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout crear_atributoLayout = new javax.swing.GroupLayout(crear_atributo.getContentPane());
        crear_atributo.getContentPane().setLayout(crear_atributoLayout);
        crear_atributoLayout.setHorizontalGroup(
            crear_atributoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crear_atributoLayout.createSequentialGroup()
                .addGroup(crear_atributoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(crear_atributoLayout.createSequentialGroup()
                        .addGroup(crear_atributoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(crear_atributoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(crear_atributoLayout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(crear_atributoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(crear_atributoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(atr_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(crear_atributoLayout.createSequentialGroup()
                                .addGroup(crear_atributoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(atr_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                    .addComponent(atr_valor))
                                .addGap(31, 31, 31)
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(atr_scope, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(crear_atributoLayout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        crear_atributoLayout.setVerticalGroup(
            crear_atributoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crear_atributoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(crear_atributoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(atr_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(atr_scope, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(crear_atributoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(crear_atributoLayout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(crear_atributoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(atr_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(atr_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        crear_método.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        crear_método.setTitle("Métodos");
        crear_método.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crear_métodoMouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Nombre");

        mtd_nombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Tipo");

        mtd_tipo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mtd_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "byte", "void", "short", "int", "long", "float", "double", "char", "boolean", "String", "ArrayList" }));

        mtd_scope.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mtd_scope.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "public", "private", "package", "protected" }));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Encapsulamiento");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Cuerpo");

        mtd_parametros.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mtd_parametros.setModel(new DefaultListModel());
        mtd_parametros.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        mtd_parametros.setLayoutOrientation(javax.swing.JList.HORIZONTAL_WRAP);
        jScrollPane1.setViewportView(mtd_parametros);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Parámetros");

        mtd_cuerpo.setColumns(20);
        mtd_cuerpo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mtd_cuerpo.setRows(5);
        jScrollPane5.setViewportView(mtd_cuerpo);

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.setText("Aceptar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout crear_métodoLayout = new javax.swing.GroupLayout(crear_método.getContentPane());
        crear_método.getContentPane().setLayout(crear_métodoLayout);
        crear_métodoLayout.setHorizontalGroup(
            crear_métodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crear_métodoLayout.createSequentialGroup()
                .addGroup(crear_métodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(crear_métodoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(crear_métodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(crear_métodoLayout.createSequentialGroup()
                                .addGroup(crear_métodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(crear_métodoLayout.createSequentialGroup()
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(crear_métodoLayout.createSequentialGroup()
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(mtd_nombre)
                                        .addGap(73, 73, 73)))
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(mtd_scope, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(crear_métodoLayout.createSequentialGroup()
                                .addGroup(crear_métodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(mtd_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(crear_métodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(crear_métodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(crear_métodoLayout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        crear_métodoLayout.setVerticalGroup(
            crear_métodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crear_métodoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(crear_métodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mtd_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mtd_scope, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(crear_métodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mtd_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(crear_métodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(crear_métodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        crear_interface.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        crear_interface.setTitle("Interfaces");
        crear_interface.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crear_interfaceMouseClicked(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel17.setText("Nombre");

        intf_nombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        intf_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intf_nombreActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel18.setText("Atributos");

        intf_atributos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        intf_atributos.setModel(new DefaultListModel());
        intf_atributos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane8.setViewportView(intf_atributos);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel19.setText("Métodos");

        intf_métodos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        intf_métodos.setModel(new DefaultListModel());
        intf_métodos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane9.setViewportView(intf_métodos);

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton7.setText("Aceptar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout crear_interfaceLayout = new javax.swing.GroupLayout(crear_interface.getContentPane());
        crear_interface.getContentPane().setLayout(crear_interfaceLayout);
        crear_interfaceLayout.setHorizontalGroup(
            crear_interfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crear_interfaceLayout.createSequentialGroup()
                .addGroup(crear_interfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(crear_interfaceLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(crear_interfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(crear_interfaceLayout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addComponent(intf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(crear_interfaceLayout.createSequentialGroup()
                                .addGroup(crear_interfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(crear_interfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(crear_interfaceLayout.createSequentialGroup()
                                        .addComponent(jLabel19)
                                        .addGap(172, 172, 172))
                                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))))
                    .addGroup(crear_interfaceLayout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        crear_interfaceLayout.setVerticalGroup(
            crear_interfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crear_interfaceLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(crear_interfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(intf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(crear_interfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(crear_interfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        menuClass_Kit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        menu_añadirTodo.setText("Añadir");
        menu_añadirTodo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        añadir_atributo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        añadir_atributo.setText("Atributo");
        añadir_atributo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadir_atributoActionPerformed(evt);
            }
        });
        menu_añadirTodo.add(añadir_atributo);
        menu_añadirTodo.add(jSeparator5);

        añadir_método.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        añadir_método.setText("Método");
        añadir_método.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadir_métodoActionPerformed(evt);
            }
        });
        menu_añadirTodo.add(añadir_método);

        menuClass_Kit.add(menu_añadirTodo);

        eliminar_todo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        eliminar_todo.setText("Eliminar");
        eliminar_todo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_todoActionPerformed(evt);
            }
        });
        menuClass_Kit.add(eliminar_todo);

        menuMtd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        añadir_atributo1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        añadir_atributo1.setText("Añadir Parámetros");
        añadir_atributo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadir_atributo1ActionPerformed(evt);
            }
        });
        menuMtd.add(añadir_atributo1);

        eliminar_todo2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        eliminar_todo2.setText("Eliminar");
        eliminar_todo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_todo2ActionPerformed(evt);
            }
        });
        menuMtd.add(eliminar_todo2);

        menuIntf.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        menu_añadirTodo1.setText("Añadir");
        menu_añadirTodo1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        añadir_atributo2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        añadir_atributo2.setText("Atributo");
        añadir_atributo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadir_atributo2ActionPerformed(evt);
            }
        });
        menu_añadirTodo1.add(añadir_atributo2);
        menu_añadirTodo1.add(jSeparator4);

        añadir_método1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        añadir_método1.setText("Método");
        añadir_método1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadir_método1ActionPerformed(evt);
            }
        });
        menu_añadirTodo1.add(añadir_método1);

        menuIntf.add(menu_añadirTodo1);

        eliminar_todo1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        eliminar_todo1.setText("Eliminar");
        eliminar_todo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_todo1ActionPerformed(evt);
            }
        });
        menuIntf.add(eliminar_todo1);

        main_Clase.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        añadir_clase.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        añadir_clase.setText("Añadir");
        añadir_clase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadir_claseActionPerformed(evt);
            }
        });
        main_Clase.add(añadir_clase);
        main_Clase.add(jSeparator2);

        modificar_clase.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        modificar_clase.setText("Modificar");
        modificar_clase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificar_claseActionPerformed(evt);
            }
        });
        main_Clase.add(modificar_clase);
        main_Clase.add(jSeparator3);

        eliminar_clase.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        eliminar_clase.setText("Eliminar");
        eliminar_clase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_claseActionPerformed(evt);
            }
        });
        main_Clase.add(eliminar_clase);

        create.setText("CREATE TABLE");
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
            }
        });
        sql_actions.add(create);

        drop.setText("DROP TABLE");
        drop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropActionPerformed(evt);
            }
        });
        sql_actions.add(drop);
        sql_actions.add(jSeparator6);

        add_column.setText("ADD COLUMN");
        add_column.setToolTipText("");
        add_column.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_columnActionPerformed(evt);
            }
        });
        sql_actions.add(add_column);

        drop_column.setText("DROP COLUMN");
        drop_column.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drop_columnActionPerformed(evt);
            }
        });
        sql_actions.add(drop_column);
        sql_actions.add(jSeparator7);

        add_pk.setText("ADD PRIMARY KEY");
        add_pk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_pkActionPerformed(evt);
            }
        });
        sql_actions.add(add_pk);

        add_foreg.setText("ADD FOREIGN KEY");
        add_foreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_foregActionPerformed(evt);
            }
        });
        sql_actions.add(add_foreg);

        sql_console_create.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        sql_console_create.setTitle("Ejecutor SQL");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Consola SQL");

        create_editor.setColumns(20);
        create_editor.setRows(5);
        jScrollPane10.setViewportView(create_editor);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Ejecutar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sql_console_createLayout = new javax.swing.GroupLayout(sql_console_create.getContentPane());
        sql_console_create.getContentPane().setLayout(sql_console_createLayout);
        sql_console_createLayout.setHorizontalGroup(
            sql_console_createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sql_console_createLayout.createSequentialGroup()
                .addGroup(sql_console_createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sql_console_createLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(sql_console_createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(sql_console_createLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel20)))
                    .addGroup(sql_console_createLayout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        sql_console_createLayout.setVerticalGroup(
            sql_console_createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sql_console_createLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        sql_console_addcolumn.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        sql_console_addcolumn.setTitle("Ejecutor SQL");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("Consola SQL");

        editor_addcolumn.setColumns(20);
        editor_addcolumn.setRows(5);
        jScrollPane11.setViewportView(editor_addcolumn);

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setText("Ejecutar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sql_console_addcolumnLayout = new javax.swing.GroupLayout(sql_console_addcolumn.getContentPane());
        sql_console_addcolumn.getContentPane().setLayout(sql_console_addcolumnLayout);
        sql_console_addcolumnLayout.setHorizontalGroup(
            sql_console_addcolumnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sql_console_addcolumnLayout.createSequentialGroup()
                .addGroup(sql_console_addcolumnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sql_console_addcolumnLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(sql_console_addcolumnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(sql_console_addcolumnLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel21)))
                    .addGroup(sql_console_addcolumnLayout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        sql_console_addcolumnLayout.setVerticalGroup(
            sql_console_addcolumnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sql_console_addcolumnLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        sql_console_dropcolumn.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        sql_console_dropcolumn.setTitle("Ejecutor SQL");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("Consola SQL");

        editor_dropcolumn.setColumns(20);
        editor_dropcolumn.setRows(5);
        jScrollPane12.setViewportView(editor_dropcolumn);

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton9.setText("Ejecutar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sql_console_dropcolumnLayout = new javax.swing.GroupLayout(sql_console_dropcolumn.getContentPane());
        sql_console_dropcolumn.getContentPane().setLayout(sql_console_dropcolumnLayout);
        sql_console_dropcolumnLayout.setHorizontalGroup(
            sql_console_dropcolumnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sql_console_dropcolumnLayout.createSequentialGroup()
                .addGroup(sql_console_dropcolumnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sql_console_dropcolumnLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(sql_console_dropcolumnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(sql_console_dropcolumnLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel22)))
                    .addGroup(sql_console_dropcolumnLayout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        sql_console_dropcolumnLayout.setVerticalGroup(
            sql_console_dropcolumnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sql_console_dropcolumnLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        sql_console_drop.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        sql_console_drop.setTitle("Ejecutor SQL");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setText("Consola SQL");

        editor_drop.setColumns(20);
        editor_drop.setRows(5);
        jScrollPane13.setViewportView(editor_drop);

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton10.setText("Ejecutar");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sql_console_dropLayout = new javax.swing.GroupLayout(sql_console_drop.getContentPane());
        sql_console_drop.getContentPane().setLayout(sql_console_dropLayout);
        sql_console_dropLayout.setHorizontalGroup(
            sql_console_dropLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sql_console_dropLayout.createSequentialGroup()
                .addGroup(sql_console_dropLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sql_console_dropLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(sql_console_dropLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(sql_console_dropLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel23)))
                    .addGroup(sql_console_dropLayout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        sql_console_dropLayout.setVerticalGroup(
            sql_console_dropLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sql_console_dropLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        sql_console_pk.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        sql_console_pk.setTitle("Ejecutor SQL");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("Consola SQL");

        editor_pk.setColumns(20);
        editor_pk.setRows(5);
        jScrollPane14.setViewportView(editor_pk);

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton11.setText("Ejecutar");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sql_console_pkLayout = new javax.swing.GroupLayout(sql_console_pk.getContentPane());
        sql_console_pk.getContentPane().setLayout(sql_console_pkLayout);
        sql_console_pkLayout.setHorizontalGroup(
            sql_console_pkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sql_console_pkLayout.createSequentialGroup()
                .addGroup(sql_console_pkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sql_console_pkLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(sql_console_pkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(sql_console_pkLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel24)))
                    .addGroup(sql_console_pkLayout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        sql_console_pkLayout.setVerticalGroup(
            sql_console_pkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sql_console_pkLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        sql_console_fk.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        sql_console_fk.setTitle("Ejecutor SQL");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setText("Consola SQL");

        editor_fk.setColumns(20);
        editor_fk.setRows(5);
        jScrollPane15.setViewportView(editor_fk);

        jButton12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton12.setText("Ejecutar");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sql_console_fkLayout = new javax.swing.GroupLayout(sql_console_fk.getContentPane());
        sql_console_fk.getContentPane().setLayout(sql_console_fkLayout);
        sql_console_fkLayout.setHorizontalGroup(
            sql_console_fkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sql_console_fkLayout.createSequentialGroup()
                .addGroup(sql_console_fkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sql_console_fkLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(sql_console_fkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(sql_console_fkLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel25)))
                    .addGroup(sql_console_fkLayout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        sql_console_fkLayout.setVerticalGroup(
            sql_console_fkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sql_console_fkLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Acciones");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Generar Clases");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Generar SQL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(39, 39, 39))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(90, 90, 90)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDesktopPane1.setLayer(jPanel11, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Base de datos");
        er.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        er.setToolTipText("Diagrama ER");
        er.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                erMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(er);

        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Proyecto");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Clases");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Interfaces");
        treeNode1.add(treeNode2);
        uml.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        uml.setToolTipText("Diagrama UML");
        uml.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                umlMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(uml);

        jDesktopPane2.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 796, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenu1.setText("Archivo");

        exportar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_MASK));
        exportar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        exportar.setText("Exportar");
        exportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportarActionPerformed(evt);
            }
        });
        jMenu1.add(exportar);

        importar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_MASK));
        importar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        importar.setText("Importar");
        importar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importarActionPerformed(evt);
            }
        });
        importar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                importarKeyPressed(evt);
            }
        });
        jMenu1.add(importar);

        informacion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.CTRL_MASK));
        informacion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        informacion.setText("Información");
        informacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                informacionActionPerformed(evt);
            }
        });
        jMenu1.add(informacion);
        jMenu1.add(jSeparator1);

        salir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        salir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jMenu1.add(salir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edición");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        reiniciar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        reiniciar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        reiniciar.setText("Reiniciar");
        reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reiniciarActionPerformed(evt);
            }
        });
        jMenu2.add(reiniciar);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
            .addComponent(jDesktopPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clase_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clase_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clase_nombreActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            clase.setNombre(clase_nombre.getText());
            clase.setVisibilidad(clase_scope.getSelectedItem().toString());
            int[] index = clase_interfaces.getSelectedIndices();
            clase.setInterfaces(new ArrayList<Interface>());
            DefaultListModel modelo = (DefaultListModel) clase_interfaces.getModel();
            for (int i : index) {
                clase.getInterfaces().add((Interface) modelo.getElementAt(i));
            }
            if (!clase.equals(nodo_seleccionado.getUserObject())) {
                if (nodo_seleccionado.getUserObject() instanceof String) {
                    clase.setPadre(null);
                } else {
                    clase.setPadre((Clase) nodo_seleccionado.getUserObject());
                }
                nodo_seleccionado.add(new DefaultMutableTreeNode(clase));
                DefaultComboBoxModel model = (DefaultComboBoxModel) atr_tipo.getModel();
                model.addElement(clase);
                model.addElement("ArrayList <" + clase + ">");
                model = (DefaultComboBoxModel) mtd_tipo.getModel();
                model.addElement(clase);
                model.addElement("ArrayList <" + clase + ">");
                clases.add(clase);
            }
            int abstr = JOptionPane.showConfirmDialog(null, "¿Su clase es abstracta?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (abstr == 1) {
                for (Interface ifc : clase.getInterfaces()) {
                    for (Método mtdf : ifc.getMetodos()) {
                        Método mt = new Método(mtdf.getNombre(), mtdf.getRetorno(), "", mtdf.getVisibilidad(), false, true);
                        mt.setParametros(mtdf.getParametros());
                        clase.getMétodos().add(mt);
                    }
                }
                if (clase.getPadre() != null && clase.getPadre().isAbtracto()) {
                    for (Método mtdf : clase.getPadre().getMétodos()) {
                        if (mtdf.isAbstracto()) {
                            Método mt = new Método(mtdf.getNombre(), mtdf.getRetorno(), "", mtdf.getVisibilidad(), false, true);
                            mt.setParametros(mtdf.getParametros());
                            clase.getMétodos().add(mt);
                        }
                    }
                }
                clase.setAbstracto(false);
            } else {
                clase.setAbstracto(true);
            }
            if (clase.getPadre() != null) {
                for (Método mtdf : clase.getPadre().getMétodos()) {
                    for (Método met : clase.getMétodos()) {
                        if (mtdf.getNombre().equals(met.getNombre())) {
                            met.setOverWrite(true);
                        }
                    }
                }
            }
            DefaultTreeModel modeloArbol = (DefaultTreeModel) uml.getModel();
            modeloArbol.reload();
            clase_nombre.setText("");
            clase_metodos.setModel(new DefaultListModel());
            clase_atributos.setModel(new DefaultListModel());
            clase_interfaces.setModel(new DefaultListModel());
            clase = null;
            crear_clase.setVisible(false);
            this.setVisible(true);
        } catch (Exception ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Un error ha ocurrido.");

        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void crear_claseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crear_claseMouseClicked
        if (evt.isMetaDown()) {
            menuTodo(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_crear_claseMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (clase != null && método == null) {;
            agregarAtributo(clase);
        } else if (clase != null & método != null) {
            agregarAtributo(método);
        } else if (Interface != null && método == null) {
            agregarAtributo(Interface);
        } else if (método != null && Interface != null) {
            agregarAtributo(método);
        }
        atr_nombre.setText("");
        atr_valor.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            método.setNombre(mtd_nombre.getText());
            método.setRetorno(mtd_tipo.getSelectedItem().toString());
            método.setVisibilidad(this.mtd_scope.getSelectedItem().toString());
            método.setCuerpo(mtd_cuerpo.getText());
            if (clase != null && Interface == null) {
                agregarMétodo(clase);
            }
            if (Interface != null && clase == null) {
                agregarMétodo(Interface);
            }
            crear_método.setVisible(false);
            método = null;
            mtd_nombre.setText("");
            mtd_nombre.setText("");
            mtd_cuerpo.setText("");
            mtd_parametros.setModel(new DefaultListModel());
            mtd_cuerpo.setEnabled(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Un error ha ocurrido.");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void crear_métodoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crear_métodoMouseClicked
        if (evt.isMetaDown()) {
            menuTodo(crear_método, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_crear_métodoMouseClicked

    private void añadir_atributo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadir_atributo1ActionPerformed
        if (método != null) {
            crear_método.setVisible(false);
            atributo(crear_método);
        }
    }//GEN-LAST:event_añadir_atributo1ActionPerformed

    private void añadir_atributo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadir_atributo2ActionPerformed
        crear_interface.setVisible(false);
        atributo(crear_interface);
    }//GEN-LAST:event_añadir_atributo2ActionPerformed

    private void añadir_método1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadir_método1ActionPerformed
        crear_interface.setVisible(false);
        metodo(crear_interface);
    }//GEN-LAST:event_añadir_método1ActionPerformed

    private void añadir_métodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadir_métodoActionPerformed
        crear_clase.setVisible(false);
        metodo(crear_clase);
    }//GEN-LAST:event_añadir_métodoActionPerformed

    private void añadir_atributoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadir_atributoActionPerformed
        crear_clase.setVisible(false);
        atributo(crear_clase);
    }//GEN-LAST:event_añadir_atributoActionPerformed

    private void crear_interfaceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crear_interfaceMouseClicked
        if (evt.isMetaDown()) {
            menuTodo(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_crear_interfaceMouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        agregarInterface(nodo_seleccionado);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void intf_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intf_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_intf_nombreActionPerformed

    private void umlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_umlMouseClicked
        int row = uml.getClosestRowForLocation(evt.getX(), evt.getY());
        uml.setSelectionRow(row);
        Object v1 = uml.getSelectionPath().getLastPathComponent();
        nodo_seleccionado = (DefaultMutableTreeNode) v1;
        if (nodo_seleccionado.getUserObject() instanceof Clase) {
            clase = (Clase) nodo_seleccionado.getUserObject();
        }
        if (evt.isMetaDown()) {
            menuTodo(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_umlMouseClicked

    private void añadir_claseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadir_claseActionPerformed
        if (nodo_seleccionado.getUserObject().equals("Interfaces")) {
            interf(this);
        } else if (nodo_seleccionado.getUserObject().equals("Clases") || nodo_seleccionado.getUserObject() instanceof Clase) {
            Clase(null);
        } else {
            JOptionPane.showMessageDialog(null, "¡Aquí no puede agregar nada!");
        }
    }//GEN-LAST:event_añadir_claseActionPerformed

    private void modificar_claseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar_claseActionPerformed
        if (nodo_seleccionado.getUserObject() instanceof Clase) {
            Clase(nodo_seleccionado);
            if (nodo_seleccionado.getUserObject() instanceof Clase) {
                clase = (Clase) nodo_seleccionado.getUserObject();
            } else {
                JOptionPane.showMessageDialog(null, "¡Debe seleccionar una clase!");
            }
        } else if (nodo_seleccionado.getUserObject() instanceof Interface) {
            Interface = (Interface) nodo_seleccionado.getUserObject();
            interf(this);
        } else {
            JOptionPane.showMessageDialog(null, "¡Aquí no se puede modificar nada!");
        }
    }//GEN-LAST:event_modificar_claseActionPerformed

    private void eliminar_claseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_claseActionPerformed
        int response = JOptionPane.showConfirmDialog(null, "¿Seguro de eliminar?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        uml.removeSelectionPath(uml.getSelectionPath());
        if (response == JOptionPane.OK_OPTION) {
            DefaultTreeModel m = (DefaultTreeModel) uml.getModel();
            if (nodo_seleccionado.getUserObject() instanceof String) {
                JOptionPane.showMessageDialog(null, "¡No puede eliminar el proyecto!");
            } else {
                m.removeNodeFromParent(nodo_seleccionado);
            }
            m.reload();
        }
    }//GEN-LAST:event_eliminar_claseActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            if (nodo_seleccionado != null && nodo_seleccionado.getUserObject() instanceof Clase) {
                Object[] padres = nodo_seleccionado.getUserObjectPath();
                for (Object padre : padres) {
                    if (padre instanceof Clase && !padre.equals(nodo_seleccionado.getUserObject())) {
                        Clase claseExp = new Clase();
                        Clase ref = (Clase) padre;
                        claseExp.setAbstracto(ref.isAbtracto());
                        claseExp.setNombre(ref.getNombre());
                        claseExp.setAtributos(ref.getAtributos());
                        claseExp.setInterfaces(ref.getInterfaces());
                        claseExp.setMétodos(new ArrayList<Método>());
                        for (Método mt : ref.getMétodos()) {
                            claseExp.getMétodos().add(mt);
                        }
                        claseExp.setPadre(ref.getPadre());
                        claseExp.setVisibilidad(ref.getVisibilidad());
                        claseExp.createConstructor();
                        claseExp.GetterAndSetters();
                        claseExp.setToString();
                        generarClases(claseExp);
                    }
                }
                generarSubClases(nodo_seleccionado);
                JOptionPane.showMessageDialog(null, "Sus Clases fueron creadas con éxito.");
            } else {
                JOptionPane.showMessageDialog(null, "¡No seleccionó ninguna clase!");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Un error ha ocurrido.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void importarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importarActionPerformed
        File f = null;
        FileInputStream fos = null;
        ObjectInputStream oos = null;
        try {
            JFileChooser fc = new JFileChooser();
            int accion = fc.showOpenDialog(this);
            if (accion == JFileChooser.APPROVE_OPTION) {
                String ruta = fc.getSelectedFile().getAbsolutePath();
                try {
                    f = new File(ruta);
                    fos = new FileInputStream(f);
                    oos = new ObjectInputStream(fos);
                    Binario bnt = (Binario) oos.readObject();
                    er.setModel(new DefaultTreeModel(bnt.getSql()));
                    uml.setModel(new DefaultTreeModel(bnt.getUml()));
                    clases = bnt.getClases();
                    interfaces = bnt.getInterfaces();
                    tablas = bnt.getTablas();
                } catch (IOException | ClassNotFoundException e) {
                    System.out.println(e);
                }
                try {
                    oos.close();
                    fos.close();
                } catch (Exception ex) {

                }
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        DefaultTreeModel model = (DefaultTreeModel) er.getModel();
        DefaultTreeModel model2 = (DefaultTreeModel) uml.getModel();
        model2.reload();
        model.reload();
    }//GEN-LAST:event_importarActionPerformed

    private void importarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_importarKeyPressed

    }//GEN-LAST:event_importarKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (tablas.size() > 0) {
            String string = "";

            for (Tabla tabla : tablas) {
                string += "CREATE TABLE " + tabla.getNombre() + "(\r\n";
                for (Campo camp : tabla.getCampos()) {
                    string += camp.getNombre() + " " + camp.getTipo() + ",\r\n";
                }
                string += ");\r\n";
                for (Campo camp : tabla.getCampos()) {
                    if (camp.isPrimaria()) {
                        string += "ALTER TABLE " + tabla.getNombre() + " ADD PRIMARY KEY (" + camp.getNombre() + ");\r\n";
                    }
                }
                for (Campo camp : tabla.getCampos()) {
                    if (camp.isSecundaria()) {
                        string += "ALTER TABLE " + tabla.getNombre() + " ADD FOREIGN KEY FROM " + camp.getReferencia2() + " (" + camp.getNombre() + "," + camp.getReferencia1() + ");";
                    }
                }
                string += "\r\n";
            }
            File ar = null;
            FileWriter fw = null;
            BufferedWriter bw = null;
            try {
                ar = new File("./Tablas/ SQL.sql");
                fw = new FileWriter(ar, false);
                bw = new BufferedWriter(fw);
                bw.write(string);
                bw.flush();
            } catch (Exception e) {
            }
            try {
                fw.close();
                bw.close();
                JOptionPane.showMessageDialog(null, "Su código sql, fue generado correctamente.");
            } catch (IOException ex) {
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void exportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportarActionPerformed
        File f = null;
        try {
            JFileChooser fc = new JFileChooser();
            int accion = fc.showSaveDialog(this);
            Binario bn = new Binario((DefaultMutableTreeNode) ((DefaultTreeModel) uml.getModel()).getRoot(), (DefaultMutableTreeNode) ((DefaultTreeModel) this.er.getModel()).getRoot(), interfaces, tablas, clases);
            if (accion == JFileChooser.APPROVE_OPTION) {
                String ruta = fc.getSelectedFile().getAbsolutePath();
                f = new File(ruta);
                FileOutputStream fos = new FileOutputStream(f);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(bn);
                try {
                    oos.flush();
                    oos.close();
                    fos.close();
                } catch (Exception e) {
                    System.out.println(e.getMessage());

                }
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_exportarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void drop_columnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drop_columnActionPerformed
        sql_console_dropcolumn.setSize(531, 460);
        sql_console_dropcolumn.setResizable(false);
        sql_console_dropcolumn.setLocationRelativeTo(this);
        this.setVisible(false);
        sql_console_dropcolumn.setVisible(true);
    }//GEN-LAST:event_drop_columnActionPerformed

    private void erMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_erMouseClicked
        if (evt.isMetaDown()) {
            sql_actions.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_erMouseClicked

    private void createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createActionPerformed
        sql_console_create.setSize(531, 460);
        sql_console_create.setResizable(false);
        sql_console_create.setLocationRelativeTo(this);
        this.setVisible(false);
        sql_console_create.setVisible(true);
    }//GEN-LAST:event_createActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            Tabla temp = new Tabla();
            String[] tableAll = create_editor.getText().split(";\n");
            for (String table : tableAll) {
                String campos = table.substring(table.indexOf("(") + 1, table.length() - 1);
                table = table.substring(0, table.indexOf("(") - 1);
                String[] tables = table.split(" ");
                String[] campoString = campos.split(",\n");
                temp = new Tabla(tables[2]);
                for (String string : campoString) {
                    String[] paramCampo = string.split(" ");
                    Campo camp = new Campo(paramCampo[0], false, false, paramCampo[1]);
                    boolean control = true;
                    for (Campo tempCamp : temp.getCampos()) {
                        if (camp.getNombre().equals(tempCamp.getNombre())) {
                            control = false;
                        }
                    }
                    if (control) {
                        temp.getCampos().add(camp);
                    }
                }
                boolean control = true;
                for (Tabla tabla : tablas) {
                    if (tabla.getNombre().equals(temp.getNombre())) {
                        control = false;
                    }
                }
                if (control) {
                    tablas.add(temp);
                }
            }
            er.setModel(new DefaultTreeModel(new DefaultMutableTreeNode("Base de datos")));
            DefaultTreeModel model = (DefaultTreeModel) er.getModel();
            DefaultMutableTreeNode nodo = (DefaultMutableTreeNode) model.getRoot();
            for (Tabla tabla : tablas) {
                DefaultMutableTreeNode nodoTabla = new DefaultMutableTreeNode(tabla);
                DefaultMutableTreeNode normalCamp = new DefaultMutableTreeNode("Campos");
                DefaultMutableTreeNode nodoPrimarios = new DefaultMutableTreeNode("Llaves primarias");
                DefaultMutableTreeNode nodoForaneo = new DefaultMutableTreeNode("Llaves foráneas");
                for (Campo campito : tabla.getCampos()) {
                    if (campito.isPrimaria()) {
                        if (campito.isPrimaria()) {
                            nodoPrimarios.add(new DefaultMutableTreeNode(campito));
                        }
                    } else if (campito.isSecundaria()) {
                        nodoForaneo.add(new DefaultMutableTreeNode(campito));
                    } else {
                        normalCamp.add(new DefaultMutableTreeNode(campito));
                    }
                }
                nodoTabla.add(nodoPrimarios);
                nodoTabla.add(nodoForaneo);
                nodoTabla.add(normalCamp);
                nodo.add(nodoTabla);
            }
            model.reload();
            create_editor.setText("");
            sql_console_create.setVisible(false);
            this.setVisible(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error de Síntaxis.");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void add_columnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_columnActionPerformed
        sql_console_addcolumn.setSize(531, 460);
        sql_console_addcolumn.setResizable(false);
        sql_console_addcolumn.setLocationRelativeTo(this);
        this.setVisible(false);
        sql_console_addcolumn.setVisible(true);
    }//GEN-LAST:event_add_columnActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try {
            String[] tableAll = editor_addcolumn.getText().split(";\n");
            for (String string : tableAll) {
                String tableName = string.substring(0, string.indexOf('\n')).split(" ")[2];
                String[] campo = string.substring(string.indexOf('\n'), string.length()).split(" ");
                for (Tabla tabTemp : tablas) {
                    if (tabTemp.getNombre().equals(tableName)) {
                        tabTemp.getCampos().add(new Campo(campo[1], false, false, campo[2]));
                    }
                }
            }
            er.setModel(new DefaultTreeModel(new DefaultMutableTreeNode("Base de datos")));
            DefaultTreeModel model = (DefaultTreeModel) er.getModel();
            DefaultMutableTreeNode nodo = (DefaultMutableTreeNode) model.getRoot();
            for (Tabla tabla : tablas) {
                DefaultMutableTreeNode nodoTabla = new DefaultMutableTreeNode(tabla);
                DefaultMutableTreeNode normalCamp = new DefaultMutableTreeNode("Campos");
                DefaultMutableTreeNode nodoPrimarios = new DefaultMutableTreeNode("Llaves primarias");
                DefaultMutableTreeNode nodoForaneo = new DefaultMutableTreeNode("Llaves foráneas");
                for (Campo campito : tabla.getCampos()) {
                    if (campito.isPrimaria()) {
                        if (campito.isPrimaria()) {
                            nodoPrimarios.add(new DefaultMutableTreeNode(campito));
                        }
                    } else if (campito.isSecundaria()) {
                        nodoForaneo.add(new DefaultMutableTreeNode(campito));
                    } else {
                        normalCamp.add(new DefaultMutableTreeNode(campito));
                    }
                }
                nodoTabla.add(nodoPrimarios);
                nodoTabla.add(nodoForaneo);
                nodoTabla.add(normalCamp);
                nodo.add(nodoTabla);
            }
            model.reload();
            editor_addcolumn.setText("");
            sql_console_create.setVisible(false);
            this.setVisible(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error de síntaxis.");
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        try {
            String[] tableAll = editor_dropcolumn.getText().split(";\n");
            for (String string : tableAll) {
                String tableName = string.substring(0, string.indexOf('\n')).split(" ")[2];
                String[] campo = string.substring(string.indexOf('\n'), string.length()).split(" ");
                for (Tabla tabTemp : tablas) {
                    if (tabTemp.getNombre().equals(tableName)) {
                        for (Campo cpm : tabTemp.getCampos()) {
                            if (cpm.getNombre().equals(campo[2])) {
                                tabTemp.getCampos().remove(cpm);
                            }
                        }
                    }
                }
            }
            er.setModel(new DefaultTreeModel(new DefaultMutableTreeNode("Base de datos")));
            DefaultTreeModel model = (DefaultTreeModel) er.getModel();
            DefaultMutableTreeNode nodo = (DefaultMutableTreeNode) model.getRoot();
            for (Tabla tabla : tablas) {
                DefaultMutableTreeNode nodoTabla = new DefaultMutableTreeNode(tabla);
                DefaultMutableTreeNode normalCamp = new DefaultMutableTreeNode("Campos");
                DefaultMutableTreeNode nodoPrimarios = new DefaultMutableTreeNode("Llaves primarias");
                DefaultMutableTreeNode nodoForaneo = new DefaultMutableTreeNode("Llaves foráneas");
                for (Campo campito : tabla.getCampos()) {
                    if (campito.isPrimaria()) {
                        if (campito.isPrimaria()) {
                            nodoPrimarios.add(new DefaultMutableTreeNode(campito));
                        }
                    } else if (campito.isSecundaria()) {
                        nodoForaneo.add(new DefaultMutableTreeNode(campito));
                    } else {
                        normalCamp.add(new DefaultMutableTreeNode(campito));
                    }
                }
                nodoTabla.add(nodoPrimarios);
                nodoTabla.add(nodoForaneo);
                nodoTabla.add(normalCamp);
                nodo.add(nodoTabla);
            }
            model.reload();
            editor_dropcolumn.setText("");
            sql_console_dropcolumn.setVisible(false);
            this.setVisible(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error de síntaxis.");
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void dropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropActionPerformed
        sql_console_drop.setSize(531, 460);
        sql_console_drop.setResizable(false);
        sql_console_drop.setLocationRelativeTo(this);
        this.setVisible(false);
        sql_console_drop.setVisible(true);
    }//GEN-LAST:event_dropActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        try {
            String[] tableAll = editor_drop.getText().split(";\n");
            for (String string : tableAll) {
                String tableName = string.split(" ")[2];
                for (int i = 0; i < tablas.size(); i++) {
                    Tabla tabTemp = tablas.get(i);
                    if (tabTemp.getNombre().equals(tableName)) {
                        tablas.remove(tabTemp);
                    }
                }
            }
            er.setModel(new DefaultTreeModel(new DefaultMutableTreeNode("Base de datos")));
            DefaultTreeModel model = (DefaultTreeModel) er.getModel();
            DefaultMutableTreeNode nodo = (DefaultMutableTreeNode) model.getRoot();
            for (Tabla tabla : tablas) {
                DefaultMutableTreeNode nodoTabla = new DefaultMutableTreeNode(tabla);
                DefaultMutableTreeNode normalCamp = new DefaultMutableTreeNode("Campos");
                DefaultMutableTreeNode nodoPrimarios = new DefaultMutableTreeNode("Llaves primarias");
                DefaultMutableTreeNode nodoForaneo = new DefaultMutableTreeNode("Llaves foráneas");
                for (Campo campito : tabla.getCampos()) {
                    if (campito.isPrimaria()) {
                        if (campito.isPrimaria()) {
                            nodoPrimarios.add(new DefaultMutableTreeNode(campito));
                        }
                    } else if (campito.isSecundaria()) {
                        nodoForaneo.add(new DefaultMutableTreeNode(campito));
                    } else {
                        normalCamp.add(new DefaultMutableTreeNode(campito));
                    }
                }
                nodoTabla.add(nodoPrimarios);
                nodoTabla.add(nodoForaneo);
                nodoTabla.add(normalCamp);
                nodo.add(nodoTabla);
            }
            model.reload();
            editor_drop.setText("");
            sql_console_drop.setVisible(false);
            this.setVisible(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error de síntaxis.");
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        try {
            String[] sentencias = editor_pk.getText().split(";\n");
            for (String sentencia : sentencias) {
                String[] comandos = sentencia.split(" ");
                String nombre = comandos[2];
                String campos = comandos[comandos.length - 1].replace("(", "").replace(")", "");
                String[] campoS = campos.split(",");
                for (Tabla tabTem : tablas) {
                    if (tabTem.getNombre().equals(nombre) && !tabTem.isPrimarykey()) {
                        for (String string : campoS) {
                            for (Campo campotemp : tabTem.getCampos()) {
                                if (campotemp.getNombre().equals(string)) {
                                    campotemp.setPrimaria(true);
                                }
                            }
                        }
                    }
                }
                for (Tabla tabTem : tablas) {
                    if (tabTem.equals(nombre) && !tabTem.isPrimarykey()) {
                        tabTem.setPrimarykey(true);
                    }
                }
            }
            er.setModel(new DefaultTreeModel(new DefaultMutableTreeNode("Base de datos")));
            DefaultTreeModel model = (DefaultTreeModel) er.getModel();
            DefaultMutableTreeNode nodo = (DefaultMutableTreeNode) model.getRoot();
            for (Tabla tabla : tablas) {
                DefaultMutableTreeNode nodoTabla = new DefaultMutableTreeNode(tabla);
                DefaultMutableTreeNode normalCamp = new DefaultMutableTreeNode("Campos");
                DefaultMutableTreeNode nodoPrimarios = new DefaultMutableTreeNode("Llaves primarias");
                DefaultMutableTreeNode nodoForaneo = new DefaultMutableTreeNode("Llaves foráneas");
                for (Campo campito : tabla.getCampos()) {
                    if (campito.isPrimaria()) {
                        if (campito.isPrimaria()) {
                            nodoPrimarios.add(new DefaultMutableTreeNode(campito));
                        }
                    } else if (campito.isSecundaria()) {
                        nodoForaneo.add(new DefaultMutableTreeNode(campito));
                    } else {
                        normalCamp.add(new DefaultMutableTreeNode(campito));
                    }
                }
                nodoTabla.add(nodoPrimarios);
                nodoTabla.add(nodoForaneo);
                nodoTabla.add(normalCamp);
                nodo.add(nodoTabla);
            }
            model.reload();
            editor_pk.setText("");
            sql_console_pk.setVisible(false);
            this.setVisible(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error de síntaxis.");
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        String[] sentencias = editor_fk.getText().split(";\n");
        for (String sentencia : sentencias) {
            String[] comandos = sentencia.split(" ");
            String nombre = comandos[2];
            String nombre2 = comandos[7];
            String campos = comandos[comandos.length - 1].replace("(", "").replace(")", "");
            String[] campoS = campos.split(",");
            for (String string : campoS) {
                for (Tabla tabTemp : tablas) {
                    if (tabTemp.getNombre().equals(nombre)) {
                        for (Tabla tp : tablas) {
                            if (tp.getNombre().equals(nombre2)) {
                                for (Campo cps : tp.getCampos()) {
                                    if (cps.getNombre().equals(campoS[1]) && cps.isPrimaria()) {
                                        for (Campo cpss : tabTemp.getCampos()) {
                                            if (cpss.getNombre().equals(campoS[0])) {
                                                cpss.setSecundaria(true);
                                                cpss.setReferencia1(campoS[1]);
                                                cpss.setReferencia2(nombre2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            er.setModel(new DefaultTreeModel(new DefaultMutableTreeNode("Base de datos")));
            DefaultTreeModel model = (DefaultTreeModel) er.getModel();
            DefaultMutableTreeNode nodo = (DefaultMutableTreeNode) model.getRoot();
            for (Tabla tabla : tablas) {
                DefaultMutableTreeNode nodoTabla = new DefaultMutableTreeNode(tabla);
                DefaultMutableTreeNode normalCamp = new DefaultMutableTreeNode("Campos");
                DefaultMutableTreeNode nodoPrimarios = new DefaultMutableTreeNode("Llaves primarias");
                DefaultMutableTreeNode nodoForaneo = new DefaultMutableTreeNode("Llaves foráneas");
                for (Campo campito : tabla.getCampos()) {
                    if (campito.isPrimaria()) {
                        if (campito.isPrimaria()) {
                            nodoPrimarios.add(new DefaultMutableTreeNode(campito));
                        }
                    } else if (campito.isSecundaria()) {
                        nodoForaneo.add(new DefaultMutableTreeNode(campito));
                    } else {
                        normalCamp.add(new DefaultMutableTreeNode(campito));
                    }
                }
                nodoTabla.add(nodoPrimarios);
                nodoTabla.add(nodoForaneo);
                nodoTabla.add(normalCamp);
                nodo.add(nodoTabla);
            }
            model.reload();
            editor_fk.setText("");
            sql_console_fk.setVisible(false);
            this.setVisible(true);
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void add_pkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_pkActionPerformed
        sql_console_pk.setSize(531, 460);
        sql_console_pk.setResizable(false);
        sql_console_pk.setLocationRelativeTo(this);
        this.setVisible(false);
        sql_console_pk.setVisible(true);
    }//GEN-LAST:event_add_pkActionPerformed

    private void add_foregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_foregActionPerformed
        sql_console_fk.setSize(531, 460);
        sql_console_fk.setResizable(false);
        sql_console_fk.setLocationRelativeTo(this);
        this.setVisible(false);
        sql_console_fk.setVisible(true);
    }//GEN-LAST:event_add_foregActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed

    }//GEN-LAST:event_jMenu2ActionPerformed

    private void reiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reiniciarActionPerformed
        er.setModel(new DefaultTreeModel(new DefaultMutableTreeNode("Base de datos")));
        DefaultTreeModel model = (DefaultTreeModel) er.getModel();
        model.reload();
        DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Proyecto");
        DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Clases");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Interfaces");
        treeNode1.add(treeNode2);
        uml.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        ((DefaultTreeModel) uml.getModel()).reload();
        clases = new ArrayList();
        tablas = new ArrayList();
        interfaces = new ArrayList();
    }//GEN-LAST:event_reiniciarActionPerformed

    private void informacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_informacionActionPerformed
        JOptionPane.showMessageDialog(null, "Vizio versión Beta 0.1.8\n"
                + "Autor: César Figueroa\n"
                + "Directorio: https://github.com/Cesar123456/Vizio\n"
                + "Ingeniero Osman Mejía\n"
                + "Programación II\n"
                + "Universidad Tecnológica Centroamericana"
        );
    }//GEN-LAST:event_informacionActionPerformed

    private void eliminar_todoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_todoActionPerformed
        clase.setAtributos(new ArrayList());
        clase.setMétodos(new ArrayList());
        clase_atributos.setModel(new DefaultListModel());
        clase_metodos.setModel(new DefaultListModel());
    }//GEN-LAST:event_eliminar_todoActionPerformed

    private void eliminar_todo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_todo2ActionPerformed
        mtd_parametros.setModel(new DefaultListModel());
        método.setParametros(new ArrayList());
    }//GEN-LAST:event_eliminar_todo2ActionPerformed

    private void eliminar_todo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_todo1ActionPerformed
        intf_atributos.setModel(new DefaultListModel());
        intf_métodos.setModel(new DefaultListModel());
        Interface.setAtributos(new ArrayList());
        Interface.setAtributos(new ArrayList());

    }//GEN-LAST:event_eliminar_todo1ActionPerformed

    public void generarSubClases(DefaultMutableTreeNode clase) {
        try {
            Clase claseExp = new Clase();
            if (clase.getUserObject() instanceof Clase) {
                Clase ref = (Clase) clase.getUserObject();
                claseExp.setAbstracto(ref.isAbtracto());
                claseExp.setNombre(ref.getNombre());
                claseExp.setAtributos(ref.getAtributos());
                claseExp.setInterfaces(ref.getInterfaces());
                claseExp.setMétodos(new ArrayList<Método>());
                for (Método mt : ref.getMétodos()) {
                    claseExp.getMétodos().add(mt);
                }
                claseExp.setPadre(ref.getPadre());
                claseExp.setVisibilidad(ref.getVisibilidad());
                claseExp.createConstructor();
                claseExp.GetterAndSetters();
                claseExp.setToString();
                generarClases(claseExp);
                for (int i = 0; i < clase.getChildCount(); i++) {
                    DefaultMutableTreeNode hijo = (DefaultMutableTreeNode) clase.getChildAt(i);
                    claseExp = new Clase();
                    generarSubClases(hijo);
                }
            } else if (clase.getUserObject().equals("Clases")) {
                for (int i = 0; i < clase.getChildCount(); i++) {
                    DefaultMutableTreeNode hijo = (DefaultMutableTreeNode) clase.getChildAt(i);
                    claseExp = new Clase();
                    generarSubClases(hijo);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una clase.");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Un error ha ocurrido.");
        }
    }

    public void generarClases(Clase claseExp) {
        String codigo = "package Proyecto;\r\n";
        codigo += claseExp.getVisibilidad();
        if (claseExp.isAbtracto()) {
            codigo += " abstract";
        }
        codigo += " class " + claseExp.getNombre() + "";
        if (claseExp.getPadre() != null) {
            codigo += " extends " + claseExp.getPadre().getNombre();
        }
        if (claseExp.getInterfaces().size() > 0) {
            codigo += " implements";
            int cont = 0;
            for (Interface inte : claseExp.getInterfaces()) {
                codigo += " " + inte.getNombre();
                cont++;
                if (cont > 0 && cont < claseExp.getInterfaces().size()) {
                    codigo += ",";
                }
            }
        }
        codigo += " { \r\n";
        for (Atributo temp : claseExp.getAtributos()) {
            codigo += "   " + temp.getScope() + " " + temp.getTipo() + " " + temp.getNombre() + " = " + temp.getValor() + ";\r\n";
        }
        codigo += " \r\n\t";
        for (Método mt : claseExp.getMétodos()) {
            if (mt.isOverWrite()) {
                if (codigo.charAt(codigo.length() - 1) == '\t') {
                    codigo += "@Override" + "\r\n\t";
                } else {
                    codigo += "\t@Override" + "\r\n\t";
                }
            }
            if (!mt.isAbstracto()) {
                if (codigo.charAt(codigo.length() - 1) == '\t') {
                    codigo += mt.getVisibilidad() + " " + mt.getRetorno() + " " + mt.getNombre() + "(";
                } else {
                    codigo += "\t" + mt.getVisibilidad() + " " + mt.getRetorno() + " " + mt.getNombre() + "(";
                }
            } else if (codigo.charAt(codigo.length() - 1) == '\t') {
                codigo += mt.getVisibilidad() + " abstract " + mt.getRetorno() + " " + mt.getNombre() + "(";
            } else {
                codigo += "\t" + mt.getVisibilidad() + " " + mt.getRetorno() + " " + mt.getNombre() + "(";
            }
            for (Atributo pt : mt.getParametros()) {
                if (mt.getParametros().indexOf(pt) != mt.getParametros().size() - 1) {
                    codigo += pt.getTipo() + " " + pt.getNombre() + ", ";
                } else {
                    codigo += pt.getTipo() + " " + pt.getNombre();
                }
            }
            if (!mt.isAbstracto()) {
                codigo += ") { \r\n\t\t";
                codigo += mt.getCuerpo();
                codigo += "\r\n\t}\r\n\r\n";
            } else {
                codigo += ");\r\n\r\n";
            }
            if (claseExp.getMétodos().indexOf(mt) != clase.getMétodos().size() - 1) {
                codigo += "\t";
            } else {
                codigo += "\t\r\n";
            }
        }
        codigo = codigo.replaceAll("\\t*$", "");
        codigo += "}";
        File ar = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            ar = new File("./Clases/" + claseExp.getNombre() + ".java");
            fw = new FileWriter(ar, false);
            bw = new BufferedWriter(fw);
            bw.write(codigo);
            bw.flush();
        } catch (Exception e) {
        }
        try {
            fw.close();
            bw.close();
        } catch (IOException ex) {
        }
    }

    public void agregarAtributo(Object objeto) {
        try {
            String nombre = atr_nombre.getText();
            String tipo = atr_tipo.getSelectedItem().toString();
            String encap = atr_scope.getSelectedItem().toString();
            String valor = atr_valor.getText();
            if (objeto instanceof Clase) {
                Atributo atributo = new Atributo(nombre, tipo, encap, valor);
                crear_atributo.setVisible(false);
                Clase clase = ((Clase) objeto);
                if (atributo.getValor().equals("")) {
                    atributo.setValor("null");
                }
                clase.getAtributos().add(atributo);
                clase_atributos.setModel(new DefaultListModel());
                DefaultListModel model = (DefaultListModel) clase_atributos.getModel();
                clase.getAtributos().stream().forEach((attr) -> {
                    model.addElement(attr);
                });
                crear_clase.setVisible(true);
            } else if (objeto instanceof Interface) {
                Atributo atributo = new Atributo(nombre, tipo, encap, valor);
                if (atributo.getValor().equals("")) {
                    atributo.setValor("null");
                }
                crear_atributo.setVisible(false);
                Interface obj = ((Interface) objeto);
                obj.getAtributos().add(atributo);
                intf_atributos.setModel(new DefaultListModel());
                DefaultListModel model = (DefaultListModel) intf_atributos.getModel();
                obj.getAtributos().stream().forEach((attr) -> {
                    model.addElement(attr);
                });
                crear_interface.setVisible(true);
            } else if (objeto instanceof Método) {
                Atributo atributo = new Atributo(nombre, tipo, encap, valor);
                crear_atributo.setVisible(false);
                Método mt = ((Método) objeto);
                mt.getParametros().add(atributo);
                mtd_parametros.setModel(new DefaultListModel());
                DefaultListModel model = (DefaultListModel) mtd_parametros.getModel();
                método.getParametros().stream().forEach((attr) -> {
                    model.addElement(attr);
                });
                crear_método.setVisible(true);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Un error ha ocurrido.");
        }
    }

    public void agregarMétodo(Object objeto) {
        if (objeto instanceof Clase) {
            crear_método.setVisible(false);
            Clase clase = ((Clase) objeto);
            clase.getMétodos().add(método);
            clase_metodos.setModel(new DefaultListModel());
            DefaultListModel model = (DefaultListModel) clase_metodos.getModel();
            clase.getMétodos().stream().forEach((mtd) -> {
                model.addElement(mtd);
            });
            crear_clase.setVisible(true);
        } else if (objeto instanceof Interface) {
            crear_método.setVisible(false);
            Interface intf = ((Interface) objeto);
            intf.getMetodos().add(método);
            intf_métodos.setModel(new DefaultListModel());
            DefaultListModel model = (DefaultListModel) intf_métodos.getModel();
            for (Iterator<Método> it = intf.getMetodos().iterator(); it.hasNext();) {
                Método mtd = it.next();
                model.addElement(mtd);
            }
            crear_interface.setVisible(true);
        }
    }

    public void agregarInterface(Object objeto) {
        try {
            if (!nodo_seleccionado.getUserObject().equals(Interface)) {
                Interface.setNombre(intf_nombre.getText());
                nodo_seleccionado.add(new DefaultMutableTreeNode(Interface));
                interfaces.add(Interface);
                DefaultTreeModel modelo = (DefaultTreeModel) uml.getModel();
                modelo.reload();
                clase_interfaces.setModel(new DefaultListModel());
                DefaultListModel model = (DefaultListModel) clase_interfaces.getModel();
                interfaces.stream().forEach((intf) -> {
                    model.addElement(intf);
                });
            } else {
                Interface.setNombre(intf_nombre.getText());
                intf_métodos.setModel(new DefaultListModel());
                intf_atributos.setModel(new DefaultListModel());
                intf_nombre.setText("");
            }
            crear_interface.setVisible(false);
            this.setVisible(true);
            Interface = null;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Un error ha ocurrido.");
        }

    }

    public void atributo(Component comp) {
        atr_nombre.setText("");
        atr_valor.setText("");
        crear_atributo.setSize(513, 310);
        crear_atributo.setResizable(false);
        crear_atributo.setLocationRelativeTo(comp);
        if (comp.equals(crear_método)) {
            jLabel11.setVisible(false);
            atr_scope.setVisible(false);
            jLabel7.setVisible(false);
            atr_valor.setVisible(false);
            crear_atributo.setSize(513, 310);
        } else {
            jLabel11.setVisible(true);
            atr_scope.setVisible(true);
            jLabel7.setVisible(true);
            atr_valor.setVisible(true);
        }
        crear_atributo.setVisible(true);
    }

    public void Clase(Object object) {
        crear_clase.setSize(866, 500);
        crear_clase.setResizable(false);
        crear_clase.setLocationRelativeTo(null);
        if (object == null && !nodo_seleccionado.getUserObject().equals("Proyecto") && !nodo_seleccionado.getUserObject().equals("Interfaces")) {
            int abstr = JOptionPane.showConfirmDialog(null, "¿Su clase es abstracta?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (abstr == 0) {
                clase = new Clase(true);
            } else {
                clase = new Clase();
            }
            if (!(nodo_seleccionado.getUserObject() instanceof String)) {
                clase_herencia.setEnabled(false);
                clase_herencia.setModel(new DefaultComboBoxModel());
                DefaultComboBoxModel mod = (DefaultComboBoxModel) clase_herencia.getModel();
                mod.addElement(nodo_seleccionado);
            } else {
                clase_herencia.setEnabled(false);
            }
            clase_interfaces.setModel(new DefaultListModel());
            DefaultListModel model = (DefaultListModel) clase_interfaces.getModel();
            for (Interface met : interfaces) {
                model.addElement(met);
            }
        } else if (!nodo_seleccionado.getUserObject().equals("Proyecto") && !nodo_seleccionado.getUserObject().equals("Interfaces")) {
            clase_nombre.setText(clase.getNombre());
            clase_metodos.setModel(new DefaultListModel());
            clase_atributos.setModel(new DefaultListModel());
            clase_interfaces.setModel(new DefaultListModel());
            clase_metodos.setModel(new DefaultListModel());
            DefaultListModel model = (DefaultListModel) clase_metodos.getModel();
            for (Método met : clase.getMétodos()) {
                model.addElement(met);
            }
            clase_atributos.setModel(new DefaultListModel());
            model = (DefaultListModel) clase_atributos.getModel();
            for (Atributo met : clase.getAtributos()) {
                model.addElement(met);
            }
            clase_interfaces.setModel(new DefaultListModel());
            model = (DefaultListModel) clase_interfaces.getModel();
            for (Interface met : interfaces) {
                model.addElement(met);
            }
            if (clase.getPadre() != null) {
                clase_herencia.setEnabled(false);
                clase_herencia.setModel(new DefaultComboBoxModel());
                DefaultComboBoxModel mod = (DefaultComboBoxModel) clase_herencia.getModel();
                mod.addElement(clase.getPadre());
            } else {
                clase_herencia.setEnabled(false);
                clase_herencia.setModel(new DefaultComboBoxModel());
                DefaultComboBoxModel mod = (DefaultComboBoxModel) clase_herencia.getModel();
            }
        }
        if (nodo_seleccionado.getUserObject().equals("Proyecto") || nodo_seleccionado.getUserObject().equals("Interfaces")) {
            JOptionPane.showMessageDialog(null, "¡Aquí no puede añadir Clases!");
        } else {
            this.setVisible(false);
            crear_clase.setVisible(true);
        }
    }

    public void metodo(Component comp) {
        int abstr;
        if (comp.equals(crear_clase) && clase.isAbtracto()) {
            abstr = JOptionPane.showConfirmDialog(null, "¿Su método es abstracto?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        } else if (comp.equals(this.crear_interface)) {
            abstr = 0;
        } else {
            abstr = 1;
        }
        if (abstr == 0) {
            mtd_cuerpo.setEnabled(false);
            método = new Método(true);
        } else {
            método = new Método();
            mtd_cuerpo.setEnabled(true);
        }
        crear_método.setSize(605, 456);
        crear_método.setResizable(false);
        crear_método.setLocationRelativeTo(comp);
        crear_método.setVisible(true);
    }

    public void interf(Component comp) {
        if (Interface == null) {
            Interface = new Interface();
            intf_métodos.setModel(new DefaultListModel());
            intf_atributos.setModel(new DefaultListModel());
            intf_nombre.setText("");
        } else {
            intf_nombre.setText(Interface.getNombre());
            DefaultListModel model = (DefaultListModel) intf_métodos.getModel();
            for (Método met : Interface.getMetodos()) {
                model.addElement(met);
            }
            model = (DefaultListModel) intf_atributos.getModel();
            for (Atributo atb : Interface.getAtributos()) {
                model.addElement(atb);
            }
        }
        crear_interface.setSize(568, 430);
        crear_interface.setLocationRelativeTo(null);
        this.setVisible(false);
        crear_interface.setVisible(true);
    }

    public void menuTodo(Component comp, int x, int y) {
        if (comp.equals(crear_clase)) {
            menuClass_Kit.show(comp, x, y);
        } else if (comp.equals(crear_método)) {
            menuMtd.show(comp, x, y);
        } else if (comp.equals(crear_interface)) {
            menuIntf.show(comp, x, y);
        } else if (comp.equals(uml)) {
            main_Clase.show(comp, x, y);
        }

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem add_column;
    private javax.swing.JMenuItem add_foreg;
    private javax.swing.JMenuItem add_pk;
    private javax.swing.JTextField atr_nombre;
    private javax.swing.JComboBox<String> atr_scope;
    private javax.swing.JComboBox<String> atr_tipo;
    private javax.swing.JTextField atr_valor;
    private javax.swing.JMenuItem añadir_atributo;
    private javax.swing.JMenuItem añadir_atributo1;
    private javax.swing.JMenuItem añadir_atributo2;
    private javax.swing.JMenuItem añadir_clase;
    private javax.swing.JMenuItem añadir_método;
    private javax.swing.JMenuItem añadir_método1;
    private javax.swing.JList<String> clase_atributos;
    private javax.swing.JComboBox<String> clase_herencia;
    private javax.swing.JList<String> clase_interfaces;
    private javax.swing.JList<String> clase_metodos;
    private javax.swing.JTextField clase_nombre;
    private javax.swing.JComboBox<String> clase_scope;
    private javax.swing.JDialog crear_atributo;
    private javax.swing.JDialog crear_clase;
    private javax.swing.JDialog crear_interface;
    private javax.swing.JDialog crear_método;
    private javax.swing.JMenuItem create;
    private javax.swing.JTextArea create_editor;
    private javax.swing.JMenuItem drop;
    private javax.swing.JMenuItem drop_column;
    private javax.swing.JTextArea editor_addcolumn;
    private javax.swing.JTextArea editor_drop;
    private javax.swing.JTextArea editor_dropcolumn;
    private javax.swing.JTextArea editor_fk;
    private javax.swing.JTextArea editor_pk;
    private javax.swing.JMenuItem eliminar_clase;
    private javax.swing.JMenuItem eliminar_todo;
    private javax.swing.JMenuItem eliminar_todo1;
    private javax.swing.JMenuItem eliminar_todo2;
    private javax.swing.JTree er;
    private javax.swing.JMenuItem exportar;
    private javax.swing.JMenuItem importar;
    private javax.swing.JMenuItem informacion;
    private javax.swing.JList<String> intf_atributos;
    private javax.swing.JList<String> intf_métodos;
    private javax.swing.JTextField intf_nombre;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu main_Clase;
    private javax.swing.JPopupMenu menuClass_Kit;
    private javax.swing.JPopupMenu menuIntf;
    private javax.swing.JPopupMenu menuMtd;
    private javax.swing.JMenu menu_añadirTodo;
    private javax.swing.JMenu menu_añadirTodo1;
    private javax.swing.JMenuItem modificar_clase;
    private javax.swing.JTextArea mtd_cuerpo;
    private javax.swing.JTextField mtd_nombre;
    private javax.swing.JList<String> mtd_parametros;
    private javax.swing.JComboBox<String> mtd_scope;
    private javax.swing.JComboBox<String> mtd_tipo;
    private javax.swing.JMenuItem reiniciar;
    private javax.swing.JMenuItem salir;
    private javax.swing.JPopupMenu sql_actions;
    private javax.swing.JDialog sql_console_addcolumn;
    private javax.swing.JDialog sql_console_create;
    private javax.swing.JDialog sql_console_drop;
    private javax.swing.JDialog sql_console_dropcolumn;
    private javax.swing.JDialog sql_console_fk;
    private javax.swing.JDialog sql_console_pk;
    private javax.swing.JTree uml;
    // End of variables declaration//GEN-END:variables
}

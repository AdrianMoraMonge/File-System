/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import controller.Controlador;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;

/**
 *
 * @author adri-
 */
public class interfaz extends javax.swing.JFrame {
    
    private Controlador controlador;
    private JPopupMenu popupMenu;
    private DefaultTableModel model;
    private DefaultTreeModel modelTree;
    private DefaultMutableTreeNode rootTree;
    private boolean busqueda;
    
    public interfaz() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        popupTable();
        eventosMouse();
        crearDisco();
        editarElementos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel1.setText("root");

        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(jTree1);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("File System");

        jTextField1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 33, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jButton4)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(317, 317, 317))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(1, 1, 1))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu2.setText("Archivo");
        jMenu2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jMenuItem1.setText("Crear directorio");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jMenuItem2.setText("Crear archivo");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);
        jMenu2.add(jSeparator1);

        jMenuItem4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jMenuItem4.setText("Copiar de Ruta Real");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String title = controlador.irAtras();
        jLabel1.setText(title);
        cargarCarpeta();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String nombre = jTextField1.getText();
        if(nombre.isEmpty())
            JOptionPane.showMessageDialog(this, "Escriba para buscar", "Error",JOptionPane.ERROR_MESSAGE);
        else{
            while(model.getRowCount() > 0){
                model.removeRow(0);
            }
            ArrayList<String[]> listDocument = controlador.buscarDocument(nombre);
            for (int i = 0; i < listDocument.size(); i++) {
                model.addRow(new Object[]{listDocument.get(i)[0], listDocument.get(i)[1]});
            }
            busqueda = true;
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        addDirectory addDirect = new addDirectory(this,true);
        addDirect.setLocationRelativeTo(null);
        addDirect.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        addFiles addFile = new addFiles(this,true);
        addFile.setLocationRelativeTo(null);
        addFile.setVisible(true); 
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int respuesta = fc.showOpenDialog(this);
        if(respuesta == JFileChooser.APPROVE_OPTION){
            File select = fc.getSelectedFile();
            if(select != null){
                int cant = espacioNecesario(select.getAbsolutePath(),0);
                if(controlador.getCantSectorLibres() >= cant){
                    treeDocuments copyDocument = new treeDocuments(this,true);
                    copyDocument.setLocationRelativeTo(null);
                    copyDocument.copiarRRCargar("root", controlador,select.getAbsolutePath());
                    copyDocument.setVisible(true);
                }
                else
                    JOptionPane.showMessageDialog(this, "No hay espacio suficiente en el disco.", "Error",JOptionPane.ERROR_MESSAGE);
            }
            else
                JOptionPane.showMessageDialog(this, "Seleccione un documento.", "Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void popupTable(){
        popupMenu = new JPopupMenu();
        JMenuItem item1 = new JMenuItem("Abrir");
        JMenuItem item2 = new JMenuItem("Copiar");
        JMenuItem item3 = new JMenuItem("Mover");
        JMenuItem item4 = new JMenuItem("Ver propiedades");
        JMenuItem item5 = new JMenuItem("Eliminar");
        
        item1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                abrirDocument(jTable1.getSelectedRow());
            }
        });
        
        item2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                openCopyOptions();
            }
        });
        
        item3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                mover(jTable1.getSelectedRow());
            }
        });
        
        item4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                verPropiedades(jTable1.getSelectedRow());
            }
        });
        
        item5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                eliminar(jTable1.getSelectedRow());
            }
        });
        
        popupMenu.add(item1);
        popupMenu.add(item2);
        popupMenu.add(item3);
        popupMenu.add(item4);
        popupMenu.add(item5);
    }
    
    private void openCopyOptions(){
        copyOptions copyOption = new copyOptions(this,true);
        copyOption.setLocationRelativeTo(null);
        copyOption.setVisible(true);
    }
    
    private void editarElementos(){
        Image img = new ImageIcon("data/rehacer.png").getImage();
        ImageIcon icBtn = new ImageIcon(img.getScaledInstance(jButton3.getWidth(), jButton3.getHeight(), Image.SCALE_SMOOTH));
        jButton3.setIcon(icBtn);
        
        Image img2 = new ImageIcon("data/lupa.png").getImage();
        ImageIcon icBtn2 = new ImageIcon(img2.getScaledInstance(jButton4.getWidth(), jButton4.getHeight(), Image.SCALE_SMOOTH));
        jButton4.setIcon(icBtn2);
        
        model = (DefaultTableModel) jTable1.getModel();
        modelTree = (DefaultTreeModel) jTree1.getModel();
        rootTree = (DefaultMutableTreeNode) jTree1.getModel().getRoot();
        busqueda = false;
    }
    
    private void eliminar(int pSelectDocument){
        controlador.eliminarElemento(pSelectDocument, busqueda);
        limpiarArbol();
        cargarCarpeta();
    }
    
    public void eliminarNombre(String pNombre) {
        eliminar(controlador.getPos(pNombre));
    }
    
    private int espacioNecesario(String pDir, int cant){
        File document = new File(pDir);
        File[] childs = document.listFiles();
        for (int i = 0; i < childs.length; i++) {
            String pNewDirR = childs[i].getAbsolutePath();
            File newDocument = new File(pNewDirR);
            if(newDocument.isDirectory())
                espacioNecesario(newDocument.getAbsolutePath(), cant);
            else{
                cant += copiarRRtoSF(newDocument.getAbsolutePath()).length() / controlador.getSectorSize();
                if(copiarRRtoSF(newDocument.getAbsolutePath()).length() % controlador.getSectorSize() != 0)
                    cant++;
            }
        }
        return cant;
    }
    
    private void mover(int pSelectDocument){
        treeDocuments moveDocument = new treeDocuments(this,true);
        moveDocument.setLocationRelativeTo(null);
        moveDocument.mostrarCarpetas("root", controlador, controlador.getDir(pSelectDocument, busqueda));
        moveDocument.setVisible(true);
    }
    
    public boolean copiarAFS(String pNewDir, String pAntDir){
        ArrayList<String[]> documents = controlador.getCarpetaDocuments(pNewDir);
        int pos = pAntDir.lastIndexOf("/");
        String nombre = pAntDir.substring(pos+1);
        for (int i = 0; i < documents.size(); i++) {
            if(documents.get(i)[0].compareToIgnoreCase(nombre) == 0)
                return false;
        }
        controlador.crearDocumentCopiados(pNewDir, pAntDir);
        limpiarArbol();
        cargarCarpeta();
        return true;
    }
    
    public boolean copiarToFS(String pNewDir, String pAntDir){
        ArrayList<String[]> documents = controlador.getCarpetaDocuments(pNewDir);
        int pos = pAntDir.lastIndexOf("\\");
        String nombre = pAntDir.substring(pos+1);
        for (int i = 0; i < documents.size(); i++) {
            if(documents.get(i)[0].compareToIgnoreCase(nombre) == 0)
                return false;
        }
        File document = new File(pAntDir);
        if(document.isDirectory())
            copiarRRtoFS(pNewDir, pAntDir);
        else{
            String cont = copiarRRtoSF(pAntDir);
            pos = nombre.lastIndexOf(".");
            controlador.crearArchivo(nombre.substring(0,pos), nombre.substring(pos), cont, pNewDir);
        }
        limpiarArbol();
        cargarCarpeta();
        return true;
    }
    
    public void copiarRRtoFS(String pNewDir, String pAntDir){
        File document = new File(pAntDir);
        int pos = document.getAbsolutePath().lastIndexOf("\\");
        String nombre = document.getAbsolutePath().substring(pos+1);
        controlador.crearCarpeta(pNewDir, nombre);
        pNewDir += "/"+nombre;
        File[] childs = document.listFiles();
        for (int i = 0; i < childs.length; i++) {
            String pNewDirR = childs[i].getAbsolutePath();
            pos = pNewDirR.lastIndexOf("\\");
            nombre = pNewDirR.substring(pos+1);
            String pNewDirSF = pNewDir + "/" + nombre;
            File newDocument = new File(pNewDirR);
            if(newDocument.isDirectory())
                copiarRRtoFS(pNewDirSF, pNewDirR);
            else{
                pos = pNewDirR.lastIndexOf("\\");
                nombre = pNewDirR.substring(pos+1);
                String cont = copiarRRtoSF(pNewDirR);
                pos = nombre.lastIndexOf(".");
                controlador.crearArchivo(nombre.substring(0,pos), nombre.substring(pos), cont, pNewDirSF);
            }
        }
    }
    
    public void copiarFStoFS(){
        if(controlador.copiarVerEspacio(jTable1.getSelectedRow(), busqueda)){
            treeDocuments copyDocument = new treeDocuments(this,true);
            copyDocument.setLocationRelativeTo(null);
            copyDocument.copiarCargar("root", controlador, controlador.getDir(jTable1.getSelectedRow(), busqueda));
            copyDocument.setVisible(true);
        }
        else
            JOptionPane.showMessageDialog(this, "No hay suficiente espacio en el disco para copiar.", "Error",JOptionPane.ERROR_MESSAGE);
    }
    
    public void copiarFStoRR(){
        String dir = controlador.getDir(jTable1.getSelectedRow(), busqueda);
        JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int respuesta = fc.showOpenDialog(this);
        if(respuesta == JFileChooser.APPROVE_OPTION){
            File select = fc.getSelectedFile();
            if(select != null){
                File[] childs = select.listFiles();
                for (int i = 0; i < childs.length; i++) {
                    int pos = childs[i].getAbsolutePath().lastIndexOf("\\");
                    String nombre = childs[i].getAbsolutePath().substring(pos+1);
                    pos = dir.lastIndexOf("/");
                    if(nombre.compareToIgnoreCase(dir.substring(pos+1)) == 0){
                        int result = JOptionPane.showConfirmDialog(this,"El nombre del archivo ya existe. ¿Desea que sea reemplazado?",null, JOptionPane.YES_NO_OPTION);
                        if(result == JOptionPane.YES_OPTION){
                            if(childs[i].isDirectory())
                                borrarFichero(childs[i]);
                            childs[i].delete();
                            break;
                        }
                        else
                            return;
                    } 
                }
                if(controlador.isDirectorio(dir))
                    crearEnRR(select.getAbsolutePath(), dir);
                else{
                    try {
                        int pos = dir.lastIndexOf("/");
                        String nombre = dir.substring(pos+1);
                        File fichero = new File (select.getAbsolutePath(), nombre);
                        fichero.createNewFile();
                        escribirEnRR(select.getAbsolutePath(), nombre, dir);
                    } catch (IOException ex) {
                        Logger.getLogger(interfaz.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            else
                JOptionPane.showMessageDialog(this, "Seleccione un directorio destino.", "Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void borrarFichero(File fichero){
        File[] ficheros = fichero.listFiles();
        for (int i = 0; i < ficheros.length; i++) {
            if (ficheros[i].isDirectory())
                borrarFichero(ficheros[i]);
            ficheros[i].delete();
        }
    }
    
    private void escribirEnRR(String pDirReal, String pNombre, String pDirSF){
        String cont = controlador.abrirArchivo(pDirSF);
        if("".compareToIgnoreCase(cont) == 0)
            return;
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter(pDirReal.concat("/"+pNombre));
            pw = new PrintWriter(fichero);
            pw.println(cont);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fichero)
                    fichero.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
    
    private void crearEnRR(String pDirReal, String pDirSF){
        int pos = pDirSF.lastIndexOf("/");
        String nombre = pDirSF.substring(pos);
        File directorio = new File(pDirReal+nombre);
        directorio.mkdir();
        ArrayList<String[]> childs = controlador.getCarpetaDocuments(pDirSF);
        for (int i = 0; i < childs.size(); i++) {
            String pNewDir = pDirReal + nombre;
            String pNewDirSF = pDirSF + "/"+ childs.get(i)[0];
            if(controlador.isDirectorio(pNewDirSF))
                crearEnRR(pNewDir, pNewDirSF);
            else{
                try {
                    File fichero = new File (pDirReal, nombre.substring(1));
                    fichero.createNewFile();
                    escribirEnRR(pNewDir, childs.get(i)[0], pNewDirSF);
                } catch (IOException ex) {
                    Logger.getLogger(interfaz.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    private String copiarRRtoSF(String pDir){
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        String cont = "";
        try {
            archivo = new File (pDir);
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);
            String linea;
            String sl = "";
            while((linea=br.readLine()) != null){
                cont += sl + linea;
                sl = "\n";
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }finally{
            try{                    
                if(null != fr ) 
                    fr.close();                 
            }catch (Exception e2){ 
                e2.printStackTrace();
            }
        }
        return cont;
    }
    
    public boolean moverArchivo(String pDireccion, String pDireccionDestino, String pNombre){
        if(controlador.moverElemento(pDireccion, pDireccionDestino, pNombre)){
            limpiarArbol();
            cargarCarpeta();
            return true;
        }
        return false;
    }
    
    public void eliminarDir(String pDirPadre, String pNombre){
        controlador.eliminarEnDir(pDirPadre, pNombre);
    }
    
    public boolean crearCarpeta(String pNombre) {
        if(busqueda)
            cargarCarpeta();
        if(!controlador.crearCarpeta(pNombre))
            return false;
        model.addRow(new Object[]{pNombre, "Carpeta"});
        limpiarArbol();
        return true;
    }
    
    private void cargarCarpeta(){
        while(model.getRowCount() > 0){
            model.removeRow(0);
        }
        ArrayList<String[]> listDocument = controlador.getCarpetaDocuments();
        for (int i = 0; i < listDocument.size(); i++) {
            model.addRow(new Object[]{listDocument.get(i)[0], listDocument.get(i)[1]});
        }
        jTextField1.setText("");
        busqueda = false;
    }
    
    private void limpiarArbol(){
        rootTree.removeAllChildren();
        modelTree.reload();
        recargarArbol(rootTree, "root");
    }
    
    private void recargarArbol(DefaultMutableTreeNode pPadre, String pDir){
        ArrayList<String[]> childs = controlador.getCarpetaDocuments(pDir);
        for (int i = 0; i < childs.size(); i++) {
            DefaultMutableTreeNode child = new DefaultMutableTreeNode(childs.get(i)[0]);
            modelTree.insertNodeInto(child, pPadre, pPadre.getChildCount());
            jTree1.scrollPathToVisible(new TreePath(child.getPath()));
            String pNewDir = pDir + "/" + childs.get(i)[0];
            if(controlador.isDirectorio(pNewDir))
                recargarArbol(child, pNewDir);
        }
    }
    
    private void verPropiedades(int pSelectDocument){
        viewProperties viewPropertiesWindow = new viewProperties(this,true);
        viewPropertiesWindow.setLocationRelativeTo(null);
        viewPropertiesWindow.setPropiedades(controlador.getPropiedades(pSelectDocument, busqueda));
        viewPropertiesWindow.setVisible(true);
    }
    
    private void abrirDocument(int pSelectDocument){
        if(controlador.isDirectorio(pSelectDocument, busqueda)){
            String title = controlador.abrirDirectorio(pSelectDocument, busqueda);
            jLabel1.setText(title);
            cargarCarpeta();
        }
        else{
            String[] datos = controlador.abrirArchivo(pSelectDocument, busqueda);
            viewFiles viewFile = new viewFiles(this,true);
            viewFile.setLocationRelativeTo(null);
            viewFile.setFile(datos[0], datos[1]);
            viewFile.setVisible(true);
        }
    }
    
    public boolean modificarArchivo(String pCont){
        return controlador.modificarArchivo(jTable1.getSelectedRow(), pCont, busqueda);
    }
    
    public int crearArchivo(String pNombre, String pExtension, String pCont) {
        if(busqueda)
            cargarCarpeta();
        int num = controlador.crearArchivo(pNombre, pExtension, pCont);
        if(num == 2){
            model.addRow(new Object[]{pNombre.concat(pExtension), "Archivo"});
            limpiarArbol();
        }
        return num;
    }
    
    private void crearDisco(){
        try{
            int numSectores = Integer.valueOf(JOptionPane.showInputDialog("Numero de sectores:"));
            int sizeSector = Integer.valueOf(JOptionPane.showInputDialog("Tamaño de sector:"));
            if(numSectores > 0 && sizeSector > 0)
                controlador = new Controlador(numSectores, sizeSector);
            else{
                JOptionPane.showMessageDialog(this, "Ingrese numeros enteros positivos", "Error",JOptionPane.ERROR_MESSAGE);
                crearDisco();
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Ingrese numeros enteros positivos", "Error",JOptionPane.ERROR_MESSAGE);
            crearDisco();
        }
    }
    
    private void eventosMouse(){
        jTable1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    int r = jTable1.rowAtPoint(e.getPoint());
                    if (r >= 0 && r < jTable1.getRowCount()) {
                        jTable1.setRowSelectionInterval(r, r);
                        popupMenu.show(jTable1, e.getX(), e.getY());
                    } else
                        jTable1.clearSelection();
                }
                else if (e.getClickCount() == 2 && e.getButton() == MouseEvent.BUTTON1) {
                    int r = jTable1.rowAtPoint(e.getPoint());
                    if (r >= 0 && r < jTable1.getRowCount()) {
                        jTable1.setRowSelectionInterval(r, r);
                        abrirDocument(jTable1.getSelectedRow());
                    } else
                        jTable1.clearSelection();
                }
            }
        });
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
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables

}

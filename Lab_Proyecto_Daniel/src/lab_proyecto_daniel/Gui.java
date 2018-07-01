/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_proyecto_daniel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author X
 */
public class Gui extends javax.swing.JFrame {

    /**
     * Creates new form Gui
     */
    public Gui() {
        initComponents();
        System.out.println("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        arreglado = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ta_1.setColumns(20);
        ta_1.setRows(5);
        jScrollPane1.setViewportView(ta_1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Archivo", jPanel1);

        arreglado.setColumns(20);
        arreglado.setRows(5);
        jScrollPane2.setViewportView(arreglado);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Texto Arreglado", jPanel2);

        jMenu1.setText("File");

        jMenuItem1.setText("Agregar Texto");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        try{
        ArrayList<String> lineas = new ArrayList();
        File fichero = null;
        FileReader fr = null;
        BufferedReader br = null;
        ta_1.setText("");
        arreglado.setText("");
        try {
            JFileChooser jfc = new JFileChooser();
            FileNameExtensionFilter filtro
                    = new FileNameExtensionFilter("Archivos de Texto", "txt");
            FileNameExtensionFilter filtro2
                    = new FileNameExtensionFilter("Imagenes", "jpg", "png", "bmp");
            jfc.setFileFilter(filtro);
            jfc.addChoosableFileFilter(filtro2);
            int seleccion = jfc.showOpenDialog(this);
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                fichero = jfc.getSelectedFile();
                fr = new FileReader(fichero);
                br = new BufferedReader(fr);
                String linea;
                ta_1.setText("");
                while ((linea = br.readLine()) != null) {
                    if (!linea.isEmpty()) {
                        ta_1.append(linea);
                        lineas.add(linea);
                        ta_1.append("\n");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        String dic = "abcdefghiklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ";

        String uno = "";
        String dos = "";
        String tres = "";
        String cuatro = "";
        ArrayList<Palabras> words1 = new ArrayList();
        ArrayList<Palabras> words2 = new ArrayList();
        ArrayList<Palabras> words3 = new ArrayList();
        ArrayList<Palabras> words4 = new ArrayList();
        String[] sacapalabras = {"to", "is", "the", "a", "in", "for", "and", "of",
            "c#", "an", "on", "with", "th", "into", "do", "from",
            "el", "los", "la", "de", "or", "is", "for", "it"};
        for (int l = 0; l < lineas.size(); l++) {
            String frase = lineas.get(l);
            //frase = "hola ,mundo que,.- hace134 hola-.13,1 mundo56'046 que hace?9182918 hola+´-{.- mundo {}{.que{} hace hola mundo que hace hola mundo que hace";
            //  frase = "hola ,mundo que,.- hace hola ,mundo que,.- hace";
            StringTokenizer st = new StringTokenizer(frase, " ");
            ArrayList<String> words = new ArrayList();
            int spaces = 1;
            while (st.hasMoreElements()) {
                String palabra = st.nextToken();
                String nueva = "";
                boolean entra = false;
                for (int y = 0; y < palabra.length(); y++) {
                    if (dic.contains(Character.toString(palabra.charAt(y)))) {
                        nueva += palabra.charAt(y);

                    }
                }

                for (int z = 0; z < 24; z++) {
                    if (nueva.equals(sacapalabras[z])) {
                        entra = true;
                    }
                }
                if (entra == false) {
                    if (!nueva.isEmpty()) {
                        words.add(nueva);
                    }
                }

            }
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            for (int i = 0; i < words.size(); i++) {
                String first = words.get(i);
                boolean existe = false;
                for (int j = 0; j < words1.size(); j++) {
                    if (words1.get(j).getPalabra().equals(first)) {
                        existe = true;
                        int frec = words1.get(j).getFrecuencia();
                        words1.get(j).setFrecuencia(frec + 1);

                    }
                }
                if (existe == false) {
                    words1.add(new Palabras(first, 1, l));
                }
            }
            //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            for (int i = 0; i < words.size(); i++) {
                for (int k = 0; k < words.size(); k++) {
                    if (k > i) {
                        String two = words.get(i) + " " + words.get(k);
                        boolean existe = false;
                        for (int j = 0; j < words2.size(); j++) {
                            String quiza = words2.get(j).getPalabra();
                            String[] partes = quiza.split(" ");
                            boolean b1 = two.contains(partes[0]);
                            boolean b2 = two.contains(partes[1]);
                            int linea = words2.get(j).getLinea();
                            if (((b1 && b2) == true) && linea != l) {
                                existe = true;
                                int frec = words2.get(j).getFrecuencia();
                                words2.get(j).setFrecuencia(frec + 1);
                            }
                        }
                        if (existe == false) {
                            words2.add(new Palabras(two, 1, l));
                        }
                    }
                }
            }
            //********************************************************************************
            for (int z = 0; z < words.size(); z++) {
                for (int i = 0; i < words.size(); i++) {
                    for (int k = 0; k < words.size(); k++) {
                        if (k > i && i > z) {
                            String three = words.get(z) + " " + words.get(i) + " " + words.get(k);
                            boolean existe = false;
                            for (int j = 0; j < words3.size(); j++) {
                                String quiza = words3.get(j).getPalabra();
                                String[] partes = quiza.split(" ");
                                boolean b1 = three.contains(partes[0]);
                                boolean b2 = three.contains(partes[1]);
                                boolean b3 = three.contains(partes[2]);
                                int linea = words3.get(j).getLinea();
                                if (((b1 && b2 && b3) == true) && linea != l) {
                                    existe = true;
                                    int frec = words3.get(j).getFrecuencia();
                                    words3.get(j).setFrecuencia(frec + 1);
                                }
                            }
                            if (existe == false) {
                                words3.add(new Palabras(three, 1, l));
                            }
                        }
                    }
                }
            }
        }
        ArrayList ultimo = new ArrayList<>();
        ArrayList<Palabras> topten = new ArrayList();
        for (int i = 0; i < words1.size(); i++) {
            ultimo.add(words1.get(i).toString());
        }
        for (int i = 0; i < words2.size(); i++) {
            ultimo.add(words2.get(i).toString());
        }
        for (int i = 0; i < words3.size(); i++) {
            ultimo.add(words3.get(i).toString());
        }
        topten.addAll(words1);
        topten.addAll(words2);
        topten.addAll(words3);
        Collections.sort(ultimo);
        for (int z = 0; z < topten.size(); z++) {
            for (int k = 0; k < topten.size(); k++) {
                for (int i = 0; i < topten.size(); i++) {
                    for (int j = 0; j < topten.size(); j++) {
                        Palabras p = topten.get(j);
                        Palabras h = topten.get(i);
                        if (p.getFrecuencia() < h.getFrecuencia()) {
                            topten.remove(j);
                            topten.add(i, p);
                        }
                    }
                }
            }
        }
        arreglado.append("****************Top Ten De Frecuencias**************\n");
        arreglado.append("");
        for (int i = 0; i < 10; i++) {
            arreglado.append(topten.get(i).toString() + "");
        }
        arreglado.append("\n");
        arreglado.append("**************** Combinaciones Encontradas*****************\n");
        arreglado.append("");
        for (int i = 0; i < ultimo.size(); i++) {
            arreglado.append(ultimo.get(i).toString() + "");
        }

        }catch(Exception e){
            
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Gui.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea arreglado;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea ta_1;
    // End of variables declaration//GEN-END:variables
public void texto() {

    }
}
/*
   if (j > 0) {
                String two = words.get(j - 1) + " " + words.get(j);
                boolean existe2 = false;
                int cont2 = 0;
                for (int i = 0; i < words.size(); i++) {
                    if (i > 0) {
                        String quiza = words.get(i - 1) + " " + words.get(i);
                        if (quiza.equals(two)) {
                            cont2++;
                        }
                    }
                }
                for (int k = 0; k < words2.size(); k++) {
                    if (two.equals(words2.get(k).getPalabra())) {
                        existe2 = true;
                    }
                }

                if (existe2 == false) {
                    if (!two.isEmpty()) {
                        words2.add(new Palabras(two, cont2));
                    }
                }
            }



 for (int h = 0; h < words2.size(); h++) {
                    if (j > -1) {
                        boolean d = words2.get(h).getPalabra().contains(words.get(j));
                        if (d == false) {
                            String three = words2.get(h).getPalabra() + " " + words.get(j);
                            boolean existe3 = false;
                            int cont3 = 0;
                            for (int i = 0; i < words.size(); i++) {
                                if (i > 1) {
                                    String quiza = words.get(i - 2) + " " + words.get(i - 1) + " " + words.get(i);
                                    if (quiza.equals(three)) {
                                        cont3++;
                                    }
                                }
                            }
                            for (int k = 0; k < words3.size(); k++) {
                                String[] partes = words3.get(k).getPalabra().split(" ");
                                boolean b1 = three.contains(partes[0]);
                                boolean b2 = three.contains(partes[1]);
                                boolean b3 = three.contains(partes[2]);

                                if (three.equals(words3.get(k).getPalabra())) {
                                    existe3 = true;
                                    int frec = words3.get(k).getFrecuencia();
                                    words3.get(k).setFrecuencia(frec + 1);
                                }
                                if ((b1 && b2 && b3) == true) {
                                    existe3 = true;
                                }
                            }

                            if (existe3 == false) {
                                if (!three.isEmpty()) {
                                    if (cont3 == 0) {
                                        cont3 = 1;
                                    }
                                    words3.add(new Palabras(three, cont3));
                                }
                            }
                        }
                    }
                }






                if (j > -1) {
                    for (int z = j; z < words.size(); z++) {
                        System.out.println(words);
                        if (!(words.get(j).equals(words.get(z)))) {
                            String two = words.get(j) + " " + words.get(z);
                            boolean existe2 = false;
                            int cont2 = 0;
                            for (int i = 0; i < words.size(); i++) {
                                if (i + 1 < words.size()) {
                                    String podria = words.get(i) + " " + words.get(i + 1);
                                    String quiza = words.get(i + 1) + " " + words.get(i);
                                    System.out.println(quiza);
                                    if (quiza.equals(two)) {
                                        cont2++;
                                    }

                                }

                            }
                            for (int k = 0; k < words2.size(); k++) {
                                String[] partes = words2.get(k).getPalabra().split(" ");
                                boolean b1 = two.contains(partes[0]);
                                boolean b2 = two.contains(partes[1]);
                                if (two.equals(words2.get(k).getPalabra())) {

                                }
                                if ((b1 && b2) == true) {
                                    existe2 = true;
                                }

                            }
                            if (existe2 == false) {
                                if (!two.isEmpty()) {
                                    if (cont2 == 0) {
                                        cont2 = 1;
                                    }
                                    words2.add(new Palabras(two, cont2));
                                }
                            }
                        }
                    }
                }
 */

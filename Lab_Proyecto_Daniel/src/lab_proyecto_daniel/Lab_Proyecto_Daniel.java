/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_proyecto_daniel;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author X
 */
public class Lab_Proyecto_Daniel {

    /**
     * @param args the command line arguments
     */
  /*  public static void main(String[] args) {
        // TODO code application logic here
     //   String frase="El debe reducir los datos de"
        String frase = "hola ,mundo que,.- hace134 hola-.13,1 mundo56'046 que hace?9182918 hola+´-{.- mundo {}{.que{} hace hola mundo que hace hola mundo que hace";
        StringTokenizer st = new StringTokenizer(frase, " ");
        ArrayList<String> words = new ArrayList();
        ArrayList<Palabras> words1 = new ArrayList();
        ArrayList<Palabras> words2 = new ArrayList();
        ArrayList<Palabras> words3 = new ArrayList();
        ArrayList<Palabras> words4 = new ArrayList();
        String first = "";
        int spaces = 1;
        String dic = "abcdefghiklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        while (st.hasMoreElements()) {
            String palabra = st.nextToken();
            String nueva = "";
            for (int y = 0; y < palabra.length(); y++) {
                if (dic.contains(Character.toString(palabra.charAt(y)))) {
                    nueva += palabra.charAt(y);
                }
            }
            words.add(nueva);
        }
        System.out.println("Spaces:" + spaces);
        for (int j = 0; j < words.size(); j++) {
            first = words.get(j);
            //********************************************
            //***********************************************
            int cont = 0;
            for (int i = 0; i < words.size(); i++) {
                if (first.equals(words.get(i))) {
                    cont++;
                }
            }
            //*********************************************************************
            //for que verifica que la palbra ya este o no en el arraylist
            boolean existe = false;

            for (int k = 0; k < words1.size(); k++) {
                if (words.get(k).equals(first)) {
                    existe = true;
                }
            }
            if (existe == false) {
                words1.add(new Palabras(first, cont));
            }
            //********************************************************************** dos palabras
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
                    words2.add(new Palabras(two, cont2));
                }
            }

            //************************************************************************  
            if (j > 1) {
                String three = words.get(j - 2) + " " + words.get(j - 1) + " " + words.get(j);
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
                    if (three.equals(words3.get(k).getPalabra())) {
                        existe3 = true;
                    }
                }

                if (existe3 == false) {
                    words3.add(new Palabras(three, cont3));
                }
            }
        }
        for (int j = 0; j < words.size(); j += 1) {
            if (j > 0) {
                for (int z = 0; z < words.size(); z++) {
                    if(!(words.get(j - 1).equals(words.get(z)))){
                    String four = words.get(j - 1) + " " + words.get(z);          
                    boolean existe4 = false;
                    int cont4 = 0;
                    for (int i = 0; i < words.size(); i++) {
                        if (i > 0) {
                            String quiza = words.get(i - 1) + " " + words.get(z);
                            if (quiza.equals(four)) {
                                cont4++;
                            }
                        }
                    }
                    for (int k = 0; k < words4.size(); k++) {
                        if (four.equals(words4.get(k).getPalabra())&&!(words.get(z) + " " + words.get(j-1)).equals(words4.get(k))) {
                            existe4 = true;
                        }
                    }

                    if (existe4 == false) {
                        words4.add(new Palabras(four, cont4));
                    }
                }
                }
            }
        }
        System.out.println(words1);
        System.out.println(words2);
        System.out.println(words3);
        System.out.println(words4);
    }
*/
}

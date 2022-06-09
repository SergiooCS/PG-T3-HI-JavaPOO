/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cuestion2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


/**
 *
 * @author BySum
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Tu resultado es " + ResponderPreguntas());
    }//cierra main
    
    
    
    //METODO RESPONDERPREGUNTAS
    public static float ResponderPreguntas() {
        //CREAMOS UN CONTADOR DONDE ALMACENAREMOS LA NOTA DEL USUARIO.
        float nota = 0.0f;
        try {
            //CREAMOS LA ENTRADA DE DATOS POR CONSOLA MEDIANTE SCANNER.
            Scanner sc1 = new Scanner(System.in);
            //LEEMOS EL ARCHIVO 'PREGUNTAS.TXT' CON EL OBJETO 'FILEREADER' Y LO ALMACENAMOS EN MEMORIA CON EL OBJETO 'BUFFERREADER'.
            BufferedReader archivoPreguntas = new BufferedReader(new FileReader(new File("F:\\DAM 1º\\PROGRAMACION\\3º TRIMESTRE\\HITOS\\INDIVIDUAL\\Cuestion2\\src\\main\\java\\com\\mycompany\\cuestion2\\Preguntas.txt")));
            
            //CREAMOS LA VARIABLE 'QUESTION' VACIA.
            String question = "";

            //CREAMOS UN ARRAYLIST DONDE ALMACENAREMOS LAS PREGUNTAS.
            ArrayList<String> Preguntas = new ArrayList<>();
            
            //RECORREMOS MEDIANTE UN WHILE, YA QUE DESCONOCEMOS CUANTAS PREGUNTAS SON, EL ARCHIVO DE LAS PREGUNTAS Y SI LA LINEA QUE LEEMOS ES DIFERENTE A NULA, ES DECIR, CONTIENE ALGUNA PREGUNTA NOS LA ALMACENA EN EL ARRAYLIST.
            //SI TUVIERAMOS TODAS LAS PREGUNTAS EN UNA MISMA LINEA EN EL .TXT NOS ALMACENARIA LAS 10 PREGUNTAS EN UN ELEMANTO DEL ARRAYLIST.
            while ((question = archivoPreguntas.readLine()) != null) {
                Preguntas.add(question);
            }//cierra while
            
            //INDICAMOS QUE CERRAMOS EL BUFFERREADER PARA DEJAR DE LEER EL ARCHIVO.
            archivoPreguntas.close();
            //HACEMOS QUE LAS PREGUNTAS SALGAN DE MANERA ALEATORIA MEDIANTE EL METODO SHUFFLE
            Collections.shuffle(Preguntas);

            //PINTAMOS CADA PREGUNTA QUE CONTENGA EL ARRAYLIST
            for (String pregunta : Preguntas) {
                //PINTAMOS LA PREGUNTA ANTES DE LLEGAR A LOS CARACTERES '==' YA QUE EL == INDICA LA RESPUESTA CORRECTA.
                System.out.println(pregunta.split("==")[0]);
                System.out.println("¿Cuál es tu respuesta? (Solo admite numeros)");
                
                try{
                    if (sc1.nextInt() == Integer.parseInt(pregunta.split("==")[1])) {
                        System.out.println("Respuesta correcta, +1 punto");
                        nota++;
                    } else {
                        System.out.println("Respuesta incorrecta, -0.5 puntos");
                        nota = nota - 0.5f;
                    }//cierra if
                }catch(Exception IOException){
                    System.out.println("Error, introduzca un tipo de dato valido.");
                    break;
                }//cierra catch
            }//cierra for
            
        } catch (FileNotFoundException e) {
            System.out.println("El error se produce por no encontrar el archivo. "+e.getMessage());
        } catch (IOException a) {
            System.out.println("El error se produce por un problema a la hora de meter datos o de recibirlos. "+a.getMessage());
        }//cierra catch
        
        return nota;
        
    }//cierra ResponderPreguntas
}//cierra clase

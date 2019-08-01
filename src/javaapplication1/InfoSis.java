
package javaapplication1;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 *
 * @author Augusto
 */
public class InfoSis {
     public static void main(String[] args) {
   
    System.out.println("Informações Técnicas do meu Sistema: ");
    
     System.out.println();
    //vendo configurações do sistema 
    System.out.println("Meu sistema: " + System.getProperty("os.name"));                                    
    System.out.println("\nVersão: " + System.getProperty("os.version"));
    System.out.println("\nUsuário: " + System.getProperty("user.name"));
    
    //idioma do meu sistema
    Locale idioma = Locale.getDefault();
    System.out.println("\nIdioma: "+ idioma.getDisplayLanguage() +" "+ idioma.getLanguage());
    
    //Resolução da tela
    Toolkit tela = Toolkit.getDefaultToolkit();
    Dimension d = tela.getScreenSize();
    System.out.println("Resolução do Display: "+d.width+" x "+d.height);
    
    //Ano Atual
    Calendar ano = GregorianCalendar.getInstance();
    Date horas = new Date();
    System.out.println("Horas: " + horas);
    System.out.println("Ano Atual: "+ano.get(Calendar.YEAR));
     }
}


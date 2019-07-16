/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regex;

import java.text.SimpleDateFormat;
import java.util.regex.Pattern;

/**
 *
 * @author Win 10
 */
public class Regex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pattern pattern1 = Pattern.compile(".*[a-zA-Z[0-9]]");
        
        Pattern pattern2 = Pattern.compile(".*[!@#$%^&*(),.?\":{}|<>]");
        Pattern emailFormat = Pattern.compile(".*[a-z]@.*[a-z].*[.].*[a-z]");
        
        String str1 = "cebroblade@gmail.com";
        System.out.println(pattern1.matcher(str1).matches());
        System.out.println(pattern2.matcher(str1).matches());
        System.out.println(emailFormat.matcher(str1).matches());
        
        String str = "28/2/2019";
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
        try {
            sdf.parse(str);
            System.out.println(sdf.parse(str));
        } catch (Exception e) {
            System.out.println("Wrong format");
        }
    }
    
}

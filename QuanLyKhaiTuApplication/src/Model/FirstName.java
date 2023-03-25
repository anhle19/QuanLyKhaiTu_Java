/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Pavilion 15
 */
public class FirstName {
    public static String CheckFirstName(String fullname){
        String name="";
        var words = fullname.split("\\s+");
        name = words[words.length -1 ];
        return name;
    }
}

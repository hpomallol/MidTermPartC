/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;
import java.util.Scanner;
/**
 *
 * @author paul
 */
public class TestUserprofile {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter your name: ");
        String uID = input.nextLine();
        
        System.out.print("\nList of Available Genres: ");
        System.out.println("Comedy, Drama, Action, Mystery");
            
        System.out.print("\nPlease select the genre:");
        String genre = input.nextLine();
        
        UserProfile u1 = new UserProfile(uID, genre);
        
        System.out.println("\nUser Profile has been created");
        
    }
}

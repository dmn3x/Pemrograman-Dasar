/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package halo;

/**
 *
 * @author LENOVO LOQ
 */
import java.util.Scanner;
public class halo {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Masukkan kata: ");
        String val = sc.nextLine();
        System.out.println(val);
        System.out.print("Give value again? (yes/no):");
	String ulang = sc.nextLine();	
	}while (ulang.equalsIgnoreCase("yes"));
    }

package kursova_rabota_java;
import java.util.Scanner;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {

	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Въведете функция която искате да използвате (Възможните функции са:grayscale,monochrome, negative rotate и др) ");
	        String inputString = scanner.nextLine();
	        
	        if (inputString.equals("greyscale")) {
	            //изпълнява код за greyscale
	        } else if (inputString.equals("monochrome")) {
	          // код за monochrome
	        	else if (inputString.equals("rotate")) {
	  	          // код за rotate
	        		else if (inputString.equals("collage")) {
	  	  	          // код за колаж
	        			else if (inputString.equals("other")) {
	  	  	  	          // код за другите функции
	        } else {
	            System.out.println("The color is not red or blue.");
	        }

	       
		

	}

}

import javax.swing.*;
import java.util.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.*;
public class SchoolSoft{
	
	public static void main(String args[]){
		
		logIn();
		
	}
	
	public static void logIn(){
		
		int pasword = 123;
		String Id = "ik";
		int again = 0;
		do{
		String id = JOptionPane.showInputDialog("Enter Your Id");
		
		int p = Integer.parseInt(JOptionPane.showInputDialog("  Enter Password  "));
		
		if(Id.equals(id)&&pasword==p){
			
			manue();
			
		}
		else 
			again = Integer.parseInt(JOptionPane.showInputDialog(" Wrong user Id or Password yes '1' 0r No '0'"));
		
		}while(again==1);
		JOptionPane.showMessageDialog(null,"Thank You for Using Our Software..");
	}
	
	public static void manue(){
			int ch = 0;
		do{
			
		int choice = Integer.parseInt(JOptionPane.showInputDialog("---Welcome to Jonior High School Management Application---\n--------------------------------------------------------------------------------------\n"+"1) Add Student Information.\n\t 2) View Student Information.\n\t 3)Delete Student Information.\n\t 4)View All File Names.\n\t Enter Your Choice..... "));
		
		switch(choice){
			
					case 1:
							newStudent();
							break;
					case 2:
							viewData();
							break;
					case 3:
							deleteFile();
							break;
					case 4:
							listFiles();
							break;
					default:
							JOptionPane.showMessageDialog(null,"Wrong Input......");
		
		}					
		
			ch = Integer.parseInt(JOptionPane.showInputDialog("Want to Continue..... press 1"));
		}while(ch==1);
		
	}
	
	public static void newStudent(){
		int ch = 0;
		do{
		String name = JOptionPane.showInputDialog("Enter Student Roll No: \n i.e <NO:>.txt");
		
		try{
			//File f  = new File("E:/SchoolSoft/Data/"+name);
		 FileWriter filew = new FileWriter("E:/SchoolSoft/Data/"+name);
		 /*
		 boolean b = f.createNewFile();
				if(b){
					JOptionPane.showMessageDialog(null,"File Created....");
				}
				else{
					JOptionPane.showMessageDialog(null,"File Already Exists");
					break;
				}
*/
				BufferedWriter buff = new BufferedWriter(filew);
		
		 //String  = JOptionPane.showInputDialog("Enter Student Info...");
				
				String info = " Name :";
						info += JOptionPane.showInputDialog("  Enter Name : ");

						info += " F/Name :";
						info += JOptionPane.showInputDialog("  Enter Father Name : ");
												
						info += " Class : "; 
						info += JOptionPane.showInputDialog("  Enter Class  : ");
												
						info += " Religion :";
						info += JOptionPane.showInputDialog("  Enter Religion  : ");
						
				buff.write(info);
				buff.close();
				
			JOptionPane.showMessageDialog(null,"File Succussfully Created... ");
			
		
		}
		catch(Exception e){
			System.out.println("..."+e);
		}
			ch = Integer.parseInt(JOptionPane.showInputDialog("Enter Another Data... press '1'  "));
		
		}while(ch==1);
		
	}
	
	public static void viewData(){
		
		String path = JOptionPane.showInputDialog("Enter Student Roll No: ");
		
			 Scanner x = null	;
			try{
			x = new Scanner(new File("E:/SchoolSoft/Data/"+path));
			}
			catch(Exception e){
				System.out.println("Could Not Find the File");
			}
			StringBuffer sb = new StringBuffer();
			//String a=null,b=null,c=null,d=null;
			String str = null;
			while(x.hasNext()){
				//String a = x.next();
				//sb.append(a);
				 //a = x.next();
				 //b = x.next();
				 //c = x.next();
				 //d = x.next();
				//str += x.next();
				System.out.printf(x.next());
				System.out.printf(" ");
			}
			//JOptionPane.showMessageDialog(null,sb);
			//System.out.println(str);
			//System.out.println(b);
			//System.out.println(c);
			//System.out.println(d);
			
			x.close();
		
	} 
	
	public static void 	listFiles(){
		
			System.out.println("------------------");
		    try{
				File file = new File("E:/SchoolSoft");
				
				 File arr[] = file.listFiles();
				
						for(int i=0;i<arr.length;i++){
							System.out.println(arr[i]);
						}
			}
			catch(Exception e){
				
					System.out.println("No File Found.."+e);
			}
			
		
		
	}
	
	public static void deleteFile(){
	
		String path = JOptionPane.showInputDialog("Enter Roll no: tO Delete Data...");
		
				try{
					
					File f1 = new File("E:/SchoolSoft/Data/"+path);
					
						if(f1.delete()){
							JOptionPane.showMessageDialog(null,"File Deleted....");

						}
						else
							JOptionPane.showMessageDialog(null,"File Does not Deleted....");
					
				}
				catch(Exception e){
							System.out.println("....");
				}
		
		
	} 
	
		
	
	
}
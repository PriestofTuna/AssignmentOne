import javax.swing.JOptionPane; 
2 
 
3 public class Assignment333 { 
4 	public enum AccountType { 
5 		Admin, Student, Staff, 
6 	}; 
7 
 
8 	/** 
9 	 * Author, Karl Lyttek 
10 	 *  
11 	 *  
12 	 * @param args 
13 	 */ 
14 	public static void main(String[] args) { 
15 		AccountType[] choices = { AccountType.Admin, AccountType.Staff, 
16 				AccountType.Student }; 
17 		String TrueUser, TruePassword, password, TrueUserPass, user, CreatedAccount; 
18 		TrueUser = ("name"); 
19 		int Legitimacy = (3), Test = (4); 
20 		TruePassword = ("password"); 
21 		TrueUserPass = (TrueUser + TruePassword); 
22 		TrueUserPass.equals(AccountType.Admin); 
23 		int limit = 3, x = 0; 
24 		user = JOptionPane.showInputDialog("Input your Username"); 
                
	
	
                }else if (password != TruePassword) { 
91 					JOptionPane.showMessageDialog(null, 
92 							"Incorrect password, please Input your password"); 
93 					x = (x + 1); 
94 				} else { 
95 					break; 
96 				} 
97 			} else if (user != TrueUser) { 
98 				JOptionPane.showMessageDialog(null, "Invalid Username"); 
99 				x = (x + 1); 
100 				user = JOptionPane.showInputDialog("Input your Username"); 
101 			} else { 
102 				break; 
103 			} 
104 		} 
105 		while (x >= limit) { 
106 			JOptionPane 
107 					.showMessageDialog( 
108 							null, 
109 							"You have been locked out of your account due to too many attempts to log in, please contact the administrator"); 
110 			break; 

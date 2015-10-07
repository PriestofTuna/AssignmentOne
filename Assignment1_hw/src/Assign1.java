import javax.swing.JOptionPane;

public class Assignment32 {
	public enum AccountType {
		Admin, Student, Staff, WrongAccount
	};

	/**
	 * Author, Karl Lyttek
	 * 
	 * @param args
	 */
	// WrongAccount is for whenever an account does not equal the TrueUserPass
	// below

	public static void main(String[] args) {

		AccountType[] choices = { AccountType.Admin, AccountType.Staff, AccountType.Student };

		String TrueUser, TruePassword, password, TrueUserPass, user, CreatedAccount;
		TrueUser = ("name");
		int Legitimacy = (3), Test = (4);
		TruePassword = ("password");
		TrueUserPass = (TrueUser + TruePassword);
		TrueUserPass.equals(AccountType.Admin);
		int limit = 3, x = 0;

		user = JOptionPane.showInputDialog("Input your Username");
		// x = Integer.parseInt(user);
		while (user != TrueUser && (x < (limit))) {

			if (user.equals(TrueUser)) {
				password = JOptionPane.showInputDialog("Input your password");

				if (password.equals(TruePassword)) {
					CreatedAccount = (user + password);
					AccountType select = (AccountType) JOptionPane.showInputDialog(null, "select your account.",
							"Account Type", JOptionPane.INFORMATION_MESSAGE, null, choices, choices[0]);
					//JOptionPane.showMessageDialog(null, x);
					while (Legitimacy != Test) {
					if (CreatedAccount.equals(TrueUserPass)) {
						select.equals(TrueUserPass);
						switch (select) {
						case Admin:

							break;
						case Student:

							break;
						case Staff:
							;
							break;
						case WrongAccount:

							break;
						default:
						}

						if (select.equals(AccountType.Admin)) {
							Legitimacy = (Legitimacy+1);
							JOptionPane.showMessageDialog(null, "Welcome Staff! You can update, read, add, delete file.");
							break;
						}else {
							
						}
					    } else {
					    	System.out.print("Pain, pain and suffering without end...");
					    }
					}
						
					
					break;

				} else if (password != TruePassword)

				{

					JOptionPane.showMessageDialog(null, "Incorrect password, please Input your password");
					x = (x + 1);
				} else {
					break;
				}

			} else if (user != TrueUser) {
				JOptionPane.showMessageDialog(null, "Invalid Username");
				x = (x + 1);
				user = JOptionPane.showInputDialog("Input your Username");

			} else {
				break;
			}

		}
		while (x >= limit) {
			JOptionPane.showMessageDialog(null,
					"You have been locked out of your account due to too many attempts to log in, please contact the administrator");
		}

		// here
        /**
		AccountType select = (AccountType) JOptionPane.showInputDialog(null, "select your account.", "Account Type",
				JOptionPane.INFORMATION_MESSAGE, null, choices, choices[0]);
		JOptionPane.showMessageDialog(null, x);

		switch (select) {
		case Admin:
			JOptionPane.showMessageDialog(null, "Welcome Admin! You can update and read file.");
			break;
		case Student:
			JOptionPane.showMessageDialog(null, "Welcome Student! You can only read file.");
			break;
		case Staff:
			JOptionPane.showMessageDialog(null, "Welcome Staff! You can update, read, add, delete file.");
			break;
		case WrongAccount:
			JOptionPane.showMessageDialog(null, "");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Enjoy your stay");

			if (select.equals(AccountType.Admin)) {
				JOptionPane.showMessageDialog(null, "Welcome Admin! You can update and read files.");
			} else {
			}
		}*/
        
	}
}

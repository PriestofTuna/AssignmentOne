import javax.swing.JOptionPane;

public class Assignment3 {

	public enum AccountType {
		Admin, Staff, Student
	};

	public static void main(String[] args) {
		String user = "cqd2292";
		String pass = "password";
		// String user2 = "cdinh";
		// String pass2 = "password1";
		// String user3 = "Tanes";
		// String pass3 = "password2";

		AccountType[] account = { AccountType.Admin, AccountType.Staff, AccountType.Student };
		String euser, epass;
		int limit = 3;

		euser = JOptionPane.showInputDialog("Enter Username");

		while (euser != user) {

			if (euser.equals(user)) {
				epass = JOptionPane.showInputDialog("Enter Password");
				if (epass.equals(pass)) {
					// JOptionPane.showMessageDialog(null, "Hello");
					AccountType select = (AccountType) JOptionPane.showInputDialog(null, "Select account type",
							"Account Type", JOptionPane.INFORMATION_MESSAGE, null, account, account[0]);
					switch (select) {
					case Admin:
						JOptionPane.showMessageDialog(null, "Welcome Admin! You can update and read file.");
						break;
					case Staff:
						JOptionPane.showMessageDialog(null, "Welcome Staff! You can update, read, add, delete file.");
						break;
					case Student:
						JOptionPane.showMessageDialog(null, "Welcome Student! You can only read file.");
						break;
					default:
						// JOptionPane.showMessageDialog(null, "Good Bye!");
					}
					break;
				} else {
					JOptionPane.showMessageDialog(null, "Invalid password");
				}
			} else {
				JOptionPane.showMessageDialog(null, "Invalid Username");
				euser = JOptionPane.showInputDialog("Enter Username");
			}

		}

	}
}

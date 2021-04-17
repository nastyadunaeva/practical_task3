package sql;

public class Program {
	public static void main(String[] args) {
		String query = "INSERT INTO T_GroupSelected (id, name, author) \n" +
	               "SELECT id_Student, firstName, lastName, id_Group\n" +
				   "WHERE id_Group = 'M-205' AND dolgCount > 4";
	}
}

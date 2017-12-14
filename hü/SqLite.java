package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class SqLite {

	public static void main(String[] args) {
		createDatabase();
		userTable();
		resultTable();

	}

	public static void createDatabase() {

		String path = "jdbc:sqlite:C:/sqlite/pokerDB.db";
		try (Connection con = DriverManager.getConnection(path)) {
			if (con != null) {
				System.out.println("Neue Datenbank erstellt");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	public static void userTable() {
		String path = "jdbc:sqlite:C:/sqlite/pokerDB.db";
		String userTable = "create table if not exists user(userID int primary key, userName Varchar(50) not null, userRegistrationDate date);";

		try (Connection con = DriverManager.getConnection(path); Statement stm = con.createStatement()) {
			stm.execute(userTable);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void resultTable() {
		String path = "jdbc:sqlite:C:/sqlite/pokerDB.db";
		String resultTable = "create table if not exists result(userID int primary key, nrPairs int, nrTriples int, nrPoker int, nrRoyalFlush int, nrStraightFlush int, nrFlush int, nrStraight int);";

		try (Connection con = DriverManager.getConnection(path); Statement stm = con.createStatement()) {
			stm.execute(resultTable);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
    
	public static void insertUser(int userID, String userName) {
		String path = "jdbc:sqlite:C:/sqlite/pokerDB.db";
		String insert = "insert into user(userID, userName) values(?,?);";

		try (Connection con = DriverManager.getConnection(path);
				PreparedStatement pstm = con.prepareStatement(insert)) {
			pstm.setInt(1, userID);
			pstm.setString(2, userName);
			pstm.executeUpdate(insert);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void insertResult(int userID, int nrPairs, int nrTriples, int nrPoker, int nrRoyalFlush,
			int nrStraightFlush, int nrFlush, int nrStraight) {
		String path = "jdbc:sqlite:C:/sqlite/pokerDB.db";
		String insert = "insert into result(userID, nrPairs, nrTriples, nrPoker, nrRoyalFlush, nrStraightFlush, nrFlush, nrStraight) values(?,?,?,?,?,?,?,?)";

		try (Connection con = DriverManager.getConnection(path);
				PreparedStatement pstm = con.prepareStatement(insert)) {
			pstm.setInt(1, userID);
			pstm.setInt(2, nrPairs);
			pstm.setInt(3, nrTriples);
			pstm.setInt(4, nrPoker);
			pstm.setInt(5, nrRoyalFlush);
			pstm.setInt(6, nrStraightFlush);
			pstm.setInt(7, nrFlush);
			pstm.setInt(8, nrStraight);
			pstm.executeUpdate(insert);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
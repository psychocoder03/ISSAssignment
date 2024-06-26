package com.gautam;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			connection = DriverManager.getConnection(
					"jdbc:sqlserver://127.0.0.1:1433;databaseName=UserDatabase;integratedSecurity=true;trustServerCertificate=true;");

			String sql = "INSERT INTO Users (username, password) VALUES (?, ?)";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);

			int rows = preparedStatement.executeUpdate();

			if (rows > 0) {
				response.getWriter().append("Registration successful.");
			} else {
				response.getWriter().append("Registration failed.");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			response.getWriter().append("An error occurred: " + e.getMessage());
		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}

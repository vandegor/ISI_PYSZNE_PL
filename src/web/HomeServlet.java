package web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DaoImpl.Restauracja.StatusDaoImpl;
import Model.Restauracja.Status;
import ModelHelper.ConnectionSourceEnum;
import ModelHelper.TableCreator;

@WebServlet(name = "homeServlet", urlPatterns = "/home")
public class HomeServlet extends HttpServlet {

	private static final long serialVersionUID = -9148145188995637882L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			// new TableCreator().createTablesIfNotExists().addSampleData();
			// new TableCreator().createTablesWithRawSQL();
			// new TableCreator().createTablesIfNotExists();
			new TableCreator().addSampleData();
			for (Status status : new StatusDaoImpl(ConnectionSourceEnum.ISI_PYSZNE_PL.getConnectionSource())) {
				resp.getWriter().println(status.getStatus());
			}
		} catch (SQLException e) {
		}
		req.getRequestDispatcher("WEB-INF/view/home.jsp").include(req, resp);

	}
}

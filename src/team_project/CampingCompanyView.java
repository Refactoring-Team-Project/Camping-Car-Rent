package team_project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CampingCompanyView extends JPanel {

	private MainView _view;
	DefaultTableModel model;
	JTable dbResult;
	JScrollPane scrollPane;
	int curRow=-1, curCol=-1;
	
	Connection _conn;
	Statement stmt; //select
	PreparedStatement pstmt; //insert, delete
	ResultSet rs; 
	   
	public CampingCompanyView() {
		AppManager.getInstance().setCampingCompanyView(this);
		_view = AppManager.getInstance().getView();
		_conn = _view.conn;
		model = new DefaultTableModel() {
	         public boolean isCellEditable(int row, int column) {
	            return false;
	         }
	      };
		dbResult = new JTable(model);
		scrollPane = new JScrollPane(dbResult);
		add(scrollPane);
		getData();
	}
	
	public void getData() {
	    try {
	       String sql = "SELECT * FROM Camping_Company";
	       System.out.println("aa");
	       stmt = _conn.createStatement();
	       rs = stmt.executeQuery(sql);
	       
	       Object column[] = {"COMPID", "COMPNAME", "ADDRESS", "PHONE", "MANAGER NAME", "MANAGER EMAIL"};
	       model.setDataVector(null, column);
	       
	       while(rs.next()) {
	          Object[] data = {
	                rs.getInt(1),
	                rs.getString(2),
	                rs.getString(3),
	                rs.getString(4),
	                rs.getString(5),
	                rs.getString(6)
	                };
	          model.addRow(data);
	       }
	       
	    } catch (SQLException e1) {
	       e1.printStackTrace();
	    }

	    revalidate();
	    repaint();
	}
}

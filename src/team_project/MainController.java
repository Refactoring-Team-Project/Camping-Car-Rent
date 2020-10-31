package team_project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainController {
	MainView _view;
	CampingCompanyView _campCompView;
	
	public MainController() {
		this._view = AppManager.getInstance().getView();
		
		this._view.addUserButtonListener(new UserButtonListener());
		
		//this._campCompView.addUserButtonListener(new UserButtonListener());
	
	}
	
	private class UserButtonListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			_campCompView = AppManager.getInstance().getCampingCompanyView(); 

			
			
			_view.curRow = -1;
			_view.curCol = -1;
			
			if(_view.user == 0) {
				_view.btnUser.setText("사용자");
				System.out.println("사용자");
				_view.remove(_view.pn1);
				_view.add(_view.pn2, 1);
				_view.user = 1;
				//
				String text=_campCompView.btnDelete.getText();
				System.out.println(text);
				
				//_campCompView.scrollPane.removeAll();
				_campCompView.model.setRowCount(0);
				_campCompView.model.setColumnCount(0);
				_campCompView.updatePanel.removeAll();
				_campCompView.buttonPanel.removeAll();
			
			}
			else if(_view.user == 1) {
				_view.btnUser.setText("관리자");
				System.out.println("관리자");
				_view.remove(_view.pn2);
				_view.add(_view.pn1, 1);
				_view.user = 0;
				_campCompView.model.setColumnCount(0);
				_campCompView.model.setRowCount(0);
				_campCompView.updatePanel.removeAll();
				_campCompView.buttonPanel.removeAll();
			}
			_view.repaint();
		}
		
	}
}

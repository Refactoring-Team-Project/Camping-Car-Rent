package team_project;

public class AppManager {
	private static AppManager s_instance; // AppManager �ڽ��� ��Ÿ���� ����
	private MainView _view; // SimplePainterView�� �״�� �޾ƿͼ� ���� �� ����
	private CampingCompanyView _campingcompview; // DrawingPanelView�� �״�� �޾ƿͼ� ���� �� ����

	public MainView getView() { // AppManager�� ���� SimplePainterView�� �����Ϸ� �Ҷ� �� SimplePainterView�� ��ȯ�� �� �Լ�
		return _view;
	} // getView()

	public CampingCompanyView getCampingCompanyView() {// AppManager�� ���� DrawingPanelView�� �����Ϸ� �Ҷ� �� DrawingPanelView�� ��ȯ�� �� �Լ�
		return _campingcompview;
	} // getDrawView()

	public void setView(MainView view) { // AppManager�� ���� SimplePainterView�� ������ �� �ֵ��� AppManager��
													// SimplePainterView�� ������� �Լ�
		_view = view;
	} // setView()

	public void setCampingCompanyView(CampingCompanyView campingcompview) { // AppManager�� ���� DrawingPanelView�� ������ �� �ֵ��� AppManager��
															// DrawingPanelView�� ������� �Լ�
		_campingcompview = campingcompview;
	} // setDrawView()

	public static AppManager getInstance() {

		if (s_instance == null) // ó�� ȣ��Ǿ��ٸ� ��ü������ ���� �� AppMananger�� ���� �������ְ� ��ȯ
			s_instance = new AppManager();
		return s_instance;

	} // getInstance()




}

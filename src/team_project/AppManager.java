package team_project;

public class AppManager {
	private static AppManager s_instance; // AppManager 자신을 나타내는 변수
	private MainView _view; // SimplePainterView를 그대로 받아와서 관리 할 변수
	private CampingCompanyView _campingcompview; // DrawingPanelView를 그대로 받아와서 관리 할 변수

	public MainView getView() { // AppManager를 통해 SimplePainterView로 접근하려 할때 그 SimplePainterView를 반환해 줄 함수
		return _view;
	} // getView()

	public CampingCompanyView getCampingCompanyView() {// AppManager를 통해 DrawingPanelView로 접근하려 할때 그 DrawingPanelView를 반환해 줄 함수
		return _campingcompview;
	} // getDrawView()

	public void setView(MainView view) { // AppManager를 통해 SimplePainterView에 접근할 수 있도록 AppManager에
													// SimplePainterView를 등록해줄 함수
		_view = view;
	} // setView()

	public void setCampingCompanyView(CampingCompanyView campingcompview) { // AppManager를 통해 DrawingPanelView에 접근할 수 있도록 AppManager에
															// DrawingPanelView를 등록해줄 함수
		_campingcompview = campingcompview;
	} // setDrawView()

	public static AppManager getInstance() {

		if (s_instance == null) // 처음 호출되었다면 전체적으로 관리 할 AppMananger를 새로 생성해주고 반환
			s_instance = new AppManager();
		return s_instance;

	} // getInstance()




}

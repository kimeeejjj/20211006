package co.eunji.prj;
import java.io.File;
import java.io.FileReader;
//import java.util.HashMap;
//import java.util.Map;
import java.util.Properties;

//import co.eunji.prj.vo.Bicle;
//import co.eunji.prj.vo.Car;
//import co.eunji.prj.vo.Command;
//
////import java.util.ArrayList;
////import java.util.List;
//import co.eunji.prj.vo.DevVO;

public class MainApp {
//	private static DevVO vo; // VO 객체 인스턴스 정의, main안에서 쓰는거니까 static 필수
//	private static MapTest mapTest; //사용할 객체를 선언
//	private static Map<String, Command> map = new HashMap<String, Command>();
	private static Properties properties= new Properties();	//사용할 Properties객체 정의,초기화
	public static void main(String[] args) {
		File path = new File("src/main/resources/info.properties"); //파일경로 설정, 파일객체사용
		FileReader file; //파일내용 읽는 객체 = FileReader
		try {
			file=new FileReader(path); //property파일을 읽어들임 *properties(key(property라고함)=value)
			properties.load(file); //load가 읽어서 properties객체에다가 담는 것.(map.put()의 역할)
			System.out.println(properties.getProperty("name")); //properties는 키값을 property라고 하니까
			System.out.println(properties.getProperty("tel")); //getProperty를 이용해서 키값을 전달함+
			System.out.println(properties.getProperty("address"));
		} catch(Exception e) {
			e.printStackTrace();
		}
		
//		map.put("car", new Car());
//		map.put("bicle", new Bicle());
//		
//		Command command = map.get("bicle"); //하나의 이름으로 하부객체를 초기화 시켜 사용=인터페이스
//		command.run();  //이런걸 컨트롤러라고 하는데 맵은 컨트롤러를 만들때 많이 사용함
		//하나의 클래스는 멤버변수, 멤버메소드로 구성
		
//		mapTest = new MapTest();
//		
//		mapTest.setMap("eunji", "1234"); //eunji(key)가 들어오면 1234(Value)를 알려줘라
//		mapTest.setMap("eunhye", "5678");
//		mapTest.setMap("joseon", "2345");
//		mapTest.setMap("insuk", "9876");
//		mapTest.setMap("jaegi", "5432");
//		
//		String pw = mapTest.getMap("eunji"); //eunji라는 key 넣었더니 1234가 돌아옴
//		System.out.println(pw);
//		
//		Map<String,Integer> map = new HashMap<String,Integer>(); //integer는 인스턴스
//		map.put("age", 23); //기본타입을 객체화 int -> Integer (BOXING,객체화시킴)
//		map.put("id", 6);
//		
//		int age = map.get("age");
//		System.out.println(age);
//		System.out.println(map.get("id"));   //인덱스 없는 것 hash 있는 것 arraylist
 		
//		Map<String,DevVO> mapVo = new HashMap<String, DevVO>();
//		DevVO vo = new DevVO();
//		vo.setId(1);
//		vo.setName("홍길동");
//		vo.setColumn1("서울");
//		vo.setAge(20);
//		mapVo.put("홍길동",vo);
//		
//		vo = new DevVO();
//		vo.setId(2);
//		vo.setName("박수동");
//		vo.setColumn1("대구");
//		vo.setAge(23);
//		mapVo.put("박수동", vo);
//		
//		DevVO vo1 = new DevVO();
//		vo1 = mapVo.get("박수동");
//		vo1.toString();
//		
//		List<DevVO> list = new ArrayList<DevVO>();
//		vo = new DevVO(); //객체 초기화
//		vo.setId(1);
//		vo.setName("홍길동");
//		vo.setColumn1("대구광역시 중구");
//		vo.setAge(23);
//		list.add(vo); //array list구조에 객체 하나를 추가하는 것.
//		
//		vo = new DevVO(); //객체 초기화
//		vo.setId(2);
//		vo.setName("홍길순");
//		vo.setColumn1("대구광역시 서구");
//		vo.setAge(23);
//		list.add(vo); //array list구조에 객체 하나 더 추가.
//		
//		System.out.println("==========getter이용============");
//		
//		System.out.println(list.get(0).getId());
//		System.out.println(list.get(0).getName());
//		System.out.println(list.get(0).getColumn1());
//		System.out.println(list.get(0).getAge());		//getter이용해서 출력
//		
//		System.out.println("==========toString메소드이용============");
//		
//		list.get(1).toString(); //list가 가지고 있는 첫번째요소를 출력함. //toString메소드 이용해서 출력
//		
//		System.out.println("==========for문이용============");
//		
//		for(int i=0; i<list.size(); i++) {			//for문 사용하여 출력
//			list.get(i).toString();					//list 전체를 출력
//		}
//		
//		System.out.println("==========향상된for문이용============");
//		
//		for(DevVO vo : list) {					//list전체를 출력
//			vo.toString();						//향상된 for문 이용하여 출력
//		}
		
	}

}

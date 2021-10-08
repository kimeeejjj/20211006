package co.eunji.prj.vo;

public class DevVO { //컬럼명과 일치하는 변수+getter,setter모두 갖춤 = VO객체, DTO객체
	private int id; //컬럼명과 변수명 일치시키기!!
	private String name; //이게 자바클래스의 전형. 이런식으로 만드려고 노력하기.
	private String column1;
	private int age;
	
	public DevVO() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColumn1() {
		return column1;
	}

	public void setColumn1(String column1) {
		this.column1 = column1;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		System.out.print("아이디 : "+id);
		System.out.print(" ,이 름 : "+name);
		System.out.print(" ,주 소 : "+column1);
		System.out.println(" ,나 이 : "+age);
		return null;
	}
}

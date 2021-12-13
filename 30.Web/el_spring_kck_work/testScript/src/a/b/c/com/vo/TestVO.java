package a.b.c.com.vo;

public class TestVO {
	
	
	// varibles
	
	private String no;
	private String name;
	private String message;
	private String address;
	
	
	// cunstructor
	
	public TestVO() {
		
	}

	
	// setter & getter()
	
	public TestVO(String no, String name, String message, String address) {
		this.no = no;
		this.name = name;
		this.message = message;
		this.address = address;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}

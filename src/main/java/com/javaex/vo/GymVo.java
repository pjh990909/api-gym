package com.javaex.vo;

public class GymVo {

	private int no;
	private String id;
	private String password;
	private String name;
	private String address;
	private String gender;
	private String hp;
	private int age;
	
	public GymVo() {
		super();
	}

	public GymVo(int no, String id, String password, String name, String address, String gender, String hp, int age) {
		super();
		this.no = no;
		this.id = id;
		this.password = password;
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.hp = hp;
		this.age = age;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "GymVo [no=" + no + ", id=" + id + ", password=" + password + ", name=" + name + ", address=" + address
				+ ", gender=" + gender + ", hp=" + hp + ", age=" + age + "]";
	}
	
	
	
}

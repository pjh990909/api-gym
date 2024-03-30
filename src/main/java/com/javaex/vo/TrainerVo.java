package com.javaex.vo;

public class TrainerVo {

	private int no;
	private String id;
	private String password;
	private String name;
	private String address;
	private String gender;
	private String hp;
	private int age;
	private String orgName;
	private String saveName;
	private String filePath;
	private String fileSize;

	public TrainerVo() {
		super();
	}

	public TrainerVo(int no, String id, String password, String name, String address, String gender, String hp, int age,
			String orgName, String saveName, String filePath, String fileSize) {
		super();
		this.no = no;
		this.id = id;
		this.password = password;
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.hp = hp;
		this.age = age;
		this.orgName = orgName;
		this.saveName = saveName;
		this.filePath = filePath;
		this.fileSize = fileSize;
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

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getSaveName() {
		return saveName;
	}

	public void setSaveName(String saveName) {
		this.saveName = saveName;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getFileSize() {
		return fileSize;
	}

	public void setFileSize(String fileSize) {
		this.fileSize = fileSize;
	}

	@Override
	public String toString() {
		return "TrainerVo [no=" + no + ", id=" + id + ", password=" + password + ", name=" + name + ", address="
				+ address + ", gender=" + gender + ", hp=" + hp + ", age=" + age + ", orgName=" + orgName
				+ ", saveName=" + saveName + ", filePath=" + filePath + ", fileSize=" + fileSize + "]";
	}

}

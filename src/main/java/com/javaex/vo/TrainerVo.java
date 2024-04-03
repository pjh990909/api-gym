package com.javaex.vo;

public class TrainerVo {

	private int trainer_no;
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
	private long fileSize;
	private String career;

	public TrainerVo() {
	}

	public TrainerVo(int trainer_no,String orgName, String saveName, String filePath, long fileSize, String career) {
		this.trainer_no = trainer_no;
		this.orgName = orgName;
		this.saveName = saveName;
		this.filePath = filePath;
		this.fileSize = fileSize;
		this.career = career;
	}

	public TrainerVo(int trainer_no, String id, String password, String name, String address, String gender, String hp,
			int age, String orgName, String saveName, String filePath, long fileSize, String career) {
		this.trainer_no = trainer_no;
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
		this.career = career;
	}

	public int getTrainer_no() {
		return trainer_no;
	}

	public void setTrainer_no(int trainer_no) {
		this.trainer_no = trainer_no;
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

	public long getFileSize() {
		return fileSize;
	}

	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}

	public String getCareer() {
		return career;
	}

	public void setCareer(String career) {
		this.career = career;
	}

	@Override
	public String toString() {
		return "TrainerVo [no=" + trainer_no + ", id=" + id + ", password=" + password + ", name=" + name + ", address="
				+ address + ", gender=" + gender + ", hp=" + hp + ", age=" + age + ", orgName=" + orgName
				+ ", saveName=" + saveName + ", filePath=" + filePath + ", fileSize=" + fileSize + ", content=" + career
				+ "]";
	}

}

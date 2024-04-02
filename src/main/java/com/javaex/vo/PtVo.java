package com.javaex.vo;

public class PtVo {

	private int pt_no;
	private int no;
	private int trainer_no;
	private int pt_count;
	private int pt_total;
	
	public PtVo() {
	}

	public PtVo(int pt_no, int no, int trainer_no, int pt_count, int pt_total) {
		this.pt_no = pt_no;
		this.no = no;
		this.trainer_no = trainer_no;
		this.pt_count = pt_count;
		this.pt_total = pt_total;
	}



	public int getPt_no() {
		return pt_no;
	}

	public void setPt_no(int pt_no) {
		this.pt_no = pt_no;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getTrainer_no() {
		return trainer_no;
	}

	public void setTrainer_no(int trainer_no) {
		this.trainer_no = trainer_no;
	}

	public int getPt_count() {
		return pt_count;
	}

	public void setPt_count(int pt_count) {
		this.pt_count = pt_count;
	}

	public int getPt_total() {
		return pt_total;
	}

	public void setPt_total(int pt_total) {
		this.pt_total = pt_total;
	}


	@Override
	public String toString() {
		return "PtVo [pt_no=" + pt_no + ", no=" + no + ", trainer_no=" + trainer_no + ", pt_count=" + pt_count
				+ ", pt_total=" + pt_total + ", training_date=" + "]";
	}
	
	
	
}

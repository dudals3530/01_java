package edu.kh.oop.practice.model.vo;

public class Hero {

	private String nickname;
	private String job;
	private int hp;
	private int mp;
	private int level;
	private double exp;

	public Hero() {
	}

	public Hero(String nickname, String job, int hp, int mp, int level, double exp) {
		super();
		this.nickname = nickname;
		this.job = job;
		this.hp = hp;
		this.mp = mp;
		this.level = level;
		this.exp = exp;
	}
	//공격함수
	public void attack(double exp) {
		this.exp += exp;
		System.out.println(this.nickname + "플레이어가 공격을 했다." + this.exp);
		if (this.exp >= 300) {
			this.level = level + 1;
			System.out.println(this.nickname + "레벨이 올랐습니다!! 현재레벨" + this.level);
		}
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;

	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public double getExp() {
		return exp;
	}

	public void setExp(double exp) {
		this.exp = exp;
	}

	public void dash() {
		if (this.mp < 10) {
			System.out.println("[마력이"+this.mp+"입니다.] ");
		} else {
			this.mp = mp - 10;
			System.out.println(this.nickname + "의 엄청빠른 대쉬!! 남은마력 " + this.mp);
		
						
			}

		}

	

	@Override
	public String toString() {
		return ("현재 레벨" + this.level + "\n" + "현재 hp" + this.hp + "\n" + "현재 mp" + this.mp + "\n" + "현재경험치" + this.exp);
	}

}

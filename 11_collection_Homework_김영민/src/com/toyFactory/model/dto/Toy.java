package com.toyFactory.model.dto;

import java.util.Objects;
import java.util.Set;

public class Toy {

	private String name;             // 이름
	private int    avalage;          // 사용가능연령
	private int    price;            // 가격
	private String color;            // 색상
	private String made;             // 제조일
 	private Set<String> materials;         // 재료
	
 	
 	
 	public Toy() {    //기본생성자
 	}



 	
 	
 	public Toy(String name, int avalage, int price, String color, String made, Set<String> material) {
 		super();
 		this.name = name;
 		this.avalage = avalage;
 		this.price = price;
 		this.color = color;
 		this.made = made;
 		this.materials = material;
 	}
 	
 	
 	
 	
 	@Override
 	public String toString() {
 		
 		return super.toString();
 	}
 	
 	@Override
 	public int hashCode() { // String 중에 우리가 같은 객체가 들어왓을때
 		                    // 그객체가 같은 값을 가지고있음을 나타내는 메서드
 		return Objects.hash(avalage, color, made, materials, name, price);
 	}
 	
 	
 	
 	
 	@Override
 	public boolean equals(Object obj) {
 		if (this == obj)
 			return true;
 		if (obj == null)
 			return false;
 		if (getClass() != obj.getClass())
 			return false;
 		Toy other = (Toy) obj;
 		return avalage == other.avalage && Objects.equals(color, other.color) && Objects.equals(made, other.made)
 				&& Objects.equals(materials, other.materials) && Objects.equals(name, other.name) && price == other.price;
 	}
 	
 	
 	
 	
 	
 	public String toyInfo() { // 해당 Toy의 status를 보여주는 ? 
 		return ".이름 : " + name + " / 사용 가능연령 : " + avalage + " / 가격 : " + price + " / 색상 :" + color + " / 제조년월일  : " + made
 				+ " / 재료 : " + materials.toString() ;
 	}
 	
 	
 	
 	
 	//게터세터
 	public String getName() {
 		return name;
 	}
 	
 	
 	
 	public void setName(String name) {
 		this.name = name;
 	}
 	
 	
 	
 	public int getAvalage() {
 		return avalage;
 	}
 	
 	
 	
 	public void setAvalage(int avalage) {
 		this.avalage = avalage;
 	}
 	
 	
 	
 	public int getPrice() {
 		return price;
 	}
 	
 	
 	
 	public void setPrice(int price) {
 		this.price = price;
 	}
 	
 	
 	
 	public String getColor() {
 		return color;
 	}
 	
 	
 	
 	public void setColor(String color) {
 		this.color = color;
 	}
 	
 	
 	
 	public String getMade() {
 		return made;
 	}
 	
 	
 	
 	public void setMade(String made) {
 		this.made = made;
 	}
 	
 	
 	
 	public Set<String> getMaterial() {
 		return materials;
 	}
 	
 	public void setMaterial(Set<String> material) {
 		this.materials = material;
 	}

 	
 	
 

	
	

	
	
	
	
	
	
	
	
	
	





















	
	
	
	
	
























































































































 	
 	
	
}

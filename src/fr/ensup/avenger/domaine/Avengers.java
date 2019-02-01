package fr.ensup.avenger.domaine;

public class Avengers {

	private int age;
	private String name;
	private String costume;
	private String pouvoir;
	
	
	public Avengers(int age, String name, String costume, String pouvoir) {
		this.age = age;
		this.name = name;
		this.costume = costume;
		this.pouvoir = pouvoir;
	}
	public int getAge() {
		return age;
	}
	public Object setAge(int age) {
		return this.age = age;
	}
	public String getName() {
		return name;
	}
	public Object setName(String name) {
		return this.name = name;
	}
	public String getCostume() {
		return costume;
	}
	public Object setCostume(String costume) {
		return this.costume = costume;
	}
	public String getPouvoir() {
		return pouvoir;
	}
	public Object setPouvoir(String pouvoir) {
		return this.pouvoir = pouvoir;
	}
	@Override
	public String toString() {
		return "Avengers [age=" + age + ", name=" + name + ", costume=" + costume + ", pouvoir=" + pouvoir + "]";
	}
	
}

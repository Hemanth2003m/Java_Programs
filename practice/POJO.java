package practice;

import java.util.Objects;

public class POJO {
	private int id;
	private String name;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public POJO(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public POJO() {
		super();
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
	@Override
	public String toString() {
		return "POJO [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		POJO other = (POJO) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

}

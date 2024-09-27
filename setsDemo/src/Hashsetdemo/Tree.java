package Hashsetdemo;

/**
*
* @author ajay
*/

import java.util.Objects;

public class Tree {
	private String name;
	private boolean creeper;
	
	public Tree(String name, boolean creeper) {
		super();
		this.name = name;
		this.creeper = creeper;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isCreeper() {
		return creeper;
	}

	public void setCreeper(boolean creeper) {
		this.creeper = creeper;
	}

	@Override
	public String toString() {
		return "Tree [name=" + name + ", creeper=" + creeper + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tree other = (Tree) obj;
		return Objects.equals(name, other.name);
	}

	
	
	
	
	
}

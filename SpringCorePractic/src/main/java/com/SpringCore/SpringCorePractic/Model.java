package com.SpringCore.SpringCorePractic;

public class Model {
private String name;
private int mask;

public Model(String name,int mask) {
	this.name=name;
	this.mask=mask;
}

@Override
public String toString() {
	return "Model [name=" + name + ", mask=" + mask + "]";
}

}

package com.test.hashmap;
//Storing custom Object as key
public class CountryBean {
String name;
long population;
public CountryBean(String name,long population) {
	super();
	this.name=name;
	this.population=population;

}
public void setName(String name) {
	this.name = name;
}
public String getName() {
	return name;
}
public void setPopulation(long population) {
	this.population = population;
}
public long getPopulation() {
	return population;
}
@Override
	public int hashCode() {
	
	return super.hashCode();
	}
@Override
	public boolean equals(Object obj) {

		return super.equals(obj);
	}
}

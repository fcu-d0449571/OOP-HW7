package fcu.iecs.oop.pokemon;

public abstract class Pokemon {
	String name;
	int cp;
	PokemonType type;
	public abstract void attack();
	
	public final String getName(){
		return name;
	}
	public final PokemonType gettype(){
		return type;
	}
	public int getcp(){
		return cp;
	}
	public void cp(int cp){
		this.cp = cp;
	}
}
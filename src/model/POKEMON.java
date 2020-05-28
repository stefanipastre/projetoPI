package model;

public enum POKEMON {

	bulbasauro("view/resourses.pokemon/bulbasauro2.gif"),
	charmander("view/resourses.pokemon/charmander.gif"),
	squirtle("view/resourses.pokemon/squirtle.gif"),
	book("view/resourses.pokemon/book.gif");
	
	
	private String urlPokemon;
	
	private POKEMON(String urlPokemon) {
		this.urlPokemon = urlPokemon;
	}
	
	
	public String getURL() {
		return this.urlPokemon;
	}
}

import java.util.ArrayList;
import java.util.List;

public class Database {
    private ArrayList<Superhero> database;

    public Database() {
        database = new ArrayList<>();
        Superhero p1 = new Superhero("Batman", "Bruce Wayne", "Intelligence",
                1915, true, "Physique");
        Superhero p2 = new Superhero("Superman", "Clark Kent", "Invulnerability",
                1938, false, "Flying");
        Superhero p3 = new Superhero("One Punch Man", "Saitama", "The One Punch",
                1990, true, "Physique");
        Superhero p4 = new Superhero("Thunder God", "Thor Odinson", "Controlling of Lightning",
                523, false, "His Hammer");
        Superhero p5 = new Superhero("Spiderman", "Peter Parker",  "Spidersenses",
                1993, true, "his suit");

        database.addAll(List.of(p1, p2, p3, p4, p5));
    }

    public void addHero(Superhero hero){
        database.add(hero);
    }

    public void databaseprint() {
        for (Superhero superhero : database) {
            System.out.println(superhero.getName() + " -- " + superhero.getRealName());
            System.out.println(superhero.getSuperPower() + " and " + superhero.getStrength());
            System.out.println(superhero.getYearCreated());
            System.out.println(superhero.isHuman());
            System.out.println();
        }
    }
            public ArrayList<Superhero> searchHeroByName(String name){
        ArrayList<Superhero> heroList = new ArrayList<>();
                for (Superhero hero : heroList) {
                    if (hero.getName().toLowerCase().contains(name.toLowerCase()))
                        hero.getRealName().toLowerCase().contains(name.toLowerCase());{
                    heroList.add(hero);
                    }

                }
                return heroList;
            }
    }

/*public ArrayList<Superhero> searchHeroByName(String name){
        ArrayList<Superhero> heroList = new ArrayList<>();
        for (Superhero hero: superheroes) {
            if(hero.getName().toLowerCase().contains(name.toLowerCase()) ||
                    hero.getRealName().toLowerCase().contains(name.toLowerCase())){
                heroList.add(hero);*/
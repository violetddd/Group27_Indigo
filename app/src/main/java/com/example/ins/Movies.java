package com.example.ins;


import java.util.ArrayList;

public class Movies {
    public Movies(String movie, String release, String genre, String description, String rating, String id, String movieLink, int moviePicture) {
        this.movie = movie;
        this.release = release;
        this.genre = genre;
        this.rating = rating;
        this.description = description;
        this.id = id;
        this.movieLink = movieLink;
        this.moviePicture = moviePicture;

    }

    private String movie;
    private String release;
    private String genre;
    private String rating;
    private String description;
    private String id;
    private String movieLink;
    private int moviePicture;

    //Initialising getters and setters for the arraylist
    public int getMoviePicture() { return moviePicture; }

    public void setMoviePicture(int moviePicture) {
        this.moviePicture = moviePicture;
    }

    public String getMovieLink() {
        return movieLink;
    }

    public void setMovieLink(String movieLink) {
        this.movieLink = movieLink;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static ArrayList<Movies> getMovies() { //arraylist of hard coded movie entries
        ArrayList<Movies> movies = new ArrayList<>();
        movies.add(new Movies("Godzilla vs. Kong", "2021/03/25", "Action, Sci-Fi, Thriller", "Legends collide as Godzilla and Kong, the two most powerful forces of nature, clash on the big screen in a spectacular battle for the ages. As a squadron embarks on a perilous mission into fantastic uncharted terrain, unearthing clues to the Titans' very origins and mankind's survival, a conspiracy threatens to wipe the creatures, both good and bad, from the face of the earth forever. Written by Warner Bros.", "8.1/10", "1", "tt5034838/", R.drawable.godzilla));
        movies.add(new Movies("Home Alone", "1990/12/07", "Comedy, Family", "It is Christmas time and the McCallister family is preparing for a vacation in Paris, France. But the youngest in the family, Kevin (Macaulay Culkin), got into a scuffle with his older brother Buzz (Devin Ratray) and was sent to his room, which is on the third floor of his house. Then, the next morning, while the rest of the family was in a rush to make it to the airport on time, they completely forgot about Kevin, who now has the house all to himself. Being home alone was fun for Kevin, having a pizza all to himself, jumping on his parents' bed, and making a mess. Then, Kevin discovers about two burglars, Harry (Joe Pesci) and Marv (Daniel Stern), about to rob his house on Christmas Eve. Kevin acts quickly by wiring his own house with makeshift booby traps to stop the burglars and to bring them to justice. Written by John Wiggins", "7.6/10", "2", "tt0099785/", R.drawable.home));
        movies.add(new Movies("Pulp Fiction", "1994/09/21", "Crime, Drama", "Jules Winnfield (Samuel L. Jackson) and Vincent Vega (John Travolta) are two hit men who are out to retrieve a suitcase stolen from their employer, mob boss Marsellus Wallace (Ving Rhames). Wallace has also asked Vincent to take his wife Mia (Uma Thurman) out a few days later when Wallace himself will be out of town. Butch Coolidge (Bruce Willis) is an aging boxer who is paid by Wallace to lose his fight. The lives of these seemingly unrelated people are woven together comprising of a series of funny, bizarre and uncalled-for incidents. Written by Soumitra", "8.9/10", "3", "tt0110912/", R.drawable.pulp));
        movies.add(new Movies("John Wick", "2015/04/10", "Action, Crime, Thriller", "With the untimely death of his beloved wife still bitter in his mouth, John Wick, the expert former assassin, receives one final gift from her--a precious keepsake to help John find a new meaning in life now that she is gone. But when the arrogant Russian mob prince, Iosef Tarasov, and his men pay Wick a rather unwelcome visit to rob him of his prized 1969 Mustang and his wife's present, the legendary hitman will be forced to unearth his meticulously concealed identity. Blind with revenge, John will immediately unleash a carefully orchestrated maelstrom of destruction against the sophisticated kingpin, Viggo Tarasov, and his family, who are fully aware of his lethal capacity. Now, only blood can quench the boogeyman's thirst for retribution. Written by Nick Riganas", "7.4/10", "4", "tt2911666/", R.drawable.wick));
        movies.add(new Movies("Jurassic World", "2015/06/11", "Action, Adventure, Sci-Fi", "Twenty-two years after the original Jurassic Park failed, the new park, also known as Jurassic World, is open for business. After years of studying genetics, the scientists on the park genetically engineer a new breed of dinosaur, the Indominus Rex. When everything goes horribly wrong, will our heroes make it off the island? Written by ahmetkozan", "7.0/10", "5", "tt0369610/", R.drawable.jw));
        movies.add(new Movies("The Matrix", "1999/06/11", "Action, Sci-Fi", "Thomas A. Anderson is a man living two lives. By day he is an average computer programmer and by night a hacker known as Neo. Neo has always questioned his reality, but the truth is far beyond his imagination. Neo finds himself targeted by the police when he is contacted by Morpheus, a legendary computer hacker branded a terrorist by the government. As a rebel against the machines, Neo must confront the agents: super-powerful computer programs devoted to stopping Neo and the entire human rebellion. Written by redcommander27", "8.7/10", "6", "tt0133093/", R.drawable.matrix));
        movies.add(new Movies("Jurassic Park", "1993/07/16", "Action, Adventure, Sci-Fi", "Huge advancements in scientific technology have enabled a mogul to create an island full of living dinosaurs. John Hammond has invited four individuals, along with his two grandchildren, to join him at Jurassic Park. But will everything go according to plan? A park employee attempts to steal dinosaur embryos, critical security systems are shut down and it now becomes a race for survival with dinosaurs roaming freely over the island. Written by Film_Fan", "8.1/10", "7", "tt0107290/", R.drawable.jp));
        movies.add(new Movies("Ghost Rider", "2007/03/02", "Action, Fantasy, Thriller", "When the motorcyclist Johnny Blaze finds that his father Barton Blaze has terminal cancer, he accepts a pact with Mephistopheles, giving his soul for the health of his beloved father. But the devil deceives him, and Barton dies in a motorcycle accident during an exhibition. Johnny leaves the carnival, his town, his friends, and his girlfriend Roxanne. Many years later, Johnny Blaze becomes a famous motorcyclist, who risks his life in his shows, and he meets Roxanne again, now a television reporter. However, Mephistopheles proposes Johnny to release his contract if he become the \"Ghost Rider\" and defeat his evil son Blackheart, who wants to possess one thousand evil souls and transform hell on Earth. Written by Claudio Carvalho, Rio de Janeiro, Brazil", "5.3/10", "8", "tt0259324/", R.drawable.ghost));
        movies.add(new Movies("The Internship", "2013/07/03", "Comedy", "Billy (Vince Vaughn) and Nick (Owen Wilson) are salesmen whose careers have been torpedoed by the digital world. Trying to prove they are not obsolete, they defy the odds by talking their way into a coveted internship at Google, along with a battalion of brilliant college students. But, gaining entrance to this utopia is only half the battle. Now they must compete with a group of the nation's most elite, tech-savvy geniuses to prove that necessity really is the mother of re-invention. Written by Twentieth Century Fox", "6.3/10", "9", "tt2234155/", R.drawable.internship));
        movies.add(new Movies("The Devil Wears Prada", "2006/09/05", "Comedy, Drama", "In New York, the simple and naive just-graduated in journalism Andrea Sachs is hired to work as the second assistant of the powerful and sophisticated Miranda Priestly, the ruthless and merciless executive of the Runway fashion magazine. Andrea dreams to become a journalist and faces the opportunity as a temporary professional challenge. The first assistant Emily advises Andrea about the behavior and preferences of their cruel boss, and the stylist Nigel helps Andrea to dress more adequately for the environment. Andrea changes her attitude and behavior, affecting her private life and the relationship with her boyfriend Nate, her family and friends. In the end, Andrea learns that life is made of choices. Written by Claudio Carvalho, Rio de Janeiro, Brazil", "6.9/10", "10", "tt0458352/", R.drawable.devil));
        return movies;
    }


    public static Movies getMovie(String id) { //gets the movie
        ArrayList<Movies> movies = Movies.getMovies();
        for (final Movies movie : movies) {
            if (movie.getId().equals(id)) {
                return movie;
            }
        }
        return null;
    }
    public static Movies getMovieLink(String id) { //gets the movieLink so I can redirect the user to the right IMDB page
        ArrayList<Movies> movieLinks = Movies.getMovies();
        for (final Movies movieLink : movieLinks) {
            if (movieLink.getId().equals(id)) {
                return movieLink;
            }
        }
        return null;
    }
}


package com.example.INFS3605;


import java.util.ArrayList;

public class Movies {
    public Movies(String movie, String release, String genre, String description, int rating, String id, String movieLink, int moviePicture) {
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
    private int rating;
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

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
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
        movies.add(new Movies("We Don't Need A Map", "2017/06/07", "Documentary", "  The Southern Cross is the most famous constellation in the southern hemisphere. Ever since colonisation, it’s been claimed, appropriated and hotly-contested for ownership by a range of Australian groups. But for Aboriginal people the meaning of this heavenly body is deeply spiritual. And just about completely unknown. For a start, the Southern Cross isn’t even a cross – it’s a totem that’s deeply woven into the spiritual and practical lives of Aboriginal people.\n" +
                "\n" +
                "Now one of Australia’s Aboriginal filmmakers, Warwick Thornton, tackles this subject in a film which challenges us to consider the place of the Southern Cross in the Australian psyche.\n" +
                "\n" +
                "Imbued with Warwick’s cavalier spirit, this is a thought-provoking ride through Australia’s cultural and political landscape.\n" +
                "\n" +
                "Created by Thornton and his filmmaker son, Dylan River, this poetic essay-film features interviews with tattooists, rappers, astronomers and bush puppets.\n" +
                "\n" +
                "The film is part of NITV’s landmark Moment in History initiative, launched by NITV and Screen Australia to bring together some of Australia’s most experienced and innovative Aboriginal filmmakers to create powerful, one-off documentaries that reflect on the place of Aboriginal people in the country today.\n" +
                "\n" +
                "Featuring tracks by A.B. Original’s Adam Briggs and leading Aussie rock-punk acts such as The Drones, Frenzal Rhomb, The Saints and Rowland S Howard, the film is a bold statement from the first frame.",8, "1", "tt5034838/", R.drawable.m_we_dont_need_a_map));
        movies.add(new Movies("Mystery Road", "2013/06/05", "Noir film ", "Near the rural town of Winton, Queensland, a truck driver finds the body of a teenage Aboriginal girl named Julie Mason inside one of the drainage culverts under the road. Newly promoted aboriginal Detective Jay Swan, recently returned from training in the city, investigates the murder. He learns that Julie was a drug addict who would have sex with truck drivers for money. He attempts to question another local Aboriginal girl, Tarni Williams, who was friends with Julie, but she refuses to speak to him. A neighbourhood boy tells Jay that he found Julie's phone and gives it to him. Jay finds several text messages to his teenage daughter, Crystal. He visits his ex-wife, Mary, and speaks to Crystal. He asks her if she wants to move in with him to his nicer neighbourhood, but she declines. Mary tells Jay that it is too late for him to be a father. Jay searches a farm near where Julie's body was found and meets its owner, Sam Bailey. Before Jay leaves, he sees a young man leaving in a white hunting truck. Jay later finds out that another teenage Aboriginal girl had also gone missing earlier.", 7, "2", "tt0099785/", R.drawable.m_mysteryroad2013));
        movies.add(new Movies("Here I Am", "2011/06/02", "Drama", "'Here I Am' is driven by three generations of Aboriginal women - Karen Lee Burden, her mother Lois and her daughter Rosie. When Karen is released from prison, through a series of chance encounters the women learn that freedom is hard to find when hearts are still broken.", 9, "3", "tt0110912/", R.drawable.m_hereiam));
        movies.add(new Movies("Sweet Country", "2017/09/06", "Western Drama", "Sam Kelly is a late middle-aged Aboriginal farm worker in the outback of Australia's Northern Territory some time after the end of the First World War. His employer, Fred Smith, a kindly preacher, agrees to lend Sam with his wife Lizzie to a bitter and very abusive alcoholic world war one war veteran named Harry March (who has been affected by his involvement in the war) on a neighbouring farm to renovate the latter's paddock fences. After sending Sam out to round up some cattle, Harry rapes Sam's wife, Lizzie, while Sam is away. Sam's relationship with Harry quickly deteriorates.", 7, "4", "tt2911666/", R.drawable.m_sweet_country));
        movies.add(new Movies("One Night the Moon", "2001/09/08", "Musical", "One Night the Moon was inspired by the story of indigenous tracker, Alexander Riley as depicted in Black Tracker (1997), a documentary directed by Riley's grandson, Michael Riley.[6][7] Alexander Riley had worked for the New South Wales police in Dubbo in the early 1900s, finding wanted criminals, missing persons and hidden caches.[6] Composer/singer Mairead Hannan saw the documentary and formed a project with her sister Deirdre Hannan, Kelly, Carmody, Alice Garner, Romeril and Perkins.Aside from the search for a missing child, the film deals with the racist attitude depicted by the father's refusal to use an indigenous tracker. The film was Paul Kelly's cinematic debut, while his then wife, Fairfax had a lead role in two related TV mini-series Harp in the South and Poor Man's Orange in 1987, and roles in films Belinda (1988) and Young Einstein (1989). Fairfax had her film debut with a minor role in 1982's Starstruck which had Paul Kelly and the Dots supplying a song for the soundtrack.", 7, "5", "tt0369610/", R.drawable.m_moon));
        movies.add(new Movies("Rabbit-Proof Fence", "2002/02/04", "Drama", "Rabbit-Proof Fence is a 2002 Australian drama film directed and produced by Phillip Noyce based on the 1996 book Follow the Rabbit-Proof Fence by Doris Pilkington Garimara. It is loosely based on a true story concerning the author's mother Molly, as well as two other Aboriginal girls, Daisy Kadibil and Gracie, who escape from the Moore River Native Settlement, north of Perth, Western Australia, to return to their Aboriginal families, after being placed there in 1931. The film follows the Aboriginal girls as they walk for nine weeks along 1,500 miles (2,400 km) of the Australian rabbit-proof fence to return to their community at Jigalong, while being pursued by white law enforcement authorities and an Aboriginal tracker.[2] The film illustrates the official child removal policy that existed in Australia between approximately 1905 and 1967. Its victims now are called the \"Stolen Generations\".", 9, "6", "tt0133093/", R.drawable.m_rabbit));
        movies.add(new Movies("The Sapphires", "2012/05/19", "Musical", "In 1968 Australia, Gail and Cynthia head into town to sing country & western songs for a talent contest but their young sister, Julie, is forbidden from going because she has a child and is too young until she bribes a fellow neighbour to take her into town. An alcoholic, Irish talent scout, Dave Lovelace, is scolded by his boss for being late despite him sleeping in his car that is near work. Despite being the best act in the contest, the girls not only do not win, but are told to leave. Dave recognizes their talent and is told that the troops need singers for Vietnam. Soon, Dave goes to make a call and he says they have been granted a spot to audition in Melbourne. Back at their place, Gail, Cynthia and Julie's mother tell him he can take them but without Julie, until Julie's father tells him not to worry about her. Advised by their grandmother, they meet up with their cousin Kay, who had been living in Melbourne for 10 years after the government took her from her family as part of the Stolen Generations, because she was half white. She rejects the offer of joining them, but later changes her mind and meets up at their uncle's place. After days of practicing their moves, they are almost ready until Julie gives Cynthia a letter from her fiancé that he is going to call it off. Despite that, they manage to audition very well and Kay comes up with the group's name, The Sapphires, after looking at Cynthia's engagement ring.", 8, "7", "tt0107290/", R.drawable.m_sapphires));
        movies.add(new Movies("Servant or Slave", "2016/08/01", "Documentary, History", "The confronting story of five Indigenous Australian women told in their own words revealing how they were removed from their families and forced against their will to serve in cruel conditions amounting to secret slavery.", 5, "8", "tt0259324/", R.drawable.m_servant));
        movies.add(new Movies("The Tracker", "2019/08/09", "Action, Thriller", "After failing to save his kidnapped wife and daughter, a vengeful man embarks on a bloody mission to punish those responsible for their deaths", 5, "9", "tt2234155/", R.drawable.m_tracker));

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


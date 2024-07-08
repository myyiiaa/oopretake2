public class Movie {
    private String movieName;
    private String movieGenre;
    private int ageRestriction;

    public Movie(String movieName, String movieGenre, int ageRestriction) {
        this.movieName = movieName;
        this.movieGenre = movieGenre;
        this.ageRestriction = ageRestriction;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }

    public int getAgeRestriction() {
        return ageRestriction;
    }

    public void setAgeRestriction(int ageRestriction) {
        this.ageRestriction = ageRestriction;
    }
}

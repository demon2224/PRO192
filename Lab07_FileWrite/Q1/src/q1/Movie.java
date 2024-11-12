/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1;

/**
 *
 * @author Le Anh Tuan - CE180905
 */
class Movie extends Media {

    private String title;
    private String director;
    private int releaseYear;

    public Movie() {
    }

    public Movie(String id, int size, String title, String director, int releaseYear) {
        super(id, size);
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String entryData() {
        return String.format("New movie %s: %s (%d) by %s added!",
                this.getId(),
                this.getTitle(),
                this.getReleaseYear(),
                this.getDirector()
        );
    }

    @Override
    public String printData() {
        return String.format("Movie %s: %s (%d) by %s.",
                this.getId(),
                this.getTitle(),
                this.getReleaseYear(),
                this.getDirector()
        );
    }
}

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
class Track extends Media {

    private String title;
    private String artist;
    private String category;

    public Track() {
    }

    public Track(String id, int size, String title, String artist, String category) {
        super(id, size);
        this.title = title;
        this.artist = artist;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String entryData() {
        return String.format("New track %s: %s (%s) by %s added!",
                this.getId(),
                this.getTitle(),
                this.getCategory(),
                this.getArtist()
        );
    }

    @Override
    public String printData() {
        return String.format("Music track %s: %s (%s) by %s.",
                this.getId(),
                this.getTitle(),
                this.getCategory(),
                this.getArtist()
        );
    }
}

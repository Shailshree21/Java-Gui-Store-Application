package com.mangaverse.models;

/**
 *
 * @author Shailshree
 */

public class MangaModel {
    
    // Fields to store various details of a manga
    private int serialNumber;
    private String title;
    private int totalChapter;
    private String status;
    private int rating;
    private String publisher;
    private String genre;
    private String author;
    private String releaseDate;

    /**
     * Constructor to initialize the MangaModel with provided values.
     * @param serialNumber The unique serial number of the manga.
     * @param title The title of the manga.
     * @param totalChapter The total number of chapters in the manga.
     * @param status The current status of the manga (e.g., ongoing, completed).
     * @param rating The rating of the manga.
     * @param publisher The publisher of the manga.
     * @param genre The genre(s) of the manga.
     * @param author The author(s) of the manga.
     * @param releaseDate The release date of the manga.
     */
    public MangaModel(int serialNumber, String title, int totalChapter, String status, int rating, String publisher, String genre, String author, String releaseDate) {
        this.serialNumber = serialNumber;
        this.title = title;
        this.totalChapter = totalChapter;
        this.status = status;
        this.rating = rating;
        this.publisher = publisher;
        this.genre = genre;
        this.author = author;
        this.releaseDate = releaseDate;
    }

    // Getter methods to retrieve information about the manga

    /**
     * Getter method to retrieve the serial number of the manga.
     * @return The serial number.
     */
    public int getSerialNumber() {
        return serialNumber;
    }

    /**
     * Getter method to retrieve the title of the manga.
     * @return The title.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Getter method to retrieve the total number of chapters in the manga.
     * @return The total number of chapters.
     */
    public int getTotalChapter() {
        return totalChapter;
    }

    /**
     * Getter method to retrieve the current status of the manga.
     * @return The status (e.g., ongoing, completed).
     */
    public String getStatus() {
        return status;
    }

    /**
     * Getter method to retrieve the rating of the manga.
     * @return The rating.
     */
    public int getRating() {
        return rating;
    }

    /**
     * Getter method to retrieve the publisher of the manga.
     * @return The publisher.
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * Getter method to retrieve the genre(s) of the manga.
     * @return The genre(s).
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Getter method to retrieve the author(s) of the manga.
     * @return The author(s).
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Getter method to retrieve the release date of the manga.
     * @return The release date.
     */
    public String getReleaseDate() {
        return releaseDate;
    }

    // Setter methods to update information about the manga

    /**
     * Setter method to update the serial number of the manga.
     * @param serialNumber The new serial number.
     */
    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * Setter method to update the title of the manga.
     * @param title The new title.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Setter method to update the total number of chapters in the manga.
     * @param totalChapter The new total number of chapters.
     */
    public void setTotalChapter(int totalChapter) {
        this.totalChapter = totalChapter;
    }

    /**
     * Setter method to update the current status of the manga.
     * @param status The new status (e.g., ongoing, completed).
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Setter method to update the release date of the manga.
     * @param releaseDate The new release date.
     */
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    /**
     * Setter method to update the rating of the manga.
     * @param rating The new rating.
     */
    public void setRating(int rating) {
        this.rating = rating;
    }

    /**
     * Setter method to update the publisher of the manga.
     * @param publisher The new publisher.
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * Setter method to update the genre(s) of the manga.
     * @param genre The new genre(s).
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * Setter method to update the author(s) of the manga.
     * @param author The new author(s).
     */
    public void setAuthor(String author) {
        this.author = author;
    }
}

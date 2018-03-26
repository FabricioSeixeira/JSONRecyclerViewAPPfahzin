package br.com.l13.senac.sp.jsonrecyclerviewapp.Model;

/**
 * Created by willian.ytada on 26/03/2018.
 */

public class Anime {

    private String name;
    private String Description;
    private String rating;
    private int nb_espisode;
    private String categorie;
    private String studio;
    private String image_url;

    public Anime() {
    }

    public Anime(String name, String description, String rating, int nb_espisode, String categorie, String studio, String image_url) {
        this.name = name;
        Description = description;
        this.rating = rating;
        this.nb_espisode = nb_espisode;
        this.categorie = categorie;
        this.studio = studio;
        this.image_url = image_url;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return Description;
    }

    public String getRating() {
        return rating;
    }

    public int getNb_espisode() {
        return nb_espisode;
    }

    public String getCategorie() {
        return categorie;
    }

    public String getStudio() {
        return studio;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setNb_espisode(int nb_espisode) {
        this.nb_espisode = nb_espisode;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }


}

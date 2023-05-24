package org.example.entities;

import javax.persistence.*;

@Entity
public class Image {
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private int id;
    private String url;

    @ManyToOne
    @JoinColumn(name="produit_id")
    private Produit produit;

    public Image() {
    }

    public Image(int id, String url, Produit produit) {
        this.id = id;
        this.url = url;
        this.produit = produit;
    }

    public Image(String url, Produit produit) {
        this.url = url;
        this.produit = produit;
    }

    public Image(String chemin) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    @Override
    public String toString() {
        return "Image{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", produit=" + produit +
                '}';
    }
}

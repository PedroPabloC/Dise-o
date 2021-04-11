public class Movie {
    private int ID;
    private String title;
    private int duration;
    private String color;
    private String language;
    private String country;
    private String contentRating;
    private int budget;
    private int titleYear;
    private float imdbScore;
    private float aspectRatio;
    private String imbdLink;



    public Movie(int iD, String title, int duration, String color, String language, String country,
            String contentRating, int budget, int titleYear, float imdbScore, float aspectRatio, String imbdLink) {
        ID = iD;
        this.title = title;
        this.duration = duration;
        this.color = color;
        this.language = language;
        this.country = country;
        this.contentRating = contentRating;
        this.budget = budget;
        this.titleYear = titleYear;
        this.imdbScore = imdbScore;
        this.aspectRatio = aspectRatio;
        this.imbdLink = imbdLink;
    }




    public int getID() {
        return ID;
    }




    public void setID(int iD) {
        ID = iD;
    }




    public String getTitle() {
        return title;
    }




    public void setTitle(String title) {
        this.title = title;
    }




    public int getDuration() {
        return duration;
    }




    public void setDuration(int duration) {
        this.duration = duration;
    }




    public String getColor() {
        return color;
    }




    public void setColor(String color) {
        this.color = color;
    }




    public String getLanguage() {
        return language;
    }




    public void setLanguage(String language) {
        this.language = language;
    }




    public String getCountry() {
        return country;
    }




    public void setCountry(String country) {
        this.country = country;
    }




    public String getContentRating() {
        return contentRating;
    }




    public void setContentRating(String contentRating) {
        this.contentRating = contentRating;
    }




    public int getBudget() {
        return budget;
    }




    public void setBudget(int budget) {
        this.budget = budget;
    }




    public int getTitleYear() {
        return titleYear;
    }




    public void setTitleYear(int titleYear) {
        this.titleYear = titleYear;
    }




    public float getImdbScore() {
        return imdbScore;
    }




    public void setImdbScore(float imdbScore) {
        this.imdbScore = imdbScore;
    }




    public float getAspectRatio() {
        return aspectRatio;
    }




    public void setAspectRatio(float aspectRatio) {
        this.aspectRatio = aspectRatio;
    }




    public String getImbdLink() {
        return imbdLink;
    }




    public void setImbdLink(String imbdLink) {
        this.imbdLink = imbdLink;
    }




    @Override
    public String toString() {
        return ID + "," + title + "," + duration + "," + color + "," + language + "," + country + "," + contentRating 
                + "," + budget + "," + titleYear + "," + imdbScore + "," + aspectRatio + "," + imbdLink;
    }




    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ID;
        result = prime * result + Float.floatToIntBits(aspectRatio);
        result = prime * result + budget;
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        result = prime * result + ((contentRating == null) ? 0 : contentRating.hashCode());
        result = prime * result + ((country == null) ? 0 : country.hashCode());
        result = prime * result + duration;
        result = prime * result + ((imbdLink == null) ? 0 : imbdLink.hashCode());
        result = prime * result + Float.floatToIntBits(imdbScore);
        result = prime * result + ((language == null) ? 0 : language.hashCode());
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        result = prime * result + titleYear;
        return result;
    }




    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Movie other = (Movie) obj;
        if (ID != other.ID)
            return false;
        if (Float.floatToIntBits(aspectRatio) != Float.floatToIntBits(other.aspectRatio))
            return false;
        if (budget != other.budget)
            return false;
        if (color == null) {
            if (other.color != null)
                return false;
        } else if (!color.equals(other.color))
            return false;
        if (contentRating == null) {
            if (other.contentRating != null)
                return false;
        } else if (!contentRating.equals(other.contentRating))
            return false;
        if (country == null) {
            if (other.country != null)
                return false;
        } else if (!country.equals(other.country))
            return false;
        if (duration != other.duration)
            return false;
        if (imbdLink == null) {
            if (other.imbdLink != null)
                return false;
        } else if (!imbdLink.equals(other.imbdLink))
            return false;
        if (Float.floatToIntBits(imdbScore) != Float.floatToIntBits(other.imdbScore))
            return false;
        if (language == null) {
            if (other.language != null)
                return false;
        } else if (!language.equals(other.language))
            return false;
        if (title == null) {
            if (other.title != null)
                return false;
        } else if (!title.equals(other.title))
            return false;
        if (titleYear != other.titleYear)
            return false;
        return true;
    }


    
    
}
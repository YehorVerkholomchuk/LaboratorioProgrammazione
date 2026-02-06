public abstract class LibraryResource {
    private String title;
    private int popularityIndex;

    public LibraryResource(String title, int popularityIndex) {
        if (title.isEmpty()) {
            throw new IllegalArgumentException("Title cannot be empty");
        }
        if (popularityIndex < 0 || popularityIndex > 100) {
            throw new IllegalArgumentException("Popularity index must be between 0 and 100");
        }
        this.title = title;
        this.popularityIndex = popularityIndex;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title.isEmpty()) {
            throw new IllegalArgumentException("Title cannot be empty");
        }
        this.title = title;
    }

    public int getPopularityIndex() {
        return popularityIndex;
    }

    public void setPopularityIndex(int popularityIndex) {
        if (popularityIndex < 0 || popularityIndex > 100) {
            throw new IllegalArgumentException("Popularity index must be between 0 and 100");
        }
        this.popularityIndex = popularityIndex;
    }

    public int boostPopularity(int points) {
        if (points < 0) {
            return popularityIndex;
        }

        if (popularityIndex + points > 100) {
            popularityIndex = 100;
        } else {
            popularityIndex += points;
        }

        return popularityIndex;
    }

    public abstract String getUsageTerms();
}

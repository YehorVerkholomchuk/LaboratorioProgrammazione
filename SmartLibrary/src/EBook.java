public class EBook extends LibraryResource implements Downloadable {
    public EBook(String title, int popularityIndex) {
        super(title, popularityIndex);
        if (title.isEmpty()) {
            throw new IllegalArgumentException("Title cannot be empty");
        }
        if (popularityIndex < 0 || popularityIndex > 100) {
            throw new IllegalArgumentException("Popularity index must be between 0 and 100");
        }
    }

    @Override
    public String getUsageTerms() {
        return  "Digital license: single user access.";
    }

    @Override
    public boolean isAvailableForOffline() {
        if (getPopularityIndex() >= 30) {
            return true;
        }
        return false;
    }
}

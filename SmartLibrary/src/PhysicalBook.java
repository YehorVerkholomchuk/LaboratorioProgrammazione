public class PhysicalBook extends LibraryResource {
    private String shelfLocation;
    public PhysicalBook(String title, int popularityIndex, String shelfLocation) {
        super(title, popularityIndex);
        if (title.isEmpty()) {
            throw new IllegalArgumentException("Title cannot be empty");
        }
        if (popularityIndex < 0 || popularityIndex > 100) {
            throw new IllegalArgumentException("Popularity index must be between 0 and 100");
        }
        if (shelfLocation.isEmpty()) {
            throw new IllegalArgumentException("Shelf location cannot be empty");
        }
        this.shelfLocation = shelfLocation;
    }

    @Override
    public String getUsageTerms() {
        return  "Physical copy at location: " + shelfLocation;
    }
}

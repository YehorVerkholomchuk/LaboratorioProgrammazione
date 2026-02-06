public class ContentProvider {
    private String name;
    private String licenseCode;

    public ContentProvider(String name, String licenseCode) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        if (licenseCode.isEmpty()) {
            throw new IllegalArgumentException("License code cannot be empty");
        }
        this.name = name;
        this.licenseCode = licenseCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public String getLicenseCode() {
        return licenseCode;
    }

    public void setLicenseCode(String licenseCode) {
        if (licenseCode.isEmpty()) {
            throw new IllegalArgumentException("License code cannot be empty");
        }
        this.licenseCode = licenseCode;
    }

    public String getInfo() {
        return "Provider: " + name + " (Code: " + licenseCode + ")";
    }
}

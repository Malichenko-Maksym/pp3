//package Encaps;
public class DrivingLicense {
    private String driverName;
    private String driverSurname;
    private String address;
    private String postalCode;
    private String city;
    private String drivingLicenseN;
    private int yearOfIssue;
    private String drivingLicenseCategory;

    public void setDriverName(String driverName) {
        this.driverName = driverName.substring(0, 1).toUpperCase() + driverName.substring(1).toLowerCase();
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverSurname(String driverSurname) {
        this.driverSurname = driverSurname;
    }

    public String getDriverSurname() {
        return driverSurname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setDrivingLicenseN(String drivingLicenseN) {
        this.drivingLicenseN = drivingLicenseN;
    }

    public String getDrivingLicenseN() {
        return drivingLicenseN;
    }

    public void setYearOfIssue(int yearOfIssue) {
        if ((yearOfIssue >= 1980) && (yearOfIssue <= 2022)) {
            this.yearOfIssue = yearOfIssue;
        } else {
            System.out.println("Wait, what?!");
        }

    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setDrivingLicenseCategory(String drivingLicenseCategory) {
        this.drivingLicenseCategory = drivingLicenseCategory;
    }

    public String getDrivingLicenseCategory() {
        return drivingLicenseCategory;
    }

    public String toString() {
        return getDriverName() + " " + getDriverSurname() + " Home adress: " + getAddress() + " " + getPostalCode()
                + " " + getCity() + " Licence number: " + getDrivingLicenseN() + " year of issue " + getYearOfIssue()
                + " category: "
                + getDrivingLicenseCategory();
    }
}
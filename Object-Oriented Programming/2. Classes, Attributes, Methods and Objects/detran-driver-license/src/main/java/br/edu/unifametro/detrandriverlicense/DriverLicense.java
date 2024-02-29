package br.edu.unifametro.detrandriverlicense;

import br.edu.unifametro.detrandriverlicense.enumerations.Status;
import br.edu.unifametro.detrandriverlicense.enumerations.Type;

import java.time.LocalDate;
import java.util.List;

public class DriverLicense {

    public long licenseNumber;
    public long ownerIdentification;
    public Type type;
    public LocalDate expirationDate;
    public LocalDate expeditionDate;
    public int infractions;
    public Status status;

    public DriverLicense() {}

    public DriverLicense(long licenseNumber, long ownerIdentification, Type type, LocalDate expirationDate,
                         LocalDate expeditionDate) {
        this.licenseNumber = licenseNumber;
        this.ownerIdentification = ownerIdentification;
        this.type = type;
        this.expirationDate = expirationDate;
        this.expeditionDate = expeditionDate;
        this.infractions = 0;
        this.status = Status.Valid;
    }

    public int addInfractionPoints(int points) {
        return this.infractions += points;
    }

    public int removeInfractionPoints (int points) {
        return this.infractions -= points;
    }

    public int resetInfractionPoints (int points) {
        return this.infractions = 0;
    }

    public String verifyInfractionPoints() {
        return "Infraction Points" + this.infractions;
    }

    public boolean isConfiscable() {
        return this.infractions >= 20;
    }

    public void verifyDriverLicenseStatus() {
        if (LocalDate.now().isAfter(this.expirationDate)) {
            this.status = Status.Expired;
        } else if (isConfiscable()) {
            this.status = Status.Confiscated;
        }
        System.out.println("Number: " + licenseNumber + " Owner: " + ownerIdentification + " Type: " + type +
                "\nExpedition Date: " + expeditionDate + " Expiration Date: " + expirationDate +
                "\nStatus: " + status + " Infraction Points: " + infractions);
    }
}

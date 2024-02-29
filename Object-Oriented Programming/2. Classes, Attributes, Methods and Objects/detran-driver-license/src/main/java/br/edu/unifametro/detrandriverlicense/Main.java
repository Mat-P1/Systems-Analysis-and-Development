package br.edu.unifametro.detrandriverlicense;

import br.edu.unifametro.detrandriverlicense.enumerations.Type;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        DriverLicense validLicense = new DriverLicense(580111369L, 51422295212L, Type.B,
                LocalDate.of(2025, 2, 22), LocalDate.of(2018, 2, 23));

        // Testing valid license

        validLicense.addInfractionPoints(10);
        validLicense.removeInfractionPoints(5);
        validLicense.verifyInfractionPoints();
        validLicense.resetInfractionPoints();
        validLicense.verifyInfractionPoints();
        validLicense.verifyDriverLicenseStatus();

        // Testing expired or confiscated license

        System.out.println("\n");

        DriverLicense expiredLicense = new DriverLicense(520551367L, 81372595312L, Type.A,
                LocalDate.of(2020, 4, 22), LocalDate.of(2018, 4, 23));

        expiredLicense.verifyDriverLicenseStatus();

        DriverLicense confiscatedLicense = new DriverLicense(920421368L, 91563684221L, Type.C,
                LocalDate.of(2026, 8, 22), LocalDate.of(2020, 8, 23));

        System.out.println("\n");

        confiscatedLicense.addInfractionPoints(25);
        confiscatedLicense.verifyDriverLicenseStatus();
    }
}
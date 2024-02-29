package br.edu.unifametro.detrandriverlicense;

import br.edu.unifametro.detrandriverlicense.enumerations.Type;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        DriverLicense license = new DriverLicense(580111369L, 51422295212L, Type.B,
                LocalDate.of(2025, 2, 22), LocalDate.of(2018, 2, 23));

        license.verifyDriverLicenseStatus();
    }
}
package com.example.imports;

import java.nio.file.Path;
import java.util.List;
import java.util.Objects;

public class CsvProfileImporter implements ProfileImporter {
    private final NaiveCsvReader csvReader;
    private final ProfileService profileService;

    public CsvProfileImporter(NaiveCsvReader csvReader, ProfileService profileService) {
        this.csvReader = Objects.requireNonNull(csvReader, "csvReader");
        this.profileService = Objects.requireNonNull(profileService, "profileService");
    }

    @Override
    public int importFrom(Path csvFile) {
        List<String[]> rows = csvReader.read(csvFile);
        int importedCount = 0;

        for (String[] row : rows) {
            try {
                if (row.length < 3) {
                    System.out.println("Skipping invalid row: insufficient columns");
                    continue;
                }

                String id = row[0].trim();
                String email = row[1].trim();
                String displayName = row[2].trim();

                if (id.isEmpty()) {
                    System.out.println("Skipping row with missing id");
                    continue;
                }

                if (email.isEmpty()) {
                    System.out.println("Skipping row with missing email");
                    continue;
                }

                if (!email.contains("@")) {
                    System.out.println("Skipping row with invalid email: " + email);
                    continue;
                }

                profileService.createProfile(id, email, displayName);
                importedCount++;
            } catch (Exception e) {
                System.out.println("Skipping invalid row due to error: " + e.getMessage());
            }
        }
        return importedCount;
    }
}

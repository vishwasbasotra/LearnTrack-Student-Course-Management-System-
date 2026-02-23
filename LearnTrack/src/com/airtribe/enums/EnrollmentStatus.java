package com.airtribe.enums;

public enum EnrollmentStatus {
    ACTIVE,
    COMPLETED,
    CANCELLED;

    // Optional: A helper to convert String input (from Scanner) to Enum safely
    public static EnrollmentStatus fromString(String status) {
        for (EnrollmentStatus s : EnrollmentStatus.values()) {
            if (s.name().equalsIgnoreCase(status)) {
                return s;
            }
        }
        return null; // Handle this in your Service logic
    }
}

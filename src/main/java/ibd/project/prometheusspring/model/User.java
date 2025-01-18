package ibd.project.prometheusspring.model;

public record User(
        int id,
        String name,
        String username,
        String email,
        Address address,
        String phone,
        String website,
        Company company
) {
    // Address class as a nested static class
    public static record Address(
            String street,
            String suite,
            String city,
            String zipcode,
            Geo geo
    ) {
        // Geo class as a nested static class
        public static record Geo(
                String lat,
                String lng
        ) {}
    }

    // Company class as a nested static class
    public static record Company(
            String name,
            String catchPhrase,
            String bs
    ) {}
}

package pl.javastart.task;

public enum Season {
    SPRING("wiosna", "marzec", "kwiecień", "maj"),
    SUMMER("lato", "czerwiec", "lipiec", "sierpień"),
    AUTUMN("jesień", "wrzesień", "październik", "listopad"),
    WINTER("zima", "grudzień", "styczeń", "luty");

    private final String nameSeason;
    private final String[] nameMonth;

    Season(String nameSeason, String... nameMonth) {
        this.nameSeason = nameSeason;
        this.nameMonth = nameMonth;
    }

    public String getNameSeason() {
        return nameSeason;
    }

    public String[] getNameMonth() {
        return nameMonth;
    }

    public static Season getNameSeasonValue(String nameSeason) {
        for (Season value : values()) {
            if (value.getNameSeason().equalsIgnoreCase(nameSeason)) {
                return value;
            }
        }

        return null;
    }
}

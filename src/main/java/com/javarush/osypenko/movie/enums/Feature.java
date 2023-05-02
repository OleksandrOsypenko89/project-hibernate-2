package com.javarush.osypenko.movie.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static java.util.Objects.isNull;

@AllArgsConstructor
@Getter
public enum Feature {
    Trailers("Trailers"),
    Commentaries("Commentaries"),
    DeletedScenes("Deleted Scenes"),
    BehindTheScenes("Behind the Scenes");

    private final String value;

    public static Feature getFeatureByValue(String value) {
        if (isNull(value) || value.isEmpty()) {
            return null;
        }

        Feature[] features = Feature.values();
        for (Feature feature : features) {
            if (feature.value.equals(value)) {
                return feature;
            }
        }

        return null;
    }
}

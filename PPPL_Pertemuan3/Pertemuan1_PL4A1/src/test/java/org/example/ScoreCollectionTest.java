package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScoreCollectionTest {

    @Test
    public void AddScore() {
        ScoreCollection collection = new ScoreCollection();
        collection.addScore(7);
        collection.addScore(8);
        collection.addScore(9);

        assertEquals(3, collection.scores.size());
    }

    @Test
    public void AverageScore() {
        ScoreCollection collection = new ScoreCollection();
        collection.addScore(9);
        collection.addScore(8);
        collection.addScore(7);

        double expectedAverage = 5.0;
        assertEquals(expectedAverage, collection.averageScore(), 0.01);
    }
}
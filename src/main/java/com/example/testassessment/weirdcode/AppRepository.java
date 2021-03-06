package com.example.testassessment.weirdcode;

public interface AppRepository {

    /**
     * @return {@link App} or {@code null} if no {@link App} found
     */
    App findById(String id);
    
}

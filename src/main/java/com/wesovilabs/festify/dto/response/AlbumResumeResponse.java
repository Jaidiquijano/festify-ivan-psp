package com.wesovilabs.festify.dto.response;

import java.sql.Timestamp;
import java.time.LocalDate;

public record AlbumResumeResponse(Long id,
                                  String title,
                                  Long artistId,
                                  LocalDate releaseDate,
                                  Integer tracksCount,
                                  Integer durationSeconds,
                                  Timestamp createdAt,
                                  Timestamp updatedAt) {
}

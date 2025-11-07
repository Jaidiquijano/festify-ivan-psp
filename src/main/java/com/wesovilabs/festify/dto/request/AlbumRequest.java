package com.wesovilabs.festify.dto.request;

import java.sql.Timestamp;
import java.time.LocalDate;

public record AlbumRequest(
                            Long id,
                            String title,
                           Long artistId,
                           LocalDate releaseDate,
                           Integer tracksCount,
                           Integer durationSeconds,
                           Timestamp createdAt,
                           Timestamp updatedAt) {
}

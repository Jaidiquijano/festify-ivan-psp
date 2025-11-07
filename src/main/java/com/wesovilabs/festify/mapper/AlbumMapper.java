package com.wesovilabs.festify.mapper;

import com.wesovilabs.festify.dto.request.AlbumRequest;
import com.wesovilabs.festify.dto.response.AlbumResumeResponse;
import com.wesovilabs.festify.persistence.jpa.entity.AlbumEntity;

public class AlbumMapper {

    public static AlbumResumeResponse mapAlbumDTOResume(AlbumEntity albumEntity) {
        return new AlbumResumeResponse(
                albumEntity.getId(),
                albumEntity.getTitle(),
                albumEntity.getArtistId(),
                albumEntity.getReleaseDate(),
                albumEntity.getTracksCount(),
                albumEntity.getDurationSeconds(),
                albumEntity.getCreatedAt(),
                albumEntity.getUpdatedAt());
    }
    public static AlbumEntity mapAlbumEntityResponse(AlbumRequest albumRequest) {
        return new AlbumEntity(albumRequest.id(), albumRequest.artistId(), albumRequest.title(),
                albumRequest.releaseDate(),
                albumRequest.tracksCount(),
                albumRequest.durationSeconds(),
                albumRequest.createdAt(),
                albumRequest.updatedAt());
    }
}

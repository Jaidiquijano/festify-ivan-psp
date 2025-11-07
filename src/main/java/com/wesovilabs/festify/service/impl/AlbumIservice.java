package com.wesovilabs.festify.service.impl;

import com.wesovilabs.festify.dto.request.AlbumRequest;

import com.wesovilabs.festify.dto.response.AlbumDetailResponse;
import com.wesovilabs.festify.dto.response.AlbumResumeResponse;


import java.util.List;

public interface AlbumIservice {
    List<AlbumResumeResponse> listAlbum();

    AlbumResumeResponse createAlbum(AlbumRequest requestAl );

    AlbumDetailResponse updateAlbum(String id, AlbumRequest requestAl);

    AlbumDetailResponse getAlbumId(String id);

    void deleteAlbum(String id);



}


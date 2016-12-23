package com.belov.artem.templateapp.domain.repository;

import com.belov.artem.templateapp.data.net.responce.ApiResponse;
import com.belov.artem.templateapp.domain.About;

import rx.Observable;

public interface AboutRepository {

   Observable<ApiResponse<About>> about();

}

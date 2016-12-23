package com.belov.artem.templateapp.domain.interactor;

import com.belov.artem.templateapp.domain.repository.AboutRepository;

import javax.inject.Inject;

import rx.Observable;

public class AboutCase extends UseCase {

    private final AboutRepository aboutRepository;

    @Inject
    public AboutCase(AboutRepository aboutRepository) {
        this.aboutRepository = aboutRepository;
    }

    @Override
    protected Observable buildUseCaseObservable() {
        return aboutRepository.about();
    }
}

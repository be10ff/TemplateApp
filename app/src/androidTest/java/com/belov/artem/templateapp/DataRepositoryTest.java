package com.belov.artem.templateapp;

import com.belov.artem.templateapp.data.entity.AboutEntity;
import com.belov.artem.templateapp.data.entity.mapper.AboutEntityDataMapper;
import com.belov.artem.templateapp.data.net.repository.AboutDataRepository;
import com.belov.artem.templateapp.data.net.repository.datasource.AboutDataStore;
import com.belov.artem.templateapp.data.net.repository.datasource.AboutDataStoreFactory;
import com.belov.artem.templateapp.domain.About;
import com.belov.artem.templateapp.domain.repository.AboutRepository;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.mockito.runners.MockitoJUnitRunner;
import static org.mockito.Mockito.verify;

/**
 * Created by artem on 26.12.16.
 */

@RunWith(MockitoJUnitRunner.class)
public class DataRepositoryTest {

    @Mock private AboutDataStoreFactory mockUserDataStoreFactory;
    @Mock private AboutEntityDataMapper mockUserEntityDataMapper;
    @Mock private AboutDataStore mockUserDataStore;
    @Mock private AboutEntity mockUserEntity;
    @Mock private About mockUser;

    @InjectMocks private AboutRepository userDataRepository;

    @Rule public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Test
    public void testGetUsersHappyCase() {
        verify(userDataRepository).about();
    }
}

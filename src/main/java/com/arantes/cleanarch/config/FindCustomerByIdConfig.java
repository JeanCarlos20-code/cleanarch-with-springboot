package com.arantes.cleanarch.config;

import com.arantes.cleanarch.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import com.arantes.cleanarch.dataprovider.FindCustomerByIdImpl;
import org.springframework.context.annotation.Bean;

public class FindCustomerByIdConfig {

    @Bean
    public FindCustomerByIdUseCaseImpl findCustomerByIdUseCase(
            FindCustomerByIdImpl findCustomerById
    ) {
       return new FindCustomerByIdUseCaseImpl(findCustomerById);
    }
}

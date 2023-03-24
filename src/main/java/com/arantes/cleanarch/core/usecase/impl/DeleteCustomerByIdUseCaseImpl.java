package com.arantes.cleanarch.core.usecase.impl;

import com.arantes.cleanarch.core.dataprovider.DeleteCustomerById;
import com.arantes.cleanarch.core.usecase.DeleteCustomerByIdUseCase;

public class DeleteCustomerByIdUseCaseImpl implements DeleteCustomerByIdUseCase {

    private final FindCustomerByIdUseCaseImpl findCustomerByIdUseCase;

    private final DeleteCustomerById deleteCustomerById;

    public DeleteCustomerByIdUseCaseImpl(FindCustomerByIdUseCaseImpl findCustomerByIdUseCase, DeleteCustomerById deleteCustomerById) {
        this.findCustomerByIdUseCase = findCustomerByIdUseCase;
        this.deleteCustomerById = deleteCustomerById;
    }
    @Override
    public void delete(String id) {
        findCustomerByIdUseCase.find(id);
        deleteCustomerById.delete(id);
    }
}

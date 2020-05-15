package ouzture.springframework.recipator.services;

import ouzture.springframework.recipator.commands.UnitOfMeasureCommand;

import java.util.Set;

public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();
}
package com.evergent.corejava.caseStudy;

public interface LibraryUser {
void registerAccount(int age) throws InvalidAgeException;
void requestBook(String bookType) throws InvalidBookTypeException;
}
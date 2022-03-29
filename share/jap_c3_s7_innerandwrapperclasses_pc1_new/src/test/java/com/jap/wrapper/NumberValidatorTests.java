package com.jap.wrapper;


import com.jap.wrapper.wrapper.NumberValidator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class NumberValidatorTests {

    private static final String VALID_VALUES="0201103311";
    private static final String[] INVALID_VALUES={"8965142316","8988899","77ui889789","invalid"};
    private static final String[] EMPTY_VALUES={"",null};
    private NumberValidator numberValidator;

    @BeforeEach
    public void setUp() {
        numberValidator= new NumberValidator();
    }

    @AfterEach
    public void tearDown() {
        numberValidator = null;
    }

    @Test
    public void givenValidNumberValuesWhenCheckedThenReturnOne(){
        assertEquals(1,numberValidator.validateNumber(VALID_VALUES));
    }

    @Test
    public void givenInValidNumberValuesWhenCheckedThenReturnZero(){
        assertEquals(0,numberValidator.validateNumber(INVALID_VALUES[0]));
        assertEquals(0,numberValidator.validateNumber(INVALID_VALUES[1]));
    }

    @Test
    public void givenEmptyValuesWhenCheckedThenReturnMinusOne(){
        assertEquals(-1,numberValidator.validateNumber(EMPTY_VALUES[0]));
        assertEquals(-1,numberValidator.validateNumber(EMPTY_VALUES[0]));
    }

    @Test
    public void givenInvalidStringValuesWhenCheckedThenThrowsException(){
        assertThrows(NumberFormatException.class,()->
                numberValidator.validateNumber(INVALID_VALUES[2]));
        assertThrows(NumberFormatException.class,()->
                numberValidator.validateNumber(INVALID_VALUES[3]));
    }
}

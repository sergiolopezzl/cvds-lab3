package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {
    private Registry registry = new Registry();
    @Test
    public void testVotoValido() {
        Person person = new Person("Juan", 12345, 25, Gender.MALE, true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, result);
    }

    @Test
    public void testVotoInvalidoMuerto() {
        Person person = new Person("Maria", 67890, 30, Gender.FEMALE, false);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.DEAD, result);
    }

    @Test
    public void testVotoInvalidoMenorDeEdad() {
        Person person = new Person("Pedro", 54321, 16, Gender.MALE, true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }

    @Test
    public void testVotoInvalidoEdadInvalida() {
        Person person = new Person("Ana", 98765, -5, Gender.FEMALE, true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }
    
    @Test
    public void testVotoInvalidoDuplicado() {
        Person person1 = new Person("Carlos", 11111, 40, Gender.MALE, true);
        registry.registerVoter(person1);
        Person person2 = new Person("Laura", 11111, 35, Gender.FEMALE, true);
        RegisterResult result = registry.registerVoter(person2);
        Assert.assertEquals(RegisterResult.DUPLICATED, result);
    }
}
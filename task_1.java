@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
	assertEquals("Если меньше 18, тогда ребенок", true, isAdult);
    // Напиши код здесь
}
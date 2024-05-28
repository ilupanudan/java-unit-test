@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(15);
	assertEquals("Очевидно пользователю < 18 лет",true, isAdult);
}
